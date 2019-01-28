package it.chao.controller;

import it.chao.common.ServerResponse;
import it.chao.domain.Menu;
import it.chao.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Administrator
 * 21:26
 **/
@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping(value = "/querySecondMenu")
    @ResponseBody
    public ServerResponse querySecondMenu(Model model, HttpServletRequest request, String menuId){
        List<Menu> secondMenu = userService.getSecondMenu(menuId);
        model.addAttribute("secondMenu",secondMenu);
        return ServerResponse.createBySuccess(secondMenu);
    }
}
