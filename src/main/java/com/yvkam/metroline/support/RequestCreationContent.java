package com.yvkam.metroline.support;

import com.yvkam.metroline.StationContent;
import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class RequestCreationContent implements StationContent {
    private final String requestId;
}
