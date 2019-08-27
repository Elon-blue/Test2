package com.tedu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tedu.pojo.Door;
import com.tedu.pojo.Order;
import com.tedu.service.DoorService;
import com.tedu.service.OrderService;

@Controller
public class OrderController {
	
	@Autowired
	OrderService orderService;
	@Autowired
	DoorService doorService;
	
	/** 1.查询所有订单信息 */
	@RequestMapping("/orderList")
	public String orderList(Model model) {
		//查询所有门店集合
		List<Door> doorList = doorService.findAll();
		//将门店集合存入model中
		model.addAttribute("doorList", doorList);
		
		//查询所有订单集合
		List<Order> orderList = 
				orderService.findAll();
		//将订单集合存入model中
		model.addAttribute("orderList", orderList);
		for(Order o:orderList) {
			System.out.println( o );
		}
		//转向order_list.jsp页面进行显示
		return "order_list";
	}
	
	/** 2.根据id删除订单信息 */
	@RequestMapping("/orderDelete")
	public String orderDelete(Integer id) {
		//调用service方法,根据id删除订单
		orderService.deleteById( id );
		//转向 /orderList, 重新查询所有订单
		return "forward:/orderList";
	}
	
	/** 3.跳转到新增订单页面, 跳转的同时
	 * 查询出所有门店, 将所有门店带到
	 * 新增订单页面 */
	@RequestMapping("/toOrderAdd")
	public String toOrderAdd(Model model) {
		//查询所有门店集合
		List<Door> doorList = doorService.findAll();
		//将门店集合存入model中
		model.addAttribute("dList", doorList);
		
		return "order_add";
	}
	
}







