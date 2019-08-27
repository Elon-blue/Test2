package com.tedu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tedu.dao.DoorMapper;
import com.tedu.pojo.Door;

/** 注解的作用:
 * (1)标识当前类属于Service层
 * (2)将当前类的对象的创建交给Spring容器
 * 最后该对象会赋值给, 同类型的且带有
 * @Autowired 注解的变量 
 */
@Service
public class DoorServiceImpl 
		implements DoorService{
	@Autowired
	DoorMapper dao;
	
	@Override
	public List<Door> findAll() {
		//调用dao层的方法,查询所有门店
		List<Door> list = dao.findAll();
		return list;
	}
	
	/** 2.根据id删除门店 */
	@Override
	public void deleteById(Integer id) {
		dao.deleteById( id );
	}
	
	/** 3.新增门店信息 */
	@Override
	public void addDoor(Door door) {
		dao.addDoor( door );
	}
	
	/** 4.根据id查询门店详情信息 */
	@Override
	public Door findById(Integer id) {
		Door door = dao.findById( id );
		return door;
	}
	
	/** 5.根据id修改门店信息 */
	@Override
	public void updateById(Door door) {
		dao.updateById( door );
	}

}




