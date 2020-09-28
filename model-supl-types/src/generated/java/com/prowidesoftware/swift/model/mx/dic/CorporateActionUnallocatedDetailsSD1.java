
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
 * Provides additional information regarding the corporate action event.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorporateActionUnallocatedDetailsSD1", propOrder = {
    "sfkpgAcct",
    "uallctdBal",
    "uallctdSctiesTxDtls",
    "uallctdCshTxDtls"
})
public class CorporateActionUnallocatedDetailsSD1 {

    @XmlElement(name = "SfkpgAcct", required = true)
    protected String sfkpgAcct;
    @XmlElement(name = "UallctdBal")
    protected CorporateActionUnallocatedBalanceSD1Choice uallctdBal;
    @XmlElement(name = "UallctdSctiesTxDtls")
    protected List<CorporateActionUnallocatedSecuritiesTransactionDetailsSD1> uallctdSctiesTxDtls;
    @XmlElement(name = "UallctdCshTxDtls")
    protected List<CorporateActionUnallocatedCashTransactionDetailsSD1> uallctdCshTxDtls;

    /**
     * Gets the value of the sfkpgAcct property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSfkpgAcct() {
        return sfkpgAcct;
    }

    /**
     * Sets the value of the sfkpgAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CorporateActionUnallocatedDetailsSD1 setSfkpgAcct(String value) {
        this.sfkpgAcct = value;
        return this;
    }

    /**
     * Gets the value of the uallctdBal property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionUnallocatedBalanceSD1Choice }
     *     
     */
    public CorporateActionUnallocatedBalanceSD1Choice getUallctdBal() {
        return uallctdBal;
    }

    /**
     * Sets the value of the uallctdBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionUnallocatedBalanceSD1Choice }
     *     
     */
    public CorporateActionUnallocatedDetailsSD1 setUallctdBal(CorporateActionUnallocatedBalanceSD1Choice value) {
        this.uallctdBal = value;
        return this;
    }

    /**
     * Gets the value of the uallctdSctiesTxDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the uallctdSctiesTxDtls property.
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
     * {@link CorporateActionUnallocatedSecuritiesTransactionDetailsSD1 }
     * 
     * 
     */
    public List<CorporateActionUnallocatedSecuritiesTransactionDetailsSD1> getUallctdSctiesTxDtls() {
        if (uallctdSctiesTxDtls == null) {
            uallctdSctiesTxDtls = new ArrayList<CorporateActionUnallocatedSecuritiesTransactionDetailsSD1>();
        }
        return this.uallctdSctiesTxDtls;
    }

    /**
     * Gets the value of the uallctdCshTxDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the uallctdCshTxDtls property.
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
     * {@link CorporateActionUnallocatedCashTransactionDetailsSD1 }
     * 
     * 
     */
    public List<CorporateActionUnallocatedCashTransactionDetailsSD1> getUallctdCshTxDtls() {
        if (uallctdCshTxDtls == null) {
            uallctdCshTxDtls = new ArrayList<CorporateActionUnallocatedCashTransactionDetailsSD1>();
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
    public CorporateActionUnallocatedDetailsSD1 addUallctdSctiesTxDtls(CorporateActionUnallocatedSecuritiesTransactionDetailsSD1 uallctdSctiesTxDtls) {
        getUallctdSctiesTxDtls().add(uallctdSctiesTxDtls);
        return this;
    }

    /**
     * Adds a new item to the uallctdCshTxDtls list.
     * @see #getUallctdCshTxDtls()
     * 
     */
    public CorporateActionUnallocatedDetailsSD1 addUallctdCshTxDtls(CorporateActionUnallocatedCashTransactionDetailsSD1 uallctdCshTxDtls) {
        getUallctdCshTxDtls().add(uallctdCshTxDtls);
        return this;
    }

}
