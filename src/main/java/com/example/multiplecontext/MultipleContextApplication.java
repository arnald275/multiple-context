package com.example.multiplecontext;

import com.example.multiplecontext.childwebcontext.ChildContext;
import com.example.multiplecontext.parentcontext.ParentContext;
import com.example.multiplecontext.siblingcontext.SiblingContext;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;



public class MultipleContextApplication {

	public static void main(String[] args) {

		SpringApplicationBuilder parentBuilder =
				new SpringApplicationBuilder(ParentContext.class)
						.web(WebApplicationType.NONE);
		parentBuilder.run(args);
		parentBuilder.child(ChildContext.class)
				.properties("spring.config.name=ChildContext").run(args);
		parentBuilder.child(SiblingContext.class)
				.properties("spring.config.name=SiblingContext").run(args);
	}

}
