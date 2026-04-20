package com.cookies;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

@WebServlet("/cookie")
public class CookieServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String name = request.getParameter("username");

        Cookie nameCookie = null;
        Cookie visitCookie = null;

        Cookie[] cookies = request.getCookies();

        int visitCount = 0;

        // Check existing cookies
        if (cookies != null) {
            for (Cookie c : cookies) {
                if (c.getName().equals("username")) {
                    nameCookie = c;
                }
                if (c.getName().equals("visitCount")) {
                    visitCookie = c;
                }
            }
        }

        // If first visit
        if (nameCookie == null) {
            nameCookie = new Cookie("username", name);
            visitCookie = new Cookie("visitCount", "1");
            visitCount = 1;
        } else {
            visitCount = Integer.parseInt(visitCookie.getValue());
            visitCount++;
            visitCookie.setValue(String.valueOf(visitCount));
        }

        // Set expiry time (60 seconds for demo)
        nameCookie.setMaxAge(60);
        visitCookie.setMaxAge(60);

        response.addCookie(nameCookie);
        response.addCookie(visitCookie);

        // Display output
        out.println("<html><body>");
        out.println("<h2>Welcome back " + nameCookie.getValue() + "!</h2>");
        out.println("<h3>You have visited this page " + visitCount + " times.</h3>");

        // List all cookies
        out.println("<h3>List of Cookies:</h3>");
        if (cookies != null) {
            for (Cookie c : cookies) {
                out.println("Name: " + c.getName() + " | Value: " + c.getValue() + "<br>");
            }
        }

        out.println("<br><b>Note:</b> Cookies will expire in 60 seconds. Refresh after 1 minute to test expiry.");

        out.println("</body></html>");
    }
}

