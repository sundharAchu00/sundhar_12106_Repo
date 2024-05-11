package com.sbmobilerepairapp;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.sbmobilerepairapp.controller.UserController;
import com.sbmobilerepairapp.entity.User;

@SpringBootTest
class UserTest {

	@Autowired
	private UserController controller;

	@Test
	void getShopsByIdPositive() {

		User user = controller.getById(1);

		assertThat(user).isNotNull();

	}

}
