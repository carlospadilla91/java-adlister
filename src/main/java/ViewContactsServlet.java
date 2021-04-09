import contact.Contact;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/contacts")
public class ViewContactsServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        List<Contact> contacts = new ArrayList<>();
        contacts.add(new Contact(1,"Carlos","carlos@email.com","123 main st","2101231234",true));
        contacts.add(new Contact(2,"Michael","michael@email.com","111 main st","2101112222",false));
        contacts.add(new Contact(3,"Sam","sam@email.com","333 main st","2102223333",true));
        contacts.add(new Contact(4,"Jacob","jacob@email.com","444 main st","2103334444",false));
        contacts.add(new Contact(4,"Audi","audi@email.com","555 main st","2104445555",true));
        request.setAttribute("contacts", contacts);
        request.getRequestDispatcher("contacts.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
