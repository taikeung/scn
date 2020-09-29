package com.andy.scn.interfaces.facade;

import com.andy.scn.interfaces.fallback.TestFacadeFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "test-client",path = "/test",fallback = TestFacadeFallback.class)
public interface TestFacade {

    @RequestMapping(value = "/sayHi",method = RequestMethod.GET)
    String sayHi();

}
