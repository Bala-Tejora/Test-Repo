package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("  <title>Bootstrap Example</title>\r\n");
      out.write("  <meta charset=\"utf-8\">\r\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css\">\r\n");
      out.write("  <script src=\"http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js\"></script>\r\n");
      out.write("  <script src=\"http://ajax.googleapis.com/ajax/libs/angularjs/1.2.26/angular.min.js\"></script>\r\n");
      out.write("  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/2.1.3/jquery.min.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<div class=\"container\" ng-app=\"\" ng-controller=\"registerController\">\r\n");
      out.write("\r\n");
      out.write("  <div class=\"page-header\">\r\n");
      out.write("  \t<h2>To Do</h2>\r\n");
      out.write("  </div>\t\r\n");
      out.write("\r\n");
      out.write("  \r\n");
      out.write("  <form class=\"form-horizontal\" role=\"form\">\r\n");
      out.write("  \t<div class=\"form-group\">\r\n");
      out.write("      <label class=\"control-label col-sm-2\" for=\"name\" >Name:</label>\r\n");
      out.write("      <div class=\"col-sm-4\">\r\n");
      out.write("        <input type=\"text\" ng-model=\"name\" name=\"name\" required class=\"form-control\" placeholder=\"Enter name\"> \r\n");
      out.write("      </div>\r\n");
      out.write("    </div>  \r\n");
      out.write("  \r\n");
      out.write("    <div class=\"form-group\">\r\n");
      out.write("      <label class=\"control-label col-sm-2\" for=\"email\">Email:</label>\r\n");
      out.write("      <div class=\"col-sm-4\">\r\n");
      out.write("        <input type=\"text\" ng-model=\"email\" name=\"email\" required class=\"form-control\" placeholder=\"Enter email\"/>\r\n");
      out.write("       \r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    \r\n");
      out.write("    <div class=\"form-group\">        \r\n");
      out.write("      <div class=\"col-sm-offset-2 col-sm-10\">\r\n");
      out.write("        <input type=\"submit\" class=\"btn btn-primary\" ng-click=\"save()\" value=\"Save\"/>\r\n");
      out.write("        <button type=\"submit\" class=\"btn btn-primary\" ng-click=\"getAll()\">Get all ToDo</button>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("  </form>\r\n");
      out.write("  \r\n");
      out.write("  \r\n");
      out.write("    <div class=\"panel panel-default\">\t  \r\n");
      out.write("\t\t  <div class=\"panel-body\">\r\n");
      out.write("\t\t   \t<p ng-bind=\"resultString\"> </p>\r\n");
      out.write("\t\t  </div>\r\n");
      out.write("\t</div>\r\n");
      out.write("  \r\n");
      out.write("    <table class=\"table table-striped\">\r\n");
      out.write("    \t<tr>\r\n");
      out.write("\t        <th>Name</th>\r\n");
      out.write("\t        <th>Email</th>\r\n");
      out.write("\t        <th></th>\r\n");
      out.write("\t        <th></th>\r\n");
      out.write("        </tr>\r\n");
      out.write("    \t<tr ng-repeat=\"todo in result\">\r\n");
      out.write("    \t\t<td>{{ todo.name }}</td>\r\n");
      out.write("    \t\t<td>{{ todo.email }}</td>\r\n");
      out.write("    \t\t<td> <a href=\"#\" class=\"button\" ng-click=\"edit(todo);\">Edit</a></td>\r\n");
      out.write("    \t\t<td> <a href=\"#\" class=\"button\" ng-click=\"remove(todo.name);\">Delete</a></td>\r\n");
      out.write("    \t</tr>\r\n");
      out.write("    </table>\r\n");
      out.write("  \r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\tfunction manualValidate(ev) {\r\n");
      out.write("\t    ev.target.checkValidity();\r\n");
      out.write("\t    return false;\r\n");
      out.write("\t}\r\n");
      out.write("\t$(\"#form\").bind(\"submit\", manualValidate);\r\n");
      out.write("\r\n");
      out.write("\tfunction registerController($scope,$http)\r\n");
      out.write("\t{\r\n");
      out.write("\t\t$scope.name=\"\";\r\n");
      out.write("\t\t$scope.resultString = \"\";\r\n");
      out.write("\t\t$scope.edit=false;\r\n");
      out.write("\t\t$scope.message = function(){\r\n");
      out.write("\t\t\tif($scope.name==\"\")\r\n");
      out.write("\t\t\t\treturn \"\";\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\treturn \"Welcome \" + $scope.name;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t \t$scope.getAll = function(){\r\n");
      out.write("\r\n");
      out.write("\t \t\t  $http.get(\"getToDo\")\r\n");
      out.write("\t \t\t    .success(function(response) {\r\n");
      out.write("\t \t\t    \t$scope.result = response;\r\n");
      out.write("\t \t\t    });\r\n");
      out.write("\t \t\t\r\n");
      out.write("\t \t}\t\r\n");
      out.write("\t \t\r\n");
      out.write("\t \t\r\n");
      out.write("\t \t$scope.save = function(){\r\n");
      out.write("\t \t\t\r\n");
      out.write("\t \t\t$http.get(\"addToDo?name=\"+$scope.name+\"&email=\"+$scope.email)\r\n");
      out.write("\t \t\t\t .success(function(response){\r\n");
      out.write("\t \t\t\t\t$scope.resultString = response;\r\n");
      out.write("\t \t\t\t\t$scope.getAll();\r\n");
      out.write("\t \t\t\t\t$scope.name=\"\";\r\n");
      out.write("\t \t\t\t\t$scope.email=\"\";\r\n");
      out.write("\t \t\t\t });\r\n");
      out.write("\t \t}\r\n");
      out.write("\t \t\r\n");
      out.write("\t \t$scope.remove = function(n){\r\n");
      out.write("\t \t\t\r\n");
      out.write("\t \t\t\t \t\t\r\n");
      out.write("\t \t\t $http.get(\"deleteToDo?name=\"+n)\r\n");
      out.write("\t\t\t .success(function(response){\r\n");
      out.write("\t\t\t\t$scope.resultString = response;\r\n");
      out.write("\t\t\t\t$scope.getAll();\r\n");
      out.write("\t\t\t }); \r\n");
      out.write("\t \t\t\r\n");
      out.write("\t \t}\r\n");
      out.write("\t \t\r\n");
      out.write("\t \t\r\n");
      out.write("\t \t$scope.edit = function(todo){\r\n");
      out.write("\t \t\t\r\n");
      out.write("\t \t\t\r\n");
      out.write("\t\t \t$scope.name=todo.name;\r\n");
      out.write("\t\t \t$scope.email=todo.email;\r\n");
      out.write("\t\t \t\r\n");
      out.write("\t \t\t\r\n");
      out.write("\t \t}\r\n");
      out.write("\t \t\r\n");
      out.write("\t\t\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
