package project.april.web;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@WebServlet(name="combo", urlPatterns="/combo")
public class ComboBox extends HttpServlet {

    private static Map<String, String> options=new HashMap<>();

    @Override
    public void init() throws ServletException {
        super.init();

        options.put("kavefozo","kavefozo");
        options.put("hosugarzo","hosugarzo");
        options.put("mikro","mikrohullamu suto");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        PrintWriter writer = resp.getWriter();

        for (String act:options.keySet())
            writer.println("<option value=\"" + act + "\">" + options.get(act) + "</option>");

    }
}
