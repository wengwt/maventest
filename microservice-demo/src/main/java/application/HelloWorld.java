package application;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {


    private Logger logger = LoggerFactory.getLogger(HelloWorld.class);

    @RequestMapping("/")
    public String helloworld(){
    	String msg = "hello world !!!";
    	logger.info(msg);
        return msg;
        
    }

}
