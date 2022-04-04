package com.zemoga.zemogaportfolioapp.api.model.response;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class BaseResponse<T> {
    private T data;

    public static <T> BaseResponse<T> build(T response) {
        BaseResponse<T> resp = new BaseResponse<>();
        resp.setData(response);
        return resp;
    }
}
