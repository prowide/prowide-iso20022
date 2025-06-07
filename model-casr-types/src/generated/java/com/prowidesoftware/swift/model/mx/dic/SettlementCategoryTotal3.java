
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
 * Settlement totals
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SettlementCategoryTotal3", propOrder = {
    "cnt",
    "amt",
    "ccy",
    "cdtDbt",
    "intrchngFeeAmt",
    "intrchngFeeCcy",
    "intrchngFeeCdtDbt",
    "prcgFeeAmt",
    "prcgFeeCcy",
    "prcgFeeCdtDbt"
})
public class SettlementCategoryTotal3 {

    @XmlElement(name = "Cnt")
    protected BigDecimal cnt;
    @XmlElement(name = "Amt")
    protected BigDecimal amt;
    @XmlElement(name = "Ccy")
    protected String ccy;
    @XmlElement(name = "CdtDbt")
    @XmlSchemaType(name = "string")
    protected CreditDebit3Code cdtDbt;
    @XmlElement(name = "IntrchngFeeAmt")
    protected BigDecimal intrchngFeeAmt;
    @XmlElement(name = "IntrchngFeeCcy")
    protected String intrchngFeeCcy;
    @XmlElement(name = "IntrchngFeeCdtDbt")
    @XmlSchemaType(name = "string")
    protected CreditDebit3Code intrchngFeeCdtDbt;
    @XmlElement(name = "PrcgFeeAmt")
    protected BigDecimal prcgFeeAmt;
    @XmlElement(name = "PrcgFeeCcy")
    protected String prcgFeeCcy;
    @XmlElement(name = "PrcgFeeCdtDbt")
    @XmlSchemaType(name = "string")
    protected CreditDebit3Code prcgFeeCdtDbt;

    /**
     * Gets the value of the cnt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCnt() {
        return cnt;
    }

    /**
     * Sets the value of the cnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public SettlementCategoryTotal3 setCnt(BigDecimal value) {
        this.cnt = value;
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
    public SettlementCategoryTotal3 setAmt(BigDecimal value) {
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
    public SettlementCategoryTotal3 setCcy(String value) {
        this.ccy = value;
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
    public SettlementCategoryTotal3 setCdtDbt(CreditDebit3Code value) {
        this.cdtDbt = value;
        return this;
    }

    /**
     * Gets the value of the intrchngFeeAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getIntrchngFeeAmt() {
        return intrchngFeeAmt;
    }

    /**
     * Sets the value of the intrchngFeeAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public SettlementCategoryTotal3 setIntrchngFeeAmt(BigDecimal value) {
        this.intrchngFeeAmt = value;
        return this;
    }

    /**
     * Gets the value of the intrchngFeeCcy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIntrchngFeeCcy() {
        return intrchngFeeCcy;
    }

    /**
     * Sets the value of the intrchngFeeCcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SettlementCategoryTotal3 setIntrchngFeeCcy(String value) {
        this.intrchngFeeCcy = value;
        return this;
    }

    /**
     * Gets the value of the intrchngFeeCdtDbt property.
     * 
     * @return
     *     possible object is
     *     {@link CreditDebit3Code }
     *     
     */
    public CreditDebit3Code getIntrchngFeeCdtDbt() {
        return intrchngFeeCdtDbt;
    }

    /**
     * Sets the value of the intrchngFeeCdtDbt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditDebit3Code }
     *     
     */
    public SettlementCategoryTotal3 setIntrchngFeeCdtDbt(CreditDebit3Code value) {
        this.intrchngFeeCdtDbt = value;
        return this;
    }

    /**
     * Gets the value of the prcgFeeAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPrcgFeeAmt() {
        return prcgFeeAmt;
    }

    /**
     * Sets the value of the prcgFeeAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public SettlementCategoryTotal3 setPrcgFeeAmt(BigDecimal value) {
        this.prcgFeeAmt = value;
        return this;
    }

    /**
     * Gets the value of the prcgFeeCcy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrcgFeeCcy() {
        return prcgFeeCcy;
    }

    /**
     * Sets the value of the prcgFeeCcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SettlementCategoryTotal3 setPrcgFeeCcy(String value) {
        this.prcgFeeCcy = value;
        return this;
    }

    /**
     * Gets the value of the prcgFeeCdtDbt property.
     * 
     * @return
     *     possible object is
     *     {@link CreditDebit3Code }
     *     
     */
    public CreditDebit3Code getPrcgFeeCdtDbt() {
        return prcgFeeCdtDbt;
    }

    /**
     * Sets the value of the prcgFeeCdtDbt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditDebit3Code }
     *     
     */
    public SettlementCategoryTotal3 setPrcgFeeCdtDbt(CreditDebit3Code value) {
        this.prcgFeeCdtDbt = value;
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
