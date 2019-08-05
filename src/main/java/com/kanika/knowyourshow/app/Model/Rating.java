package com.kanika.knowyourshow.app.Model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Rating {

    @JsonProperty("Source")
    String source;

    @JsonProperty("Value")
    String value;
}
