/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import za.ac.tut.model.ArithmeticOperations;
import za.ac.tut.model.ArithmeticOperationsInterface;

/**
 *
 * @author Jacob
 */
public class AddServlet extends HttpServlet {
 
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String strNum1 = request.getParameter("num1");
        String strNum2 = request.getParameter("num2");
        
        //convert
        int num1 = Integer.parseInt(strNum1);
        int num2 = Integer.parseInt(strNum2);
        
        
        ArithmeticOperationsInterface aoi = new ArithmeticOperations();
        Integer sum = aoi.add(num1, num2);
         
        
        //atach data to objects
        request.setAttribute("n1",num1);
        request.setAttribute("n2",num2);
        request.setAttribute("s",sum);
        
        
        //forward to outcome p
        RequestDispatcher disp = request.getRequestDispatcher(add_outcome.jsp);
        disp.forward(request,response);
    }

     
     

}
