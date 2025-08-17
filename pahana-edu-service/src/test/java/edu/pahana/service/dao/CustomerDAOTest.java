/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package edu.pahana.service.dao;

import edu.pahana.service.dto.CustomerDTO;
import java.util.List;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author User
 */
public class CustomerDAOTest {
    
    public CustomerDAOTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of findAll method, of class CustomerDAO.
     */
    @Test
    public void testFindAll() throws Exception {
        System.out.println("findAll");
        CustomerDAO instance = new CustomerDAO();
        List<CustomerDTO> expResult = null;
        List<CustomerDTO> result = instance.findAll();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findById method, of class CustomerDAO.
     */
    @Test
    public void testFindById() throws Exception {
        System.out.println("findById");
        int id = 0;
        CustomerDAO instance = new CustomerDAO();
        CustomerDTO expResult = null;
        CustomerDTO result = instance.findById(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of create method, of class CustomerDAO.
     */
    @Test
    public void testCreate() throws Exception {
        System.out.println("create");
        CustomerDTO d = null;
        CustomerDAO instance = new CustomerDAO();
        CustomerDTO expResult = null;
        CustomerDTO result = instance.create(d);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of update method, of class CustomerDAO.
     */
    @Test
    public void testUpdate() throws Exception {
        System.out.println("update");
        int id = 0;
        CustomerDTO d = null;
        CustomerDAO instance = new CustomerDAO();
        boolean expResult = false;
        boolean result = instance.update(id, d);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of delete method, of class CustomerDAO.
     */
    @Test
    public void testDelete() throws Exception {
        System.out.println("delete");
        int id = 0;
        CustomerDAO instance = new CustomerDAO();
        boolean expResult = false;
        boolean result = instance.delete(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
