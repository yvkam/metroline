package com.yvkam.metroline;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.List;

@Getter
@RequiredArgsConstructor
public class Metroline {
    public final List<Station> stations;
}
