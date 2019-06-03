package com.ls.cxy.service.impl;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ls.cxy.dao.PersonDao;
import com.ls.cxy.pojo.Person;
import com.ls.cxy.service.PersonService;

/**
 * @author Cuixiaoyong
 *
 */
@Service
public class PersonServiceImpl implements PersonService {

	/**
	 * 此处@Autowired 和 @Resource注解都可用使用
	 */
	@Autowired
	private PersonDao personDao;

	@Override
	public Person getPersonById(int personId) {
		// TODO Auto-generated method stub
		Person person = this.personDao.selectByPrimaryKey(personId);
		return person;
	}

}
