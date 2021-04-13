import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/ads/create")
public class CreateAdServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/ads/create.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Ads adsDao = DaoFactory.getAdsDao();

        String title = req.getParameter("title");
        String description = req.getParameter("description");

        Ad ad = new Ad(5, 1, title, description);
        System.out.println(ad);

        adsDao.insert(ad);

        resp.sendRedirect("/ads");
    }
}
