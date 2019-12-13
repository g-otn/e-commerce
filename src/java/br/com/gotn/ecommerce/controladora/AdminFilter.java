package br.com.gotn.ecommerce.controladora;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

@WebFilter(filterName = "AdminFilter", urlPatterns = {"/admin/*", "/admin"}, servletNames = {"AdminServlet"})
public class AdminFilter implements Filter {
    
    public void init(FilterConfig filterConfig) {
    }

    public void doFilter(ServletRequest request, ServletResponse response,
            FilterChain chain)
            throws IOException, ServletException {
        // Verificar se já está logado, se não, redirecionar ao login
        // Filtrar tipo de usuário logado, se cliente, enviar erro 404 ou redirecionar a loja
    }
    
    public void destroy() {    
    }

}
