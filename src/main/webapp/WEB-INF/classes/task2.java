
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Comparator;
import java.util.stream.Stream;

public class task2 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String a =(req.getParameter("a")=="")?"0":req.getParameter("a");
        String b =(req.getParameter("b")=="")?"0":req.getParameter("b");
        String c =(req.getParameter("b")=="")?"0":req.getParameter("c");

        String maxN = getMax(a,b,c);

        HttpSession httpSession= req.getSession();
        httpSession.setAttribute("max","Максимальное число из "+a+","+b+","+c+" ="+maxN);

        String path = "/task2.jsp";
        ServletContext servletContext = getServletContext();
        RequestDispatcher requestDispatcher = servletContext.getRequestDispatcher(path);
        requestDispatcher.forward(req, resp);
    }

    public String getMax(String a, String b, String c) {

        int aNumber = Integer.parseInt(a);
        int bNumber = Integer.parseInt(b);
        int cNumber = Integer.parseInt(c);
        String max = Stream.of(aNumber, bNumber, cNumber).max(Comparator.naturalOrder()).get().toString();
        return max;
    }
}
