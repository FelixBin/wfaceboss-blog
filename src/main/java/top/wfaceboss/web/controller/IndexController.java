package top.wfaceboss.web.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import top.wfaceboss.NotFoundExcepiton;

@Controller
public class IndexController {

    @GetMapping("/")
    public String index() {
        String base = null;
        if (base == null) {
            throw new NotFoundExcepiton("资源找不到");
        }
        return "index";
    }
}
