package com.sisipapa.study.multimodule.common.controller;

import com.sisipapa.study.multimodule.common.service.CommonService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
public class CommonContorller {

    private CommonService service;

    @GetMapping("/")
    public String index(){
        return service.getIndex("common");
    }
}
