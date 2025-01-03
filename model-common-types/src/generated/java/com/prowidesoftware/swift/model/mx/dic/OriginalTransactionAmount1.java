
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Amount related to the original transaction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OriginalTransactionAmount1", propOrder = {
    "amtQlfr",
    "txAmt",
    "crdhldrBllgAmt",
    "rcncltnAmt"
})
public class OriginalTransactionAmount1 {

    @XmlElement(name = "AmtQlfr")
    @XmlSchemaType(name = "string")
    protected TypeOfAmount11Code amtQlfr;
    @XmlElement(name = "TxAmt", required = true)
    protected TransactionAmount1 txAmt;
    @XmlElement(name = "CrdhldrBllgAmt")
    protected Amount4 crdhldrBllgAmt;
    @XmlElement(name = "RcncltnAmt")
    protected Amount4 rcncltnAmt;

    /**
     * Gets the value of the amtQlfr property.
     * 
     * @return
     *     possible object is
     *     {@link TypeOfAmount11Code }
     *     
     */
    public TypeOfAmount11Code getAmtQlfr() {
        return amtQlfr;
    }

    /**
     * Sets the value of the amtQlfr property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeOfAmount11Code }
     *     
     */
    public OriginalTransactionAmount1 setAmtQlfr(TypeOfAmount11Code value) {
        this.amtQlfr = value;
        return this;
    }

    /**
     * Gets the value of the txAmt property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionAmount1 }
     *     
     */
    public TransactionAmount1 getTxAmt() {
        return txAmt;
    }

    /**
     * Sets the value of the txAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionAmount1 }
     *     
     */
    public OriginalTransactionAmount1 setTxAmt(TransactionAmount1 value) {
        this.txAmt = value;
        return this;
    }

    /**
     * Gets the value of the crdhldrBllgAmt property.
     * 
     * @return
     *     possible object is
     *     {@link Amount4 }
     *     
     */
    public Amount4 getCrdhldrBllgAmt() {
        return crdhldrBllgAmt;
    }

    /**
     * Sets the value of the crdhldrBllgAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount4 }
     *     
     */
    public OriginalTransactionAmount1 setCrdhldrBllgAmt(Amount4 value) {
        this.crdhldrBllgAmt = value;
        return this;
    }

    /**
     * Gets the value of the rcncltnAmt property.
     * 
     * @return
     *     possible object is
     *     {@link Amount4 }
     *     
     */
    public Amount4 getRcncltnAmt() {
        return rcncltnAmt;
    }

    /**
     * Sets the value of the rcncltnAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount4 }
     *     
     */
    public OriginalTransactionAmount1 setRcncltnAmt(Amount4 value) {
        this.rcncltnAmt = value;
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
