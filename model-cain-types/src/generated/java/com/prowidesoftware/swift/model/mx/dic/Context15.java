
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Context in which the card payment transaction is performed.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Context15", propOrder = {
    "ptOfSvcCntxt",
    "txCntxt",
    "saleCntxt"
})
public class Context15 {

    @XmlElement(name = "PtOfSvcCntxt")
    protected PointOfServiceContext5 ptOfSvcCntxt;
    @XmlElement(name = "TxCntxt", required = true)
    protected TransactionContext8 txCntxt;
    @XmlElement(name = "SaleCntxt")
    protected SaleContext8 saleCntxt;

    /**
     * Gets the value of the ptOfSvcCntxt property.
     * 
     * @return
     *     possible object is
     *     {@link PointOfServiceContext5 }
     *     
     */
    public PointOfServiceContext5 getPtOfSvcCntxt() {
        return ptOfSvcCntxt;
    }

    /**
     * Sets the value of the ptOfSvcCntxt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PointOfServiceContext5 }
     *     
     */
    public Context15 setPtOfSvcCntxt(PointOfServiceContext5 value) {
        this.ptOfSvcCntxt = value;
        return this;
    }

    /**
     * Gets the value of the txCntxt property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionContext8 }
     *     
     */
    public TransactionContext8 getTxCntxt() {
        return txCntxt;
    }

    /**
     * Sets the value of the txCntxt property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionContext8 }
     *     
     */
    public Context15 setTxCntxt(TransactionContext8 value) {
        this.txCntxt = value;
        return this;
    }

    /**
     * Gets the value of the saleCntxt property.
     * 
     * @return
     *     possible object is
     *     {@link SaleContext8 }
     *     
     */
    public SaleContext8 getSaleCntxt() {
        return saleCntxt;
    }

    /**
     * Sets the value of the saleCntxt property.
     * 
     * @param value
     *     allowed object is
     *     {@link SaleContext8 }
     *     
     */
    public Context15 setSaleCntxt(SaleContext8 value) {
        this.saleCntxt = value;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
    }

    @Override
    public boolean equals(Object that) {
        return EqualsBuilder.reflectionEquals(this, that);
    }

    @Override
    public int hashCode() {
        return HashCodeBuilder.reflectionHashCode(this);
    }

}
