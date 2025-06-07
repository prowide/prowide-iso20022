
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
 * Media item that are deposited.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ATMDepositedMedia2", propOrder = {
    "cnt",
    "unitVal",
    "ccy",
    "cdLineFrmt",
    "cdLine",
    "scnndVal",
    "cnfdncLvl"
})
public class ATMDepositedMedia2 {

    @XmlElement(name = "Cnt")
    protected BigDecimal cnt;
    @XmlElement(name = "UnitVal")
    protected BigDecimal unitVal;
    @XmlElement(name = "Ccy")
    protected String ccy;
    @XmlElement(name = "CdLineFrmt")
    @XmlSchemaType(name = "string")
    protected CheckCodeLine1Code cdLineFrmt;
    @XmlElement(name = "CdLine")
    protected String cdLine;
    @XmlElement(name = "ScnndVal")
    protected BigDecimal scnndVal;
    @XmlElement(name = "CnfdncLvl")
    protected BigDecimal cnfdncLvl;

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
    public ATMDepositedMedia2 setCnt(BigDecimal value) {
        this.cnt = value;
        return this;
    }

    /**
     * Gets the value of the unitVal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getUnitVal() {
        return unitVal;
    }

    /**
     * Sets the value of the unitVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public ATMDepositedMedia2 setUnitVal(BigDecimal value) {
        this.unitVal = value;
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
    public ATMDepositedMedia2 setCcy(String value) {
        this.ccy = value;
        return this;
    }

    /**
     * Gets the value of the cdLineFrmt property.
     * 
     * @return
     *     possible object is
     *     {@link CheckCodeLine1Code }
     *     
     */
    public CheckCodeLine1Code getCdLineFrmt() {
        return cdLineFrmt;
    }

    /**
     * Sets the value of the cdLineFrmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CheckCodeLine1Code }
     *     
     */
    public ATMDepositedMedia2 setCdLineFrmt(CheckCodeLine1Code value) {
        this.cdLineFrmt = value;
        return this;
    }

    /**
     * Gets the value of the cdLine property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdLine() {
        return cdLine;
    }

    /**
     * Sets the value of the cdLine property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ATMDepositedMedia2 setCdLine(String value) {
        this.cdLine = value;
        return this;
    }

    /**
     * Gets the value of the scnndVal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getScnndVal() {
        return scnndVal;
    }

    /**
     * Sets the value of the scnndVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public ATMDepositedMedia2 setScnndVal(BigDecimal value) {
        this.scnndVal = value;
        return this;
    }

    /**
     * Gets the value of the cnfdncLvl property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCnfdncLvl() {
        return cnfdncLvl;
    }

    /**
     * Sets the value of the cnfdncLvl property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public ATMDepositedMedia2 setCnfdncLvl(BigDecimal value) {
        this.cnfdncLvl = value;
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
