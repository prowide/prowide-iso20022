
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
 * Provides additional information regarding the corporate action event.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorporateActionUnallocatedDetailsSD4", propOrder = {
    "uallctdDstrbtnBal",
    "uallctdRedBal",
    "uallctdSctiesTxDtls",
    "uallctdCshTxDtls"
})
public class CorporateActionUnallocatedDetailsSD4 {

    @XmlElement(name = "UallctdDstrbtnBal")
    protected CorporateActionUnallocatedBalanceSD2Choice uallctdDstrbtnBal;
    @XmlElement(name = "UallctdRedBal")
    protected CorporateActionUnallocatedBalanceSD1 uallctdRedBal;
    @XmlElement(name = "UallctdSctiesTxDtls")
    protected List<CorporateActionUnallocatedSecuritiesTransactionDetailsSD5> uallctdSctiesTxDtls;
    @XmlElement(name = "UallctdCshTxDtls")
    protected List<CorporateActionUnallocatedCashTransactionDetailsSD4> uallctdCshTxDtls;

    /**
     * Gets the value of the uallctdDstrbtnBal property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionUnallocatedBalanceSD2Choice }
     *     
     */
    public CorporateActionUnallocatedBalanceSD2Choice getUallctdDstrbtnBal() {
        return uallctdDstrbtnBal;
    }

    /**
     * Sets the value of the uallctdDstrbtnBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionUnallocatedBalanceSD2Choice }
     *     
     */
    public CorporateActionUnallocatedDetailsSD4 setUallctdDstrbtnBal(CorporateActionUnallocatedBalanceSD2Choice value) {
        this.uallctdDstrbtnBal = value;
        return this;
    }

    /**
     * Gets the value of the uallctdRedBal property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionUnallocatedBalanceSD1 }
     *     
     */
    public CorporateActionUnallocatedBalanceSD1 getUallctdRedBal() {
        return uallctdRedBal;
    }

    /**
     * Sets the value of the uallctdRedBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionUnallocatedBalanceSD1 }
     *     
     */
    public CorporateActionUnallocatedDetailsSD4 setUallctdRedBal(CorporateActionUnallocatedBalanceSD1 value) {
        this.uallctdRedBal = value;
        return this;
    }

    /**
     * Gets the value of the uallctdSctiesTxDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the uallctdSctiesTxDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUallctdSctiesTxDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CorporateActionUnallocatedSecuritiesTransactionDetailsSD5 }
     * 
     * 
     * @return
     *     The value of the uallctdSctiesTxDtls property.
     */
    public List<CorporateActionUnallocatedSecuritiesTransactionDetailsSD5> getUallctdSctiesTxDtls() {
        if (uallctdSctiesTxDtls == null) {
            uallctdSctiesTxDtls = new ArrayList<>();
        }
        return this.uallctdSctiesTxDtls;
    }

    /**
     * Gets the value of the uallctdCshTxDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the uallctdCshTxDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUallctdCshTxDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CorporateActionUnallocatedCashTransactionDetailsSD4 }
     * 
     * 
     * @return
     *     The value of the uallctdCshTxDtls property.
     */
    public List<CorporateActionUnallocatedCashTransactionDetailsSD4> getUallctdCshTxDtls() {
        if (uallctdCshTxDtls == null) {
            uallctdCshTxDtls = new ArrayList<>();
        }
        return this.uallctdCshTxDtls;
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
     * Adds a new item to the uallctdSctiesTxDtls list.
     * @see #getUallctdSctiesTxDtls()
     * 
     */
    public CorporateActionUnallocatedDetailsSD4 addUallctdSctiesTxDtls(CorporateActionUnallocatedSecuritiesTransactionDetailsSD5 uallctdSctiesTxDtls) {
        getUallctdSctiesTxDtls().add(uallctdSctiesTxDtls);
        return this;
    }

    /**
     * Adds a new item to the uallctdCshTxDtls list.
     * @see #getUallctdCshTxDtls()
     * 
     */
    public CorporateActionUnallocatedDetailsSD4 addUallctdCshTxDtls(CorporateActionUnallocatedCashTransactionDetailsSD4 uallctdCshTxDtls) {
        getUallctdCshTxDtls().add(uallctdCshTxDtls);
        return this;
    }

}
