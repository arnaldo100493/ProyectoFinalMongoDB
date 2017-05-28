/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mongodb.web.servlet;

import com.mongodb.ejb.EJBContacto;
import java.io.IOException;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author FABAME
 */
@WebServlet(name = "ServletInsertarContacto", urlPatterns = {"/insertarContacto"})
public class ServletInsertarContacto extends HttpServlet {

    @EJB
    private EJBContacto ejbContacto;

    public ServletInsertarContacto() {

    }

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        if (request.getMethod().equals("GET")) {
            request.getRequestDispatcher("insertarContacto.jsp").forward(request, response);
        }

        if (request.getMethod().equals("POST")) {
            this.ejbContacto = new EJBContacto();
            this.ejbContacto.getContacto().setCedula(request.getParameter("textCedulaContacto"));
            this.ejbContacto.getContacto().setNombre(request.getParameter("textNombreContacto"));
            this.ejbContacto.getContacto().setApellido(request.getParameter("textApellidoContacto"));
            this.ejbContacto.getContacto().setDireccion(request.getParameter("textDireccionContacto"));
            this.ejbContacto.getContacto().setTelefono(request.getParameter("textTelefonoContacto"));
            this.ejbContacto.getContacto().setCorreoElectronico(request.getParameter("textCorreoElectronicoContacto"));

            boolean radioSexo;

            if (request.getParameter("radioSexoContacto").equals("Masculino")) {
                radioSexo = true;
            } else {
                radioSexo = false;
            }

            if (radioSexo) {
                this.ejbContacto.getContacto().setSexo(radioSexo);
            }

            boolean valorRetornado = this.ejbContacto.insertar();
            request.setAttribute("respuesta", valorRetornado ? "Correcto" : "Incorrecto");
            request.getRequestDispatcher("respuesta.jsp").forward(request, response);
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
