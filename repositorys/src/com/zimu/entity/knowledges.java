package com.zimu.entity;

import java.sql.Date;

public class knowledges {
	
	private int knowledgeID;
	private int typeID;
	private int createrID;
	private Date createTime;
	private String title;
	private String key;
	private String abstracts;
	private String content;
	private String contentAddress;
	private String attachment;
	private String state;
	private int modifier;
	private Date modifyTime;
	private String valid;
	private Date validDate;
	private String replyScope;
	private String openness;
	private String authorityScope;
	private String knowledgePath;
	private String remark;
	
	public knowledges(){
		
	}
	public knowledges(int knowledgeID, int typeID, int createrID,
			Date createTime, String title, String key, String abstracts,
			String content, String contentAddress, String attachment,
			String state, int modifier, Date modifyTime, String valid,
			Date validDate, String replyScope, String openness,
			String authorityScope, String knowledgePath, String remark) {
		this.knowledgeID = knowledgeID;
		this.typeID = typeID;
		this.createrID = createrID;
		this.createTime = createTime;
		this.title = title;
		this.key = key;
		this.abstracts = abstracts;
		this.content = content;
		this.contentAddress = contentAddress;
		this.attachment = attachment;
		this.state = state;
		this.modifier = modifier;
		this.modifyTime = modifyTime;
		this.valid = valid;
		this.validDate = validDate;
		this.replyScope = replyScope;
		this.openness = openness;
		this.authorityScope = authorityScope;
		this.knowledgePath = knowledgePath;
		this.remark = remark;
	}
	public int getKnowledgeID() {
		return knowledgeID;
	}
	public void setKnowledgeID(int knowledgeID) {
		this.knowledgeID = knowledgeID;
	}
	public int getTypeID() {
		return typeID;
	}
	public void setTypeID(int typeID) {
		this.typeID = typeID;
	}
	public int getCreaterID() {
		return createrID;
	}
	public void setCreaterID(int createrID) {
		this.createrID = createrID;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public String getAbstracts() {
		return abstracts;
	}
	public void setAbstracts(String abstracts) {
		this.abstracts = abstracts;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getContentAddress() {
		return contentAddress;
	}
	public void setContentAddress(String contentAddress) {
		this.contentAddress = contentAddress;
	}
	public String getAttachment() {
		return attachment;
	}
	public void setAttachment(String attachment) {
		this.attachment = attachment;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getModifier() {
		return modifier;
	}
	public void setModifier(int modifier) {
		this.modifier = modifier;
	}
	public Date getModifyTime() {
		return modifyTime;
	}
	public void setModifyTime(Date modifyTime) {
		this.modifyTime = modifyTime;
	}
	public String getValid() {
		return valid;
	}
	public void setValid(String valid) {
		this.valid = valid;
	}
	public Date getValidDate() {
		return validDate;
	}
	public void setValidDate(Date validDate) {
		this.validDate = validDate;
	}
	public String getReplyScope() {
		return replyScope;
	}
	public void setReplyScope(String replyScope) {
		this.replyScope = replyScope;
	}
	public String getOpenness() {
		return openness;
	}
	public void setOpenness(String openness) {
		this.openness = openness;
	}
	public String getAuthorityScope() {
		return authorityScope;
	}
	public void setAuthorityScope(String authorityScope) {
		this.authorityScope = authorityScope;
	}
	public String getKnowledgePath() {
		return knowledgePath;
	}
	public void setKnowledgePath(String knowledgePath) {
		this.knowledgePath = knowledgePath;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	@Override
	public String toString() {
		return "knowledges [knowledgeID=" + knowledgeID + ", typeID=" + typeID
				+ ", createrID=" + createrID + ", createTime=" + createTime
				+ ", title=" + title + ", key=" + key + ", abstracts="
				+ abstracts + ", content=" + content + ", contentAddress="
				+ contentAddress + ", attachment=" + attachment + ", state="
				+ state + ", modifier=" + modifier + ", modifyTime="
				+ modifyTime + ", valid=" + valid + ", validDate=" + validDate
				+ ", replyScope=" + replyScope + ", openness=" + openness
				+ ", authorityScope=" + authorityScope + ", knowledgePath="
				+ knowledgePath + ", remark=" + remark + "]";
	}
	
	
	
	

}
