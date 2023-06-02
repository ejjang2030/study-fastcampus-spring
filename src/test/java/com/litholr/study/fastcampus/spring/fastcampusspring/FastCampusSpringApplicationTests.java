package com.litholr.study.fastcampus.spring.fastcampusspring;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.litholr.study.fastcampus.spring.fastcampusspring.dto.User;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class FastCampusSpringApplicationTests {

	@Test
	void contextLoads() throws JsonProcessingException {
		System.out.println("----------------------");


		var objectMapper = new ObjectMapper();

		User user = new User(
				"eunjae",
				12,
				"1010101",
				"아하디"
		);

		var text = objectMapper.writeValueAsString(user);
		System.out.println(text);

		var userType = objectMapper.readValue(text, User.class);
		System.out.println(userType);
	}

}
