
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
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
@XmlType(name = "CardTransactionAmount2", propOrder = {
    "ttlAmt",
    "crdhldrBllgTxAmt",
    "dtldAmt"
})
public class CardTransactionAmount2 {

    @XmlElement(name = "TtlAmt", required = true)
    protected CurrencyAndAmount ttlAmt;
    @XmlElement(name = "CrdhldrBllgTxAmt")
    protected DetailedAmount8 crdhldrBllgTxAmt;
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
    public CardTransactionAmount2 setTtlAmt(CurrencyAndAmount value) {
        this.ttlAmt = value;
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
    public CardTransactionAmount2 setCrdhldrBllgTxAmt(DetailedAmount8 value) {
        this.crdhldrBllgTxAmt = value;
        return this;
    }

    /**
     * Gets the value of the dtldAmt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dtldAmt property.
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
     */
    public List<DetailedAmount9> getDtldAmt() {
        if (dtldAmt == null) {
            dtldAmt = new ArrayList<DetailedAmount9>();
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
    public CardTransactionAmount2 addDtldAmt(DetailedAmount9 dtldAmt) {
        getDtldAmt().add(dtldAmt);
        return this;
    }

}
