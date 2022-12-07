package com.restaurante.web.servlets;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

import com.restaurante.model.service.ManterProduto;
import com.restaurante.common.NegocioException;
import com.restaurante.model.dto.Produto;
import com.restaurante.model.service.ManterPedidos;
import com.restaurante.model.service.ManterPedidosCliente;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 *
 * @author Usuário
 */
@WebServlet(urlPatterns = {"/pedidoServlet"})
public class pedidoServlet extends HttpServlet {

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
            throws ServletException, IOException, NegocioException, SQLException, ClassNotFoundException {
        response.setContentType("text/html;charset=UTF-8");
        
        String op = request.getParameter("op");
        
        String nome = request.getParameter("nome");
        String valor = request.getParameter("valor");
        String descricao = request.getParameter("descricao");
        
        try {
            switch(op) {
                case "a":
                    ManterPedidos.cadastrarPedidos(nome, descricao);
                    ManterPedidosCliente.cadastrarPedidosCliente(valor, nome);
                    response.sendRedirect("index.jsp");
                    break;
                case "f":
                    ManterPedidos.excluirPedidos(nome, descricao);
                    ManterPedidosCliente.excluirPedidosCliente(nome);
                    response.sendRedirect("pedidosGestao.jsp");
                    break;
            }
        } catch (NegocioException ex) {
            System.out.print("Error");
        } catch (ClassNotFoundException ex) {
            System.out.print("Error");
        } catch (SQLException ex) {
            System.out.print("Error");
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
        try {
            processRequest(request, response);
        } catch (NegocioException ex) {
            Logger.getLogger(pedidoServlet.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(pedidoServlet.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(pedidoServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
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
        try {
            processRequest(request, response);
        } catch (NegocioException ex) {
            Logger.getLogger(pedidoServlet.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(pedidoServlet.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(pedidoServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
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
