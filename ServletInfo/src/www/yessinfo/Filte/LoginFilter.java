package www.yessinfo.Filte;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;

/**
 * Servlet Filter implementation class LoginFilter
 */
@WebFilter(urlPatterns="/login",initParams={
		@WebInitParam(name="enable",value="on")
})
public class LoginFilter implements Filter {
	boolean enable;
    /**
     * Default constructor. 
     */
    public LoginFilter() {
        // TODO Auto-generated constructor stub
    	enable=false;
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		// place your code here
		if(enable)
		{
			String sourceAddress=request.getRemoteAddr();
			Date date=new Date();
			System.out.println("Login Request from  "+sourceAddress+" at "+date);
		}
		// pass the request along the filter chain
		chain.doFilter(request, response);
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
		String enableStr=fConfig.getInitParameter("enable");
		if(enableStr.equals("on"))
		{
			enable=true;
		}
	}

}
