package com.alticor.prowl;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class EndpointRegistry {

    private static Properties endpoints;

    static {
        endpoints = new Properties();
        try {
            endpoints.load(ClassLoader.getSystemResourceAsStream("endpoint.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private EndpointRegistry() {
    }

    public static synchronized void register(String tag, String endpoint) {
        String existing = endpoints.getProperty(tag);

        if (existing == null) {
            endpoints.put(tag, endpoint);
        }
        // TODO: Handle case of duplicate tags
    }

    public static synchronized String getEndpoint(String tag) {
        return endpoints.getProperty(tag);
    }

    public static EndpointRegistry registerFromFile(File file) {
        FileInputStream inputStream = null;
        try {
            inputStream = new FileInputStream(file);
            endpoints.load(inputStream);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        return null;
    }
}
