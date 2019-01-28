package it.chao.controller;

import it.chao.domain.Menu;
import it.chao.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Administrator
 * 21:53
 **/
@Controller
public class IndexController {
    private Logger logger = LoggerFactory.getLogger(IndexController.class);
    @Autowired
    private UserService userService;
    @RequestMapping(value = "/index")
    public String pageIndex(Model model){
        List<Menu> menu = userService.getMenu();
        model.addAttribute("userMenu",menu);
        logger.info("菜单查询成功");
        return "index";
    }
    @RequestMapping(value = "/login")
    public String longin(Model model){
        List<Menu> menu = userService.getMenu();
        model.addAttribute("userMenu",menu);
        logger.info("菜单查询成功");
        return "login";
    }
}
