package CookiesServlets;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class SetCookiesServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Cookie cookie = new Cookie("name_id", "12345");
        Cookie cookie1 = new Cookie("new_name", "968565");
        cookie.setMaxAge(24 * 60 * 60); // save cookie 1 day
        cookie1.setMaxAge(24 * 60 * 60);

        response.addCookie(cookie);
        response.addCookie(cookie1);

    }
}
