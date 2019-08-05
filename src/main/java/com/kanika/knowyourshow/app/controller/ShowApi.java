package com.kanika.knowyourshow.app.controller;

import com.kanika.knowyourshow.app.Model.SearchResponse;
import com.kanika.knowyourshow.app.service.ShowInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api")
public class ShowApi {

    @Autowired
    private ShowInfoService showInfoService;

    @RequestMapping(value = "show/{name}", method = RequestMethod.GET, produces = "application/json")
    public SearchResponse findByName(@PathVariable("name") final String showName) {
        return showInfoService.getShowInfo(showName);
    }
}
