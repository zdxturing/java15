package com.turing.mybaits.test;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.turing.mybaits.entity.Staff;
import com.turing.mybaits.mapper.StaffMapper;

public class MyBaitsText {
	
	//SqlSessionFactory方法
	private static SqlSessionFactory getSqlSessionFactory() throws IOException {
		//设置mybaits主配置文件路径
		String resource = "mybaits-comfig.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		return sqlSessionFactory;
	}

	public static void main(String[] args) {
		SqlSession session = null;
		try {
			//会话对象(其实就是以前的connection对象)
			//打开会话
			session = getSqlSessionFactory().openSession();
			//创建StaffMapper对象
			StaffMapper mapper = session.getMapper(StaffMapper.class);
			//调用接口的方法
			Staff sta = mapper.getstaById(1);
			//打印数据
			System.out.println(sta);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			//关闭会话
			session.close();
		}
	}

	
}
