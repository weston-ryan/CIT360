
/**
 *
 * @author westo
 */
@WebServlet(name = "AssetServlet", urlPatterns = "/addAssetServlet")
public class Servlet extends HttpServlet{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //dispatches requests to the methods doGet and doPost
        //httpServlet is a sublcass of GenericServlet with is the implementation of Servlet interface.
        protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
    }
        //hard coded username and password.  It will check if the user name and password match
        // if they match it will proceed to the iccu-member page.  If not, it will redirect to the access denied page.
    protected void dopost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Please enter your username and password");
	    	String user = request.getParameter("user");
                String password = request.getParameter("password");
                if(user.equals("rweston") && password.equals("47LeguesUnder!")){
                    response.setHeader("login", "success");
                    response.sendRedirect("iccu-member.jsp")
                    }           
                else {
                    response.sendRedirect("accessDenied.jsp");
                }}
    }
                        
}
 
