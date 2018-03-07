import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

public class Check extends HttpServlet {
    protected void doPost( HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();



        String email = request.getParameter("email");
        String pass = request.getParameter("pass");



        if(Valid1.checkUser(email, pass))
        {

            RequestDispatcher rs = request.getRequestDispatcher("Welcome.jsp");
            HttpSession session=request.getSession ();
            session.setAttribute ( "email",email );
            rs.forward (request, response);
        }
        else
        {
            out.println("Username or Password incorrect");
            RequestDispatcher rs = request.getRequestDispatcher("index.html");
            rs.include(request, response);
        }
    }
}
