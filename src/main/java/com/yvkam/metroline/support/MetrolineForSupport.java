package com.yvkam.metroline.support;

import com.yvkam.metroline.Metroline;
import com.yvkam.metroline.MetrolineBuilder;
import com.yvkam.metroline.Station;
import com.yvkam.metroline.bam.BamTimeline;
import org.springframework.stereotype.Service;

import static java.util.List.of;

@Service
public class MetrolineForSupport implements MetrolineBuilder {
    private static final String SUPPORT = "SUPPORT";
    @Override
    public boolean supportedType(String metrolineType) {
        return SUPPORT.equals(metrolineType);
    }

    @Override
    public Metroline build(BamTimeline bamTimeline) {
        return new Metroline(of(new Station(bamTimeline.getId(), RequestCreationContent.builder().requestId("1234").build())));
    }
}
