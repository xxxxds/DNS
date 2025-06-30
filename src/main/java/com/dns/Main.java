package com.dns;

/**
 * DNS项目主类
 * 
 * @author DNS Team
 * @version 1.0.0
 */
public class Main {
    
    public static void main(String[] args) {
        System.out.println("欢迎使用DNS Java项目！");
        System.out.println("项目已成功启动");
        
        // 示例功能
        DNSService service = new DNSService();
        service.start();
    }
} 