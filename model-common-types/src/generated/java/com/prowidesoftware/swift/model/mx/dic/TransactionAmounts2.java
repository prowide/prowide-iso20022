
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
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
 * Amounts of the card transaction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransactionAmounts2", propOrder = {
    "amtQlfr",
    "txAmt",
    "crdhldrBllgAmt",
    "rcncltnAmt",
    "dtldAmt",
    "orgnlTxAmts"
})
public class TransactionAmounts2 {

    @XmlElement(name = "AmtQlfr")
    @XmlSchemaType(name = "string")
    protected TypeOfAmount22Code amtQlfr;
    @XmlElement(name = "TxAmt", required = true)
    protected TransactionAmount1 txAmt;
    @XmlElement(name = "CrdhldrBllgAmt")
    protected Amount15 crdhldrBllgAmt;
    @XmlElement(name = "RcncltnAmt")
    protected Amount15 rcncltnAmt;
    @XmlElement(name = "DtldAmt")
    protected List<DetailedAmount22> dtldAmt;
    @XmlElement(name = "OrgnlTxAmts")
    protected OriginalTransactionAmount2 orgnlTxAmts;

    /**
     * Gets the value of the amtQlfr property.
     * 
     * @return
     *     possible object is
     *     {@link TypeOfAmount22Code }
     *     
     */
    public TypeOfAmount22Code getAmtQlfr() {
        return amtQlfr;
    }

    /**
     * Sets the value of the amtQlfr property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeOfAmount22Code }
     *     
     */
    public TransactionAmounts2 setAmtQlfr(TypeOfAmount22Code value) {
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
    public TransactionAmounts2 setTxAmt(TransactionAmount1 value) {
        this.txAmt = value;
        return this;
    }

    /**
     * Gets the value of the crdhldrBllgAmt property.
     * 
     * @return
     *     possible object is
     *     {@link Amount15 }
     *     
     */
    public Amount15 getCrdhldrBllgAmt() {
        return crdhldrBllgAmt;
    }

    /**
     * Sets the value of the crdhldrBllgAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount15 }
     *     
     */
    public TransactionAmounts2 setCrdhldrBllgAmt(Amount15 value) {
        this.crdhldrBllgAmt = value;
        return this;
    }

    /**
     * Gets the value of the rcncltnAmt property.
     * 
     * @return
     *     possible object is
     *     {@link Amount15 }
     *     
     */
    public Amount15 getRcncltnAmt() {
        return rcncltnAmt;
    }

    /**
     * Sets the value of the rcncltnAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount15 }
     *     
     */
    public TransactionAmounts2 setRcncltnAmt(Amount15 value) {
        this.rcncltnAmt = value;
        return this;
    }

    /**
     * Gets the value of the dtldAmt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the dtldAmt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDtldAmt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DetailedAmount22 }
     * 
     * 
     * @return
     *     The value of the dtldAmt property.
     */
    public List<DetailedAmount22> getDtldAmt() {
        if (dtldAmt == null) {
            dtldAmt = new ArrayList<>();
        }
        return this.dtldAmt;
    }

    /**
     * Gets the value of the orgnlTxAmts property.
     * 
     * @return
     *     possible object is
     *     {@link OriginalTransactionAmount2 }
     *     
     */
    public OriginalTransactionAmount2 getOrgnlTxAmts() {
        return orgnlTxAmts;
    }

    /**
     * Sets the value of the orgnlTxAmts property.
     * 
     * @param value
     *     allowed object is
     *     {@link OriginalTransactionAmount2 }
     *     
     */
    public TransactionAmounts2 setOrgnlTxAmts(OriginalTransactionAmount2 value) {
        this.orgnlTxAmts = value;
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

    /**
     * Adds a new item to the dtldAmt list.
     * @see #getDtldAmt()
     * 
     */
    public TransactionAmounts2 addDtldAmt(DetailedAmount22 dtldAmt) {
        getDtldAmt().add(dtldAmt);
        return this;
    }

}
