package pl.coderslab.controller;

import pl.coderslab.dao.CarDao;
import pl.coderslab.model.Car;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;

@WebServlet(name = "AddCar", urlPatterns = "/add-car")
public class AddCar extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        try {
            int id = Integer.parseInt(request.getParameter("id"));
            String model = request.getParameter("model");
            String brand = request.getParameter("brand");
            int production_year = Integer.parseInt(request.getParameter("production_year"));
            String number_plate = request.getParameter("number_plate");
            String next_vehicle_inspection = request.getParameter("next_vehicle_inspection");
            int client_id = Integer.parseInt(request.getParameter("client_id"));

            Car car = new Car();
            car.setId(id);
            car.setModel(model);
            car.setBrand(brand);
            car.setProduction_year(production_year);
            car.setNumber_plate(number_plate);
            car.setNext_vehicle_inspection(next_vehicle_inspection);
            car.setClient_id(client_id);

            CarDao carDao = new CarDao();
            carDao.save(car);

            response.getWriter().append("saved at id : " + car.getId());
        }
        catch (Exception e) {
            System.out.println(e.getMessage());

            doGet(request, response);
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Car car = new Car();
        request.setAttribute("car", car);
        getServletContext().getRequestDispatcher("/WEB-INF/addCar.jsp").forward(request, response);

    }
}
