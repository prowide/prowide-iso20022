
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
@XmlType(name = "TransactionAmounts1", propOrder = {
    "amtQlfr",
    "txAmt",
    "crdhldrBllgAmt",
    "rcncltnAmt",
    "dtldAmt",
    "orgnlTxAmts"
})
public class TransactionAmounts1 {

    @XmlElement(name = "AmtQlfr")
    @XmlSchemaType(name = "string")
    protected TypeOfAmount11Code amtQlfr;
    @XmlElement(name = "TxAmt")
    protected TransactionAmount1 txAmt;
    @XmlElement(name = "CrdhldrBllgAmt")
    protected Amount4 crdhldrBllgAmt;
    @XmlElement(name = "RcncltnAmt")
    protected Amount4 rcncltnAmt;
    @XmlElement(name = "DtldAmt")
    protected List<DetailedAmount19> dtldAmt;
    @XmlElement(name = "OrgnlTxAmts")
    protected OriginalTransactionAmount1 orgnlTxAmts;

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
    public TransactionAmounts1 setAmtQlfr(TypeOfAmount11Code value) {
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
    public TransactionAmounts1 setTxAmt(TransactionAmount1 value) {
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
    public TransactionAmounts1 setCrdhldrBllgAmt(Amount4 value) {
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
    public TransactionAmounts1 setRcncltnAmt(Amount4 value) {
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
     * {@link DetailedAmount19 }
     * 
     * 
     * @return
     *     The value of the dtldAmt property.
     */
    public List<DetailedAmount19> getDtldAmt() {
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
     *     {@link OriginalTransactionAmount1 }
     *     
     */
    public OriginalTransactionAmount1 getOrgnlTxAmts() {
        return orgnlTxAmts;
    }

    /**
     * Sets the value of the orgnlTxAmts property.
     * 
     * @param value
     *     allowed object is
     *     {@link OriginalTransactionAmount1 }
     *     
     */
    public TransactionAmounts1 setOrgnlTxAmts(OriginalTransactionAmount1 value) {
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
    public TransactionAmounts1 addDtldAmt(DetailedAmount19 dtldAmt) {
        getDtldAmt().add(dtldAmt);
        return this;
    }

}
