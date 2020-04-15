package project.april.web;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Wiz2", urlPatterns = "/wiz2")
public class Wiz2 extends HttpServlet {


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String param=req.getParameter("good");
        HttpSession session=req.getSession();
        session.setAttribute("good",param);
        doGet(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        resp.setContentType("text/html");
        PrintWriter writer = resp.getWriter();

        writer.println("<!DOCTYPE html><html>");
        writer.println("<head>");
        writer.println("<link rel=\"stylesheet\" href=\"style.css\">");
        writer.println("<title>Wizard 2</title>");
        writer.println("</head>");
        writer.println("<body>");
        writer.println("<div id=\"mainContainer\">");

        writer.println("<h2>Masodik lepes</h2>");


        writer.println("<h3>Add meg a neved es a cimed!</h3>");


        writer.println("<form action=\"wiz3\" method=\"POST\" id=\"form2\">");
        writer.println("<input type=\"text\" placeholder=\"Nev\" name=\"name\" /><br/>");
        writer.println("<input type=\"text\" placeholder=\"Cim\" name=\"address\" />");
        writer.println("</form>");


        writer.println("<a href=\"wiz1\">Vissza</a>");
        writer.println("<a href=\"#\" onclick=\"document.getElementById('form2').submit();\">Tovabb</a>");

        writer.println("</div>");

        writer.println("</body>");
        writer.println("</html>");


    }
}
