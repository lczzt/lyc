package it.chao.controller;

import it.chao.common.BaseExceptionHandleAction;
import it.chao.common.BusinessException;
import it.chao.common.ServerResponse;
import it.chao.domain.Menu;
import it.chao.domain.User;
import it.chao.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Administrator
 * 21:26
 **/
@Controller
@RequestMapping("/user")
public class UserController extends BaseExceptionHandleAction {
    @Autowired
    private UserService userService;
    @RequestMapping(value = "/querySecondMenu")
    @ResponseBody
    public ServerResponse querySecondMenu(Model model, HttpServletRequest request, String menuId){
        List<Menu> secondMenu = userService.getSecondMenu(menuId);
        model.addAttribute("secondMenu",secondMenu);
        return ServerResponse.createBySuccess(secondMenu);
    }
    @RequestMapping(value = "/getUsers")
    @ResponseBody
    public Map<String,Object> getUsers(int offset,int limit){
        int pageNo = offset / limit +1;
        List<User> userList = new ArrayList<User>();
        for (int i=0; i<56;i++){
            User user = new User();
            user.setUSER_ID("lichao"+i);
            user.setUSER_NAME("lichao"+i);
            user.setUSER_EMAIL("lichao@feiyi.com.cn");
            user.setUSER_PHONE("18710973146");
            userList.add(user);
        }
        Map<String,Object> resultMap = new HashMap<String, Object>();
        resultMap.put("total",userList.size());
        resultMap.put("rows",userList);
        return resultMap;
    }
}
