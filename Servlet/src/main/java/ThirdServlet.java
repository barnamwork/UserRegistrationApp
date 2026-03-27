import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/third")
public class ThirdServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String name = request.getParameter("username");

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        if (name == null || name.trim().isEmpty()) {
            out.println("<h2 style='color:red;'>Name cannot be empty </h2>");
        } else {
            out.println("<h1>Hello " + name + " 👋</h1>");
            out.println("<p>UC3 POST + Validation Working</p>");
        }
    }
}