package com.zimu.service;


import java.util.List;

import javax.annotation.Resource;

import com.zimu.dao.knowledgeTypeDao;
import com.zimu.entity.knowledgeType;

public class knowledgeTypeService implements knowledgeTypeDao{
	
	@Resource
	private knowledgeTypeDao knowledgeTypeDao;
	

	@Override
	public knowledgeType findbyid(int typeID) {
		knowledgeType knowledgeType = knowledgeTypeDao.findbyid(typeID);
		return knowledgeType;
	}

	@Override
	public void save(knowledgeType knowledgetype) {
		knowledgeTypeDao.save(knowledgetype);
	}

	@Override
	public int delect(Integer typeID) {
		return knowledgeTypeDao.delect(typeID);
	}

	@Override
	public int update(knowledgeType knowledgetype) {
		return knowledgeTypeDao.update(knowledgetype);
	}

	@Override
	public List<knowledgeType> findAll() {
		List<knowledgeType> list = knowledgeTypeDao.findAll();
		return list;
	}

}
