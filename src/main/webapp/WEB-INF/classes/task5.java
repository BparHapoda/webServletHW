
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

public class task5 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession httpSession = req.getSession();
        String path = "/task5.jsp";
        String otvet = " ";
        otvet = getOtvet(req.getParameter("primer"));

        httpSession.setAttribute("otvet", otvet);
        ServletContext servletContext = getServletContext();
        RequestDispatcher requestDispatcher = servletContext.getRequestDispatcher(path);
        requestDispatcher.forward(req, resp);
    }

    public static String getOtvet(String primer) {
        if (primer == null) {
            return "0";
        }
        String[] string = primer.split("[\\^\\*/+-]");
        char znak = primer.charAt(string[0].length());
        int a = Integer.parseInt(string[0]);
        int b = Integer.parseInt(string[1]);
        int otvet = 0;
        switch (znak) {
            case '+': {
                otvet = a + b;
                break;
            }
            case '-': {
                otvet = a - b;
                break;
            }
            case '/': {
                otvet = a / b;
                break;
            }
            case '*': {
                otvet = a * b;
                break;
            }
            case '^': {
                otvet = (int) Math.pow(a, b);
                break;
            }
            case '%': {
                otvet = a / 100 * b;
                break;
            }

        }

        return Integer.toString(otvet);
    }
}
