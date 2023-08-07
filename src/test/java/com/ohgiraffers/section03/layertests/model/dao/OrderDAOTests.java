package com.ohgiraffers.section03.layertests.model.dao;

import com.ohgiraffers.section03.layertests.model.dto.CategoryDTO;
import com.ohgiraffers.section03.layertests.model.dto.OrderDTO;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.util.List;

import static com.ohgiraffers.common.JDBCTemplate.getConnection;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class OrderDAOTests {

    private static OrderDAO orderDAO;
    private static Connection con;

    private static OrderDTO order;

    @BeforeAll
    public static void setUp() {
        orderDAO = new OrderDAO();
        con = getConnection();

        order = new OrderDTO();
        order.setDate("20/12/31");
        order.setTime("12:25:41");
        order.setTotalOrederPrice(35000);
    }

    @Test
    public void testSelsctAllCategory() {
        List<CategoryDTO> categoryList = orderDAO.selectAllCategory(con);
        assertNotNull(categoryList);

        categoryList.forEach(System.out::println);
    }

    @Test
    public void testInsertOrder() {

        int result = orderDAO.insertOrder(con, order);

        assertEquals(1, result);
    }
}
