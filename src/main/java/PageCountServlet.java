import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/count")
public class PageCountServlet extends HttpServlet {

    int pageCountViews = 0;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String reset = req.getParameter("reset");
        if (reset != null) {
            pageCountViews = 0;
        }

        pageCountViews += 1;
        System.out.println(pageCountViews);
    }
}
