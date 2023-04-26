package com.cy.store;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;

@SpringBootTest
class StoreApplicationTests {

	@Autowired
	private DataSource dataSource;

	// 验证是否正常加载上下文
	@Test
	void contextLoads() {
	}

	// HikariPool
	@Test
	public void getConnection() throws Exception {
		System.out.println(dataSource.getConnection());
	}

}
