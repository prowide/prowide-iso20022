
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Cash premium made available if the securities holder consents or participates to an event.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IncentivePremium1", propOrder = {
    "prmDesc",
    "prmAmt",
    "perScty",
    "perVote",
    "perAttndee",
    "pmtDt"
})
public class IncentivePremium1 {

    @XmlElement(name = "PrmDesc")
    protected String prmDesc;
    @XmlElement(name = "PrmAmt", required = true)
    protected CurrencyAndAmount prmAmt;
    @XmlElement(name = "PerScty")
    protected BigDecimal perScty;
    @XmlElement(name = "PerVote")
    protected BigDecimal perVote;
    @XmlElement(name = "PerAttndee")
    protected Boolean perAttndee;
    @XmlElement(name = "PmtDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar pmtDt;

    /**
     * Gets the value of the prmDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrmDesc() {
        return prmDesc;
    }

    /**
     * Sets the value of the prmDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public IncentivePremium1 setPrmDesc(String value) {
        this.prmDesc = value;
        return this;
    }

    /**
     * Gets the value of the prmAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAndAmount }
     *     
     */
    public CurrencyAndAmount getPrmAmt() {
        return prmAmt;
    }

    /**
     * Sets the value of the prmAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAndAmount }
     *     
     */
    public IncentivePremium1 setPrmAmt(CurrencyAndAmount value) {
        this.prmAmt = value;
        return this;
    }

    /**
     * Gets the value of the perScty property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPerScty() {
        return perScty;
    }

    /**
     * Sets the value of the perScty property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public IncentivePremium1 setPerScty(BigDecimal value) {
        this.perScty = value;
        return this;
    }

    /**
     * Gets the value of the perVote property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPerVote() {
        return perVote;
    }

    /**
     * Sets the value of the perVote property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public IncentivePremium1 setPerVote(BigDecimal value) {
        this.perVote = value;
        return this;
    }

    /**
     * Gets the value of the perAttndee property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPerAttndee() {
        return perAttndee;
    }

    /**
     * Sets the value of the perAttndee property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public IncentivePremium1 setPerAttndee(Boolean value) {
        this.perAttndee = value;
        return this;
    }

    /**
     * Gets the value of the pmtDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPmtDt() {
        return pmtDt;
    }

    /**
     * Sets the value of the pmtDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public IncentivePremium1 setPmtDt(XMLGregorianCalendar value) {
        this.pmtDt = value;
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
