/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import dao.PedidosDao.*;
import java.math.BigDecimal;

import java.sql.Connection;
import java.sql.Date;
import java.util.ArrayList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author carlo
 */
public class PedidosDaoTest {

    static Pedido pedido = new Pedido(1234, 90, 5, new Date(1980 - 05 - 25), new Date(1980 - 05 - 25), new Date(1980 - 05 - 25), 2, new BigDecimal(10.26), "prueba", "prueba", "prueba", "prueba", "prueba", "prueba");
    static PedidosDao pedidos = new PedidosDao();

    public PedidosDaoTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of getConexion method, of class PedidosDao.
     */
    @Test
    public void testGetConexion() {
        System.out.println("getConexion");
        PedidosDao instance = new PedidosDao();
        Connection expResult = null;
        Connection result = instance.getConexion();
        assertNotEquals(expResult, result);
    }

    /**
     * Test of read method, of class PedidosDao.
     */
    @Test
    public void testRead() {
        System.out.println("read");
        Integer idPedido = 1234;

        Pedido expResult = null;
        Pedido result = pedidos.read(idPedido);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of insert method, of class PedidosDao.
     */
    @Test
    public void testInsert() {
        System.out.println("insert");
        Pedido pedido = null;
        PedidosDao instance = new PedidosDao();
        Integer expResult = null;
        Integer result = instance.insert(pedido);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of update method, of class PedidosDao.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        Pedido pedido = null;
        PedidosDao instance = new PedidosDao();
        Integer expResult = null;
        Integer result = instance.update(pedido);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of delete method, of class PedidosDao.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        int idPedido = pedido.getId();
        int result = pedidos.delete(idPedido);
        assertEquals(result, 0);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of listar method, of class PedidosDao.
     */
    @Test
    public void testListar() {
        System.out.println("listar");
        Integer posicion = null;
        PedidosDao instance = new PedidosDao();
        ArrayList<Pedido> expResult = null;
        ArrayList<Pedido> result = instance.listar(posicion);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }

}
