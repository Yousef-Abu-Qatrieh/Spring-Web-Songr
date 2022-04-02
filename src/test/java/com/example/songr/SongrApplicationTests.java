package com.example.songr;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.songr.web.HelloController;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;

import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
@AutoConfigureMockMvc
@SpringBootTest
class SongrApplicationTests {

	@Test
	void contextLoads() {
	}
	@Autowired
	private MockMvc mockMvc;
	@Autowired
	private WebApplicationContext webApplicationContext;

	@Autowired
	HelloController helloController;

	@Test
	void helloWorlTest() throws Exception {

		mockMvc.perform(MockMvcRequestBuilders.get("/"))
				.andExpect(status().isOk())
				.andExpect(content().contentType("text/html;charset=UTF-8"))
				.andExpect(view().name("index"))
				.andExpect(content().string(Matchers.containsString("Welcome To Spring Class")));

}}
