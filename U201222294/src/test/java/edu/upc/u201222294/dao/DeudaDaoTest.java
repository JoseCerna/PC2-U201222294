/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.upc.u201222294.dao;

import edu.upc.u201222294.entity.Deuda;
import org.junit.*;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author jose_cerna
 */


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/WEB-INF/context/U201222294-context.xml")
@Transactional
public class DeudaDaoTest {
    
    //private static Logger log = LoggerFactory.getLogger(DeudaDaoTest.class);
    
    @Autowired
    private DeudaDao deudaDao;
    
    @Test
    public void testGetListDeudasxRuc(){
        String ruc = "20516755416";
        Deuda objDeuda = deudaDao.getListDeudasxRuc(ruc);
        Assert.assertNull(objDeuda);
    }
}

//public class DeudaDaoTest extends TestCase {
//    
//    public DeudaDaoTest(String testName) {
//        super(testName);
//    }
//    
//    @Override
//    protected void setUp() throws Exception {
//        super.setUp();
//    }
//    
//    @Override
//    protected void tearDown() throws Exception {
//        super.tearDown();
//    }
//
//    /**
//     * Test of getListDeudas method, of class DeudaDao.
//     */
//    public void testGetListDeudas() {
//        System.out.println("getListDeudas");
//        DeudaDao instance = new DeudaDaoImpl();
//        List expResult = null;
//        List result = instance.getListDeudas();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getListDeudasxRuc method, of class DeudaDao.
//     */
//    public void testGetListDeudasxRuc() {
//        System.out.println("getListDeudasxRuc");
//        String Ruc = "";
//        DeudaDao instance = new DeudaDaoImpl();
//        Deuda expResult = null;
//        Deuda result = instance.getListDeudasxRuc(Ruc);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    public class DeudaDaoImpl implements DeudaDao {
//
//        public List<Deuda> getListDeudas() {
//            return null;
//        }
//
//        public Deuda getListDeudasxRuc(String Ruc) {
//            return null;
//        }
//    }
//}
