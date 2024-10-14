package com.zaxxer.hikari.demo;

import com.zaxxer.hikari.demo.service.HikariService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.SQLException;

/**
 * @author 谢张兵
 * @version 1.0
 * @description:
 * @date 2024/9/27 16:28
 */
public class DemoApp {
   private static final Logger logger = LoggerFactory.getLogger(DemoApp.class);

   public static void main(String[] args) throws SQLException {
      HikariService service = new HikariService();
      logger.info("users:{}",service.getAllUser());
   }
}
