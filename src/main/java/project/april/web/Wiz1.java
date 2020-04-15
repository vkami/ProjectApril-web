package project.april.web;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name="Wiz1", urlPatterns="/wiz1")
public class Wiz1 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        resp.setContentType("text/html");
        PrintWriter writer=resp.getWriter();

        writer.println("<!DOCTYPE html><html>");
        writer.println("<head>");
        writer.println("<meta charset=\"UTF-8\" />");
        writer.println("<title>Hello World!</title>");
        writer.println("</head>");
        writer.println("<body>");
        writer.println("<h1>Hello World</h1>");
        writer.println("</body>");
        writer.println("</html>");


    }
}
