package com.yvkam.metroline.support;

import lombok.Data;

import java.time.OffsetDateTime;

@Data
public class Comment {
    private String value;
    private OffsetDateTime date;
}
