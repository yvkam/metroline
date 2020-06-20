package com.yvkam.metroline;

import com.yvkam.metroline.bam.BamTimeline;

public interface MetrolineBuilder {
    boolean supportedType(String metrolineType);
    Metroline build(BamTimeline bamTimeline);
}
