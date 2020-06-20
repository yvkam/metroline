package com.yvkam.metroline;

import graphql.kickstart.tools.GraphQLQueryResolver;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.stereotype.Service;

import static java.util.List.of;

@Getter
@AllArgsConstructor
@Service
public class Query implements GraphQLQueryResolver {

    public Metroline metroline() {
        return new Metroline(of(new Station("1")));
    }
}
