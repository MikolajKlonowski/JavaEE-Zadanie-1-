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
//        if (o.sprawdzeniePodanychWartosciDlugosci(metry, milimetry, centymetry)) {
        if (kilogramy==null||gramy==null||miligramy==null){
            printWriter.print(o.obliczeniaMiar(metry, centymetry, milimetry));}
            else if (metry==null||centymetry==null||milimetry==null)

//        if (o.sprawdzeniePodanychWartosciMasy(kilogramy, gramy, miligramy)) {
            printWriter.print(o.obliczeniaWag(kilogramy, gramy, miligramy));
//        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    }
}
