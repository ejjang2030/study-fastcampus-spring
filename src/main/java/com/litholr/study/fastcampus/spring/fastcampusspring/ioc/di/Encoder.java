package com.litholr.study.fastcampus.spring.fastcampusspring.ioc.di;

public class Encoder {

    private IEncoder iEncoder;

    public Encoder(IEncoder iEncoder) {
        this.iEncoder = iEncoder;
    }
    public String encode(String message) {
        return iEncoder.encode(message);
    };

    public void setEncoder(IEncoder iEncoder) {

    }
}
