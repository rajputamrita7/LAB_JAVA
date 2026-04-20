package com.cookies;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

@WebServlet("/CookieServlet")
public class CookiesServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String name = request.getParameter("username");

        int visitCount = 1;

        Cookie[] cookies = request.getCookies();
        Cookie nameCookie = null;
        Cookie visitCookie = null;

        // Retrieve existing cookies
        if (cookies != null) {
            for (Cookie c : cookies) {
                if (c.getName().equals("userName")) {
                    nameCookie = c;
                }
                if (c.getName().equals("visitCount")) {
                    visitCookie = c;
                }
            }
        }

        // Handle name cookie
        if (nameCookie == null) {
            nameCookie = new Cookie("userName", name);
        } else {
            nameCookie.setValue(name);
        }

        // Handle visit count cookie
        if (visitCookie == null) {
            visitCookie = new Cookie("visitCount", "1");
        } else {
            visitCount = Integer.parseInt(visitCookie.getValue()) + 1;
            visitCookie.setValue(String.valueOf(visitCount));
        }

        // Set expiry (60 seconds)
        nameCookie.setMaxAge(60);
        visitCookie.setMaxAge(60);

        response.addCookie(nameCookie);
        response.addCookie(visitCookie);

        // Output
        out.println("<h2>Welcome back " + name + " !</h2>");
        out.println("<h3>You have visited this page " + visitCount + " times</h3>");

        // Display cookies with values
        out.println("<h3>Cookie List:</h3>");

        Cookie[] allCookies = request.getCookies();

        if (allCookies != null) {
            for (Cookie c : allCookies) {
                out.println("Name: " + c.getName() +
                            " | Value: " + c.getValue() + "<br>");
            }
        }

        // Expiry info
        out.println("<h3>Cookie Expiry:</h3>");
        out.println("These cookies will expire in 60 seconds.");
    }
}


