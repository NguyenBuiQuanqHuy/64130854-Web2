

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class AboutMe
 */
@WebServlet("/AboutMe")
public class AboutMe extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AboutMe() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 response.setContentType("text/html; charset=UTF-8");
	        PrintWriter out = response.getWriter();
	        out.println("<!DOCTYPE html>");
	        out.println("<html lang='vi'>");
	        out.println("<head>");
	        out.println("<meta charset='UTF-8'>");
	        out.println("<meta name='viewport' content='width=device-width, initial-scale=1.0'>");
	        out.println("<title>About Me</title>");
	        out.println("<style>");
	        out.println("body { font-family: Arial, sans-serif; background-color: #f4f4f4; text-align: center; margin: 50px; }");
	        out.println(".container { background: white; padding: 20px; border-radius: 10px; box-shadow: 0 0 10px rgba(0, 0, 0, 0.1); display: inline-block; }");
	        out.println("h1 { color: #2c3e50; }");
	        out.println("p { font-size: 18px; color: #333; }");
	        out.println("</style>");
	        out.println("</head>");
	        out.println("<body>");

	        out.println("<div class='container'>");
	        out.println("<h1>Thông Tin Cá Nhân</h1>");
	        out.println("<p><strong>Họ và tên:</strong> Nguyễn Bùi Quang Huy</p>");
	        out.println("<p><strong>Mã sinh viên:</strong> 64130854</p>");
	        out.println("<p><strong>Trường:</strong> Đại học Nha Trang</p>");
	        out.println("<p><strong>Sở thích:</strong> Lập trình, đọc sách, chơi game</p>");
	        out.println("</div>");

	        out.println("</body>");
	        out.println("</html>");
	}

}
