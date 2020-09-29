package com.andy.scn.interfaces.fallback;

import com.andy.scn.interfaces.facade.TestFacade;
import org.springframework.boot.jackson.JsonComponent;

@JsonComponent
public class TestFacadeFallback implements TestFacade {

    @Override
    public String sayHi() {
        return "say hello";
    }
}
