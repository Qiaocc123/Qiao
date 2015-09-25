package com.zimu.service;

import javax.annotation.Resource;

import com.zimu.dao.knowledgesDao;
import com.zimu.entity.knowledges;

public class knowledgesService implements knowledgesDao{
	
	@Resource
	private knowledgesDao knowledgesDao;

	@Override
	public knowledges find(int typeID) {
		knowledges knowledges = knowledgesDao.find(typeID);
		return knowledges;
	}

	@Override
	public void saves(knowledges knowledges) {
		knowledgesDao.saves(knowledges);
	}

	@Override
	public int delects(int typeID) {
		return knowledgesDao.delects(typeID);
	}

	@Override
	public int updates(knowledges knowledges) {
		return knowledgesDao.updates(knowledges);
	}
	
	

}
