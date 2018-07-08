package pl.coderslab.controller;

import pl.coderslab.dao.ClientDao;
import pl.coderslab.model.Client;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "FindClientByID", urlPatterns = "/findClientById")
public class FindClientByID extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        try {
            int id = Integer.parseInt(request.getParameter("id"));
            ClientDao clientDao = new ClientDao();
            Client client = clientDao.findClienyById(id);
            request.setAttribute("client", client);
        }
        catch (Exception e) {
            System.out.println(e);
        }
        getServletContext().getRequestDispatcher("/WEB-INF/findClientById.jsp").forward(request, response);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        getServletContext().getRequestDispatcher("/WEB-INF/findClientById.jsp").forward(request, response);


    }
}
