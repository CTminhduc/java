/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.82
 * Generated at: 2022-09-30 09:51:46 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.user;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<div class=\"banner\">\r\n");
      out.write("	<div class=\"container\">\r\n");
      out.write("		<div class=\"banner-bottom\">\r\n");
      out.write("			<div class=\"banner-bottom-left\">\r\n");
      out.write("				<h2>\r\n");
      out.write("					B<br>U<br>Y\r\n");
      out.write("				</h2>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class=\"banner-bottom-right\">\r\n");
      out.write("				<div class=\"callbacks_container\">\r\n");
      out.write("					<ul class=\"rslides\" id=\"slider4\">\r\n");
      out.write("						<li>\r\n");
      out.write("							<div class=\"banner-info\">\r\n");
      out.write("								<h3>Smart But Casual</h3>\r\n");
      out.write("								<p>Start your shopping here...</p>\r\n");
      out.write("							</div>\r\n");
      out.write("						</li>\r\n");
      out.write("						<li>\r\n");
      out.write("							<div class=\"banner-info\">\r\n");
      out.write("								<h3>Shop Online</h3>\r\n");
      out.write("								<p>Start your shopping here...</p>\r\n");
      out.write("							</div>\r\n");
      out.write("						</li>\r\n");
      out.write("						<li>\r\n");
      out.write("							<div class=\"banner-info\">\r\n");
      out.write("								<h3>Pack your Bag</h3>\r\n");
      out.write("								<p>Start your shopping here...</p>\r\n");
      out.write("							</div>\r\n");
      out.write("						</li>\r\n");
      out.write("					</ul>\r\n");
      out.write("				</div>\r\n");
      out.write("				<!--banner-->\r\n");
      out.write("				<script\r\n");
      out.write("					src=\"");
      if (_jspx_meth_c_005furl_005f0(_jspx_page_context))
        return;
      out.write(" \"></script>\r\n");
      out.write("				<script>\r\n");
      out.write("						// You can also use \"$(window).load(function() {\"\r\n");
      out.write("						$(function() {\r\n");
      out.write("							// Slideshow 4\r\n");
      out.write("							$(\"#slider4\")\r\n");
      out.write("									.responsiveSlides(\r\n");
      out.write("											{\r\n");
      out.write("												auto : true,\r\n");
      out.write("												pager : true,\r\n");
      out.write("												nav : false,\r\n");
      out.write("												speed : 500,\r\n");
      out.write("												namespace : \"callbacks\",\r\n");
      out.write("												before : function() {\r\n");
      out.write("													$('.events')\r\n");
      out.write("															.append(\r\n");
      out.write("																	\"<li>before event fired.</li>\");\r\n");
      out.write("												},\r\n");
      out.write("												after : function() {\r\n");
      out.write("													$('.events')\r\n");
      out.write("															.append(\r\n");
      out.write("																	\"<li>after event fired.</li>\");\r\n");
      out.write("												}\r\n");
      out.write("											});\r\n");
      out.write("\r\n");
      out.write("						});\r\n");
      out.write("					</script>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class=\"clearfix\"></div>\r\n");
      out.write("		</div>\r\n");
      out.write("		<div class=\"shop\">\r\n");
      out.write("			<a href=\"single.html\">SHOP COLLECTION NOW</a>\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
      out.write("</div>\r\n");
      out.write("<!-- content-section-starts-here -->\r\n");
      out.write("<div class=\"container\">\r\n");
      out.write("	<div class=\"main-content\">\r\n");
      out.write("		<div class=\"online-strip\">\r\n");
      out.write("			<div class=\"col-md-4 follow-us\">\r\n");
      out.write("				<h3>\r\n");
      out.write("					follow us : <a class=\"twitter\" href=\"#\"></a><a class=\"facebook\"\r\n");
      out.write("						href=\"#\"></a>\r\n");
      out.write("				</h3>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class=\"col-md-4 shipping-grid\">\r\n");
      out.write("				<div class=\"shipping\">\r\n");
      out.write("					<img src=\"images/shipping.png\" alt=\"\" />\r\n");
      out.write("				</div>\r\n");
      out.write("				<div class=\"shipping-text\">\r\n");
      out.write("					<h3>Free Shipping</h3>\r\n");
      out.write("					<p>on orders over $ 199</p>\r\n");
      out.write("				</div>\r\n");
      out.write("				<div class=\"clearfix\"></div>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class=\"col-md-4 online-order\">\r\n");
      out.write("				<p>Order online</p>\r\n");
      out.write("				<h3>Tel:999 4567 8902</h3>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class=\"clearfix\"></div>\r\n");
      out.write("		</div>\r\n");
      out.write("		<div class=\"products-grid\">\r\n");
      out.write("			<header>\r\n");
      out.write("				<h3 class=\"head text-center\">Latest Products</h3>\r\n");
      out.write("			</header>\r\n");
      out.write("			<div class=\"col-md-4 product simpleCart_shelfItem text-center\">\r\n");
      out.write("				<a href=\"single.html\"><img src=\"images/p1.jpg\" alt=\"\" /></a>\r\n");
      out.write("				<div class=\"mask\">\r\n");
      out.write("					<a href=\"single.html\">Quick View</a>\r\n");
      out.write("				</div>\r\n");
      out.write("				<a class=\"product_name\" href=\"single.html\">Sed ut perspiciatis</a>\r\n");
      out.write("				<p>\r\n");
      out.write("					<a class=\"item_add\" href=\"#\"><i></i> <span class=\"item_price\">$329</span></a>\r\n");
      out.write("				</p>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class=\"col-md-4 product simpleCart_shelfItem text-center\">\r\n");
      out.write("				<a href=\"single.html\"><img src=\"images/p2.jpg\" alt=\"\" /></a>\r\n");
      out.write("				<div class=\"mask\">\r\n");
      out.write("					<a href=\"single.html\">Quick View</a>\r\n");
      out.write("				</div>\r\n");
      out.write("				<a class=\"product_name\" href=\"single.html\">great explorer</a>\r\n");
      out.write("				<p>\r\n");
      out.write("					<a class=\"item_add\" href=\"#\"><i></i> <span class=\"item_price\">$599.8</span></a>\r\n");
      out.write("				</p>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class=\"col-md-4 product simpleCart_shelfItem text-center\">\r\n");
      out.write("				<a href=\"single.html\"><img src=\"images/p3.jpg\" alt=\"\" /></a>\r\n");
      out.write("				<div class=\"mask\">\r\n");
      out.write("					<a href=\"single.html\">Quick View</a>\r\n");
      out.write("				</div>\r\n");
      out.write("				<a class=\"product_name\" href=\"single.html\">similique sunt</a>\r\n");
      out.write("				<p>\r\n");
      out.write("					<a class=\"item_add\" href=\"#\"><i></i> <span class=\"item_price\">$359.6</span></a>\r\n");
      out.write("				</p>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class=\"col-md-4 product simpleCart_shelfItem text-center\">\r\n");
      out.write("				<a href=\"single.html\"><img src=\"images/p4.jpg\" alt=\"\" /></a>\r\n");
      out.write("				<div class=\"mask\">\r\n");
      out.write("					<a href=\"single.html\">Quick View</a>\r\n");
      out.write("				</div>\r\n");
      out.write("				<a class=\"product_name\" href=\"single.html\">shrinking </a>\r\n");
      out.write("				<p>\r\n");
      out.write("					<a class=\"item_add\" href=\"#\"><i></i> <span class=\"item_price\">$649.99</span></a>\r\n");
      out.write("				</p>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class=\"col-md-4 product simpleCart_shelfItem text-center\">\r\n");
      out.write("				<a href=\"single.html\"><img src=\"images/p5.jpg\" alt=\"\" /></a>\r\n");
      out.write("				<div class=\"mask\">\r\n");
      out.write("					<a href=\"single.html\">Quick View</a>\r\n");
      out.write("				</div>\r\n");
      out.write("				<a class=\"product_name\" href=\"single.html\">perfectly simple</a>\r\n");
      out.write("				<p>\r\n");
      out.write("					<a class=\"item_add\" href=\"#\"><i></i> <span class=\"item_price\">$750</span></a>\r\n");
      out.write("				</p>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class=\"col-md-4 product simpleCart_shelfItem text-center\">\r\n");
      out.write("				<a href=\"single.html\"><img src=\"images/p6.jpg\" alt=\"\" /></a>\r\n");
      out.write("				<div class=\"mask\">\r\n");
      out.write("					<a href=\"single.html\">Quick View</a>\r\n");
      out.write("				</div>\r\n");
      out.write("				<a class=\"product_name\" href=\"single.html\">equal blame</a>\r\n");
      out.write("				<p>\r\n");
      out.write("					<a class=\"item_add\" href=\"#\"><i></i> <span class=\"item_price\">$295.59</span></a>\r\n");
      out.write("				</p>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class=\"col-md-4 product simpleCart_shelfItem text-center\">\r\n");
      out.write("				<a href=\"single.html\"><img src=\"images/p7.jpg\" alt=\"\" /></a>\r\n");
      out.write("				<div class=\"mask\">\r\n");
      out.write("					<a href=\"single.html\">Quick View</a>\r\n");
      out.write("				</div>\r\n");
      out.write("				<a class=\"product_name\" href=\"single.html\">Neque porro</a>\r\n");
      out.write("				<p>\r\n");
      out.write("					<a class=\"item_add\" href=\"#\"><i></i> <span class=\"item_price\">$380</span></a>\r\n");
      out.write("				</p>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class=\"col-md-4 product simpleCart_shelfItem text-center\">\r\n");
      out.write("				<a href=\"single.html\"><img src=\"images/p8.jpg\" alt=\"\" /></a>\r\n");
      out.write("				<div class=\"mask\">\r\n");
      out.write("					<a href=\"single.html\">Quick View</a>\r\n");
      out.write("				</div>\r\n");
      out.write("				<a class=\"product_name\" href=\"single.html\">perfectly simple</a>\r\n");
      out.write("				<p>\r\n");
      out.write("					<a class=\"item_add\" href=\"#\"><i></i> <span class=\"item_price\">$540.6</span></a>\r\n");
      out.write("				</p>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class=\"col-md-4 product simpleCart_shelfItem text-center\">\r\n");
      out.write("				<a href=\"single.html\"><img src=\"images/p9.jpg\" alt=\"\" /></a>\r\n");
      out.write("				<div class=\"mask\">\r\n");
      out.write("					<a href=\"single.html\">Quick View</a>\r\n");
      out.write("				</div>\r\n");
      out.write("				<a class=\"product_name\" href=\"single.html\">praising pain</a>\r\n");
      out.write("				<p>\r\n");
      out.write("					<a class=\"item_add\" href=\"#\"><i></i> <span class=\"item_price\">$229.5</span></a>\r\n");
      out.write("				</p>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class=\"clearfix\"></div>\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"other-products\">\r\n");
      out.write("	<div class=\"container\">\r\n");
      out.write("		<h3 class=\"like text-center\">Featured Collection</h3>\r\n");
      out.write("		<ul id=\"flexiselDemo3\">\r\n");
      out.write("			<li><a href=\"single.html\"><img src=\"images/l1.jpg\"\r\n");
      out.write("					class=\"img-responsive\" alt=\"\" /></a>\r\n");
      out.write("				<div class=\"product liked-product simpleCart_shelfItem\">\r\n");
      out.write("					<a class=\"like_name\" href=\"single.html\">perfectly simple</a>\r\n");
      out.write("					<p>\r\n");
      out.write("						<a class=\"item_add\" href=\"#\"><i></i> <span class=\" item_price\">$759</span></a>\r\n");
      out.write("					</p>\r\n");
      out.write("				</div></li>\r\n");
      out.write("			<li><a href=\"single.html\"><img src=\"images/l2.jpg\"\r\n");
      out.write("					class=\"img-responsive\" alt=\"\" /></a>\r\n");
      out.write("				<div class=\"product liked-product simpleCart_shelfItem\">\r\n");
      out.write("					<a class=\"like_name\" href=\"single.html\">praising pain</a>\r\n");
      out.write("					<p>\r\n");
      out.write("						<a class=\"item_add\" href=\"#\"><i></i> <span class=\" item_price\">$699</span></a>\r\n");
      out.write("					</p>\r\n");
      out.write("				</div></li>\r\n");
      out.write("			<li><a href=\"single.html\"><img src=\"images/l3.jpg\"\r\n");
      out.write("					class=\"img-responsive\" alt=\"\" /></a>\r\n");
      out.write("				<div class=\"product liked-product simpleCart_shelfItem\">\r\n");
      out.write("					<a class=\"like_name\" href=\"single.html\">Neque porro</a>\r\n");
      out.write("					<p>\r\n");
      out.write("						<a class=\"item_add\" href=\"#\"><i></i> <span class=\" item_price\">$329</span></a>\r\n");
      out.write("					</p>\r\n");
      out.write("				</div></li>\r\n");
      out.write("			<li><a href=\"single.html\"><img src=\"images/l4.jpg\"\r\n");
      out.write("					class=\"img-responsive\" alt=\"\" /></a>\r\n");
      out.write("				<div class=\"product liked-product simpleCart_shelfItem\">\r\n");
      out.write("					<a class=\"like_name\" href=\"single.html\">equal blame</a>\r\n");
      out.write("					<p>\r\n");
      out.write("						<a class=\"item_add\" href=\"#\"><i></i> <span class=\" item_price\">$499</span></a>\r\n");
      out.write("					</p>\r\n");
      out.write("				</div></li>\r\n");
      out.write("			<li><a href=\"single.html\"><img src=\"images/l5.jpg\"\r\n");
      out.write("					class=\"img-responsive\" alt=\"\" /></a>\r\n");
      out.write("				<div class=\"product liked-product simpleCart_shelfItem\">\r\n");
      out.write("					<a class=\"like_name\" href=\"single.html\">perfectly simple</a>\r\n");
      out.write("					<p>\r\n");
      out.write("						<a class=\"item_add\" href=\"#\"><i></i> <span class=\" item_price\">$649</span></a>\r\n");
      out.write("					</p>\r\n");
      out.write("				</div></li>\r\n");
      out.write("		</ul>\r\n");
      out.write("		<script type=\"text/javascript\">\r\n");
      out.write("				$(window).load(function() {\r\n");
      out.write("					$(\"#flexiselDemo3\").flexisel({\r\n");
      out.write("						visibleItems : 4,\r\n");
      out.write("						animationSpeed : 1000,\r\n");
      out.write("						autoPlay : true,\r\n");
      out.write("						autoPlaySpeed : 3000,\r\n");
      out.write("						pauseOnHover : true,\r\n");
      out.write("						enableResponsiveBreakpoints : true,\r\n");
      out.write("						responsiveBreakpoints : {\r\n");
      out.write("							portrait : {\r\n");
      out.write("								changePoint : 480,\r\n");
      out.write("								visibleItems : 1\r\n");
      out.write("							},\r\n");
      out.write("							landscape : {\r\n");
      out.write("								changePoint : 640,\r\n");
      out.write("								visibleItems : 2\r\n");
      out.write("							},\r\n");
      out.write("							tablet : {\r\n");
      out.write("								changePoint : 768,\r\n");
      out.write("								visibleItems : 3\r\n");
      out.write("							}\r\n");
      out.write("						}\r\n");
      out.write("					});\r\n");
      out.write("\r\n");
      out.write("				});\r\n");
      out.write("			</script>\r\n");
      out.write("		<script type=\"text/javascript\"\r\n");
      out.write("			src=\"");
      if (_jspx_meth_c_005furl_005f1(_jspx_page_context))
        return;
      out.write(" \"></script>\r\n");
      out.write("	</div>\r\n");
      out.write("</div>");
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
      // /WEB-INF/views/user/home.jsp(37,10) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005furl_005f0.setValue("/template/user/js/responsiveslides.min.js");
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
      // /WEB-INF/views/user/home.jsp(270,8) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005furl_005f1.setValue("/template/user/js/responsiveslides.min.js");
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
