package org.airkerala;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "org.airkerala.*")
@EnableJpaRepositories(basePackages = "org.airkerala.dao")
@EntityScan(basePackages = "org.airkerala.entity")
public class FlightBookingAppStarter  {
    public static void main(String[] args) {
        SpringApplication.run(FlightBookingAppStarter.class, args);
    }
}