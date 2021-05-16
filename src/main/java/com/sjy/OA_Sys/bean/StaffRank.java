package com.sjy.OA_Sys.bean;

public class StaffRank {
    private Integer rankId;

    private String rankSequence;

    private Integer rankSequenceLevel;

    private String rankName;

    private Integer rankState;

    public StaffRank(Integer rankId, String rankSequence, Integer rankSequenceLevel, String rankName, Integer rankState) {
        this.rankId = rankId;
        this.rankSequence = rankSequence;
        this.rankSequenceLevel = rankSequenceLevel;
        this.rankName = rankName;
        this.rankState = rankState;
    }

    public StaffRank() {
        super();
    }

    public Integer getRankId() {
        return rankId;
    }

    public void setRankId(Integer rankId) {
        this.rankId = rankId;
    }

    public String getRankSequence() {
        return rankSequence;
    }

    public void setRankSequence(String rankSequence) {
        this.rankSequence = rankSequence == null ? null : rankSequence.trim();
    }

    public Integer getRankSequenceLevel() {
        return rankSequenceLevel;
    }

    public void setRankSequenceLevel(Integer rankSequenceLevel) {
        this.rankSequenceLevel = rankSequenceLevel;
    }

    public String getRankName() {
        return rankName;
    }

    public void setRankName(String rankName) {
        this.rankName = rankName == null ? null : rankName.trim();
    }

    public Integer getRankState() {
        return rankState;
    }

    public void setRankState(Integer rankState) {
        this.rankState = rankState;
    }
}