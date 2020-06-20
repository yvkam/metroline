package com.yvkam.metroline.bam;

import lombok.Data;

import java.util.List;

@Data
public class BamTimeline {
    private final  String id;
    private final  String type;
    private final List<BamMilestone> milestones;
}
