package it.chao.dao;

import it.chao.VO.UserVo;
import it.chao.common.BusinessException;
import it.chao.common.ServerResponse;
import it.chao.common.util.CurrentPage;
import it.chao.common.util.PaginationHelper;
import it.chao.controller.IndexController;
import it.chao.domain.Menu;
import it.chao.domain.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.util.StringUtils;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Administrator
 * 22:43
 **/
@Repository
public class UserDao {
    private Logger logger = LoggerFactory.getLogger(UserDao.class);
    @Autowired
    private JdbcTemplate jdbcTemplate;
    public List<Menu> queryFirstMenu(){
        String sql = "SELECT MENU_TEXT,MENU_ID,ROUTER_LINK FROM NP_ACCESS_CONTROL_MENU WHERE MENU_OWNER='YY' AND MENU_TYPE = 'GROUP' ";
        RowMapper rowMapper =  getRowMapper();
        List<Menu> menuList = jdbcTemplate.query(sql, new String[]{}, rowMapper);
        return menuList;
    }
    //查询二级菜单
    public List<Menu> querySecondMenu(String menuPid) throws BusinessException {
        String sql = "SELECT MENU_TEXT,MENU_ID,ROUTER_LINK FROM NP_ACCESS_CONTROL_MENU WHERE MENU_OWNER='YY' AND MENU_PID = ? ";
        RowMapper rowMapper = getRowMapper();
        List<Menu> menuList = jdbcTemplate.query(sql, new String[]{menuPid}, rowMapper);
        return menuList;
    }
    public RowMapper getRowMapper(){
        RowMapper rowMapper = new RowMapper() {
            @Override
            public Object mapRow(ResultSet resultSet, int i) throws SQLException {
                Menu menu = new Menu();
                menu.setMENU_ID(Integer.parseInt(resultSet.getString("MENU_ID")));
                menu.setMENU_TEX(resultSet.getString("MENU_TEXT"));
                menu.setROUTER_LINK(resultSet.getString("ROUTER_LINK"));
                return menu;
            }
        };
        return rowMapper;
    }

    /**
     * 修改用户
     * @param user
     * @return
     * @throws BusinessException
     */
    public ServerResponse editUser(final User user) throws BusinessException{
        String userName = user.getUSER_NAME();
        long id = user.getID();
        String sql = "UPDATE LYC_USER SET USER_NAME = ? WHERE ID=?";
        int update = jdbcTemplate.update(sql, new Object[]{userName, id});
        if(update >= 1){
            return ServerResponse.createBySuccess();
        }else{
            return ServerResponse.createByError();
        }
    }
    /**
     * 查询用户信息
     * @param userVo
     * @throws BusinessException
     */
    public List<User> getUsers(UserVo userVo) throws BusinessException{
        PaginationHelper<User> ph = new PaginationHelper<User>();
        List<User> c=new ArrayList<User>();
        List<Object> params = new ArrayList<Object>();
        String countSql = " SELECT COUNT(*) FROM LYC_USER WHERE USER_TYPE = 'YY' ";
        String sql = "SELECT ID,USER_NAME,USER_ID,USER_PHONE,USER_EMAIL,IS_STOP,SEX,BDAY FROM LYC_USER WHERE 1=1";
        if(!StringUtils.isEmpty(userVo.getUSER_NAME())){
            sql += " AND USER_NAME LIKE ?";
            countSql += " AND USER_NAME LIKE ?";
            params.add("%"+userVo.getUSER_NAME()+"%");
        }
        if(!StringUtils.isEmpty(userVo.getUSER_PHONE())){
            sql += " AND USER_PHONE LIKE ?";
            countSql += " AND USER_PHONE LIKE ?";
            params.add("%"+userVo.getUSER_PHONE()+"%");
        }
        logger.info(sql);
        CurrentPage<User> p=ph.fetchPage(
                jdbcTemplate,
                countSql,
                sql,
                params.toArray(),
                userVo.getPageNo(),
                userVo.getLimit(),
                getUserRowMap()
        );
        c=p.getPageItems();
        return c;
    }
    public RowMapper getUserRowMap(){
        RowMapper rowMapper = new RowMapper() {
            @Override
            public Object mapRow(ResultSet resultSet, int i) throws SQLException {
                User user = new User();
                user.setID(Long.parseLong(resultSet.getString("ID")));
                user.setUSER_ID(resultSet.getString("USER_ID"));
                user.setSEX("0".equals(resultSet.getString("SEX"))?"男":"女");
                user.setUSER_NAME(resultSet.getString("USER_NAME"));
                user.setUSER_PHONE(resultSet.getString("USER_PHONE"));
                user.setUSER_EMAIL(resultSet.getString("USER_EMAIL"));
                return user;
            }
        };
        return rowMapper;
    }

}
