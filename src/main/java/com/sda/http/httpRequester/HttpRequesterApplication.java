package com.sda.http.httpRequester;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.http.*;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;

@SpringBootApplication
public class HttpRequesterApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(HttpRequesterApplication.class, args);

        executeMySmallTest();

        context.close();
    }

    private static void executeMySmallTest() {
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        headers.add("user-agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/54.0.2840.99 Safari/537.36");
        HttpEntity<String> entity = new HttpEntity<String>("parameters", headers);

        ResponseEntity<Object> exchange = restTemplate.exchange("https://api.punkapi.com/v2/beers/1", HttpMethod.GET, entity, Object.class);

        System.out.println(exchange.getBody());
    }


}
