package cn.pn.pncommodityprovider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class PnCommodityProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(PnCommodityProviderApplication.class, args);
    }

}
