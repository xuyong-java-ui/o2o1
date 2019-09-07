package com.iweb.o2o.controller.shop;

import com.iweb.o2o.service.ProductService;
import com.iweb.o2o.vo.ProductVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * @Auter : Xuyong
 * @Date : 2019/9/7 8:53
 * Description:
 */
@Controller
@RequestMapping("/shop/order")
public class OrderController {
    @Autowired
    private ProductService productService;

    @GetMapping("/list.html")
    public String toList(){
        return "shop/order/list";
    }

    @RequestMapping("/list")
    @ResponseBody
    public Object getList(){
        Map<String,Object> map=new HashMap<>();
        productService.getPage(1,10,new ProductVo());
        return map;
    }
}
