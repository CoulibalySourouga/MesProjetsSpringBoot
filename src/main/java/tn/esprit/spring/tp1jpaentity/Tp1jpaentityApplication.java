package tn.esprit.spring.tp1jpaentity;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.stereotype.Service;
import tn.esprit.spring.entity.*;

import java.util.Date;

@SpringBootApplication
@EntityScan(basePackages ={"tn.esprit.spring.entity"} )
@Slf4j
@Service
public class Tp1jpaentityApplication {

    public static void main(String[] args) {
        log.info("First message");

        SpringApplication.run(Tp1jpaentityApplication.class, args);

    }

}
