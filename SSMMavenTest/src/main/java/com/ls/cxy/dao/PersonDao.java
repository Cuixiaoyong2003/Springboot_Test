package com.ls.cxy.dao;

import com.ls.cxy.pojo.Person;

public interface PersonDao {
	int deleteByPrimaryKey(Integer id);

	int insert(Person record);

	int insertSelective(Person record);

	Person selectByPrimaryKey(Integer id);

	int updateByPrimaryKeySelective(Person record);

	int updateByPrimaryKey(Person record);
}