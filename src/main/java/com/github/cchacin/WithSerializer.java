package com.github.cchacin;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.time.ZonedDateTime;

@JsonSerialize(using = Serializer.class)
public class WithSerializer {
    private final String        a;
    private final Long          b;
    private final Integer       c;
    private final ZonedDateTime d;

    public WithSerializer(final String a,
                          final Long b,
                          final Integer c,
                          final ZonedDateTime d) {
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
