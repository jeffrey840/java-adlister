
import javax.servlet.ServletException;
        import javax.servlet.annotation.WebServlet;
        import javax.servlet.http.HttpServlet;
        import javax.servlet.http.HttpServletRequest;
        import javax.servlet.http.HttpServletResponse;
        import java.io.IOException;

@WebServlet("/lose")
public class GuessLostServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String loser = "You lose!";
        req.setAttribute("winOrLose", loser);
        req.getRequestDispatcher("guessPromptResult.jsp").forward(req, resp);    }
}
