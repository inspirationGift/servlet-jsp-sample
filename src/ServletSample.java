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

        HttpSession session = request.getSession();
        Integer count = (Integer) session.getAttribute("count");

        if (count == null) count = 0;
        session.setAttribute("count", count + 1);


        PrintWriter writer = response.getWriter();
        // http://localhost:8080/hello?n=Mark&surn=Pyv

        String name = request.getParameter("n");
        String surn = request.getParameter("surn");

        writer.println("<html>");
        writer.println("<h1>");
        writer.println("Your count is: " + (++count));
        writer.println("</h1>");
        writer.println("</html>");

        // redirect. the above calls are ignored
        // response.sendRedirect("http://google.com");
        // response.sendRedirect("/redirect");

        //forward
//        RequestDispatcher requestDispatcher = request.getRequestDispatcher("test.jsp");
//        requestDispatcher.forward(request, response);
    }
}
