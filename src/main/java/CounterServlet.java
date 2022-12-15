import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet(name = "CounterServlet", urlPatterns = "/count")
public class CounterServlet extends HttpServlet {
    private int counter = 0;
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        counter = counter + 1;
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<h1>The count is " + counter + ".</h1>");
    }
}

