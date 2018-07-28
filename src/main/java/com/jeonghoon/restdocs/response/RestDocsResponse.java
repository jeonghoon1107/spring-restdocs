package com.jeonghoon.restdocs.response;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Getter
@NoArgsConstructor
public class RestDocsResponse {
    private String name;

    @Builder
    public RestDocsResponse(@NonNull String name) {
        this.name = name;
    }
}
