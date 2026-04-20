import java.io.IOException;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.Date;

public class SessionDemo extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        // Get session object (true = create if not exists)
        HttpSession session = request.getSession(true);

        // Set session timeout to 1 minute (60 seconds)
        session.setMaxInactiveInterval(60);

        // Visit count logic
        Integer visitCount = (Integer) session.getAttribute("visitCount");

        if (visitCount == null) {
            visitCount = 1;
        } else {
            visitCount++;
        }

        session.setAttribute("visitCount", visitCount);

        // Fetch session details
        String sessionId = session.getId();
        Date creationTime = new Date(session.getCreationTime());
        Date lastAccessTime = new Date(session.getLastAccessedTime());

        // Output HTML
        out.println("<html><body>");
        out.println("<h2>Session Tracking Information</h2>");
        out.println("<p><b>Session ID:</b> " + sessionId + "</p>");
        out.println("<p><b>Creation Time:</b> " + creationTime + "</p>");
        out.println("<p><b>Last Access Time:</b> " + lastAccessTime + "</p>");
        out.println("<p><b>Visit Count:</b> " + visitCount + "</p>");
        out.println("<p><b>Session Timeout:</b> 1 minute</p>");
        out.println("</body></html>");

        out.close();
    }
}