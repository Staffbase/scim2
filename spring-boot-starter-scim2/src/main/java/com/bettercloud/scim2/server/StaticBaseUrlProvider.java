package com.bettercloud.scim2.server;

import jakarta.validation.constraints.NotBlank;

public class StaticBaseUrlProvider implements BaseUrlProvider {
    private final String baseUrl;

    public StaticBaseUrlProvider(@NotBlank String baseUrl) {
        this.baseUrl = baseUrl;
    }

    @Override
    public String getBaseUrl() {
        return baseUrl;
    }
}
