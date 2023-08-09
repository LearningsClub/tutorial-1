package com.tutorial.api;

import com.tutorial.api.lombok.annotations.FirstAnno;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TutorialAPIApplication {

	public static void main(String[] args) {
		SpringApplication.run(TutorialAPIApplication.class, args);

		TutorialAPIApplication t = new TutorialAPIApplication();
		Class c = t.getClass();

		FirstAnno an = (FirstAnno) c.getAnnotation(FirstAnno.class);
		System.out.println(an.myName());
	}

}
