package com.rest.controller;

import com.rest.entity.Gorod;
import com.rest.phoneCityService.PhoneCityParserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.io.IOException;


@RestController //Класс управляет рест запросами и ответами
@RequestMapping("/api")
public class MyRESTController {

    @Autowired
    private PhoneCityParserService phoneCityParserService;

    //тут объект в json
//    @GetMapping("/city")
//    public Gorod showCity() throws IOException {
//       Gorod gorod = phoneCityParserService.getOurCity();
//        return gorod;
//    }

    //тут строку выводим, чтобы легче спарсить
    @GetMapping("/city")
    public String showCity() throws IOException {
       Gorod ourGorod = phoneCityParserService.getOurCity();
        System.out.println(ourGorod.getCity());
        return ourGorod.getCity();
    }
}
