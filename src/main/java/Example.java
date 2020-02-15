import java.util.List;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.web.bind.annotation.*;

@RestController
@EnableAutoConfiguration
public class Example {

    @RequestMapping("/")
    String home(String name, String place) {
    	System.out.println("Test Line : "+name);
        return "Hello "+name+" from "+place+"!";
    }

    public static void main(String[] args) {
    	System.out.println("Test from Main");
    	//System.setProperty("spring.devtools.restart.enabled", "false");
        //SpringApplication.run(Example.class, args);
    	
    	SpringApplication app = new SpringApplication(Example.class);
    	app.setBannerMode(Banner.Mode.OFF);
    	//app.setWebApplicationType(WebApplicationType.NONE);
    	
    	app.run(args);
    }
}