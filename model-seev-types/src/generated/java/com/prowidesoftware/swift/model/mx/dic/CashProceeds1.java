
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
 * Provides information about the cash proceeds.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CashProceeds1", propOrder = {
    "pstngAmt",
    "rcncltnDtls",
    "acctDtls"
})
public class CashProceeds1 {

    @XmlElement(name = "PstngAmt", required = true)
    protected ActiveCurrencyAndAmount pstngAmt;
    @XmlElement(name = "RcncltnDtls")
    protected String rcncltnDtls;
    @XmlElement(name = "AcctDtls", required = true)
    protected List<CashAccount19> acctDtls;

    /**
     * Gets the value of the pstngAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getPstngAmt() {
        return pstngAmt;
    }

    /**
     * Sets the value of the pstngAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public CashProceeds1 setPstngAmt(ActiveCurrencyAndAmount value) {
        this.pstngAmt = value;
        return this;
    }

    /**
     * Gets the value of the rcncltnDtls property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRcncltnDtls() {
        return rcncltnDtls;
    }

    /**
     * Sets the value of the rcncltnDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CashProceeds1 setRcncltnDtls(String value) {
        this.rcncltnDtls = value;
        return this;
    }

    /**
     * Gets the value of the acctDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the acctDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAcctDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CashAccount19 }
     * 
     * 
     */
    public List<CashAccount19> getAcctDtls() {
        if (acctDtls == null) {
            acctDtls = new ArrayList<CashAccount19>();
        }
        return this.acctDtls;
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
     * Adds a new item to the acctDtls list.
     * @see #getAcctDtls()
     * 
     */
    public CashProceeds1 addAcctDtls(CashAccount19 acctDtls) {
        getAcctDtls().add(acctDtls);
        return this;
    }

}
