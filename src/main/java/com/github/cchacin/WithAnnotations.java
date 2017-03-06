package com.github.cchacin;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.ZonedDateTime;

public class WithAnnotations {
    private final String        a;
    private final Long          b;
    private final Integer       c;
    private final ZonedDateTime d;

    @JsonCreator
    public WithAnnotations(@JsonProperty("a") final String a,
                           @JsonProperty("b") final Long b,
                           @JsonProperty("c") final Integer c,
                           @JsonProperty("d") final ZonedDateTime d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    public String getA() {
        return a;
    }

    public Long getB() {
        return b;
    }

    public Integer getC() {
        return c;
    }

    public ZonedDateTime getD() {
        return d;
    }
}
