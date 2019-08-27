package com.tedu.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tedu.pojo.Door;

/** 1.测试spring的开发环境  */
public class TestSpring {
	public static void main(String[] args) {
		//1.读取spring的核心配置文件
		ClassPathXmlApplicationContext ac = 
			new ClassPathXmlApplicationContext(
			"spring/applicationContext.xml" );
		
		//2.通过spring容器获取Door类的对象
		Door door = (Door) ac.getBean("door");
		System.out.println( door );
		
	}
}


