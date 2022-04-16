package pdp.uz.product;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author Hulkar,
 * @time сб 7:33.
 * @project 16.04.2022
 */
@SpringBootApplication
@EnableEurekaClient
public class ProductApplication {
    public static void main(String[] args) {
        SpringApplication.run(ProductApplication.class,args);
    }
}
