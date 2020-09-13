package com.yvkam.metroline;

import com.yvkam.metroline.bam.BamClient;
import com.yvkam.metroline.bam.BamTimeline;
import graphql.kickstart.servlet.context.DefaultGraphQLServletContext;
import graphql.kickstart.tools.GraphQLQueryResolver;
import graphql.schema.DataFetchingEnvironment;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class Query implements GraphQLQueryResolver {

    private final CryptoClient cryptoClient;
    private final BamClient bamClient;
    private final List<MetrolineBuilder> metrolineBuilders;

    Metroline metroline(String token, DataFetchingEnvironment env) {
        DefaultGraphQLServletContext context = env.getContext();
        context.getHttpServletResponse().addHeader("test", "hello");
        String id = cryptoClient.decode(token);
        BamTimeline timeline = bamClient.getTimeline(id);
        return metrolineBuilders.stream()
                .filter(builder -> builder.supportedType(timeline.getType()))
                .findFirst()
                .map(builder -> builder.build(timeline))
                .orElseThrow(() -> new RuntimeException("Unsupported timeline type"));
    }
}
