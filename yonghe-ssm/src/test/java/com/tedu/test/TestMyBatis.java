package com.tedu.test;

import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.tedu.dao.DoorMapper;
import com.tedu.pojo.Door;

/** 测试mybatis的开发环境 
  *   查询tb_door表中的所有门店信息
 * */
public class TestMyBatis {
	public static void main(String[] args) throws Exception {
		//1.读取mybatis配置信息
		InputStream in = 
			Resources.getResourceAsStream(
			"mybatis/mybatis-config.xml");
		//2.获取SqlSessionFactory对象
		SqlSessionFactory fac =
			new SqlSessionFactoryBuilder()
			.build(in);
		//3.通过工厂获取SqlSession对象
		SqlSession session = fac.openSession();
		//4.执行sql,查询所有门店
		//>>获取DoorMapper接口的实例
		DoorMapper mapper = session
				.getMapper( DoorMapper.class );
		List<Door> list = mapper.findAll();
		
		//5.打印所有门店信息
		for(Door door : list) {
			System.out.println( door );
		}
	}
}





