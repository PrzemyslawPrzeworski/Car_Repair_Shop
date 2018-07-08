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
import java.util.List;

@WebServlet(name = "ShowAllClients", urlPatterns = "/showAllClients")
public class ShowAllClients extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        ClientDao clientDao = new ClientDao();
        List<Client> allClients = clientDao.loadAll();
        System.out.println(allClients);
        System.out.println(allClients.get(6));
        System.out.println(allClients.get(6).getFirst_name());

        request.setAttribute("allClients", allClients);
        getServletContext().getRequestDispatcher("/WEB-INF/showAllClients.jsp").forward(request,response);

    }
}
