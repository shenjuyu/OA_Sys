package com.sjy.OA_Sys.biz.impl;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.sjy.OA_Sys.bean.Notice;
import com.sjy.OA_Sys.bean.NoticeExample;
import com.sjy.OA_Sys.bean.NoticeNum;
import com.sjy.OA_Sys.bean.NoticeExample.Criteria;
import com.sjy.OA_Sys.bean.Result;
import com.sjy.OA_Sys.biz.NoticeBiz;
import com.sjy.OA_Sys.dao.NoticeMapper;
import com.sjy.OA_Sys.dao.NoticeNumMapper;

@Service
public class NoticeBizImpl implements NoticeBiz {

	@Resource
	private NoticeMapper nm;
	@Resource
	private NoticeNumMapper nnm;

	private NoticeExample ne = new NoticeExample();

	@Override
	public Result addNotice(Notice notice) {
		notice.setNoticeTime(new Timestamp(System.currentTimeMillis()));
		int code = 0;
		if (notice.getId() != null) { // 如果存在id 则修改  不存在则添加
			code = nm.updateByPrimaryKeySelective(notice);
		} else {
			code = nm.insertSelective(notice);
		}
		if (code > 0) {
			return new Result(1, "发布成功");
		} else {
			return new Result(0, "发布失败");
		}
	}

	@Override
	public List<Notice> findNotice(Notice notice, List<String> addressee, Boolean read, String staffId, Integer pageNum,
			Integer pageSize) {
		List<Notice> noReadNotice = new ArrayList<Notice>();
		try {
			Criteria criteria = ne.createCriteria();
			if (notice != null) {
				if (notice.getId() != null) {
					criteria.andIdEqualTo(notice.getId());
				}
				if (notice.getNoticeTitle() != null) {
					criteria.andNoticeTitleEqualTo(notice.getNoticeTitle());
				}
				if (notice.getNoticeStaffSend() != null) {
					criteria.andNoticeStaffSendEqualTo(notice.getNoticeStaffSend());
				}
				if (notice.getNoticeTime() != null) {
					criteria.andNoticeTimeBetween(notice.getNoticeTime(), new Timestamp(new Date().getTime()));
				}
				if (addressee == null && notice.getNoticeStaffAddressee() != null) {
					criteria.andNoticeStaffAddresseeEqualTo(notice.getNoticeStaffAddressee());
				} else if (addressee != null) {
					criteria.andNoticeStaffAddresseeIn(addressee);
				}
			}

			// 分页
			if (pageNum != null && pageSize != null) {
				PageHelper.startPage(pageNum, pageSize);
				noReadNotice = nm.selectByExampleWithBLOBs(ne);

			} else {
				noReadNotice = nm.selectByExampleWithBLOBs(ne);
			}

			if (read != null) {
				noReadNotice = getRead(read, staffId, noReadNotice);
			}
			if (staffId != null) {
				noReadNotice = setIsRead(noReadNotice, staffId);
			}
			return noReadNotice;

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			ne.clear();
		}
		return null;
	}

	/**
	 * 添加Notice中isRead属性数据
	 * 
	 * @param resource
	 * @param staffId
	 * @return
	 */
	public List<Notice> setIsRead(List<Notice> resource, String staffId) {
		Iterator<Notice> iterator = resource.iterator();
		while (iterator.hasNext()) {
			Notice notice = iterator.next();

			List<NoticeNum> noticeNums = nnm.selectByNoticeId(notice.getId());
			if (noticeNums == null || noticeNums.size() == 0) {
				// 则未读
				notice.setIsRead(0);
			} else {

				Iterator<NoticeNum> iteratorNum = noticeNums.iterator();
				while (iteratorNum.hasNext()) {
					NoticeNum noticeNum = iteratorNum.next();
					if (noticeNum.getStaffId().equals(staffId)) {
						// 则已读
						notice.setIsRead(1);
						break;
					}
					if (iteratorNum.hasNext()) {
						// 则未读
						notice.setIsRead(0);
					}
				}
			}
		}
		return resource;
	}

	/**
	 * 获得已读或未读数据
	 * 
	 * @param read
	 * @param staffId
	 * @param resource
	 * @return
	 */
	public List<Notice> getRead(Boolean read, String staffId, List<Notice> resource) {
		List<Notice> readList = new ArrayList<Notice>();
		List<Notice> noReadList = new ArrayList<Notice>();

		Iterator<Notice> iterator = resource.iterator();
		while (iterator.hasNext()) {
			Notice notice = iterator.next();

			List<NoticeNum> noticeNums = nnm.selectByNoticeId(notice.getId());
			if (noticeNums == null || noticeNums.size() == 0) {
				// 则未读
				notice.setIsRead(0);
				noReadList.add(notice);
			} else {

				Iterator<NoticeNum> iteratorNum = noticeNums.iterator();
				while (iteratorNum.hasNext()) {
					NoticeNum noticeNum = iteratorNum.next();
					if (noticeNum.getStaffId().equals(staffId)) {
						// 则已读
						notice.setIsRead(1);
						readList.add(notice);
						break;
					}
					if (iteratorNum.hasNext()) {
						// 则未读
						notice.setIsRead(0);
						noReadList.add(notice);
					}
				}
			}
		}
		if (read) {
			System.out.println(readList.size() + "+++++++++++++");
			return readList;
		} else {
			System.out.println(readList.size() + "===========");
			return noReadList;
		}
	}

}
