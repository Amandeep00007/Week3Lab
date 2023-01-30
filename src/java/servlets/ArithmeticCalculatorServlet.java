package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author amand
 */
public class ArithmeticCalculatorServlet extends HttpServlet {

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setAttribute("value", "Result: ----");
        
      getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp")
                .forward(request, response);
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp")
                .forward(request, response);
       
       String first = request.getParameter("first");
       String second = request.getParameter("second");
       
       request.setAttribute("first", first);
       request.setAttribute("second", second);
       
       
       if(first == null || first.equals("") || second == null || second.equals("")){
           request.setAttribute("message", "Result: invalid");
           getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalulator.jsp")
                   .forward(request,response);
         return;  
       }
       else{
           int nfirst = Integer.parseInt(first);
           int nsecond = Integer.parseInt(second);
           int value = 0;
           
           switch(request.getParameter("value")){
               case"+":
                   value = nfirst + nsecond;
               break;
               
               case"-":
                   value = nfirst - nsecond;
               break;
               
               case"*":
                   value = nfirst * nsecond;
               break;
               
               case"%":
                   value = nfirst % nsecond;
               break;
           }
           
           request.setAttribute("value", value);
       }
       getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp")
               .forward(request, response);   
    }

}
