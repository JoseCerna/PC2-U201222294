/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.upc.u201222294.entity;

import java.io.Serializable;

/**
 *
 * @author jose_cerna
 */
public class Deuda implements Serializable{
    private int idDeuda;
    private String ruc;
    private String concepto;
    private String periodoTributario;
    private String resolucion;
    private String codTributo;
    private double importePago;

    /**
     * @return the idDeuda
     */
    public int getIdDeuda() {
        return idDeuda;
    }

    /**
     * @param idDeuda the idDeuda to set
     */
    public void setIdDeuda(int idDeuda) {
        this.idDeuda = idDeuda;
    }

    /**
     * @return the ruc
     */
    public String getRuc() {
        return ruc;
    }

    /**
     * @param ruc the ruc to set
     */
    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    /**
     * @return the concepto
     */
    public String getConcepto() {
        return concepto;
    }

    /**
     * @param concepto the concepto to set
     */
    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    /**
     * @return the periodoTributario
     */
    public String getPeriodoTributario() {
        return periodoTributario;
    }

    /**
     * @param periodoTributario the periodoTributario to set
     */
    public void setPeriodoTributario(String periodoTributario) {
        this.periodoTributario = periodoTributario;
    }

    /**
     * @return the resolucion
     */
    public String getResolucion() {
        return resolucion;
    }

    /**
     * @param resolucion the resolucion to set
     */
    public void setResolucion(String resolucion) {
        this.resolucion = resolucion;
    }

    /**
     * @return the codTributo
     */
    public String getCodTributo() {
        return codTributo;
    }

    /**
     * @param codTributo the codTributo to set
     */
    public void setCodTributo(String codTributo) {
        this.codTributo = codTributo;
    }

    /**
     * @return the importePago
     */
    public double getImportePago() {
        return importePago;
    }

    /**
     * @param importePago the importePago to set
     */
    public void setImportePago(double importePago) {
        this.importePago = importePago;
    }
    
}
