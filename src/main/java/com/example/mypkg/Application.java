package com.example.mypkg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {

	private Map<String,Object> cache= new HashMap<String,Object>()
	private static final String REST_URL="https:www.equifax.com/getScores";


	public static void main(String[] args) {
		ConfigurableApplicationContext run=SpringApplication.run(Application.class, args);
		//Changes for HIS-134
		run.close();
	}

	//HIS-301 changes
	public void loadDateToCache(){
		//logic goes here
}

}
