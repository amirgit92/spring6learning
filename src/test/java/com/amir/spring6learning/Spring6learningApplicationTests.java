//package com.amir.spring6learning;
//
//import com.amir.spring6learning.controllers.MyController;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.context.ApplicationContext;
//
//import java.sql.SQLOutput;
//
//@SpringBootTest
//class Spring6learningApplicationTests {
//	@Autowired
//	ApplicationContext applicationContext;
//	@Autowired
//	MyController myController;
//
//	@Test
//	void testAutowiredOfController(){
//		System.out.println(myController.sayHello());
//	}
//	@Test
//	void testGetControllerFromCtx(){
//		MyController controller = applicationContext.getBean(MyController.class);
//		System.out.println(controller.sayHello());
//	}
//
//	@Test
//	void contextLoads() {
//	}
//
//}
