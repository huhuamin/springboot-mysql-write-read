package com.huhuamin.study.springbootmysqlwriteread.json;

public class JsonResult<T> {

    /**
     * statusCode 成功 返回 true 失败返回false
     */
    private Boolean success;
    /**
     * 内部错误码
     */
    private Integer code;
    /**
     * 错误描述
     */
    private String message;

    private T data;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public JsonResult(Boolean success) {
        this.success = success;
        if (success) {
            this.code = 200;
        } else {
            this.code = 700;
        }

    }

    /**
     * 拦截器获取的额外信息，自己解析json ，但是用custId
     */
    private String extra;

    public String getExtra() {
        return extra;
    }

    public void setExtra(String extra) {
        this.extra = extra;
    }

    public JsonResult() {

    }

    /**
     * 分页信息
     */

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {

        this.success = success;
        if (success) {
            this.code = 200;
        } else {
            this.code = 700;
        }
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }


}

