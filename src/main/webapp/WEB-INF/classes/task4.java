
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class task4 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String path = "/task4.jsp";
        ServletContext servletContext = getServletContext();
        RequestDispatcher requestDispatcher = servletContext.getRequestDispatcher(path);
        requestDispatcher.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String path = "/task4.jsp";
        String text = req.getParameter("textAr");
        HttpSession httpSession = req.getSession();
        httpSession.setAttribute("analis", getAnalis(text));

        ServletContext servletContext = getServletContext();
        RequestDispatcher requestDispatcher = servletContext.getRequestDispatcher(path);
        requestDispatcher.forward(req, resp);
    }

    public String getAnalis(String text) {
        ArrayList<String> res = new ArrayList<>();
        StringBuilder stringBuilder = new StringBuilder();
        char[] textChar = text.toLowerCase().toCharArray();
        ArrayList<Character> glas = new ArrayList<>();
        ArrayList<Character> soglas = new ArrayList<>();
        ArrayList<Character> prep = new ArrayList<>();


        String glasSymb = "яюэуоиёеаыaeiouy";
        String soglSymb = "ьъщшчцхфтсрпнмлкйизждгвбbcdfghjklmnpqrstvwxz";
        String prepSymb = "~!@#$%^&*()_+,./?:;\"{}|";

        for (int i = 0; i < textChar.length; i++) {
            if (glasSymb.contains(String.valueOf(textChar[i]))) {
                glas.add(textChar[i]);
            } else if (soglSymb.contains(String.valueOf(textChar[i]))) {
                soglas.add(textChar[i]);
            } else if (prepSymb.contains(String.valueOf(textChar[i]))) {
                prep.add(textChar[i]);
            }
        }

        Set<Character> uniGlas = new HashSet<>(glas);
        Set<Character> uniSoglas = new HashSet<>(soglas);
        Set<Character> uniPrep = new HashSet<>(prep);

        res.add(String.valueOf(glas.size()));
        res.add(uniGlas.toString());
        res.add(String.valueOf(soglas.size()));
        res.add(uniSoglas.toString());
        res.add(String.valueOf(prep.size()));
        res.add(uniPrep.toString());
        stringBuilder.append("\n");
        stringBuilder.append("Количество гласных букв = ");
        stringBuilder.append(res.get(0));
        stringBuilder.append("\n");
        stringBuilder.append(res.get(1));
        stringBuilder.append("\n");

        stringBuilder.append("Количество cогласных букв = ");
        stringBuilder.append(res.get(2));
        stringBuilder.append("\n");
        stringBuilder.append(res.get(3));
        stringBuilder.append("\n");

        stringBuilder.append("Количество знаков препинания = ");
        stringBuilder.append(res.get(4));
        stringBuilder.append("\n");
        stringBuilder.append(res.get(5));
        stringBuilder.append("\n");

        return stringBuilder.toString();
    }
}
