package com.lin.bean;

import com.thoughtworks.xstream.annotations.XStreamAlias;

import java.util.List;

@XStreamAlias("request")
public class AuthRequest extends BaseRequest{
    private Params params;
    public Params getParams() {
        return params;
    }

    public void setParams(Params params) {
        this.params = params;
    }
    @XStreamAlias("params")
    public static class Params{
        String Name;
        String Pwd;
        String Sid;

        public String getName() {
            return Name;
        }

        public void setName(String name) {
            Name = name;
        }

        public String getPwd() {
            return Pwd;
        }

        public void setPwd(String pwd) {
            Pwd = pwd;
        }

        public String getSid() {
            return Sid;
        }

        public void setSid(String sid) {
            Sid = sid;
        }
    }

}
