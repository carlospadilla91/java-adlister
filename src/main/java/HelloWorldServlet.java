import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/hello")
public class HelloWorldServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        String thingToBeGreeted = req.getParameter("name");
        if (thingToBeGreeted == null) {
            thingToBeGreeted = "World";
        }

        String output = String.format("<h1>Hello, %s!</h1>", thingToBeGreeted);
        out.printf(output);
    }
}
