package uk.co.diffa.cq.qrcode;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * Rewrites the URL as a QRCode image using the Google Charts Api
 * e.g. http://chart.apis.google.com/chart?cht=qr&chs=150x150&choe=UTF-8&chld=H&chl=http://www.t-systems.com
 *
 * Inspiration for idea from http://twitter.com/mattcutts/status/11780579336
 * Code inspired by tests at http://svn.apache.org/repos/asf/sling/trunk/launchpad/test-services/src/main/java/org/apache/sling/launchpad/testservices/servlets/
 *
 * Details of Sling Servlet handling here:
 * http://sling.apache.org/site/servlets.html
 *
 * @scr.component immediate="true" metatype="no"
 * @scr.service interface="javax.servlet.Servlet"
 *
 * @scr.property name="service.description" value="URL QRCode Redirect Request Handler"
 * @scr.property name="service.vendor" value="T-Systems"
 *
 * Register this servlet for the default resource type and two selectors:
 * @scr.property name="sling.servlet.resourceTypes"
 *               value="sling/servlet/default"
 *
 * @scr.property name="sling.servlet.extensions"
 *               values.1 = "qr"

 */

@SuppressWarnings("serial")
public class QrCodeRequestHandler extends javax.servlet.http.HttpServlet {

	private static final String baseUrl = "http://chart.apis.google.com/chart?cht=qr&chs=150x150&choe=UTF-8&chld=H&chl=";
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		resp.sendRedirect(baseUrl+req.getRequestURL().toString());
	}
}