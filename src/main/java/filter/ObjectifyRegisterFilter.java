package filter;

import com.googlecode.objectify.ObjectifyService;
import entity.Article;
import entity.Category;
import entity.Source;

import javax.servlet.*;
import java.io.IOException;

public class ObjectifyRegisterFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        ObjectifyService.register(Article.class);
        ObjectifyService.register(Category.class);
        ObjectifyService.register(Source.class);
        filterChain.doFilter(servletRequest, servletResponse);
    }

    @Override
    public void destroy() {

    }
}
