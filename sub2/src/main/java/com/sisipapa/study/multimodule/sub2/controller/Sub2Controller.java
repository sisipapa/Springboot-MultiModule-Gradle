package com.sisipapa.study.multimodule.sub2.controller;

import com.sisipapa.study.multimodule.common.service.CommonService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
public class Sub2Controller {

    private CommonService service;

    @GetMapping("/sub2")
    public String index(){
        return service.getIndex("sub2");
    }

}
