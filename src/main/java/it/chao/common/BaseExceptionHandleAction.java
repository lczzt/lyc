package it.chao.common;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;

public class BaseExceptionHandleAction {
    @ExceptionHandler
    @ResponseBody
    public ServerResponse  handleAndReturnData(HttpServletRequest request, HttpServletResponse response, Exception ex) {
        Map<String, Object> data = new HashMap<String, Object>();
        int code = 10;
        if(ex instanceof BusinessException) {
            BusinessException e = (BusinessException)ex;
            code = e.getCode();
            //data.put("code", e.getCode());
        }
//        data.put("msg", ex.getMessage());
//        data.put("excetion", ex.getClass().getSimpleName());
        return ServerResponse.createByErrorCodeMessage(code,ex.getMessage());
    }

}
