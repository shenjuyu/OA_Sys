package com.sjy.OA_Sys.biz.impl;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
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

@Service
public class NoticeBizImpl implements NoticeBiz {

	@Resource
	private NoticeMapper nm;
	
	private NoticeExample ne = new NoticeExample();
	
	@Override
	public Result addNotice(Notice notice) {
		int code = nm.insertSelective(notice);
		if(code>0) {
			return new Result(1, "发布成功");
		}else {
			return new Result(0, "发布失败");
		}
	}

	@Override
	public List<Notice> findNotice(Notice notice, Boolean read, String staffId, Integer pageNum, Integer pageSize) {
		List<Notice> noReadNotice = new ArrayList<Notice>();
		try {
			Criteria criteria = ne.createCriteria();
			if(notice!=null) {
				if(notice.getNoticeTitle()!=null) {
					criteria.andNoticeTitleEqualTo(notice.getNoticeTitle());
				}
				if(notice.getNoticeStaffSend()!=null) {
					criteria.andNoticeStaffSendEqualTo(notice.getNoticeStaffSend());
				}
				if(notice.getNoticeTime()!=null) {
					criteria.andNoticeTimeBetween(notice.getNoticeTime(), new Timestamp(new Date().getTime()));
				}
				if(notice.getNoticeStaffAddressee()!=null) {
					criteria.andNoticeStaffAddresseeEqualTo(notice.getNoticeStaffAddressee());
					if(read) { // 查询未读
						// 分页
						if (pageNum != null && pageSize != null) {
							PageHelper.startPage(pageNum, pageSize);
							List<Notice> allNotice = nm.selectByExample(ne);
							for(Notice no : allNotice) {
								List<NoticeNum> noticeNumList = no.getNoticeNumList();
								for(int i = 0;i<noticeNumList.size();i++) {
									// 如果员工已读
									if(noticeNumList.get(i).getStaffId()==staffId) {
										break;
									}
									// 如果员工未读
									if(i==noticeNumList.size()-1) {
										noReadNotice.add(notice);
									}
								}
							}
							return noReadNotice;
						}
						// 不分页
						List<Notice> allNotice = nm.selectByExample(ne);
						for(Notice no : allNotice) {
							List<NoticeNum> noticeNumList = no.getNoticeNumList();
							for(int i = 0;i<noticeNumList.size();i++) {
								// 如果员工已读
								if(noticeNumList.get(i).getStaffId()==staffId) {
									break;
								}
								// 如果员工未读
								if(i==noticeNumList.size()-1) {
									noReadNotice.add(notice);
								}
							}
						}
						return noReadNotice;
					}else { // 查询已读
						// 分页
						if (pageNum != null && pageSize != null) {
							PageHelper.startPage(pageNum, pageSize);
							List<Notice> allNotice = nm.selectByExample(ne);
							for(Notice no : allNotice) {
								List<NoticeNum> noticeNumList = no.getNoticeNumList();
								for(int i = 0;i<noticeNumList.size();i++) {
									// 如果员工已读
									if(noticeNumList.get(i).getStaffId()==staffId) {
										noReadNotice.add(notice);
										break;
									}
								}
							}
							return noReadNotice;
						}
						// 不分页
						List<Notice> allNotice = nm.selectByExample(ne);
						for(Notice no : allNotice) {
							List<NoticeNum> noticeNumList = no.getNoticeNumList();
							for(NoticeNum nn : noticeNumList) {
								// 如果员工已读
								if(nn.getStaffId()==staffId) {
									noReadNotice.add(notice);
									break;
								}
							}
						}
						return noReadNotice;
					}
				}
			}
			
			// 分页
			if (pageNum != null && pageSize != null) {
				PageHelper.startPage(pageNum, pageSize);
				return nm.selectByExample(ne);
			}
			return nm.selectByExample(ne);
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			ne.clear();
		}
		return null;
	}

}
