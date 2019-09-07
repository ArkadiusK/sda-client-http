package com.sda.http.httpRequester;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class HttpRequesterApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(HttpRequesterApplication.class, args);

        executeMySmallTest();

        context.close();
    }

    private static void executeMySmallTest() {
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> response = restTemplate.getForEntity("http://google.com",
                String.class);
        String body = response.getBody();

        System.out.println(body);
    }


}
