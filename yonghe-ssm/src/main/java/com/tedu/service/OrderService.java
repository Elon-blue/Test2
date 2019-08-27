package com.tedu.service;

import java.util.List;

import com.tedu.pojo.Order;

/**
 * Service层的接口
 */
public interface OrderService {
	/** 1.查询所有订单信息 */
	List<Order> findAll();
	
	/** 2.根据id删除订单信息 */
	void deleteById(Integer id);
	
}








