/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.*;
import javax.servlet.annotation*;
import javax.servlet.http.*;
import javax.servlet.http.HttpServletResponse;
/**
 *
 * @author westo
 */
@WebServlet(name = "AssetServlet", urlPatterns = "/addAssetServlet")
public class AddAssetServlet extends HttpServlet{


        //hard coded username and password.  It will check if the user name and password match
        // if they match it will proceed to the iccu-member page.  If not, it will redirect to the access denied page.
    @Override
	 protected void dopost(HttpServletRequest request, HttpServletResponse response) 
                 throws ServletException, IOException {
             
		System.out.println("Please enter asset tag# and Serial#");
                
	    	String user = request.getParameter(s: "tag#");
                String password = request.getParameter(s:"serial#");
                
               try {
                   double asset = evaluateAsset(
                   Double.parseDouble(tag#),
                   Double.parseDouble(serial#));
                   
                    request.setAttribute(s:"Asset", asset);
                    response.setHeader(s: "Test", s1: "success");
                    response.sendHeader(s: "ASSET", String.valueOf(asset));
                    
                    RequestDispatcher dispatcher
                               = request.getRequestDispatcher(s:"index.jsp");
                    dispatcher.forward(request, response);
                    }           
                              catch (Exception e){
                    response.sendRedirect(s: "index.jsp");
                }
         }
               private Double collectAsset(Double tagNumber, Double serialNumber) {
               return (tagNumber) + ' ' + (serialNumber);}
    }
                        

 
