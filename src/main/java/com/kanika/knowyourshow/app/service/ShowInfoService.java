package com.kanika.knowyourshow.app.service;

import com.kanika.knowyourshow.app.Model.SearchResponse;

public interface ShowInfoService {
    SearchResponse getShowInfo(String showName);
}
