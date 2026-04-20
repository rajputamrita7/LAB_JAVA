import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class UserDataServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String username = request.getParameter("username");
        String email = request.getParameter("email");
        String designation = request.getParameter("designation");

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        // Server-side validation
        if (username == null || username.isEmpty() ||
            email == null || email.isEmpty() ||
            designation == null || designation.isEmpty()) {

            out.println("<h3>All fields are required!</h3>");
            out.println("<a href='index.jsp'>Go Back</a>");
            return;
        }

        if (!email.matches("^[^ ]+@[^ ]+\\.[a-z]{2,3}$")) {
            out.println("<h3>Invalid Email Format!</h3>");
            out.println("<a href='index.jsp'>Go Back</a>");
            return;
        }

        // Pass data to JSP
        request.setAttribute("username", username);
        request.setAttribute("email", email);
        request.setAttribute("designation", designation);

        RequestDispatcher rd = request.getRequestDispatcher("result.jsp");
        rd.forward(request, response);
    }
}