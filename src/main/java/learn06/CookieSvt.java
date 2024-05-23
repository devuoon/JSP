package learn06;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet('/cookiesvt')
public class CookieSvt extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 쿠키생성
        Cookie cookie = new Cookie("cook","cData");
        Cookie cookie2 = new Cookie("","");
    }
}
