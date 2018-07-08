package pl.coderslab.controller;

import pl.coderslab.dao.ClientDao;
import pl.coderslab.model.Client;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "AddClient", urlPatterns = "/add-client")
public class AddClient extends HttpServlet {

    protected void doPost (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        try {
            int id = Integer.parseInt(request.getParameter("id"));
            String first_name = request.getParameter("first_name");
            String second_name = request.getParameter("second_name");

            Client client = new Client();
            client.setId(id);
            client.setFirst_name(first_name);
            client.setSecond_name(second_name);

            ClientDao clitentDAO = new ClientDao();
            clitentDAO.save(client);

            response.getWriter().append("saved at id : " + client.getId());
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
            doGet(request, response);
            System.out.println(e);
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Client client = new Client();
        request.setAttribute("client", client);
        getServletContext().getRequestDispatcher("/WEB-INF/addClient.jsp").forward(request, response);

    }
}
