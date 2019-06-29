package com.yao.webview;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import com.spring4all.swagger.EnableSwagger2Doc;

@SpringBootApplication
@EnableEurekaClient//将当前服务注册到Eureka上
@EnableSwagger2Doc //生成swagger文档
public class AppWebView
{
	 public static void main( String[] args )
   {
       SpringApplication.run(AppWebView.class, args);
   }
}
