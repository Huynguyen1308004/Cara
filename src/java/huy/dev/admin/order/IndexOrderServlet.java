/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package huy.dev.admin.order;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import huy.dev.admin.BaseAdminServlet;
import huy.dev.data.dao.DatabaseDao;
import huy.dev.data.dao.OrderDao;
import huy.dev.data.model.Order;

/**
 *
 * @author Admin
 */
public class IndexOrderServlet extends BaseAdminServlet {

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        OrderDao orderDao = DatabaseDao.getInstance().getOrderDao();
        List<Order> orderList = orderDao.findAll();
        
        request.setAttribute("orderList", orderList);
        request.getRequestDispatcher("admin/order/index.jsp").include(request, response);
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }
}
