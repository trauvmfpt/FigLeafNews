package filter;

import entity.Category;
import util.ConstantUtil;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

import static com.googlecode.objectify.ObjectifyService.ofy;

public class ConstantFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        if (ConstantUtil.CATEGORIES_MENU.size() == 0){
            ConstantUtil.CATEGORIES_MENU = ofy().load().type(Category.class).list();
        }
        request.setAttribute("cateNav",ConstantUtil.CATEGORIES_MENU);
        // pass the request along the filter chain
        filterChain.doFilter(request, servletResponse);
    }

    @Override
    public void destroy() {

    }
}
