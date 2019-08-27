package com.tedu.dao;

import java.util.List;

import com.tedu.pojo.Order;

/**
 * Dao层接口
 */
public interface OrderMapper {
	/** 1.查询所有订单信息 */
	List<Order> findAll();
	
	/** 2.根据id删除订单信息 */
	void deleteById(Integer id);
	
}






