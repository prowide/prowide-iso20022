
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
 * Other amount in clearing record data.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OtherAmount5", propOrder = {
    "clrCnt",
    "clrAmt",
    "clrCcy",
    "clrCdtDbt",
    "intrchngFeeAmt",
    "intrchngFeeCcy",
    "intrchngFeeCdtDbt",
    "agtFeeAmt",
    "agtFeeCcy",
    "agtFeeCdtDbt"
})
public class OtherAmount5 {

    @XmlElement(name = "ClrCnt", required = true)
    protected BigDecimal clrCnt;
    @XmlElement(name = "ClrAmt", required = true)
    protected BigDecimal clrAmt;
    @XmlElement(name = "ClrCcy")
    protected String clrCcy;
    @XmlElement(name = "ClrCdtDbt")
    @XmlSchemaType(name = "string")
    protected CreditDebit3Code clrCdtDbt;
    @XmlElement(name = "IntrchngFeeAmt", required = true)
    protected BigDecimal intrchngFeeAmt;
    @XmlElement(name = "IntrchngFeeCcy")
    protected String intrchngFeeCcy;
    @XmlElement(name = "IntrchngFeeCdtDbt")
    @XmlSchemaType(name = "string")
    protected CreditDebit3Code intrchngFeeCdtDbt;
    @XmlElement(name = "AgtFeeAmt", required = true)
    protected BigDecimal agtFeeAmt;
    @XmlElement(name = "AgtFeeCcy")
    protected String agtFeeCcy;
    @XmlElement(name = "AgtFeeCdtDbt")
    @XmlSchemaType(name = "string")
    protected CreditDebit3Code agtFeeCdtDbt;

    /**
     * Gets the value of the clrCnt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getClrCnt() {
        return clrCnt;
    }

    /**
     * Sets the value of the clrCnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public OtherAmount5 setClrCnt(BigDecimal value) {
        this.clrCnt = value;
        return this;
    }

    /**
     * Gets the value of the clrAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getClrAmt() {
        return clrAmt;
    }

    /**
     * Sets the value of the clrAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public OtherAmount5 setClrAmt(BigDecimal value) {
        this.clrAmt = value;
        return this;
    }

    /**
     * Gets the value of the clrCcy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClrCcy() {
        return clrCcy;
    }

    /**
     * Sets the value of the clrCcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public OtherAmount5 setClrCcy(String value) {
        this.clrCcy = value;
        return this;
    }

    /**
     * Gets the value of the clrCdtDbt property.
     * 
     * @return
     *     possible object is
     *     {@link CreditDebit3Code }
     *     
     */
    public CreditDebit3Code getClrCdtDbt() {
        return clrCdtDbt;
    }

    /**
     * Sets the value of the clrCdtDbt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditDebit3Code }
     *     
     */
    public OtherAmount5 setClrCdtDbt(CreditDebit3Code value) {
        this.clrCdtDbt = value;
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
    public OtherAmount5 setIntrchngFeeAmt(BigDecimal value) {
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
    public OtherAmount5 setIntrchngFeeCcy(String value) {
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
    public OtherAmount5 setIntrchngFeeCdtDbt(CreditDebit3Code value) {
        this.intrchngFeeCdtDbt = value;
        return this;
    }

    /**
     * Gets the value of the agtFeeAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAgtFeeAmt() {
        return agtFeeAmt;
    }

    /**
     * Sets the value of the agtFeeAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public OtherAmount5 setAgtFeeAmt(BigDecimal value) {
        this.agtFeeAmt = value;
        return this;
    }

    /**
     * Gets the value of the agtFeeCcy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgtFeeCcy() {
        return agtFeeCcy;
    }

    /**
     * Sets the value of the agtFeeCcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public OtherAmount5 setAgtFeeCcy(String value) {
        this.agtFeeCcy = value;
        return this;
    }

    /**
     * Gets the value of the agtFeeCdtDbt property.
     * 
     * @return
     *     possible object is
     *     {@link CreditDebit3Code }
     *     
     */
    public CreditDebit3Code getAgtFeeCdtDbt() {
        return agtFeeCdtDbt;
    }

    /**
     * Sets the value of the agtFeeCdtDbt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditDebit3Code }
     *     
     */
    public OtherAmount5 setAgtFeeCdtDbt(CreditDebit3Code value) {
        this.agtFeeCdtDbt = value;
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
