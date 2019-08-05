package com.kanika.knowyourshow.app.service;

import com.kanika.knowyourshow.app.Model.SearchResponse;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

@RunWith(MockitoJUnitRunner.class)
public class ShowInfoServiceUnitTest {

    @Mock
    private RestTemplate restTemplate;

    @InjectMocks
    private ShowInfoService showInfoService = new ShowInfoServiceImpl("/?type=series&page=10", new RestTemplateBuilder());

    @Test
    public void givenMockingIsDoneByMockito_whenGetIsCalled_shouldReturnMockedObject() throws Exception {
        SearchResponse mockedResponse = new SearchResponse();
        Mockito.when(restTemplate.exchange("/?type=series&page=10&t=homeland", HttpMethod.GET, null, SearchResponse.class))
                .thenReturn(new ResponseEntity<>(mockedResponse, HttpStatus.OK));

        SearchResponse searchResponse = showInfoService.getShowInfo("homeland");

        Assert.assertEquals(mockedResponse, searchResponse);
    }
}
