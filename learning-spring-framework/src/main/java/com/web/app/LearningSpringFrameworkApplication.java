package com.web.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.web.app.enterprise.MyWebController;
import com.web.app.game.GameRunner;

@SpringBootApplication
public class LearningSpringFrameworkApplication {

	public static void main(String[] args) {
		
		//way-1
		/*
		 * SpringApplication.run(LearningSpringFrameworkApplication.class, args);
		 * SuperContraGame game1=new SuperContraGame(); Mario game2=new Mario(); PacMan
		 * pacMan=new PacMan(); GameRunner runner=new GameRunner(pacMan); runner.run();
		 */
		
		//way-2
		ConfigurableApplicationContext context = SpringApplication.run(LearningSpringFrameworkApplication.class, args);
		GameRunner runner = context.getBean(GameRunner.class);
		runner.run();
		
		MyWebController bean = context.getBean(MyWebController.class);
		System.out.println(bean.returnSumOfData());
		
		
	}

}
