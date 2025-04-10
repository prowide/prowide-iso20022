
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
 * Specifies the total amount of records and charges included in the block.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TotalCharges8", propOrder = {
    "nbOfChrgsBrkdwnItms",
    "ctrlSum",
    "ttlChrgsAmt",
    "cdtDbtInd"
})
public class TotalCharges8 {

    @XmlElement(name = "NbOfChrgsBrkdwnItms", required = true)
    protected String nbOfChrgsBrkdwnItms;
    @XmlElement(name = "CtrlSum")
    protected BigDecimal ctrlSum;
    @XmlElement(name = "TtlChrgsAmt")
    protected ActiveCurrencyAndAmount ttlChrgsAmt;
    @XmlElement(name = "CdtDbtInd")
    @XmlSchemaType(name = "string")
    protected CreditDebitCode cdtDbtInd;

    /**
     * Gets the value of the nbOfChrgsBrkdwnItms property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNbOfChrgsBrkdwnItms() {
        return nbOfChrgsBrkdwnItms;
    }

    /**
     * Sets the value of the nbOfChrgsBrkdwnItms property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TotalCharges8 setNbOfChrgsBrkdwnItms(String value) {
        this.nbOfChrgsBrkdwnItms = value;
        return this;
    }

    /**
     * Gets the value of the ctrlSum property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCtrlSum() {
        return ctrlSum;
    }

    /**
     * Sets the value of the ctrlSum property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public TotalCharges8 setCtrlSum(BigDecimal value) {
        this.ctrlSum = value;
        return this;
    }

    /**
     * Gets the value of the ttlChrgsAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getTtlChrgsAmt() {
        return ttlChrgsAmt;
    }

    /**
     * Sets the value of the ttlChrgsAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public TotalCharges8 setTtlChrgsAmt(ActiveCurrencyAndAmount value) {
        this.ttlChrgsAmt = value;
        return this;
    }

    /**
     * Gets the value of the cdtDbtInd property.
     * 
     * @return
     *     possible object is
     *     {@link CreditDebitCode }
     *     
     */
    public CreditDebitCode getCdtDbtInd() {
        return cdtDbtInd;
    }

    /**
     * Sets the value of the cdtDbtInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditDebitCode }
     *     
     */
    public TotalCharges8 setCdtDbtInd(CreditDebitCode value) {
        this.cdtDbtInd = value;
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
