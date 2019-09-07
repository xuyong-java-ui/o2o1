package com.iweb.o2o.controller.shop;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Auter : Xuyong
 * @Date : 2019/9/4 14:00
 * Description:
 */
@Controller
@RequestMapping("/shop")
public class WorkBenchController {

    @GetMapping("workbench")
    public String workBench(){
        return "common/main";
    }
}
