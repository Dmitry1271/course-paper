package com.yet.spring.core.controllers;

import com.yet.spring.core.entity.Pair;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PairController {

    @RequestMapping(value = "/getPairs", method = RequestMethod.GET)
    public Pair getPair(@RequestParam(value = "course") int course,
                        @RequestParam(value = "group") int group,
                        @RequestParam(value = "dayIndex") int dayIndex) {
        return null;
    }
}
