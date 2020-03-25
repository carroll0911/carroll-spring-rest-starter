package com.carroll.spring.rest.starter;

import io.swagger.annotations.ApiModelProperty;

/**
 * @author carroll
 * @Date 2017-07-25 18:06
 */
public class BaseResponse {
    @ApiModelProperty(value = "是否成功", required = true)
    private Boolean returnSuccess = true;

    @ApiModelProperty(value = "错误code")
    private String returnErrCode;

    @ApiModelProperty(value = "错误描述")
    private String returnErrMsg;

    public String getReturnErrCode() {
        return returnErrCode;
    }

    public void setReturnErrCode(String returnErrCode) {
        this.returnErrCode = returnErrCode;
    }

    public String getReturnErrMsg() {
        return returnErrMsg;
    }

    public void setReturnErrMsg(String returnErrMsg) {
        this.returnErrMsg = returnErrMsg;
    }

    public Boolean getReturnSuccess() {
        return returnSuccess;
    }

    public void setReturnSuccess(Boolean returnSuccess) {
        this.returnSuccess = returnSuccess;
    }

    public BaseResponse error(String errCode, String errMsg) {
        setReturnSuccess(false);
        setReturnErrCode(errCode);
        setReturnErrMsg(errMsg);
        return this;
    }

    public BaseResponse error(BaseEnum baseEnum) {
        setReturnSuccess(false);
        setReturnErrCode(baseEnum.getCode());
        setReturnErrMsg(baseEnum.getMsg());
        return this;
    }

    public BaseResponse() {

    }

    public BaseResponse(BaseEnum baseEnum) {
        this.returnSuccess = false;
        this.returnErrCode = baseEnum.getCode();
        this.returnErrMsg = baseEnum.getMsg();
    }
}
