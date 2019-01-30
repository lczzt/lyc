package it.chao.service;

import it.chao.VO.UserVo;
import it.chao.common.BusinessException;
import it.chao.common.ResponseCode;
import it.chao.common.ServerResponse;
import it.chao.common.util.ConstantUtil;
import it.chao.dao.UserDao;
import it.chao.domain.Menu;
import it.chao.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;

/**
 * Administrator
 * 22:51
 **/
@Service
public class UserService {
    @Autowired
    private UserDao userDao;
    public List<Menu> getMenu(){
        return userDao.queryFirstMenu();
    }
    public List<Menu> getSecondMenu(String menuId){
        return userDao.querySecondMenu(menuId);
    }
    public List<User> getUsers(UserVo userVo){
        return userDao.getUsers(userVo);
    }
    public ServerResponse editUser(User user){
        if(StringUtils.isEmpty(user.getID())){
            throw new BusinessException(ConstantUtil.BUSINESS_SUCCESS_CODE,"主键信息丢失");
        }
        return userDao.editUser(user);
    }
}
