
package com.prowidesoftware.swift.model.mx.dic;

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
 * Proposition of price for a financial instrument.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Quote2", propOrder = {
    "tp",
    "qtOrgtr",
    "qtOrgtrRole",
    "rqstrElgblty",
    "rspnLvl",
    "qtChc"
})
public class Quote2 {

    @XmlElement(name = "Tp")
    @XmlSchemaType(name = "string")
    protected QuoteType1Code tp;
    @XmlElement(name = "QtOrgtr")
    protected PartyIdentification24Choice qtOrgtr;
    @XmlElement(name = "QtOrgtrRole")
    @XmlSchemaType(name = "string")
    protected OriginatorRole1Code qtOrgtrRole;
    @XmlElement(name = "RqstrElgblty")
    @XmlSchemaType(name = "string")
    protected Eligibility1Code rqstrElgblty;
    @XmlElement(name = "RspnLvl")
    @XmlSchemaType(name = "string")
    protected ResponseLevel1Code rspnLvl;
    @XmlElement(name = "QtChc", required = true)
    protected SingleOrMassQuote1Choice qtChc;

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link QuoteType1Code }
     *     
     */
    public QuoteType1Code getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuoteType1Code }
     *     
     */
    public Quote2 setTp(QuoteType1Code value) {
        this.tp = value;
        return this;
    }

    /**
     * Gets the value of the qtOrgtr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification24Choice }
     *     
     */
    public PartyIdentification24Choice getQtOrgtr() {
        return qtOrgtr;
    }

    /**
     * Sets the value of the qtOrgtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification24Choice }
     *     
     */
    public Quote2 setQtOrgtr(PartyIdentification24Choice value) {
        this.qtOrgtr = value;
        return this;
    }

    /**
     * Gets the value of the qtOrgtrRole property.
     * 
     * @return
     *     possible object is
     *     {@link OriginatorRole1Code }
     *     
     */
    public OriginatorRole1Code getQtOrgtrRole() {
        return qtOrgtrRole;
    }

    /**
     * Sets the value of the qtOrgtrRole property.
     * 
     * @param value
     *     allowed object is
     *     {@link OriginatorRole1Code }
     *     
     */
    public Quote2 setQtOrgtrRole(OriginatorRole1Code value) {
        this.qtOrgtrRole = value;
        return this;
    }

    /**
     * Gets the value of the rqstrElgblty property.
     * 
     * @return
     *     possible object is
     *     {@link Eligibility1Code }
     *     
     */
    public Eligibility1Code getRqstrElgblty() {
        return rqstrElgblty;
    }

    /**
     * Sets the value of the rqstrElgblty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Eligibility1Code }
     *     
     */
    public Quote2 setRqstrElgblty(Eligibility1Code value) {
        this.rqstrElgblty = value;
        return this;
    }

    /**
     * Gets the value of the rspnLvl property.
     * 
     * @return
     *     possible object is
     *     {@link ResponseLevel1Code }
     *     
     */
    public ResponseLevel1Code getRspnLvl() {
        return rspnLvl;
    }

    /**
     * Sets the value of the rspnLvl property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseLevel1Code }
     *     
     */
    public Quote2 setRspnLvl(ResponseLevel1Code value) {
        this.rspnLvl = value;
        return this;
    }

    /**
     * Gets the value of the qtChc property.
     * 
     * @return
     *     possible object is
     *     {@link SingleOrMassQuote1Choice }
     *     
     */
    public SingleOrMassQuote1Choice getQtChc() {
        return qtChc;
    }

    /**
     * Sets the value of the qtChc property.
     * 
     * @param value
     *     allowed object is
     *     {@link SingleOrMassQuote1Choice }
     *     
     */
    public Quote2 setQtChc(SingleOrMassQuote1Choice value) {
        this.qtChc = value;
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
