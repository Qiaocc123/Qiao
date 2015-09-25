package com.zimu.test;




import javax.annotation.Resource;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zimu.dao.knowledgeTypeDao;
import com.zimu.dao.knowledgesDao;
import com.zimu.entity.knowledgeType;
import com.zimu.entity.knowledges;

public class TestCase {
	
//	@Test
//	public void test(){
//		String conf = "applicationContext.xml";
//		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext(conf);
//		DataSource ds = ac.getBean("dbcp",DataSource.class);
//		System.out.println(ds);
//		SqlSessionFactory sf = ac.getBean("sqlsessionfactory",SqlSessionFactory.class);
//		System.out.println(sf);
//	}
	
	@Resource
    private knowledgeTypeDao knowledgeTypeDao;
	
	@Resource
    private knowledgesDao knowledgesDao;
	
	public void test1(){
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		knowledgeTypeDao = (knowledgeTypeDao)ctx.getBean("knowledgeTypeDao");		
		knowledgeType kt = new knowledgeType();
		kt.setTypeID(1);
		kt.setParentTypeID(1); 
		kt.setTypeName("name");
		
		knowledgeTypeDao.save(kt);
		System.out.println("添加成功");
		
	}
	
	@Test
	public void test2(){
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		knowledgeTypeDao = (knowledgeTypeDao)ctx.getBean("knowledgeTypeDao");
		int typeID = 1;
		knowledgeType knowledgeType = knowledgeTypeDao.findbyid(typeID);
		System.out.println(knowledgeType.getTypeID());
		System.out.println(knowledgeType.getParentTypeID());
		System.out.println(knowledgeType.getTypeName());
	}
	
	
	public void test3(){
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		knowledgeTypeDao = (knowledgeTypeDao)ctx.getBean("knowledgeTypeDao");
		int typeID = 2;
		knowledgeTypeDao.delect(typeID);
		System.out.println("删除成功");
	}
	
	
	public void test4(){
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		knowledgeTypeDao = (knowledgeTypeDao)ctx.getBean("knowledgeTypeDao");
		knowledgeType kt = new knowledgeType();
	    kt.setTypeID(1);
	    kt.setParentTypeID(2);
	    kt.setTypeName("name2");
	    knowledgeTypeDao.update(kt);
	    System.out.println("修改完成");
		
		
	}
	
	
	public void test5(){
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		knowledgesDao = (knowledgesDao)ctx.getBean("knowledgesDao");
		int typeID = 1;
		knowledges ks = knowledgesDao.find(typeID);
		
		System.out.println(ks.getTypeID());
	}
	

}
