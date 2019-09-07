package com.iweb.o2o.controller.shop;

import com.iweb.o2o.service.ChartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Auter : Xuyong
 * @Date : 2019/9/6 11:43
 * Description:
 */
@Controller
@RequestMapping("/shop/chart")
public class ChartController {
    @Autowired
    private ChartService chartService;

    @GetMapping("/top5.html")
    public String toTop5() {
        return "shop/chart/top5";
    }

    @GetMapping("/order.html")
    public String toOrder() {
        return "shop/chart/order";
    }

    @GetMapping("/money.html")
    public String toMoney() {
        return "shop/chart/money";
    }

    @GetMapping("/top5Product")
    @ResponseBody
    public Object getTop5Product(@RequestParam(value = "month", required = false) String month,
                                 @RequestParam(value = "startTime", required = false) String startTime,
                                 @RequestParam(value = "endTime", required = false) String endTime) {
        Map<String, String> map = new HashMap<>();
        map.put("month", month);
        map.put("startTime", startTime);
        map.put("endTime", endTime);
//        List<Map<String, Object>> top5Product = chartService.getTop5Product(map);
        Map<String, Object> xymap = new HashMap<>();
        xymap.put("x", "X轴名字");
        xymap.put("y", 10);
        return xymap;
    }


    @GetMapping("/orderStatus")
    @ResponseBody
    public Object getOrderStatus(@RequestParam(value = "month", required = false) String month,
                                 @RequestParam(value = "startTime", required = false) String startTime,
                                 @RequestParam(value = "endTime", required = false) String endTime) {
        Map<String, String> map = new HashMap<>();
        map.put("month", month);
        map.put("startTime", startTime);
        map.put("endTime", endTime);
        Map<String, Integer> orderStatus = chartService.getOrderStatus(map);
        return orderStatus;
    }

    @GetMapping("/money")
    @ResponseBody
    public Object getMoney(@RequestParam(value = "month", required = false) String month,
                                 @RequestParam(value = "startTime", required = false) String startTime,
                                 @RequestParam(value = "endTime", required = false) String endTime) {
        Map<String, String> map = new HashMap<>();
        map.put("month", month);
        map.put("startTime", startTime);
        map.put("endTime", endTime);
        Map<String, Integer> money = (Map<String, Integer>) chartService.getMonet(map);
        return money;
    }
}
