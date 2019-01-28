package it.chao.dao;

import it.chao.common.ServerResponse;
import it.chao.domain.Menu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * Administrator
 * 22:43
 **/
@Repository
public class UserDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    public List<Menu> queryFirstMenu(){
        String sql = "SELECT MENU_TEXT,MENU_ID,ROUTER_LINK FROM NP_ACCESS_CONTROL_MENU WHERE MENU_OWNER='YY' AND MENU_TYPE = 'GROUP' ";
        RowMapper rowMapper =  getRowMapper();
        List<Menu> menuList = jdbcTemplate.query(sql, new String[]{}, rowMapper);
        return menuList;
    }
    //查询二级菜单
    public List<Menu> querySecondMenu(String menuPid){
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
}
