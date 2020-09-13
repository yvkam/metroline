package com.yvkam.metroline.support;

import com.yvkam.metroline.StationContent;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class RequestCreationContent implements StationContent {
    private String requestId;
}
