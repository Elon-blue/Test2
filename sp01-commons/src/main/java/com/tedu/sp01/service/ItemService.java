package com.tedu.sp01.service;

import java.util.List;

import com.tedu.sp01.pojo.Item;

public interface ItemService {
	/*
	 通过订单Id获取商品列表
	 */
	List<Item> getItems(String orderId);
	/*
	 减少商品数量
	 */
	void decreaseNumbers(List<Item> list);
}
