import main.Cart;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ServletSample")
public class ServletSample extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

//         1. URL parms in get-request

//        PrintWriter writer = response.getWriter();
//        // http://localhost:8080/hello?n=Mark&surn=Pyv
//
//        String name = request.getParameter("n");
//        String surn = request.getParameter("surn");
//
//        writer.println("<html>");
//        writer.println("<h1>");
//        writer.println("Your Name is: " + name + " " + surn);
//        writer.println("</h1>");
//        writer.println("</html>");

        // 2. redirect - sample. the above calls are ignored
//         response.sendRedirect("http://google.com");
//         response.sendRedirect("/redirect");

        //3. forward
//        RequestDispatcher requestDispatcher = request.getRequestDispatcher("test.jsp");
//        requestDispatcher.forward(request, response);

        //4. Adding counter sample via session:

        HttpSession session = request.getSession();
        Integer count = (Integer) session.getAttribute("count");

        if (count == null) count = 0;
        session.setAttribute("count", count + 1);

        PrintWriter writer = response.getWriter();

        writer.println("<html>");
        writer.println("<h1>");
        writer.println("Your count is: " + (++count));
        writer.println("</h1>");
        writer.println("</html>");


        //5. session with object

//        HttpSession session = request.getSession();
//
//        String name = request.getParameter("name");
//        Integer quantity = Integer.valueOf(request.getParameter("quantity"));
//
//        Cart cart = (Cart) session.getAttribute("cart");
//        if (cart == null) cart = new Cart();
//        cart.setName(name);
//        cart.setQuantity(quantity);
//
//        session.setAttribute("cart", cart);
//        //forward
////        RequestDispatcher requestDispatcher = request.getRequestDispatcher("cart.jsp");
////        requestDispatcher.forward(request, response);
//
//        getServletContext().getRequestDispatcher("/cart.jsp").forward(request, response);

        // 6. Do user is authorized

//        HttpSession session = request.getSession();
//
//        String user = (String) session.getAttribute("user");
//
//        if (user == null) {
//            // to login
//            // to assign new session
//        } else {
//            //to show user choices and redirects
//        }

    }
}
