package pl.coderslab.controller;

import pl.coderslab.dao.ClientDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "DeleteClient", urlPatterns = "/DeleteClient")
public class DeleteClient extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        try {
            int id = Integer.parseInt(request.getParameter("id"));
            ClientDao clientDao = new ClientDao();
            clientDao.delete(id);
        }
        catch (Exception e){
            System.out.println(e);
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        getServletContext().getRequestDispatcher("/WEB-INF/deleteClient.jsp").forward(request,response);

    }
}
