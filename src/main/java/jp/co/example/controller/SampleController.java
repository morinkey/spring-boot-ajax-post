package jp.co.example.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="api")
public class SampleController {

    @RequestMapping(value="/v1/tickets", method = RequestMethod.POST)
    public Map<String, String> post(
            HttpServletRequest request) {
        Map<String, String> map = new HashMap<>();
        map.put("parameter1", request.getParameter("parameter1"));
        map.put("parameter2", request.getParameter("parameter2"));
        System.out.println("parameter1 : " + request.getParameter("parameter1"));
        System.out.println("parameter2 : " + request.getParameter("parameter2"));
        return map;
    }

}
