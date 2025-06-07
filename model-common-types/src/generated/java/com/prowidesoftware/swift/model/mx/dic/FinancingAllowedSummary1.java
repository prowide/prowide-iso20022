
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Summary information about amount financed.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FinancingAllowedSummary1", propOrder = {
    "fincdItmNb",
    "ttlAccptdItmsAmt",
    "apldPctg",
    "ttlFincdAmt",
    "fincgDtDtls",
    "cdtAcct",
    "fincgAcct"
})
public class FinancingAllowedSummary1 {

    @XmlElement(name = "FincdItmNb", required = true)
    protected BigDecimal fincdItmNb;
    @XmlElement(name = "TtlAccptdItmsAmt", required = true)
    protected ActiveCurrencyAndAmount ttlAccptdItmsAmt;
    @XmlElement(name = "ApldPctg")
    protected BigDecimal apldPctg;
    @XmlElement(name = "TtlFincdAmt", required = true)
    protected ActiveCurrencyAndAmount ttlFincdAmt;
    @XmlElement(name = "FincgDtDtls")
    protected FinancingDateDetails1 fincgDtDtls;
    @XmlElement(name = "CdtAcct")
    protected CashAccount7 cdtAcct;
    @XmlElement(name = "FincgAcct")
    protected CashAccount7 fincgAcct;

    /**
     * Gets the value of the fincdItmNb property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFincdItmNb() {
        return fincdItmNb;
    }

    /**
     * Sets the value of the fincdItmNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public FinancingAllowedSummary1 setFincdItmNb(BigDecimal value) {
        this.fincdItmNb = value;
        return this;
    }

    /**
     * Gets the value of the ttlAccptdItmsAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getTtlAccptdItmsAmt() {
        return ttlAccptdItmsAmt;
    }

    /**
     * Sets the value of the ttlAccptdItmsAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public FinancingAllowedSummary1 setTtlAccptdItmsAmt(ActiveCurrencyAndAmount value) {
        this.ttlAccptdItmsAmt = value;
        return this;
    }

    /**
     * Gets the value of the apldPctg property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getApldPctg() {
        return apldPctg;
    }

    /**
     * Sets the value of the apldPctg property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public FinancingAllowedSummary1 setApldPctg(BigDecimal value) {
        this.apldPctg = value;
        return this;
    }

    /**
     * Gets the value of the ttlFincdAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getTtlFincdAmt() {
        return ttlFincdAmt;
    }

    /**
     * Sets the value of the ttlFincdAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public FinancingAllowedSummary1 setTtlFincdAmt(ActiveCurrencyAndAmount value) {
        this.ttlFincdAmt = value;
        return this;
    }

    /**
     * Gets the value of the fincgDtDtls property.
     * 
     * @return
     *     possible object is
     *     {@link FinancingDateDetails1 }
     *     
     */
    public FinancingDateDetails1 getFincgDtDtls() {
        return fincgDtDtls;
    }

    /**
     * Sets the value of the fincgDtDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancingDateDetails1 }
     *     
     */
    public FinancingAllowedSummary1 setFincgDtDtls(FinancingDateDetails1 value) {
        this.fincgDtDtls = value;
        return this;
    }

    /**
     * Gets the value of the cdtAcct property.
     * 
     * @return
     *     possible object is
     *     {@link CashAccount7 }
     *     
     */
    public CashAccount7 getCdtAcct() {
        return cdtAcct;
    }

    /**
     * Sets the value of the cdtAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccount7 }
     *     
     */
    public FinancingAllowedSummary1 setCdtAcct(CashAccount7 value) {
        this.cdtAcct = value;
        return this;
    }

    /**
     * Gets the value of the fincgAcct property.
     * 
     * @return
     *     possible object is
     *     {@link CashAccount7 }
     *     
     */
    public CashAccount7 getFincgAcct() {
        return fincgAcct;
    }

    /**
     * Sets the value of the fincgAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccount7 }
     *     
     */
    public FinancingAllowedSummary1 setFincgAcct(CashAccount7 value) {
        this.fincgAcct = value;
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
