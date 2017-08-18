package com.mvision.exampleapi;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ExampleapiApplicationTests {

	@Bean
	public Gson gsonBean(){
		return new GsonBuilder().create();
	}

	@Test
	public void contextLoads() {
	}

}
