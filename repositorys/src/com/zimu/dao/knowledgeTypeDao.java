package com.zimu.dao;


import java.util.List;

import org.springframework.stereotype.Repository;

import com.zimu.entity.knowledgeType;

@Repository
public interface knowledgeTypeDao {
	
	public List<knowledgeType> findAll();
	
    public  knowledgeType findbyid(int typeID);
	
	public  void save(knowledgeType knowledgeType);
	
	public  int delect(Integer typeID);
	
	public int update(knowledgeType knowledgetype);

}
