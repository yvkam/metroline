package com.yvkam.metroline;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.graphql.spring.boot.test.GraphQLResponse;
import com.graphql.spring.boot.test.GraphQLTest;
import com.graphql.spring.boot.test.GraphQLTestTemplate;
import com.zhokhov.graphql.datetime.boot.GraphQLDateTimeAutoConfiguration;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(webEnvironment= SpringBootTest.WebEnvironment.RANDOM_PORT)
@Slf4j
class MetrolineTest {

    @Autowired
    private GraphQLTestTemplate graphQLTestTemplate;


    @Autowired
    private ObjectMapper objectMapper;


    @Test
    public void getMetroline() throws Exception {
        GraphQLResponse response = graphQLTestTemplate.postForResource("metroline.graphql");
        log.info("{}", response.getRawResponse());

        Metroline metroline = response.get("$.data", Metroline.class);
        assertThat(response.isOk()).isTrue();
        assertThat(metroline.stations.get(0).getId()).isEqualTo("SWAP");
    }

}
