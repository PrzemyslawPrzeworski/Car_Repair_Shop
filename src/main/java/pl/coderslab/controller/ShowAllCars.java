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
import java.util.List;

@WebServlet(name = "ShowAllCars", urlPatterns = "/showAllCars")
public class ShowAllCars extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        CarDao carDao = new CarDao();
        List<Car> allCars = carDao.loadAll();

        request.setAttribute("allCars", allCars);
        getServletContext().getRequestDispatcher("/WEB-INF/showAllCars.jsp").forward(request,response);

    }
}
