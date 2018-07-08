package pl.coderslab.controller;

import pl.coderslab.dao.EmployeeDao;
import pl.coderslab.dao.OrderDao;
import pl.coderslab.model.Employee;
import pl.coderslab.model.Order;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "EditOrder", urlPatterns = "/editOrder")
public class EditOrder extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        try{
            int id = Integer.parseInt(request.getParameter("id"));
            String acceptance_date = request.getParameter("acceptance_date");
            String repair_date = request.getParameter("repair_date");
            int employee_id = Integer.parseInt(request.getParameter("employee_id"));
            String problem_description = request.getParameter("problem_description");
            String repair_description = request.getParameter("repair_description");
            String status = request.getParameter("status");
            int car_id = Integer.parseInt(request.getParameter("car_id"));
            int client_cost = Integer.parseInt(request.getParameter("client_cost"));
            Double parts_cost = Double.parseDouble(request.getParameter("parts_cost"));
            Double manhour_cost = Double.parseDouble(request.getParameter("manhour_cost"));
            int manhour = Integer.parseInt(request.getParameter("manhour"));

            OrderDao orderDao = new OrderDao();
            Order order = new Order( id, acceptance_date, repair_date , employee_id, problem_description , repair_description, status, car_id, client_cost, parts_cost, manhour_cost, manhour);

            orderDao.updateOrder(order);

        }
        catch (Exception e) {
            System.out.println(e);
            getServletContext().getRequestDispatcher("/WEB-INF/editOrder.jsp").forward(request,response);
        }

        getServletContext().getRequestDispatcher("/WEB-INF/editOrder.jsp").forward(request,response);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        try {
            int id = Integer.parseInt(request.getParameter("id"));
            OrderDao orderDao = new OrderDao();
            Order order = orderDao.findOrderById(id);
            request.setAttribute("order", order);
        }
        catch (Exception e) {
            System.out.println(e);
            System.out.println(e);
        }

        getServletContext().getRequestDispatcher("/WEB-INF/editOrder.jsp").forward(request,response);

    }
}
