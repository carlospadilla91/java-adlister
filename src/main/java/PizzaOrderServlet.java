import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/pizza-order")
public class PizzaOrderServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/pizza-order.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String crust = request.getParameter("crust");
        String sauce = request.getParameter("sauce");
        String size = request.getParameter("size");
        String[] toppings = request.getParameterValues("toppings");
        String address = request.getParameter("address");
        System.out.println("You selected crust type: " + crust);
        System.out.println("You selected sauce type: " + sauce);
        System.out.println("You selected size: " + size);
        if (toppings != null) {
            System.out.println("Your toppings are ");
            for (String topping : toppings) {
                System.out.println(topping);
            }
        }
        System.out.println("Your delivery address is: " + address);

    }
}
