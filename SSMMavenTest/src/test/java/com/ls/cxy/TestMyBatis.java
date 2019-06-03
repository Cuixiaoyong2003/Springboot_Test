package com.ls.cxy;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;
import com.ls.cxy.pojo.Person;
import com.ls.cxy.service.PersonService;

/**
 * 此测试类为暂时不使用Spring时，数据库连接情况下的一种测试方法
 * 
 * @author Cuixiaoyong
 *
 */
/* 此注解表示继承了SpringJUnit4ClassRunner类 */
@RunWith(SpringJUnit4ClassRunner.class)
/*@ContextConfiguration(locations = { "classpath:applicationContext.xml", "classpath:spring-mybatis.xml" })*/
@ContextConfiguration(locations = { "classpath:applicationContext.xml", "classpath:spring-mybatis-oracle.xml" })
public class TestMyBatis {

	/**
	 * 日志记录器
	 */
	private static Logger logger = Logger.getLogger(TestMyBatis.class);

	/**
	 * 引入数据库访问服务对象
	 */
	@Autowired
	private PersonService personService = null;

	@Test
	public void test1() {
		Person person = personService.getPersonById(3);
		// System.out.println(user.getUserName());
		// logger.info("值："+user.getUserName());
		logger.info(JSON.toJSONString(person));
		System.out.println("数据库对象："+JSON.toJSONString(person));
	}

}
