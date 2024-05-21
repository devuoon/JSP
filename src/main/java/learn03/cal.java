package learn03;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/cal")
public class cal extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int num1 = Integer.parseInt(request.getParameter("num1"));
        int num2 = Integer.parseInt(request.getParameter("num2"));
        String op = request.getParameter("op");

        int result = 0;
        double re = 0;

        switch(request.getParameter("op")) {
            case "+": result = num1 + num2; break;
            case "-": result = num1 - num2; break;
            case "*": result = num1 * num2; break;
            case "/": re = (double) num1 / num2; break;
        }

        response.setContentType("text/html; charset=UTF-8");
        PrintWriter out = response.getWriter();
        if(op.equals("+") || op.equals("-") || op.equals("*")){
            out.println("계산 결과: " + result);
        } else if(op.equals("/")){
            out.println("계산 결과: " + re);
        }



    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
