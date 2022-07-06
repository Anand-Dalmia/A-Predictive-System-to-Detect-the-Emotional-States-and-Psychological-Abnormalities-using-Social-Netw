package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import DBconnection.SQLconnection;

public final class viewTweets_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
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
      out.write("    <style>\n");
      out.write("\n");
      out.write("        .customers {\n");
      out.write("            font-family: \"Trebuchet MS\", Arial, Helvetica, sans-serif;\n");
      out.write("            font-size: 20px;\n");
      out.write("            border-collapse: collapse;\n");
      out.write("            width: 100%;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .customers td, .customers th {\n");
      out.write("            border: 2px solid black;\n");
      out.write("            align:\"center\";  cellpadding:\"0\"; cellspacing:\"2\";\n");
      out.write("            text-align: center;\n");
      out.write("            padding: 15px;\n");
      out.write("            color: black;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("\n");
      out.write("        .customers th {\n");
      out.write("            padding-top: 12px;\n");
      out.write("            padding-bottom: 12px;\n");
      out.write("            text-align: center;\n");
      out.write("            background-color: #3399ff;\n");
      out.write("            color: black;\n");
      out.write("        }\n");
      out.write("    </style>\n");
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
      out.write("                        <li><a href=\"adminHome.jsp\">Home</a></li>\n");
      out.write("                        <li><a href=\"userDetails.jsp\">User Details</a></li>\n");
      out.write("                        <li><a style=\"color: #0099ff\" href=\"viewTweets.jsp\">View Tweets</a></li>\n");
      out.write("                        <li><a href=\"graph.jsp\">Graph</a></li>\n");
      out.write("                        <li><a href=\"index.jsp\">Logout</a></li>\n");
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
      out.write("\n");
      out.write("            <section id=\"about\" class=\"about\">\n");
      out.write("                <div class=\"container\" data-aos=\"fade-up\">\n");
      out.write("                    <center><h2>All Tweets</h2></center><br>\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-lg-12\">\n");
      out.write("                            <table class=\"customers\">\n");
      out.write("                            <tr>\n");
      out.write("                                <th>Twitter ID</th>\n");
      out.write("                                <th>User ID</th>\n");
      out.write("                                <th>Name</th>\n");
      out.write("                                <th>Tweet's</th>\n");
      out.write("                                <th>Emotion</th>\n");
      out.write("                                <th>Mental State</th>\n");
      out.write("                                <th><center>Photo</center></th>\n");
      out.write("                            </tr>\n");
      out.write("                            ");

                                Connection con = SQLconnection.getconnection();
                                Statement st = con.createStatement();
                                Statement st1 = con.createStatement();
                                Statement st2 = con.createStatement();

                                try {
                                    ResultSet rs = st.executeQuery("SELECT * FROM tweet");
                                    while (rs.next()) {

                            
      out.write("\n");
      out.write("                            <tr>\n");
      out.write("                                <td>");
      out.print(rs.getString("tid"));
      out.write("</td>\n");
      out.write("                                <td>");
      out.print(rs.getString("uid"));
      out.write("</td>\n");
      out.write("                                <td>");
      out.print(rs.getString("username"));
      out.write("</td>\n");
      out.write("                                <td>");
      out.print(rs.getString("msg"));
      out.write("</td>\n");
      out.write("                                <td>");
      out.print(rs.getString("status"));
      out.write("</td>\n");
      out.write("                                <td>");
      out.print(rs.getString("emotion"));
      out.write("</td>\n");
      out.write("                                <td><center><img src=\"tweet_img?id=");
      out.print(rs.getString("tid"));
      out.write("\" width=\"300\" height=\"300\"/></center></td>\n");
      out.write("                            </tr>\n");
      out.write("                            ");
                                             }
                                } catch (Exception ex) {
                                    ex.printStackTrace();
                                }


                            
      out.write("\n");
      out.write("                        </table>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </section><!-- End About Section -->\n");
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
