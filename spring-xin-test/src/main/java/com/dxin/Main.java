package com.dxin;

import com.dxin.config.AppConfig;
import com.dxin.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author TangDx
 * @Date 2025/3/17 13:44
 * @ClassName:
 * @Description:
 * @Version 1.0
 */
public class Main {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
		UserService bean = (UserService) applicationContext.getBean("userService");
		System.out.println(bean);
		bean.test();
	}
}