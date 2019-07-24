package life.chenmin.community.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller//吧当前类作为入流API的一个承载者
public class IndexController {

    @GetMapping("/")
    public String index(){
        return "index";
    }
}
