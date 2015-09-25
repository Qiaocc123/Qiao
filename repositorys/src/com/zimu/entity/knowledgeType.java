package com.zimu.entity;

public class knowledgeType {
	
	private int typeID;
	private int parentTypeID;
	private String typeName;
	
    public knowledgeType(){
		
	}
	public knowledgeType(int typeID, int parentTypeID, String typeName) {
		this.typeID = typeID;
		this.parentTypeID = parentTypeID;
		this.typeName = typeName;
	}
	public int getTypeID() {
		return typeID;
	}
	public void setTypeID(int typeID) {
		this.typeID = typeID;
	}
	public int getParentTypeID() {
		return parentTypeID;
	}
	public void setParentTypeID(int parentTypeID) {
		this.parentTypeID = parentTypeID;
	}
	public String getTypeName() {
		return typeName;
	}
	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}
	@Override
	public String toString() {
		return "knowledgeType [typeID=" + typeID + ", parentTypeID="
				+ parentTypeID + ", typeName=" + typeName + "]";
	}

}
