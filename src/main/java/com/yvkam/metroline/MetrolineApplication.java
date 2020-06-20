package com.yvkam.metroline;

import com.yvkam.metroline.support.RequestCreationContent;
import com.yvkam.metroline.swap.OrderCreationContent;
import graphql.kickstart.tools.SchemaParserDictionary;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MetrolineApplication {

    public static void main(String[] args) {
        SpringApplication.run(MetrolineApplication.class, args);
    }

    @Bean
    public SchemaParserDictionary schemaParserDictionary() {
        return new SchemaParserDictionary()
                .add(OrderCreationContent.class)
                .add(RequestCreationContent.class);
    }

}
