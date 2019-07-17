package cn.pn.pncommodityconsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class PnCommodityConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(PnCommodityConsumerApplication.class, args);
    }

}
