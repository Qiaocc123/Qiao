package com.zimu.dao;

import com.zimu.entity.knowledges;

public interface knowledgesDao {
	
	public knowledges find(int typeID);
	
	public  void saves(knowledges knowledges);
	
	public int delects(int typeID);
	
	public int updates(knowledges knowledges);
	
	

}
