/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.upc.u201222294.dao;

import edu.upc.u201222294.entity.Deuda;
import java.util.List;

/**
 *
 * @author jose_cerna
 */
public interface DeudaDao {
    public List<Deuda> getListDeudas();
    public Deuda getListDeudasxRuc(String Ruc);
}
