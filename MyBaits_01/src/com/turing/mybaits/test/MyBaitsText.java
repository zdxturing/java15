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
	
	//SqlSessionFactory����
	private static SqlSessionFactory getSqlSessionFactory() throws IOException {
		//����mybaits�������ļ�·��
		String resource = "mybaits-comfig.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		return sqlSessionFactory;
	}

	public static void main(String[] args) {
		SqlSession session = null;
		try {
			//�Ự����(��ʵ������ǰ��connection����)
			//�򿪻Ự
			session = getSqlSessionFactory().openSession();
			//����StaffMapper����
			StaffMapper mapper = session.getMapper(StaffMapper.class);
			//���ýӿڵķ���
			Staff sta = mapper.getstaById(1);
			//��ӡ����
			System.out.println(sta);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			//�رջỰ
			session.close();
		}
	}

	
}
