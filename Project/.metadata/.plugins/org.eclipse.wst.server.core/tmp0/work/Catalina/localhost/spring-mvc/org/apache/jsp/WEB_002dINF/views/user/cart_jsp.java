/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.82
 * Generated at: 2022-10-01 01:25:13 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.user;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class cart_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(5);
    _jspx_dependants.put("jar:file:/D:/NAM3/Project/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/spring-mvc/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153359882000L));
    _jspx_dependants.put("/common/taglib.jsp", Long.valueOf(1664337675212L));
    _jspx_dependants.put("jar:file:/D:/NAM3/Project/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/spring-mvc/WEB-INF/lib/sitemesh-2.4.2.jar!/META-INF/sitemesh-decorator.tld", Long.valueOf(1123653092000L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1664294358090L));
    _jspx_dependants.put("/WEB-INF/lib/sitemesh-2.4.2.jar", Long.valueOf(1664332727026L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\r');
      out.write('\n');
      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- checkout -->\r\n");
      out.write("<div class=\"cart-items\">\r\n");
      out.write("	<div class=\"container\">\r\n");
      out.write("		<div class=\"dreamcrub\">\r\n");
      out.write("			<ul class=\"breadcrumbs\">\r\n");
      out.write("				<li class=\"home\"><a href=\"");
      if (_jspx_meth_c_005furl_005f0(_jspx_page_context))
        return;
      out.write("\" title=\"Go to Home Page\">Home</a>&nbsp;\r\n");
      out.write("					<span>&gt;</span></li>\r\n");
      out.write("				<li class=\"women\">Cart</li>\r\n");
      out.write("			</ul>\r\n");
      out.write("			<ul class=\"previous\">\r\n");
      out.write("				<li><a href=\"");
      if (_jspx_meth_c_005furl_005f1(_jspx_page_context))
        return;
      out.write("\">Back to Previous Page</a></li>\r\n");
      out.write("			</ul>\r\n");
      out.write("			<div class=\"clearfix\"></div>\r\n");
      out.write("		</div>\r\n");
      out.write("		<h2>MY SHOPPING BAG (3)</h2>\r\n");
      out.write("		<div class=\"cart-gd\">\r\n");
      out.write("			<script>$(document).ready(function(c) {\r\n");
      out.write("					$('.close1').on('click', function(c){\r\n");
      out.write("						$('.cart-header').fadeOut('slow', function(c){\r\n");
      out.write("							$('.cart-header').remove();\r\n");
      out.write("						});\r\n");
      out.write("						});	  \r\n");
      out.write("					});\r\n");
      out.write("			   </script>\r\n");
      out.write("			<div class=\"cart-header\">\r\n");
      out.write("				<div class=\"close1\"></div>\r\n");
      out.write("				<div class=\"cart-sec simpleCart_shelfItem\">\r\n");
      out.write("					<div class=\"cart-item cyc\">\r\n");
      out.write("						<img src=\"images/l1.jpg\" class=\"img-responsive\" alt=\"\">\r\n");
      out.write("					</div>\r\n");
      out.write("					<div class=\"cart-item-info\">\r\n");
      out.write("						<h3>\r\n");
      out.write("							<a href=\"#\"> Lorem Ipsum is not simply </a><span>Pickup\r\n");
      out.write("								time:</span>\r\n");
      out.write("						</h3>\r\n");
      out.write("						<ul class=\"qty\">\r\n");
      out.write("							<li><p>Min. order value:</p></li>\r\n");
      out.write("							<li><p>FREE delivery</p></li>\r\n");
      out.write("						</ul>\r\n");
      out.write("						<div class=\"delivery\">\r\n");
      out.write("							<p>Service Charges : $10.00</p>\r\n");
      out.write("							<span>Delivered in 1-1:30 hours</span>\r\n");
      out.write("							<div class=\"clearfix\"></div>\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("					<div class=\"clearfix\"></div>\r\n");
      out.write("\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("			<script>$(document).ready(function(c) {\r\n");
      out.write("					$('.close2').on('click', function(c){\r\n");
      out.write("							$('.cart-header2').fadeOut('slow', function(c){\r\n");
      out.write("						$('.cart-header2').remove();\r\n");
      out.write("					});\r\n");
      out.write("					});	  \r\n");
      out.write("					});\r\n");
      out.write("			 </script>\r\n");
      out.write("			<div class=\"cart-header2\">\r\n");
      out.write("				<div class=\"close2\"></div>\r\n");
      out.write("				<div class=\"cart-sec simpleCart_shelfItem\">\r\n");
      out.write("					<div class=\"cart-item cyc\">\r\n");
      out.write("						<img src=\"images/l2.jpg\" class=\"img-responsive\" alt=\"\">\r\n");
      out.write("					</div>\r\n");
      out.write("					<div class=\"cart-item-info\">\r\n");
      out.write("						<h3>\r\n");
      out.write("							<a href=\"#\"> Lorem Ipsum is not simply </a><span>Pickup\r\n");
      out.write("								time:</span>\r\n");
      out.write("						</h3>\r\n");
      out.write("						<ul class=\"qty\">\r\n");
      out.write("							<li><p>Min. order value:</p></li>\r\n");
      out.write("							<li><p>FREE delivery</p></li>\r\n");
      out.write("						</ul>\r\n");
      out.write("						<div class=\"delivery\">\r\n");
      out.write("							<p>Service Charges : $10.00</p>\r\n");
      out.write("							<span>Delivered in 3-3:30 hours</span>\r\n");
      out.write("							<div class=\"clearfix\"></div>\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("					<div class=\"clearfix\"></div>\r\n");
      out.write("\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("			<script>$(document).ready(function(c) {\r\n");
      out.write("					$('.close3').on('click', function(c){\r\n");
      out.write("							$('.cart-header3').fadeOut('slow', function(c){\r\n");
      out.write("						$('.cart-header3').remove();\r\n");
      out.write("					});\r\n");
      out.write("					});	  \r\n");
      out.write("					});\r\n");
      out.write("			 </script>\r\n");
      out.write("			<div class=\"cart-header3\">\r\n");
      out.write("				<div class=\"close3\"></div>\r\n");
      out.write("				<div class=\"cart-sec simpleCart_shelfItem\">\r\n");
      out.write("					<div class=\"cart-item cyc\">\r\n");
      out.write("						<img src=\"images/l3.jpg\" class=\"img-responsive\" alt=\"\">\r\n");
      out.write("					</div>\r\n");
      out.write("					<div class=\"cart-item-info\">\r\n");
      out.write("						<h3>\r\n");
      out.write("							<a href=\"#\"> Lorem Ipsum is not simply </a><span>Pickup\r\n");
      out.write("								time:</span>\r\n");
      out.write("						</h3>\r\n");
      out.write("						<ul class=\"qty\">\r\n");
      out.write("							<li><p>Min. order value:</p></li>\r\n");
      out.write("							<li><p>FREE delivery</p></li>\r\n");
      out.write("						</ul>\r\n");
      out.write("						<div class=\"delivery\">\r\n");
      out.write("							<p>Service Charges : $10.00</p>\r\n");
      out.write("							<span>Delivered On Tomorrow</span>\r\n");
      out.write("							<div class=\"clearfix\"></div>\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("					<div class=\"clearfix\"></div>\r\n");
      out.write("\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
      out.write("</div>\r\n");
      out.write("<!-- //checkout -->\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_005furl_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f0 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    boolean _jspx_th_c_005furl_005f0_reused = false;
    try {
      _jspx_th_c_005furl_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005furl_005f0.setParent(null);
      // /WEB-INF/views/user/cart.jsp(9,30) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005furl_005f0.setValue("/trang-chu");
      int _jspx_eval_c_005furl_005f0 = _jspx_th_c_005furl_005f0.doStartTag();
      if (_jspx_th_c_005furl_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f0);
      _jspx_th_c_005furl_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005furl_005f0, _jsp_getInstanceManager(), _jspx_th_c_005furl_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f1(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f1 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    boolean _jspx_th_c_005furl_005f1_reused = false;
    try {
      _jspx_th_c_005furl_005f1.setPageContext(_jspx_page_context);
      _jspx_th_c_005furl_005f1.setParent(null);
      // /WEB-INF/views/user/cart.jsp(14,17) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005furl_005f1.setValue("/trang-chu");
      int _jspx_eval_c_005furl_005f1 = _jspx_th_c_005furl_005f1.doStartTag();
      if (_jspx_th_c_005furl_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f1);
      _jspx_th_c_005furl_005f1_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005furl_005f1, _jsp_getInstanceManager(), _jspx_th_c_005furl_005f1_reused);
    }
    return false;
  }
}
