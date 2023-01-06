package com.masai.app;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages= {"com.masai.app"})
public class GymConfig {
	
	@Bean
	public Person person() {
		
		Person prs=new Person();
		prs.setPerson_id(1);
		prs.setName("akram");
		prs.setAge(21);
		prs.setEmail("akram@gmail.com");
		prs.setMobile("905026578");
		return prs;
		
		
	}
	@Bean
	public Gym gym() {
		Gym gy=new Gym();
		gy.setGym_id(111);
		gy.setGym_name("anytime");
		gy.setMonthly_fee(1000);
		return gy;
		
	}
	
	

}
