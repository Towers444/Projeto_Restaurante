package com.restaurante.web.servlets;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
import com.restaurante.common.NegocioException;
import com.restaurante.model.service.ManterAlimentos;
import com.restaurante.model.service.ManterFuncionarios;
import com.restaurante.model.service.ManterUsuario;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 *
 * @author Usuário
 */
@WebServlet(urlPatterns = {"/funcionarioServlet"})
public class funcionarioServlet extends HttpServlet {

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
        
        String op = request.getParameter("op");
        
        String cpf = request.getParameter("cpf");
        String nome = request.getParameter("nome");
        String funcao = request.getParameter("funcao");
        String salario = request.getParameter("salario");
        String senha = request.getParameter("senha");

        try {
            switch(op) {
                case "a":
                    ManterFuncionarios.cadastrarFuncionarios(cpf, nome, funcao, salario);
                    ManterUsuario.cadastrarUsuario(cpf, senha);
                    break;
            }
            
            response.sendRedirect("gerenciarfuncionario.jsp");

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
