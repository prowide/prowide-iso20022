
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
 * Choice of payment instruments.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentInstrument16Choice", propOrder = {
    "cshAcctDtls",
    "chqDtls",
    "bkrsDrftDtls"
})
public class PaymentInstrument16Choice {

    @XmlElement(name = "CshAcctDtls")
    protected List<CashAccount26> cshAcctDtls;
    @XmlElement(name = "ChqDtls")
    protected Cheque4 chqDtls;
    @XmlElement(name = "BkrsDrftDtls")
    protected Cheque4 bkrsDrftDtls;

    /**
     * Gets the value of the cshAcctDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cshAcctDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCshAcctDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CashAccount26 }
     * 
     * 
     */
    public List<CashAccount26> getCshAcctDtls() {
        if (cshAcctDtls == null) {
            cshAcctDtls = new ArrayList<CashAccount26>();
        }
        return this.cshAcctDtls;
    }

    /**
     * Gets the value of the chqDtls property.
     * 
     * @return
     *     possible object is
     *     {@link Cheque4 }
     *     
     */
    public Cheque4 getChqDtls() {
        return chqDtls;
    }

    /**
     * Sets the value of the chqDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link Cheque4 }
     *     
     */
    public PaymentInstrument16Choice setChqDtls(Cheque4 value) {
        this.chqDtls = value;
        return this;
    }

    /**
     * Gets the value of the bkrsDrftDtls property.
     * 
     * @return
     *     possible object is
     *     {@link Cheque4 }
     *     
     */
    public Cheque4 getBkrsDrftDtls() {
        return bkrsDrftDtls;
    }

    /**
     * Sets the value of the bkrsDrftDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link Cheque4 }
     *     
     */
    public PaymentInstrument16Choice setBkrsDrftDtls(Cheque4 value) {
        this.bkrsDrftDtls = value;
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
     * Adds a new item to the cshAcctDtls list.
     * @see #getCshAcctDtls()
     * 
     */
    public PaymentInstrument16Choice addCshAcctDtls(CashAccount26 cshAcctDtls) {
        getCshAcctDtls().add(cshAcctDtls);
        return this;
    }

}
