
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
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
@XmlType(name = "AdditionalFee3", propOrder = {
    "tp",
    "othrTp",
    "prgm",
    "dscrptr",
    "cdtDbt",
    "amt",
    "ccy",
    "rcncltnAmt",
    "rcncltnCcy",
    "rcncltnFctvXchgRate",
    "assgnr",
    "othrAssgnr",
    "desc"
})
public class AdditionalFee3 {

    @XmlElement(name = "Tp", required = true)
    @XmlSchemaType(name = "string")
    protected TypeOfAmount21Code tp;
    @XmlElement(name = "OthrTp")
    protected String othrTp;
    @XmlElement(name = "Prgm")
    protected String prgm;
    @XmlElement(name = "Dscrptr")
    protected String dscrptr;
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
    protected PartyType32Code assgnr;
    @XmlElement(name = "OthrAssgnr")
    protected String othrAssgnr;
    @XmlElement(name = "Desc")
    protected String desc;

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link TypeOfAmount21Code }
     *     
     */
    public TypeOfAmount21Code getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeOfAmount21Code }
     *     
     */
    public AdditionalFee3 setTp(TypeOfAmount21Code value) {
        this.tp = value;
        return this;
    }

    /**
     * Gets the value of the othrTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOthrTp() {
        return othrTp;
    }

    /**
     * Sets the value of the othrTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public AdditionalFee3 setOthrTp(String value) {
        this.othrTp = value;
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
    public AdditionalFee3 setPrgm(String value) {
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
    public AdditionalFee3 setDscrptr(String value) {
        this.dscrptr = value;
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
    public AdditionalFee3 setCdtDbt(CreditDebit3Code value) {
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
    public AdditionalFee3 setAmt(BigDecimal value) {
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
    public AdditionalFee3 setCcy(String value) {
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
    public AdditionalFee3 setRcncltnAmt(BigDecimal value) {
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
    public AdditionalFee3 setRcncltnCcy(String value) {
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
    public AdditionalFee3 setRcncltnFctvXchgRate(BigDecimal value) {
        this.rcncltnFctvXchgRate = value;
        return this;
    }

    /**
     * Gets the value of the assgnr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyType32Code }
     *     
     */
    public PartyType32Code getAssgnr() {
        return assgnr;
    }

    /**
     * Sets the value of the assgnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyType32Code }
     *     
     */
    public AdditionalFee3 setAssgnr(PartyType32Code value) {
        this.assgnr = value;
        return this;
    }

    /**
     * Gets the value of the othrAssgnr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOthrAssgnr() {
        return othrAssgnr;
    }

    /**
     * Sets the value of the othrAssgnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public AdditionalFee3 setOthrAssgnr(String value) {
        this.othrAssgnr = value;
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
    public AdditionalFee3 setDesc(String value) {
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
