/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.upc.u201222294.dao.impl;

import edu.upc.u201222294.dao.DeudaDao;
import edu.upc.u201222294.entity.Deuda;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.sql.DataSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.simple.SimpleJdbcDaoSupport;
import org.springframework.stereotype.Repository;


/**
 *
 * @author jose_cerna
 */
@Repository
public class DeudaDaoImpl  extends SimpleJdbcDaoSupport implements  DeudaDao {

private static Logger log = LoggerFactory.getLogger(DeudaDaoImpl.class);

    @Autowired
    public DeudaDaoImpl(DataSource dataSource) {
        log.info("Asignando el dataSource");
        setDataSource(dataSource);
    }
    
    @Override
    public List<Deuda> getListDeudas() {
        return getSimpleJdbcTemplate().query(
                "Select idDeuda,ruc,concepto,periodoTributario,resolucion,codTributo,importePago from deudas",
                new BeanPropertyRowMapper<Deuda>(Deuda.class));
    }
    

}
