package cn.bdqn.pneureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class PnEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(PnEurekaApplication.class, args);
    }

}
