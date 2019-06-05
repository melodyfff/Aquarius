package com.xinchen.aquarius.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * {@link EnableDiscoveryClient} 和 EnableEurekaClient 都是能够让注册中心能够发现，扫描到该服务
 *
 * EnableEurekaClient 只适用于Eureka作为注册中心
 * {@link EnableDiscoveryClient} 可以是其他注册中心
 *
 * <p>
 *      {@link EnableHystrix} 开启 Hystrix 断路器监控
 * </p>
 *
 *
 * <p>
 *     {@link EnableHystrixDashboard} 开启Hystrix 断路器监控页面
 *     访问 http://localhost:9000/hystrix
 *     依次输入 http://localhost:9000/actuator/hystrix.stream 、2000 、hello
 * </p>
 *
 */
@EnableHystrix
@EnableHystrixDashboard
@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
public class ConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerApplication.class, args);
    }

}
