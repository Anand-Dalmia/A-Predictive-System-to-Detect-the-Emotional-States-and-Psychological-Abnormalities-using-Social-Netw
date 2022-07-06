package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class adminLogin_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta content=\"width=device-width, initial-scale=1.0\" name=\"viewport\">\n");
      out.write("\n");
      out.write("        <title>A Predictive System to Detect the Emotional States and Psychological Abnormalities using Social Networks\n");
      out.write("</title>\n");
      out.write("        <meta content=\"\" name=\"description\">\n");
      out.write("        <meta content=\"\" name=\"keywords\">\n");
      out.write("\n");
      out.write("        <!-- Favicons -->\n");
      out.write("        <link href=\"assets/img/favicon.png\" rel=\"icon\">\n");
      out.write("        <link href=\"assets/img/apple-touch-icon.png\" rel=\"apple-touch-icon\">\n");
      out.write("\n");
      out.write("        <!-- Google Fonts -->\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,600,600i,700,700i|Jost:300,300i,400,400i,500,500i,600,600i,700,700i|Poppins:300,300i,400,400i,500,500i,600,600i,700,700i\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("        <!-- Vendor CSS Files -->\n");
      out.write("        <link href=\"assets/vendor/bootstrap/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"assets/vendor/icofont/icofont.min.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"assets/vendor/boxicons/css/boxicons.min.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"assets/vendor/remixicon/remixicon.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"assets/vendor/venobox/venobox.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"assets/vendor/owl.carousel/assets/owl.carousel.min.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"assets/vendor/aos/aos.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("        <!-- Template Main CSS File -->\n");
      out.write("        <link href=\"assets/css/style.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    ");

        if (request.getParameter("Failed") != null) {
    
      out.write("\n");
      out.write("    <script>alert('Login Failed');</script>\n");
      out.write("    ");
            }
    
      out.write("\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        <!-- ======= Header ======= -->\n");
      out.write("        <header id=\"header\" class=\"fixed-top \">\n");
      out.write("            <div class=\"container d-flex align-items-center\">\n");
      out.write("\n");
      out.write("                <h1 class=\"logo mr-auto\"><a></a></h1>\n");
      out.write("                <!-- Uncomment below if you prefer to use an image logo -->\n");
      out.write("                <!-- <a href=\"index.html\" class=\"logo mr-auto\"><img src=\"assets/img/logo.png\" alt=\"\" class=\"img-fluid\"></a>-->\n");
      out.write("\n");
      out.write("                <nav class=\"nav-menu d-none d-lg-block\">\n");
      out.write("                    <ul>\n");
      out.write("                        <li><a href=\"index.jsp\">Home</a></li>\n");
      out.write("                        <li><a href=\"userLogin.jsp\">User</a></li>\n");
      out.write("                        <li><a style=\"color: #0099ff\" href=\"adminLogin.jsp\">Admin</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </nav><!-- .nav-menu -->\n");
      out.write("\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </header><!-- End Header -->\n");
      out.write("\n");
      out.write("        <!-- ======= Hero Section ======= -->\n");
      out.write("        <section id=\"hero\" class=\"d-flex align-items-center\">\n");
      out.write("\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-lg-6 d-flex flex-column justify-content-center pt-4 pt-lg-0 order-2 order-lg-1\" data-aos=\"fade-up\" data-aos-delay=\"200\">\n");
      out.write("                        <h1>A Predictive System to Detect the \n");
      out.write("                            Emotional States and Psychological \n");
      out.write("                            Abnormalities using Social Networks</h1>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-lg-6 order-1 order-lg-2 hero-img\" data-aos=\"zoom-in\" data-aos-delay=\"200\">\n");
      out.write("                        <img src=\"assets/img/hero-img.png\" class=\"img-fluid animated\" alt=\"\">\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </section><!-- End Hero -->\n");
      out.write("\n");
      out.write("        <main id=\"main\">\n");
      out.write("            <section id=\"contact\" class=\"contact\">\n");
      out.write("                <div class=\"container\" data-aos=\"fade-up\">\n");
      out.write("                    <div class=\"section-title\">\n");
      out.write("                        <h2>Admin Login</h2>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-lg-6 mt-5 mt-lg-0\">\n");
      out.write("                            <img src=\"assets/img/ulogin.jpg\" width=\"450\" height=\"400\" />\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-lg-6 mt-5 mt-lg-0\">\n");
      out.write("                            <form action=\"adminLogin\" method=\"post\" role=\"form\">\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label>Email :</label>\n");
      out.write("                                    <input type=\"text\" class=\"form-control\" name=\"name\" placeholder=\"Enter Your Email\" required=\"\" />\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label>Password :</label>\n");
      out.write("                                    <input type=\"password\" class=\"form-control\" name=\"pass\" placeholder=\"Enter Your Password\" required=\"\" />\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <button type=\"submit\" class=\"btn btn-block btn-success\">Login</button>\n");
      out.write("                                </div>\n");
      out.write("                            </form>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </section><!-- End Contact Section -->\n");
      out.write("        </main><!-- End #main -->\n");
      out.write("\n");
      out.write("\n");
      out.write("        <footer id=\"footer\">\n");
      out.write("            <div class=\"container footer-bottom clearfix\">\n");
      out.write("                <center>&copy;  <strong><span>2022</span></strong>.</center>\n");
      out.write("            </div>\n");
      out.write("        </footer><!-- End Footer -->\n");
      out.write("\n");
      out.write("        <a href=\"#\" class=\"back-to-top\"><i class=\"ri-arrow-up-line\"></i></a>\n");
      out.write("        <div id=\"preloader\"></div>\n");
      out.write("\n");
      out.write("        <!-- Vendor JS Files -->\n");
      out.write("        <script src=\"assets/vendor/jquery/jquery.min.js\"></script>\n");
      out.write("        <script src=\"assets/vendor/bootstrap/js/bootstrap.bundle.min.js\"></script>\n");
      out.write("        <script src=\"assets/vendor/jquery.easing/jquery.easing.min.js\"></script>\n");
      out.write("        <script src=\"assets/vendor/php-email-form/validate.js\"></script>\n");
      out.write("        <script src=\"assets/vendor/waypoints/jquery.waypoints.min.js\"></script>\n");
      out.write("        <script src=\"assets/vendor/isotope-layout/isotope.pkgd.min.js\"></script>\n");
      out.write("        <script src=\"assets/vendor/venobox/venobox.min.js\"></script>\n");
      out.write("        <script src=\"assets/vendor/owl.carousel/owl.carousel.min.js\"></script>\n");
      out.write("        <script src=\"assets/vendor/aos/aos.js\"></script>\n");
      out.write("\n");
      out.write("        <!-- Template Main JS File -->\n");
      out.write("        <script src=\"assets/js/main.js\"></script>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("\n");
      out.write("</html>\n");
      out.write("\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
