package com.tedu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tedu.dao.OrderMapper;
import com.tedu.pojo.Order;

@Service
public class OrderServiceImpl 
		implements OrderService{
	@Autowired
	OrderMapper dao;
	
	/** 1.查询所有订单信息 */
	@Override
	public List<Order> findAll() {
		List<Order> list = dao.findAll();
		return list;
	}
	
	/** 2.根据id删除订单信息 */
	@Override
	public void deleteById(Integer id) {
		dao.deleteById( id );
	}
	
	
}








