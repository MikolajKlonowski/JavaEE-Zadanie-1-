import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/kalkulator")
public class KalkulatorServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String metry = request.getParameter("metry");
        String centymetry = request.getParameter("centymetry");
        String milimetry = request.getParameter("milimetry");
        String kilogramy = request.getParameter("kilogramy");
        String gramy = request.getParameter("gramy");
        String miligramy = request.getParameter("miligramy");
        Obliczenia o = new Obliczenia();
        PrintWriter printWriter = response.getWriter();
        if (o.sprawdzeniePodanychWartosci(kilogramy,gramy,miligramy,metry,milimetry,centymetry)){
            if (metry != null || centymetry != null || milimetry != null) {
                printWriter.print(o.obliczeniaMiar(metry, centymetry, milimetry));
            } else {
                printWriter.print(o.obliczeniaWag(kilogramy, gramy, miligramy));
            }
        }else {
            response.getWriter().print("Podałeś złą liczbe");

        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    }
}
