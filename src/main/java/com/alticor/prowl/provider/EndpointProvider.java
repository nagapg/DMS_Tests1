package com.alticor.prowl.provider;

import com.alticor.prowl.EndpointRegistry;

public class EndpointProvider {
    public static String getEndpoint() {
        String target = System.getenv("TARGET");
        String baseUrl = null;

        if (target == null) {
            target = "magic.qa";
        }
        return EndpointRegistry.getEndpoint(target);
    }
}
