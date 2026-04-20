import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class CookieServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String name = request.getParameter("username");

        Cookie[] cookies = request.getCookies();

        int visitCount = 0;
        String storedName = null;

        if (cookies != null) {
            for (Cookie c : cookies) {
                if (c.getName().equals("visitCount")) {
                    visitCount = Integer.parseInt(c.getValue());
                }
                if (c.getName().equals("username")) {
                    storedName = c.getValue();
                }
            }
        }

        // Increment visit count
        visitCount++;

        // Create cookies
        Cookie nameCookie = new Cookie("username", name);
        Cookie countCookie = new Cookie("visitCount", String.valueOf(visitCount));

        // Set expiry (e.g., 60 seconds = 1 minute)
        nameCookie.setMaxAge(60);
        countCookie.setMaxAge(60);

        // Add cookies to response
        response.addCookie(nameCookie);
        response.addCookie(countCookie);

        out.println("<html><body>");

        out.println("<h2>Welcome back, " + name + "!</h2>");
        out.println("<p>You have visited this page " + visitCount + " times.</p>");
        out.println("<p>(Cookie expires in 1 minute)</p>");

        out.println("<a href='index.html'>Visit Again</a>");

        out.println("</body></html>");
    }
}