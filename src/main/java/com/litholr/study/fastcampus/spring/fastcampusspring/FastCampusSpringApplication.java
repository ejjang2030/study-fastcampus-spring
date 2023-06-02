package com.litholr.study.fastcampus.spring.fastcampusspring;

import com.litholr.study.fastcampus.spring.fastcampusspring.ioc.ioc.ApplicationContextProvider;
import com.litholr.study.fastcampus.spring.fastcampusspring.ioc.ioc.Base64Encoder;
import com.litholr.study.fastcampus.spring.fastcampusspring.ioc.ioc.Encoder;
import com.litholr.study.fastcampus.spring.fastcampusspring.ioc.ioc.UrlEncoder;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@SpringBootApplication
public class FastCampusSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(FastCampusSpringApplication.class, args);

		ApplicationContext context = ApplicationContextProvider.getContext();


//		Base64Encoder base64Encoder = context.getBean(Base64Encoder.class);
//		UrlEncoder urlEncoder = context.getBean(UrlEncoder.class);

		Encoder encoder = context.getBean("urlEncode", Encoder.class);
		String url = "www.naver.com/books/it?page=12&size=10&name=springboot";

		String result = encoder.encode(url);
		System.out.println(result);

//		encoder.setIEncoder(urlEncoder);
//
//		String urlResult = encoder.encode(url);
//		System.out.println(urlResult);
	}

}

@Configuration
class AppConfig {
	@Bean("base64Encode")
	public Encoder encoder(Base64Encoder base64Encoder) {
		return new Encoder(base64Encoder);
	}

	@Bean("urlEncode")
	public Encoder encoder(UrlEncoder urlEncoder) {
		return new Encoder(urlEncoder);
	}
}