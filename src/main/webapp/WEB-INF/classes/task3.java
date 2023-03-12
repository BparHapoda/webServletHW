
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.util.Comparator;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class task3 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession httpSession = req.getSession();
        String result = " ";
        String a =(req.getParameter("a")=="")?"0":req.getParameter("a");
        String b =(req.getParameter("b")=="")?"0":req.getParameter("b");
        String c =(req.getParameter("b")=="")?"0":req.getParameter("c");
        String choice = req.getParameter("choice");
        if (choice == null) {
            choice = " ";
        }


        if (choice.equals("maxChoice")) {
            result = getMax(a, b, c);
        } else if (choice.equals("minChoice")) {
            result = getMin(a, b, c);
        } else if (choice.equals("averageChoice")) result = getAverage(a, b, c);
        else result = " ";

        httpSession.setAttribute("result", result);
        String path = "/task3.jsp";
        ServletContext servletContext = getServletContext();
        RequestDispatcher requestDispatcher = servletContext.getRequestDispatcher(path);
        requestDispatcher.forward(req, resp);
    }

    public String getMax(String a, String b, String c) {
        Integer max = Stream.of(a, b, c).mapToInt(i -> Integer.parseInt(i)).max().orElse(0);
        return "Максимальное значение = " + max.toString();
    }

    public String getMin(String a, String b, String c) {
        Integer min = Stream.of(a, b, c).mapToInt(Integer::parseInt).min().orElse(0);
        return "Минимальное значение = " + min.toString();
    }

    public String getAverage(String a, String b, String c) {
        float average = (float) Stream.of(a, b, c).mapToInt(Integer::parseInt).average().orElse(0);
        return "Среднее арифметическое = " + Float.toString(average);
    }
}
