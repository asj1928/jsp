import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class SignOut extends HttpServlet {

    protected void doGet( HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        HttpSession session = request.getSession ();
        session.removeAttribute ( "email" );
        session.invalidate ();
        response.sendRedirect ( "index.html" );

    }

    }
