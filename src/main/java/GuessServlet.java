import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Random;

@WebServlet("/guess")
public class GuessServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("guess-num.jsp").forward(req, resp);
    }


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Random random = new Random();
        int rand = random.nextInt(3-1) + 1;
        String guess = req.getParameter("guess");
        if (Integer.parseInt(guess) == rand) {
            resp.sendRedirect("/correct");
        }
        else {
            resp.sendRedirect("/incorrect");
        }
    }
}
