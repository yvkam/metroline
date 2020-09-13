package com.yvkam.metroline.swap;

import com.yvkam.metroline.Metroline;
import com.yvkam.metroline.MetrolineBuilder;
import com.yvkam.metroline.Station;
import com.yvkam.metroline.bam.BamTimeline;
import org.springframework.stereotype.Service;

import static java.util.List.of;

@Service
public class MetrolineForSwap implements MetrolineBuilder {
    private static final String SWAP = "SWAP";
    @Override
    public boolean supportedType(String metrolineType) {
        return SWAP.equals(metrolineType);
    }

    @Override
    public Metroline build(BamTimeline bamTimeline) {
        return new Metroline(of(new Station(bamTimeline.getId(), new OrderCreationContent("RMTDGXCVG"))));
    }
}
