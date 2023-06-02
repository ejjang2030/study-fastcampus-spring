package com.litholr.study.fastcampus.spring.fastcampusspring.ioc;

import com.litholr.study.fastcampus.spring.fastcampusspring.ioc.di.Encoder;
import com.litholr.study.fastcampus.spring.fastcampusspring.ioc.di.UrlEncoder;

public class Main {
    public static void main(String[] args) {
        String url = "www.naver.com/books/it?page=12&size=10&name=springboot";

        Encoder encoder = new Encoder(new UrlEncoder());

        String result = encoder.encode(url);
        System.out.println(result);
    }
}
