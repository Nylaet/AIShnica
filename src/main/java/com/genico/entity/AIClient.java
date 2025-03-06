package com.genico.entity;

public interface AIClient {
    String getName();
    String getDescription();
    String getBaseURL();
    String getApiKey();

    List<AIURL> getApiURLs();
    List<AISetting> getSettings();

    String generateResponse(String prompt);
}

