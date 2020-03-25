package com.carroll.spring.rest.starter;

/**
 * @author carroll
 * @Date 2017-07-25 18:06
 */
public class BaseFallback {
    /**
     * hystrix fallback 方法
     * @param errCode
     * @param errMsg
     * @return
     */
    public BaseResponse fallBackResponse(String errCode, String errMsg) {
        BaseResponse response = new BaseResponse();
        response.setReturnSuccess(false);
        response.setReturnErrCode(errCode);
        response.setReturnErrMsg(errMsg);
        return response;
    }
}
