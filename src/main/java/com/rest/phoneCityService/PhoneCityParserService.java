package com.rest.phoneCityService;

import com.rest.entity.Gorod;
import java.io.IOException;

public interface PhoneCityParserService {

    public Gorod getOurCity() throws IOException;

}
