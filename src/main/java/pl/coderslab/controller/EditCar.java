package pl.coderslab.controller;

import pl.coderslab.dao.CarDao;
import pl.coderslab.dao.EmployeeDao;
import pl.coderslab.model.Car;
import pl.coderslab.model.Employee;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "EditCar", urlPatterns = "/editCar")
public class EditCar extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        try{
            int id = Integer.parseInt(request.getParameter("id"));
            String model = request.getParameter("model");
            String brand = request.getParameter("brand");
            int production_year = Integer.parseInt(request.getParameter("production_year"));
            String number_plate = request.getParameter("number_plate");
            String next_vehicle_inspection = request.getParameter("next_vehicle_inspection");
            int client_id = Integer.parseInt(request.getParameter("client_id"));

            CarDao carDao = new CarDao();
            Car car = new Car( id, model, brand , production_year, number_plate , next_vehicle_inspection, client_id );

            carDao.updateCar(car);
        }
        catch (Exception e) {
            System.out.println(e);
            getServletContext().getRequestDispatcher("/WEB-INF/editCar.jsp").forward(request,response);
        }

        getServletContext().getRequestDispatcher("/WEB-INF/editCar.jsp").forward(request,response);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        try {
            int id = Integer.parseInt(request.getParameter("id"));
            CarDao carDao = new CarDao();
            Car car = carDao.findCarById(id);
            request.setAttribute("car", car);
        }
        catch (Exception e) {
            System.out.println(e);
            System.out.println(e);
        }

        getServletContext().getRequestDispatcher("/WEB-INF/editCar.jsp").forward(request,response);

    }
}
