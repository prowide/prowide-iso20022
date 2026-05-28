
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
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
 * Fees not included in the transaction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdditionalFee4", propOrder = {
    "tp",
    "prgm",
    "dscrptr",
    "rate",
    "rateFix",
    "cdtDbt",
    "amt",
    "ccy",
    "rcncltnAmt",
    "rcncltnCcy",
    "rcncltnFctvXchgRate",
    "assgnr",
    "desc"
})
public class AdditionalFee4 {

    @XmlElement(name = "Tp", required = true)
    protected String tp;
    @XmlElement(name = "Prgm")
    protected String prgm;
    @XmlElement(name = "Dscrptr")
    protected String dscrptr;
    @XmlElement(name = "Rate")
    protected BigDecimal rate;
    @XmlElement(name = "RateFix")
    protected BigDecimal rateFix;
    @XmlElement(name = "CdtDbt")
    @XmlSchemaType(name = "string")
    protected CreditDebit3Code cdtDbt;
    @XmlElement(name = "Amt", required = true)
    protected BigDecimal amt;
    @XmlElement(name = "Ccy")
    protected String ccy;
    @XmlElement(name = "RcncltnAmt")
    protected BigDecimal rcncltnAmt;
    @XmlElement(name = "RcncltnCcy")
    protected String rcncltnCcy;
    @XmlElement(name = "RcncltnFctvXchgRate")
    protected BigDecimal rcncltnFctvXchgRate;
    @XmlElement(name = "Assgnr")
    @XmlSchemaType(name = "string")
    protected ATICAPartyType1Code assgnr;
    @XmlElement(name = "Desc")
    protected String desc;

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public AdditionalFee4 setTp(String value) {
        this.tp = value;
        return this;
    }

    /**
     * Gets the value of the prgm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrgm() {
        return prgm;
    }

    /**
     * Sets the value of the prgm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public AdditionalFee4 setPrgm(String value) {
        this.prgm = value;
        return this;
    }

    /**
     * Gets the value of the dscrptr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDscrptr() {
        return dscrptr;
    }

    /**
     * Sets the value of the dscrptr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public AdditionalFee4 setDscrptr(String value) {
        this.dscrptr = value;
        return this;
    }

    /**
     * Gets the value of the rate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRate() {
        return rate;
    }

    /**
     * Sets the value of the rate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public AdditionalFee4 setRate(BigDecimal value) {
        this.rate = value;
        return this;
    }

    /**
     * Gets the value of the rateFix property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRateFix() {
        return rateFix;
    }

    /**
     * Sets the value of the rateFix property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public AdditionalFee4 setRateFix(BigDecimal value) {
        this.rateFix = value;
        return this;
    }

    /**
     * Gets the value of the cdtDbt property.
     * 
     * @return
     *     possible object is
     *     {@link CreditDebit3Code }
     *     
     */
    public CreditDebit3Code getCdtDbt() {
        return cdtDbt;
    }

    /**
     * Sets the value of the cdtDbt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditDebit3Code }
     *     
     */
    public AdditionalFee4 setCdtDbt(CreditDebit3Code value) {
        this.cdtDbt = value;
        return this;
    }

    /**
     * Gets the value of the amt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmt() {
        return amt;
    }

    /**
     * Sets the value of the amt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public AdditionalFee4 setAmt(BigDecimal value) {
        this.amt = value;
        return this;
    }

    /**
     * Gets the value of the ccy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCcy() {
        return ccy;
    }

    /**
     * Sets the value of the ccy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public AdditionalFee4 setCcy(String value) {
        this.ccy = value;
        return this;
    }

    /**
     * Gets the value of the rcncltnAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRcncltnAmt() {
        return rcncltnAmt;
    }

    /**
     * Sets the value of the rcncltnAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public AdditionalFee4 setRcncltnAmt(BigDecimal value) {
        this.rcncltnAmt = value;
        return this;
    }

    /**
     * Gets the value of the rcncltnCcy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRcncltnCcy() {
        return rcncltnCcy;
    }

    /**
     * Sets the value of the rcncltnCcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public AdditionalFee4 setRcncltnCcy(String value) {
        this.rcncltnCcy = value;
        return this;
    }

    /**
     * Gets the value of the rcncltnFctvXchgRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRcncltnFctvXchgRate() {
        return rcncltnFctvXchgRate;
    }

    /**
     * Sets the value of the rcncltnFctvXchgRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public AdditionalFee4 setRcncltnFctvXchgRate(BigDecimal value) {
        this.rcncltnFctvXchgRate = value;
        return this;
    }

    /**
     * Gets the value of the assgnr property.
     * 
     * @return
     *     possible object is
     *     {@link ATICAPartyType1Code }
     *     
     */
    public ATICAPartyType1Code getAssgnr() {
        return assgnr;
    }

    /**
     * Sets the value of the assgnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link ATICAPartyType1Code }
     *     
     */
    public AdditionalFee4 setAssgnr(ATICAPartyType1Code value) {
        this.assgnr = value;
        return this;
    }

    /**
     * Gets the value of the desc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDesc() {
        return desc;
    }

    /**
     * Sets the value of the desc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public AdditionalFee4 setDesc(String value) {
        this.desc = value;
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
