package com.iweb.o2o.interceptor;

import com.iweb.o2o.utils.SysConstants;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

/**
 * @Auter : Xuyong
 * @Date : 2019/9/9 20:19
 * Description:
 */
@Component
public class LoginInterceptor extends HandlerInterceptorAdapter {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        // 1.获取session中的user
        Object loginUser = request.getSession().getAttribute(SysConstants.SESSION_USER);
        if(loginUser != null) {
            return true;
        }
        // 2. 没登录，跳转到登录页面
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<script>");
        out.println("window.open ('" + request.getContextPath()
                + "/shop/login.html','_self')");
        out.println("</script>");
        out.println("</html>");
        return false;
    }
}
