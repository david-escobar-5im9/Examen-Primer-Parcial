/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Convertidor;

import   java.io.*;
import   javax.servlet.*;
import   javax.servlet.http.*;
 
public   class   convertir  extends   HttpServlet
{

    /**
     *
     * @param req
     * @param res
     * @throws ServletException
     * @throws IOException
     */
    @Override
public   void   doPost(HttpServletRequest   req,   HttpServletResponse res)
throws   ServletException,   IOException
    {
    double   num1,     result;
    int   operacion;

    ServletOutputStream   out   =   res.getOutputStream();

    num1   =   Double.parseDouble(req.getParameter("num1"));
    operacion = Integer.parseInt(req.getParameter("operacion"));

    result   =   calcularRes(num1,operacion);

    out.println("<html>");
    out.println("<head><title>.:ConvertidorServlet:.</title></head>");
    out.println("<body>");
    out.println("<h1><center>El resultado es</center></h1>");
    out.println("<h2>   <b><center>"+  result   +"</center></b></h2>");
    out.println("</body>");
    out.println("</html>");
    }

    public   double   calcularRes(double   num1,   int   operacion)
    {
    double   result   =   0;

        switch   (operacion)
        {
        case   1:
            return   num1*.05;
            
        case   2:
            return   num1*20;
        }

    return   result;
    }
}