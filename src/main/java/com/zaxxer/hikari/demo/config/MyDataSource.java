package com.zaxxer.hikari.demo.config;


import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * @author 谢张兵
 * @version 1.0
 * @description:
 * @date 2024/9/26 16:54
 */
public class MyDataSource {
   static Logger logger = LoggerFactory.getLogger(MyDataSource.class);
   private static final HikariDataSource HIKARI_DATA_SOURCE;
   private static final HikariConfig CONFIG;

   static {
      CONFIG = new HikariConfig("/config/dataSource.properties");
      HIKARI_DATA_SOURCE = new HikariDataSource(CONFIG);
      logger.debug("总连接数 => {}", HIKARI_DATA_SOURCE.getPool().getTotalConnections());
      logger.debug("空闲连接数 =>{}", HIKARI_DATA_SOURCE.getPool().getIdleConnections());
   }

   public static Connection getConnection() throws SQLException {
      return HIKARI_DATA_SOURCE.getConnection();
   }


}
