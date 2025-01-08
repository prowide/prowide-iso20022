
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
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
@XmlType(name = "Context7", propOrder = {
    "ptOfSvcCntxt",
    "txCntxt"
})
public class Context7 {

    @XmlElement(name = "PtOfSvcCntxt")
    protected PointOfServiceContext2 ptOfSvcCntxt;
    @XmlElement(name = "TxCntxt")
    protected TransactionContext4 txCntxt;

    /**
     * Gets the value of the ptOfSvcCntxt property.
     * 
     * @return
     *     possible object is
     *     {@link PointOfServiceContext2 }
     *     
     */
    public PointOfServiceContext2 getPtOfSvcCntxt() {
        return ptOfSvcCntxt;
    }

    /**
     * Sets the value of the ptOfSvcCntxt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PointOfServiceContext2 }
     *     
     */
    public Context7 setPtOfSvcCntxt(PointOfServiceContext2 value) {
        this.ptOfSvcCntxt = value;
        return this;
    }

    /**
     * Gets the value of the txCntxt property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionContext4 }
     *     
     */
    public TransactionContext4 getTxCntxt() {
        return txCntxt;
    }

    /**
     * Sets the value of the txCntxt property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionContext4 }
     *     
     */
    public Context7 setTxCntxt(TransactionContext4 value) {
        this.txCntxt = value;
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
