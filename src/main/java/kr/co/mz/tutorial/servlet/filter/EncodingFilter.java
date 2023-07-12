package kr.co.mz.tutorial.servlet.filter;


import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import java.io.IOException;

public class EncodingFilter implements Filter {

  @Override
  public void init(FilterConfig filterConfig) throws ServletException {
    Filter.super.init(filterConfig);
    System.out.println("Start Filter");

  }

  @Override
  public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
      throws IOException, ServletException {
    request.setCharacterEncoding("UTF-8");
    System.out.println("Filtered anyway....");
    chain.doFilter(request, response);
  }

  @Override
  public void destroy() {
    System.out.println("Destroy Filter");
    Filter.super.destroy();
  }
}
