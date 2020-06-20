package com.yvkam.metroline.bam;

import org.springframework.stereotype.Service;

import static java.util.List.of;

@Service
public class BamClient {

    public BamTimeline getTimeline(String id) {
        String timelineId = "SWAP".equals(id) ? "swapId" : "supportId";
        return new BamTimeline(timelineId, id, of(new BamMilestone(id)));
    }

}
