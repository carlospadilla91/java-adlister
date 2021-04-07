import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/order-form")
public class OrderFormServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        resp.setContentType("text/html");
        String output = "";
        output += "<form method='POST' action='/order-summary'>";
        output += "<label for='product'>Product Name</label>";
        output += "<br>";
        output += "<input name='product' type='text'>";
        output += "<br>";
        output += "<label for='amount'>Amount</label>";
        output += "<br>";
        output += "<input name='amount' type='number'>";
        output += "<br>";
        output += "<button>Submit</button>";
        output += "</form>";

        out.println(output);
    }
}
