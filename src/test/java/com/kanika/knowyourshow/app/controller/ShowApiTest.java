package com.kanika.knowyourshow.app.controller;

import com.kanika.knowyourshow.app.Model.SearchResponse;
import com.kanika.knowyourshow.app.service.ShowInfoService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.is;
import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(ShowApi.class)
public class ShowApiTest {

    @Autowired
    private MockMvc mvc;

    @MockBean
    private ShowInfoService service;

    @Test
    public void givenShowName_whenGetShowInfo_thenReturnJsonResult()
            throws Exception {

        SearchResponse searchResponse = new SearchResponse();
        searchResponse.setTitle("homeland");

        given(service.getShowInfo("homeland")).willReturn(searchResponse);

        mvc.perform(get("/api/show/homeland")
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("Title", is(searchResponse.getTitle())));
    }
}
