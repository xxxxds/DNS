package com.dns;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * DNS服务测试类
 * 
 * @author DNS Team
 * @version 1.0.0
 */
public class DNSServiceTest {
    
    private DNSService dnsService;
    
    @BeforeEach
    void setUp() {
        dnsService = new DNSService();
    }
    
    @Test
    void testServiceStartStop() {
        // 测试服务初始状态
        assertFalse(dnsService.isRunning(), "服务初始状态应为停止");
        
        // 测试启动服务
        dnsService.start();
        assertTrue(dnsService.isRunning(), "服务启动后状态应为运行中");
        
        // 测试停止服务
        dnsService.stop();
        assertFalse(dnsService.isRunning(), "服务停止后状态应为停止");
    }
    
    @Test
    void testDomainResolve() {
        // 测试服务未启动时的域名解析
        String result = dnsService.resolveDomain("example.com");
        assertEquals("服务未启动，无法解析域名", result, "服务未启动时应返回错误信息");
        
        // 启动服务后测试域名解析
        dnsService.start();
        result = dnsService.resolveDomain("example.com");
        assertTrue(result.contains("example.com"), "解析结果应包含域名");
        assertTrue(result.contains("192.168.1.1"), "解析结果应包含IP地址");
    }
    
    @Test
    void testMultipleStart() {
        // 测试重复启动
        dnsService.start();
        assertTrue(dnsService.isRunning(), "首次启动后服务应为运行状态");
        
        dnsService.start(); // 重复启动
        assertTrue(dnsService.isRunning(), "重复启动后服务仍应为运行状态");
    }
    
    @Test
    void testMultipleStop() {
        // 测试重复停止
        dnsService.stop(); // 未启动时停止
        assertFalse(dnsService.isRunning(), "未启动时停止，服务状态应为停止");
        
        dnsService.start();
        dnsService.stop();
        dnsService.stop(); // 重复停止
        assertFalse(dnsService.isRunning(), "重复停止后服务状态应为停止");
    }
} 