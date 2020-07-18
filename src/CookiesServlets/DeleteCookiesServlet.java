package CookiesServlets;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class DeleteCookiesServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
// to reduce maxAge = delete
        Cookie cookie = new Cookie("name_id", "");
        cookie.setMaxAge(0); // set timelife
//        cookie.setMaxAge(-1); // cookie to be deleted if browser will be closed

        response.addCookie(cookie);
    }
}
