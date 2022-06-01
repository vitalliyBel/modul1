package com.rest.phoneCityService;

import com.rest.entity.Gorod;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.io.IOException;
import java.net.URL;



@Component
public class PhoneCityParser implements PhoneCityParserService{

    @Autowired
    private Gorod gorod;

    public Document getPage() throws IOException {

        String url="http://htmlweb.ru/geo/api.php?html&telcod="+gorod.getTel()+"";
        Document page = Jsoup.parse(new URL(url), 3000 );

        return page;
    }

    public Gorod getOurCity() throws IOException {

        Document page = getPage();
        Element tableTemp = page.select("a[class=b]").first();
        gorod.setCity(tableTemp.text());

        return gorod;
    }


}