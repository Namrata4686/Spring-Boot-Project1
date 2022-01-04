package com.namrata.SpringBootProject1;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
 @RestController
public class HelloController {

	 @GetMapping("/helloworld")
		public String helloworld()
		{
		String s= "Hello World ! ...";
		return s;
		}
}
