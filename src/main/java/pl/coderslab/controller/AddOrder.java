package pl.coderslab.controller;

import pl.coderslab.dao.CarDao;
import pl.coderslab.dao.OrderDao;
import pl.coderslab.model.Order;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "AddOrder", urlPatterns = "/add-order")
public class AddOrder extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        try {
            int id = Integer.parseInt(request.getParameter("id"));
            String acceptance_date = request.getParameter("acceptance_date");
            String repair_date = request.getParameter("repair_date");
            int employee_id = Integer.parseInt(request.getParameter("employee_id"));
            String problem_description = request.getParameter("problem_description");
            String repair_description = request.getParameter("repair_description");
            String status = request.getParameter("status");
            int car_id = Integer.parseInt(request.getParameter("car_id"));
            Double client_cost = Double.parseDouble(request.getParameter("client_cost"));
            Double parts_cost = Double.parseDouble(request.getParameter("parts_cost"));
            Double manhour_cost = Double.parseDouble(request.getParameter("manhour_cost"));
            int manhour = Integer.parseInt(request.getParameter("manhour"));

            Order order = new Order();
            order.setId(id);
            order.setAcceptance_date(acceptance_date);
            order.setRepair_date(repair_date);
            order.setEmployee_id(employee_id);
            order.setProblem_description(problem_description);
            order.setRepair_description(repair_description);
            order.setStatus(status);
            order.setCar_id(car_id);
            order.setClient_cost(client_cost);
            order.setParts_cost(parts_cost);
            order.setManhour_cost(manhour_cost);
            order.setManhour(manhour);

            OrderDao orderDao = new OrderDao();
            orderDao.save(order);

            response.getWriter().append("saved at id : " + order.getId());
        }
        catch (Exception e) {
            System.out.println(e.getMessage());

            doGet(request, response);
        }


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //create new order to add
        Order order = new Order();
        request.setAttribute("order", order);
        getServletContext().getRequestDispatcher("/WEB-INF/addOrder.jsp").forward(request, response);
    }
}
