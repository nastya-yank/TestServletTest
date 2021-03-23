package com.epam.golubeva.servlets;

import com.epam.golubeva.entity.User;
import com.epam.golubeva.service.UserService;
import com.epam.golubeva.service.impl.UserServiceImpl;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;


public class SimpleServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String numberFromRequest = request.getParameter("number");
        int  number = Integer.parseInt(numberFromRequest);
        number+=100;
        request.setAttribute("result",number);
        UserService service = new UserServiceImpl();
        List<User> users = service.generationUsers();
        request.setAttribute("users",users);
        request.getRequestDispatcher("/jsp/result.jsp").forward(request,response);
    }

}
