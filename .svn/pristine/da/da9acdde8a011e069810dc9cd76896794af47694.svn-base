package com.iweb.o2o.controller.superadmin;

import com.iweb.o2o.entity.Area;
import com.iweb.o2o.service.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * @Auter : Xuyong
 * @Date : 2019/9/4 13:58
 * Description:
 */
@Controller
@RequestMapping("/superadmin")
public class AreaController {
    @Autowired
    private AreaService areaService;

    @GetMapping("/listareas")
    public ModelAndView listAreas() {
        ModelAndView mv = new ModelAndView();
        try {
            List<Area> list = areaService.getAreaList();
            mv.addObject("rows", list);
            mv.addObject("total", list.size());

        } catch (Exception e) {
            e.printStackTrace();
            mv.addObject("success", false);
            mv.addObject("errMsg", e.toString());
        }
        mv.setViewName("test.html");
        return mv;
    }
}
