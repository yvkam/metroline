package com.yvkam.metroline.swap;

import com.yvkam.metroline.StationContent;
import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class OrderCreationContent implements StationContent {
    private final String orderId;
}
