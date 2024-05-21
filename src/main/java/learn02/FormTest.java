package learn02;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/FormTest")
public class FormTest extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String data1 = request.getParameter("data1");
        String data2 = request.getParameter("data2");

        response.setContentType("text/html; charset=utf-8");
        PrintWriter out = response.getWriter();
        out.println("data1: " + data1);
        out.println("data2: " + data2);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}