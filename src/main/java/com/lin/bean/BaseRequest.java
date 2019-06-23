package com.lin.bean;

import com.thoughtworks.xstream.annotations.XStreamAlias;

import java.util.List;

public class BaseRequest {
    String reqName;
    Integer AppId;
    String RequestIp;
    String UserAgent;
//    = "Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/62.0.3202.62 Safari/537.36";

    public String getReqName() {
        return reqName;
    }

    public void setReqName(String reqName) {
        this.reqName = reqName;
    }

    public Integer getAppId() {
        return AppId;
    }

    public void setAppId(Integer appId) {
        AppId = appId;
    }

    public String getRequestIp() {
        return RequestIp;
    }

    public void setRequestIp(String requestIp) {
        RequestIp = requestIp;
    }

    public String getUserAgent() {
        return UserAgent;
    }

    public void setUserAgent(String userAgent) {
        UserAgent = userAgent;
    }
}