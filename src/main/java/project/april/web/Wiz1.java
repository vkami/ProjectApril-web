package project.april.web;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Wiz1", urlPatterns = "/wiz1")
public class Wiz1 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.setContentType("text/html; charset=UTF-8");
        resp.setCharacterEncoding("UTF-8");
        PrintWriter writer = resp.getWriter();

        writer.println("<!DOCTYPE html><html>");
        writer.println("<head>");
        writer.println("<link rel=\"stylesheet\" href=\"style.css\">");
        writer.println("<meta charset=\"UTF-8\" />");

        writer.println("<title>Wizard 1</title>");
        writer.println("</head>");
        writer.println("<body>");
        writer.println("<div id=\"mainContainer\">");

        writer.println("<h2>Elso lepes</h2>");
        writer.println("<h3>Valassz egy termeket!</h3>");

        writer.println("<p>Termekeink:</p>");

        writer.println("<form action=\"wiz2\" method=\"POST\" id=\"form1\">");
        writer.println("<select name=\"good\">");
        writer.println("<option value=\"kavefozo\">kavefozo</option>");
        writer.println("<option value=\"hosugarzo\">hosugarzo</option>");
        writer.println("<option value=\"mikro\">mikrohullamu suto</option>");

        writer.println("</select>");
        writer.println("</form>");

        writer.println("<a href=\"#\" onclick=\"document.getElementById('form1').submit();\">Tovabb</a>");

        writer.println("</div>");

        writer.println("</body>");
        writer.println("</html>");


    }
}
