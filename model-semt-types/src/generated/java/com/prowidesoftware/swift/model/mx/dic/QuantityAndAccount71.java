
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Details on the quantity, account and other related information involved in a transaction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QuantityAndAccount71", propOrder = {
    "sttlmQty",
    "dnmtnChc",
    "cshAcct",
    "qtyBrkdwn",
    "sfkpgPlc"
})
public class QuantityAndAccount71 {

    @XmlElement(name = "SttlmQty", required = true)
    protected FinancialInstrumentQuantity15Choice sttlmQty;
    @XmlElement(name = "DnmtnChc")
    protected String dnmtnChc;
    @XmlElement(name = "CshAcct")
    protected CashAccountIdentification6Choice cshAcct;
    @XmlElement(name = "QtyBrkdwn")
    protected List<QuantityBreakdown48> qtyBrkdwn;
    @XmlElement(name = "SfkpgPlc")
    protected SafeKeepingPlace2 sfkpgPlc;

    /**
     * Gets the value of the sttlmQty property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity15Choice }
     *     
     */
    public FinancialInstrumentQuantity15Choice getSttlmQty() {
        return sttlmQty;
    }

    /**
     * Sets the value of the sttlmQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity15Choice }
     *     
     */
    public QuantityAndAccount71 setSttlmQty(FinancialInstrumentQuantity15Choice value) {
        this.sttlmQty = value;
        return this;
    }

    /**
     * Gets the value of the dnmtnChc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDnmtnChc() {
        return dnmtnChc;
    }

    /**
     * Sets the value of the dnmtnChc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public QuantityAndAccount71 setDnmtnChc(String value) {
        this.dnmtnChc = value;
        return this;
    }

    /**
     * Gets the value of the cshAcct property.
     * 
     * @return
     *     possible object is
     *     {@link CashAccountIdentification6Choice }
     *     
     */
    public CashAccountIdentification6Choice getCshAcct() {
        return cshAcct;
    }

    /**
     * Sets the value of the cshAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccountIdentification6Choice }
     *     
     */
    public QuantityAndAccount71 setCshAcct(CashAccountIdentification6Choice value) {
        this.cshAcct = value;
        return this;
    }

    /**
     * Gets the value of the qtyBrkdwn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the qtyBrkdwn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQtyBrkdwn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QuantityBreakdown48 }
     * 
     * 
     * @return
     *     The value of the qtyBrkdwn property.
     */
    public List<QuantityBreakdown48> getQtyBrkdwn() {
        if (qtyBrkdwn == null) {
            qtyBrkdwn = new ArrayList<>();
        }
        return this.qtyBrkdwn;
    }

    /**
     * Gets the value of the sfkpgPlc property.
     * 
     * @return
     *     possible object is
     *     {@link SafeKeepingPlace2 }
     *     
     */
    public SafeKeepingPlace2 getSfkpgPlc() {
        return sfkpgPlc;
    }

    /**
     * Sets the value of the sfkpgPlc property.
     * 
     * @param value
     *     allowed object is
     *     {@link SafeKeepingPlace2 }
     *     
     */
    public QuantityAndAccount71 setSfkpgPlc(SafeKeepingPlace2 value) {
        this.sfkpgPlc = value;
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
     * Adds a new item to the qtyBrkdwn list.
     * @see #getQtyBrkdwn()
     * 
     */
    public QuantityAndAccount71 addQtyBrkdwn(QuantityBreakdown48 qtyBrkdwn) {
        getQtyBrkdwn().add(qtyBrkdwn);
        return this;
    }

}
