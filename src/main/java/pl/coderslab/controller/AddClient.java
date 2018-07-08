package pl.coderslab.controler;

import pl.coderslab.DAO.ClientDAO;
import pl.coderslab.model.Client;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "AddClient", urlPatterns = "/addclient")
public class AddClient extends HttpServlet {

        protected void doPost (HttpServletRequest request, HttpServletResponse response) throws
        ServletException, IOException {
        String name = request.getParameter("name");
        String surname = request.getParameter("surname");

        Client client = new Client();
        client.setName(name);
        client.setSurname(surname);

        ClientDAO clitentDAO = new ClientDAO();
            ClientDAO.save(client);

            response.getWriter().append("saved at id : " + client.getId());

        }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Client client = new Client();
        request.setAttribute("client", client);
        getServletContext().getRequestDispatcher("/WEB-INF/addClinet.jsp").forward(request, response);

    }
}
