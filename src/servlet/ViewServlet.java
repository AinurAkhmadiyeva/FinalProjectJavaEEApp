package servlet;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.User;

import java.io.IOException;

@WebServlet(value = "/viewNews")
public class ViewServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        User user = (User) req.getSession().getAttribute("ONLINE_USER");
//        Integer roleIdObj = (Integer) req.getSession().getAttribute("roleId");
//        int roleId = roleIdObj != null ? roleIdObj.intValue() : 0;

        if (user != null) {

//        if (roleId == 2) {
            req.getRequestDispatcher("viewnews.jsp").forward(req, resp);
        } else {
            req.getRequestDispatcher("404.jsp").forward(req, resp);

              }
    }
}
