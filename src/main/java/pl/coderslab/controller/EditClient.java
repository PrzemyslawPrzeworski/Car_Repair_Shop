package pl.coderslab.controller;

import pl.coderslab.dao.ClientDao;
import pl.coderslab.dao.EmployeeDao;
import pl.coderslab.model.Client;
import pl.coderslab.model.Employee;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "EditClient", urlPatterns = "/editClient")
public class EditClient extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        try{
            int id = Integer.parseInt(request.getParameter("id"));
            String first_name = request.getParameter("first_name");
            String second_name = request.getParameter("second_name");

            ClientDao clientDao = new ClientDao();

            Client client = new Client( id, first_name, second_name );
            clientDao.updateClient(client);

        } catch (Exception e) {
            System.out.println(e);
            getServletContext().getRequestDispatcher("/WEB-INF/editClient.jsp").forward(request,response);
        }

        getServletContext().getRequestDispatcher("/WEB-INF/editClient.jsp").forward(request,response);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        try {
            int id = Integer.parseInt(request.getParameter("id"));
            ClientDao clientDao = new ClientDao();
            Client client = clientDao.findClienyById(id);
            request.setAttribute("client", client);
        }
        catch (Exception e) {
            System.out.println(e);
            System.out.println(e);
        }

        getServletContext().getRequestDispatcher("/WEB-INF/editClient.jsp").forward(request,response);

    }
}
