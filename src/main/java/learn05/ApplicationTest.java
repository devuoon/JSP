package learn05;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ApplicationTest")
public class ApplicationTest extends HttpServlet {
    private static final long serialVersionUID = 1L;
    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Application 저장소 생성
        ServletContext application = request.getServletContext();

        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html; charset=UTF-8");

        PrintWriter out = response.getWriter();

        // String str = request.getParameter("data");
        String data = request.getParameter("data");
        String op = request.getParameter("operator");

        int value = 0;

        if(!data.equals("")) value = Integer.parseInt(data);

        // 계산
        if(op.equals("=")) {
            int x = (Integer) application.getAttribute("value");
            int y = value;
            String operator = (String) application.getAttribute("op");

            int result = 0;

            if(operator.equals("+")) {
                result = x + y;
            } else if(operator.equals("-")) {
                result = x - y;
            }else if(operator.equals("X")) {
                result = x * y;
            }else if(operator.equals("/")) {
                result = x / y;
            }

            response.getWriter().printf("결과 값 : %d\n", result);

        } else { // 값 저장
            application.setAttribute("value", value);
            application.setAttribute("op", op);
        }
        /*
         * // 확인
         * System.out.println("data: " + str);
         * // 저장
         * application.setAttribute("data", str);
         * // 꺼내기
         * str = (String)application.getAttribute("data");
         * System.out.println("Adata: " + str);
         */
    }

}