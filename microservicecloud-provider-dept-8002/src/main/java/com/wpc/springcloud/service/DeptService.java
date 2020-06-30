package com.wpc.springcloud.service;

import java.util.List;

import com.wpc.springcloud.bean.Dept;

public interface DeptService {
	public boolean add(Dept dept);

	public Dept get(Long id);

	public List<Dept> list();

}
