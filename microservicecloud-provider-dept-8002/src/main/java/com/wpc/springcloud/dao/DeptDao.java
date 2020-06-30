package com.wpc.springcloud.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.wpc.springcloud.bean.Dept;

@Mapper
public interface DeptDao {
	public boolean addDept(Dept dept);

	public Dept findById(Long id);

	public List<Dept> findAll();
}
