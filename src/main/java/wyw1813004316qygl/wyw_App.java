package wyw1813004316qygl;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
@MapperScan("wyw1813004316qygl.dao")
@SpringBootApplication
public class wyw_App {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(wyw_App.class, args);
	}

}
