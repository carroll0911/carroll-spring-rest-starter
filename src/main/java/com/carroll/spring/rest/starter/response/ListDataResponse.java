package com.carroll.spring.rest.starter.response;

import com.carroll.spring.rest.starter.BaseEnum;
import com.carroll.spring.rest.starter.BaseResponse;

import java.util.List;

/**
 * @author: carroll.he
 * @date 2022/4/13 
 */

public class ListDataResponse<T> extends BaseResponse {

    private List<T> data;

    public ListDataResponse(final List<T> data) {
        this.data = data;
    }

    public ListDataResponse() {
    }

    public List<T> getData() {
        return data;
    }

    public void setData(final List<T> data) {
        this.data = data;
    }
}