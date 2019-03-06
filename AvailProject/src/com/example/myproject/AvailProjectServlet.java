package com.example.myproject;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.*;

import org.mortbay.log.Log;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@SuppressWarnings("serial")
@Controller
public class AvailProjectServlet extends HttpServlet {
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		//resp.setContentType("text/plain");
		PrintWriter out = resp.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Hi</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>" + "List Product Avail" + "</h1>");
        out.println("</body>");
        out.println("</html>");
        out.println("<body style='background-color:#00FF00;'>");
		
		/*ModelAndView modelAndview = new ModelAndView("ViewAvail");
		modelAndview.addObject("wellcome ririn", "Hay Ririn");*/
		//Log.info("TEST OUT", modelAndview);
		
		return;
	}
	
	//@Override
	/*protected ModelAndView handlleRequestInternal(HttpServletRequest request, HttpServletResponse response) throws Exception{
		
		ModelAndView modelAndview = new ModelAndView("ViewAvail");
		modelAndview.addObject("wellcome ririn", "Hay Ririn");
		
		return modelAndview;
	}*/
	
	@RequestMapping("/welcome")
	public ModelAndView helloWordId(){
		ModelAndView model = new ModelAndView("ViewAvail");
		model.addObject("wellcome ririn", "Hay Ririn");
		
		return model;
	}
}
