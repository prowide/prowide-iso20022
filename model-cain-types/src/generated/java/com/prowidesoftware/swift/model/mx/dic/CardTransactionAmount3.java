
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
 * Amounts of the transaction expressed within the terminal currency.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CardTransactionAmount3", propOrder = {
    "ttlAmt",
    "amtQlfr",
    "crdhldrBllgTxAmt",
    "rcncltnTxAmt",
    "dtldAmt"
})
public class CardTransactionAmount3 {

    @XmlElement(name = "TtlAmt", required = true)
    protected CurrencyAndAmount ttlAmt;
    @XmlElement(name = "AmtQlfr")
    @XmlSchemaType(name = "string")
    protected TypeOfAmount1Code amtQlfr;
    @XmlElement(name = "CrdhldrBllgTxAmt")
    protected DetailedAmount8 crdhldrBllgTxAmt;
    @XmlElement(name = "RcncltnTxAmt")
    protected DetailedAmount8 rcncltnTxAmt;
    @XmlElement(name = "DtldAmt")
    protected List<DetailedAmount9> dtldAmt;

    /**
     * Gets the value of the ttlAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAndAmount }
     *     
     */
    public CurrencyAndAmount getTtlAmt() {
        return ttlAmt;
    }

    /**
     * Sets the value of the ttlAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAndAmount }
     *     
     */
    public CardTransactionAmount3 setTtlAmt(CurrencyAndAmount value) {
        this.ttlAmt = value;
        return this;
    }

    /**
     * Gets the value of the amtQlfr property.
     * 
     * @return
     *     possible object is
     *     {@link TypeOfAmount1Code }
     *     
     */
    public TypeOfAmount1Code getAmtQlfr() {
        return amtQlfr;
    }

    /**
     * Sets the value of the amtQlfr property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeOfAmount1Code }
     *     
     */
    public CardTransactionAmount3 setAmtQlfr(TypeOfAmount1Code value) {
        this.amtQlfr = value;
        return this;
    }

    /**
     * Gets the value of the crdhldrBllgTxAmt property.
     * 
     * @return
     *     possible object is
     *     {@link DetailedAmount8 }
     *     
     */
    public DetailedAmount8 getCrdhldrBllgTxAmt() {
        return crdhldrBllgTxAmt;
    }

    /**
     * Sets the value of the crdhldrBllgTxAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DetailedAmount8 }
     *     
     */
    public CardTransactionAmount3 setCrdhldrBllgTxAmt(DetailedAmount8 value) {
        this.crdhldrBllgTxAmt = value;
        return this;
    }

    /**
     * Gets the value of the rcncltnTxAmt property.
     * 
     * @return
     *     possible object is
     *     {@link DetailedAmount8 }
     *     
     */
    public DetailedAmount8 getRcncltnTxAmt() {
        return rcncltnTxAmt;
    }

    /**
     * Sets the value of the rcncltnTxAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DetailedAmount8 }
     *     
     */
    public CardTransactionAmount3 setRcncltnTxAmt(DetailedAmount8 value) {
        this.rcncltnTxAmt = value;
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
     * {@link DetailedAmount9 }
     * 
     * 
     * @return
     *     The value of the dtldAmt property.
     */
    public List<DetailedAmount9> getDtldAmt() {
        if (dtldAmt == null) {
            dtldAmt = new ArrayList<>();
        }
        return this.dtldAmt;
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
    public CardTransactionAmount3 addDtldAmt(DetailedAmount9 dtldAmt) {
        getDtldAmt().add(dtldAmt);
        return this;
    }

}
