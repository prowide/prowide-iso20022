
package com.prowidesoftware.swift.model.mx.dic;

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
 * Parameters which explicitly state the conditions that must be fulfilled before a particular  transaction of a financial instrument can be settled.  These parameters are defined by the instructing party in compliance with settlement rules in the market the transaction will settle in.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SettlementDetails88", propOrder = {
    "tradDt",
    "sttlmPties",
    "collOwnrsh"
})
public class SettlementDetails88 {

    @XmlElement(name = "TradDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar tradDt;
    @XmlElement(name = "SttlmPties")
    protected SettlementParties3Choice sttlmPties;
    @XmlElement(name = "CollOwnrsh", required = true)
    protected CollateralOwnership1 collOwnrsh;

    /**
     * Gets the value of the tradDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTradDt() {
        return tradDt;
    }

    /**
     * Sets the value of the tradDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public SettlementDetails88 setTradDt(XMLGregorianCalendar value) {
        this.tradDt = value;
        return this;
    }

    /**
     * Gets the value of the sttlmPties property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementParties3Choice }
     *     
     */
    public SettlementParties3Choice getSttlmPties() {
        return sttlmPties;
    }

    /**
     * Sets the value of the sttlmPties property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementParties3Choice }
     *     
     */
    public SettlementDetails88 setSttlmPties(SettlementParties3Choice value) {
        this.sttlmPties = value;
        return this;
    }

    /**
     * Gets the value of the collOwnrsh property.
     * 
     * @return
     *     possible object is
     *     {@link CollateralOwnership1 }
     *     
     */
    public CollateralOwnership1 getCollOwnrsh() {
        return collOwnrsh;
    }

    /**
     * Sets the value of the collOwnrsh property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollateralOwnership1 }
     *     
     */
    public SettlementDetails88 setCollOwnrsh(CollateralOwnership1 value) {
        this.collOwnrsh = value;
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
