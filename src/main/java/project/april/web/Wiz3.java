package project.april.web;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Wiz3", urlPatterns = "/wiz3")
public class Wiz3 extends HttpServlet {


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String name=req.getParameter("name");
        String address=req.getParameter("address");

        HttpSession session=req.getSession();
        session.setAttribute("name",name);
        session.setAttribute("address",address);

        doGet(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        HttpSession session=req.getSession();
        Object good=session.getAttribute("good");
        Object name=session.getAttribute("name");
        Object address=session.getAttribute("address");

        resp.setContentType("text/html");
        PrintWriter writer = resp.getWriter();

        writer.println("<!DOCTYPE html><html>");
        writer.println("<head>");
        req.getRequestDispatcher("/getCSS").include(req, resp);
        writer.println("<title>Wizard 3</title>");
        writer.println("</head>");
        writer.println("<body>");
        writer.println("<div id=\"mainContainer\">");

        writer.println("<h2>Osszesites</h2>");

        writer.println("<p>A kovetkezo termekeket rendelted meg: " + (String)good + "</p>");
        writer.println("<p>Vevo neve: " + (String)name + "</p>");
        writer.println("<p>Szallitasi cim: " + (String)address + "</p>");


        writer.println("<a href=\"end\">Rendben fizetek</a>");

        writer.println("</div>");

        writer.println("</body>");
        writer.println("</html>");


    }
}
