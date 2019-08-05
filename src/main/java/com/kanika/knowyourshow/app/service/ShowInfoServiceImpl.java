package com.kanika.knowyourshow.app.service;

import com.kanika.knowyourshow.app.Model.SearchResponse;
import com.kanika.knowyourshow.app.handler.RestTemplateResponseErrorHandler;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ShowInfoServiceImpl implements ShowInfoService{

    private String endPoint;
    private RestTemplate restTemplate;

    public ShowInfoServiceImpl(@Value("${ShowInfoServiceImpl.endPoint}")String endPoint, RestTemplateBuilder restTemplateBuilder) {
        this.endPoint = endPoint;
        restTemplate = restTemplateBuilder
                .errorHandler(new RestTemplateResponseErrorHandler())
                .build();

    }

    @Override
    public SearchResponse getShowInfo(String showName) {
        ResponseEntity<SearchResponse> response = restTemplate.exchange(endPoint + "&t=" + showName , HttpMethod.GET, null, SearchResponse.class);
        return response.getBody();
    }
}
