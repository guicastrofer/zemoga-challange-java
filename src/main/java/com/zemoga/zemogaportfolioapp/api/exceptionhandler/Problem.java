package com.zemoga.zemogaportfolioapp.api.exceptionhandler;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;

import java.time.OffsetDateTime;
import java.util.List;

@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Problem {
    private Integer status;
    private OffsetDateTime time;
    private String message;
    private List<Field> fields;

    @Getter
    @Setter
    public static class Field {
        private String name;
        private String message;

        public Field(String name, String message) {
            this.name = name;
            this.message = message;
        }
    }
}
