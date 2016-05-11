package com.alticor.prowl;

public class EndpointProvider {
    public static String getEndpoint() {
        String target = System.getenv("TARGET");
        String baseUrl = null;

        if (target == null) {
            target = "magic.dev";
        }
        return EndpointRegistry.getEndpoint(target);
    }
}
