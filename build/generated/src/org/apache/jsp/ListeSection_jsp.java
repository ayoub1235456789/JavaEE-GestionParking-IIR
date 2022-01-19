package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class ListeSection_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(5);
    _jspx_dependants.add("/include/css.jsp");
    _jspx_dependants.add("/include/header.jsp");
    _jspx_dependants.add("/include/menu.jsp");
    _jspx_dependants.add("/include/footer.jsp");
    _jspx_dependants.add("/include/js.jsp");
  }

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
      out.write("<!DOCTYPE html>\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <!-- Tell the browser to be responsive to screen width -->\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("    <meta name=\"description\" content=\"\">\n");
      out.write("    <meta name=\"author\" content=\"\">\n");
      out.write("    <!-- Favicon icon -->\n");
      out.write("    <link rel=\"icon\" type=\"image/png\" sizes=\"16x16\" href=\"assets/images/favicon.png\">\n");
      out.write("    <title></title>\n");
      out.write("    <!-- Custom CSS -->\n");
      out.write("    ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<link href=\"adminmart-master/assets/extra-libs/c3/c3.min.css\" rel=\"stylesheet\">\n");
      out.write("<link href=\"adminmart-master/assets/libs/chartist/dist/chartist.min.css\" rel=\"stylesheet\">\n");
      out.write("<link href=\"adminmart-master/assets/extra-libs/jvector/jquery-jvectormap-2.0.2.css\" rel=\"stylesheet\" />\n");
      out.write("<link href=\"adminmart-master/dist/css/style.min.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("    <script src=\"script/jquery-3.3.1.min.js\" type=\"text/javascript\"></script>\n");
      out.write("    <script src=\"script/section.js\" type=\"text/javascript\"></script>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <div id=\"main-wrapper\" data-theme=\"light\" data-layout=\"vertical\" data-navbarbg=\"skin6\" data-sidebartype=\"full\"\n");
      out.write("         data-sidebar-position=\"fixed\" data-header-position=\"fixed\" data-boxed-layout=\"full\">\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("        <header class=\"topbar\" data-navbarbg=\"skin6\">\n");
      out.write("            <nav class=\"navbar top-navbar navbar-expand-md\">\n");
      out.write("                <div class=\"navbar-header\" data-logobg=\"skin6\">\n");
      out.write("                    <!-- This is for the sidebar toggle which is visible on mobile only -->\n");
      out.write("                    <a class=\"nav-toggler waves-effect waves-light d-block d-md-none\" href=\"javascript:void(0)\"><i\n");
      out.write("                            class=\"ti-menu ti-close\"></i></a>\n");
      out.write("                    <!-- ============================================================== -->\n");
      out.write("                    <!-- Logo -->\n");
      out.write("                    <!-- ============================================================== -->\n");
      out.write("                    <div class=\"navbar-brand\">\n");
      out.write("                        <!-- Logo icon -->\n");
      out.write("                        <a href=\"index.html\">\n");
      out.write("                            <b class=\"logo-icon\">\n");
      out.write("                                <!-- Dark Logo icon -->\n");
      out.write("                                <img src=\"adminmart-master/assets/images/logo-icon.png\" alt=\"homepage\" class=\"dark-logo\" />\n");
      out.write("                                <!-- Light Logo icon -->\n");
      out.write("                                <img src=\"adminmart-master/assets/images/logo-icon.png\" alt=\"homepage\" class=\"light-logo\" />\n");
      out.write("                            </b>\n");
      out.write("                            <!--End Logo icon -->\n");
      out.write("                            <!-- Logo text -->\n");
      out.write("                            <span class=\"logo-text\">\n");
      out.write("                                <!-- dark Logo text -->\n");
      out.write("                                <img src=\"adminmart-master/assets/images/logo-text.png\" alt=\"homepage\" class=\"dark-logo\" />\n");
      out.write("                                <!-- Light Logo text -->\n");
      out.write("                                <img src=\"adminmart-master/assets/images/logo-light-text.png\" class=\"light-logo\" alt=\"homepage\" />\n");
      out.write("                            </span>\n");
      out.write("                        </a>\n");
      out.write("                    </div>\n");
      out.write("                    <!-- ============================================================== -->\n");
      out.write("                    <!-- End Logo -->\n");
      out.write("                    <!-- ============================================================== -->\n");
      out.write("                    <!-- ============================================================== -->\n");
      out.write("                    <!-- Toggle which is visible on mobile only -->\n");
      out.write("                    <!-- ============================================================== -->\n");
      out.write("                    <a class=\"topbartoggler d-block d-md-none waves-effect waves-light\" href=\"javascript:void(0)\"\n");
      out.write("                        data-toggle=\"collapse\" data-target=\"#navbarSupportedContent\"\n");
      out.write("                        aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\"><i\n");
      out.write("                            class=\"ti-more\"></i></a>\n");
      out.write("                </div>\n");
      out.write("                <!-- ============================================================== -->\n");
      out.write("                <!-- End Logo -->\n");
      out.write("                <!-- ============================================================== -->\n");
      out.write("                <div class=\"navbar-collapse collapse\" id=\"navbarSupportedContent\">\n");
      out.write("                    <!-- ============================================================== -->\n");
      out.write("                    <!-- toggle and nav items -->\n");
      out.write("                    <!-- ============================================================== -->\n");
      out.write("                    <ul class=\"navbar-nav float-left mr-auto ml-3 pl-1\">\n");
      out.write("                        <!-- Notification -->\n");
      out.write("                    </ul>\n");
      out.write("                    <ul class=\"navbar-nav float-right\">\n");
      out.write("                        <li class=\"nav-item dropdown\">\n");
      out.write("                            <a class=\"nav-link dropdown-toggle\" href=\"javascript:void(0)\" data-toggle=\"dropdown\"\n");
      out.write("                                aria-haspopup=\"true\" aria-expanded=\"false\">\n");
      out.write("                                <img src=\"adminmart-master/assets/images/users/profile-pic.jpg\" alt=\"user\" class=\"rounded-circle\"\n");
      out.write("                                    width=\"40\">\n");
      out.write("                               <span class=\"ml-2 d-none d-lg-inline-block\"> Bonjour Admin</span></span>\n");
      out.write("                            </a>                         \n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("            </nav>\n");
      out.write("        </header>\n");
      out.write("\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<aside class=\"left-sidebar\" data-sidebarbg=\"skin6\">\n");
      out.write("    <!-- Sidebar scroll-->\n");
      out.write("    <div class=\"scroll-sidebar\" data-sidebarbg=\"skin6\">\n");
      out.write("        <!-- Sidebar navigation-->\n");
      out.write("        <nav class=\"sidebar-nav\">\n");
      out.write("            <ul id=\"sidebarnav\">\n");
      out.write("                <li class=\"list-divider\"></li>\n");
      out.write("                <li class=\"nav-small-cap\"><span class=\"hide-menu\">Dashboard</span></li>\n");
      out.write("                </li>     \n");
      out.write("             <li class=\"sidebar-item\"> <a href=\"ListePark.jsp\" class=\"sidebar-link\">\n");
      out.write("                        <i class=\"fas fa-calculator\"></i><span\n");
      out.write("                            class=\"hide-menu\">Gestion Parcking </span></a>\n");
      out.write("                </li>\n");
      out.write("                <li class=\"sidebar-item\"> <a  href=\"ListeSection.jsp\"  aria-expanded=\"false\" class=\"sidebar-link\">\n");
      out.write("                        <i class=\"fas fa-building\"></i><span\n");
      out.write("                            class=\"hide-menu\">Gestion Sections </span></a>\n");
      out.write("                </li> \n");
      out.write("                <li class=\"sidebar-item\"> <a class=\"sidebar-link sidebar-link\" href=\"ListePlace.jsp\" class=\"sidebar-link\">\n");
      out.write("                        <i class=\"fas fa-fax\"></i><span\n");
      out.write("                            class=\"hide-menu\">Gestion Places </span></a>\n");
      out.write("                </li>\n");
      out.write("                <li class=\"sidebar-item\"> <a href=\"ListeVehicule.jsp\" class=\"sidebar-link\">\n");
      out.write("                        <i class=\"fas fa-car\"></i><span\n");
      out.write("                            class=\"hide-menu\">Gestion Vehicules </span></a>\n");
      out.write("                </li>\n");
      out.write("\n");
      out.write("                <li class=\"sidebar-item\"> <a class=\"sidebar-link sidebar-link\" href=\"authentification-login1.html\"\n");
      out.write("                                             aria-expanded=\"false\"><i data-feather=\"log-out\" class=\"feather-icon\"></i><span\n");
      out.write("                            class=\"hide-menu\">Logout</span></a></li>\n");
      out.write("            </ul>\n");
      out.write("        </nav>\n");
      out.write("    </div>\n");
      out.write("</aside>");
      out.write("\n");
      out.write("        <div class=\"page-wrapper\">\n");
      out.write("            <div class=\"page-breadcrumb\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-7 align-self-center\">\n");
      out.write("                        <h3 class=\"page-title text-truncate text-dark font-weight-medium mb-1\">Dashboard</h3>\n");
      out.write("                        <div class=\"d-flex align-items-center\">\n");
      out.write("                            <nav aria-label=\"breadcrumb\">\n");
      out.write("                                <ol class=\"breadcrumb m-0 p-0\">\n");
      out.write("                                    <!-- <li class=\"breadcrumb-item\"><a href=\"index.\">Dashboard</a>\n");
      out.write("                                     </li>-->\n");
      out.write("                                </ol>\n");
      out.write("                            </nav>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"container-fluid\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                </div>                  \n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-lg-6\">\n");
      out.write("                        <div class=\"card\">\n");
      out.write("                            <div class=\"card-body\">\n");
      out.write("                                <h4 class=\"card-title\"><U>Liste des Sections</U></h4>\n");
      out.write("                                <br>\n");
      out.write("                                <div class=\"table-responsive\">\n");
      out.write("                                    <table class=\"table table-hover table-info\">\n");
      out.write("                                        <thead class=\"bg-info text-white\">\n");
      out.write("                                            <tr>\n");
      out.write("                                                <th scope=\"col\">Identification</th>\n");
      out.write("                                                <th scope=\"col\">Code De Section</th>\n");
      out.write("                                                <th scope=\"col\">Park</th>\n");
      out.write("                                                <th scope=\"col\">Supprimer</th>\n");
      out.write("                                                <th scope=\"col\">Modifier</th>\n");
      out.write("                                            </tr>\n");
      out.write("                                        </thead>         \n");
      out.write("                                        <tbody id=\"content\">\n");
      out.write("                                        </tbody>\n");
      out.write("                                    </table>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <fieldset>\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-12\">\n");
      out.write("                            <div class=\"card\">\n");
      out.write("                                <div class=\"card-body\">\n");
      out.write("                                    <h4 class=\"card-title\"><U>Gérer Les Sections De Votre Park</U></h4>\n");
      out.write("                                    <br>                 \n");
      out.write("                                    <div class=\"form-body\">                                           \n");
      out.write("                                        <div class=\"form-group row\">\n");
      out.write("                                            <label class=\"col-md-2\">Code De Section</label>\n");
      out.write("                                            <div class=\"col-md-10\">\n");
      out.write("                                                <div class=\"row\">     \n");
      out.write("                                                    <div class=\"col-md-4\">\n");
      out.write("                                                        <div class=\"form-group\">\n");
      out.write("                                                            <input id=\"code\" type=\"text\" class=\"form-control\" value=\"\" required=\"\"\n");
      out.write("                                                                   placeholder=\"Indiquer Le Code De Section\" name=\"code_section\">\n");
      out.write("                                                        </div>\n");
      out.write("                                                    </div>\n");
      out.write("                                                </div>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"form-group row\">\n");
      out.write("                                        <label class=\"col-md-2\">Affecter au Park</label>\n");
      out.write("                                        <div class=\"col-md-10\">\n");
      out.write("                                            <div class=\"row\">     \n");
      out.write("                                                <div class=\"col-md-4\">\n");
      out.write("                                                    <div class=\"form-group\">                                                            \n");
      out.write("                                                        <!--<div class=\"dropdown-menu\" id=\"zone\">                                                                      \n");
      out.write("                                                        </div>-->\n");
      out.write("                                                        <select  class=\"btn btn-secondary dropdown-toggle dropdown-toggle-split\"  aria-label=\"Default select example\" id=\"park\">\n");
      out.write("                                                            <option>Open this select menu</option>                                                                                                  \n");
      out.write("                                                        </select>\n");
      out.write("                                                    </div>\n");
      out.write("                                                </div>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"form-actions\">\n");
      out.write("                                        <div class=\"text-right\">\n");
      out.write("                                            <button id=\"mod\" type=\"submit\" class=\"btn btn-warning\" >Modifier</button>\n");
      out.write("                                            <button id=\"add\" type=\"submit\" class=\"btn waves-effect waves-light btn-success\" >Ajouter</button>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </fieldset>\n");
      out.write("                ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<footer class=\"footer text-center text-muted\">\n");
      out.write("                All Rights Reserved by AdminsMart ©\n");
      out.write("            </footer>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<script src=\"adminmart-master/assets/libs/jquery/dist/jquery.min.js\"></script>\n");
      out.write("<script src=\"adminmart-master/assets/libs/popper.js/dist/umd/popper.min.js\"></script>\n");
      out.write("<script src=\"adminmart-master/assets/libs/bootstrap/dist/js/bootstrap.min.js\"></script>\n");
      out.write("<script src=\"adminmart-master/dist/js/app-style-switcher.js\"></script>\n");
      out.write("<script src=\"adminmart-master/dist/js/feather.min.js\"></script>\n");
      out.write("<script src=\"adminmart-master/assets/libs/perfect-scrollbar/dist/perfect-scrollbar.jquery.min.js\"></script>\n");
      out.write("<script src=\"adminmart-master/dist/js/sidebarmenu.js\"></script>\n");
      out.write("<script src=\"adminmart-master/dist/js/custom.min.js\"></script>\n");
      out.write("<script src=\"adminmart-master/assets/extra-libs/c3/d3.min.js\"></script>\n");
      out.write("<script src=\"adminmart-master/assets/extra-libs/c3/c3.min.js\"></script>\n");
      out.write("<script src=\"adminmart-master/assets/libs/chartist/dist/chartist.min.js\"></script>\n");
      out.write("<script src=\"adminmart-master/assets/libs/chartist-plugin-tooltips/dist/chartist-plugin-tooltip.min.js\"></script>\n");
      out.write("<script src=\"adminmart-master/assets/extra-libs/jvector/jquery-jvectormap-2.0.2.min.js\"></script>\n");
      out.write("<script src=\"adminmart-master/assets/extra-libs/jvector/jquery-jvectormap-world-mill-en.js\"></script>\n");
      out.write("<script src=\"adminmart-master/dist/js/pages/dashboards/dashboard1.min.js\"></script>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
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
