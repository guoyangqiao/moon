package com.guoyangqiao.moon.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping(value = "/time")
@ResponseBody
public class MainCtl {
    private static final Logger LOGGER = LoggerFactory.getLogger(MainCtl.class);

    @RequestMapping(path = "/normal")
    public Map<String, Object> first() {
        HashMap<String, Object> res = new HashMap<>();
        res.put("time", new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
        return res;
    }

}
