
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * List of items which specify the parties in a treasury trade.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TradePartyIdentification1", propOrder = {
    "submitgPty",
    "tradPty",
    "fndInf"
})
public class TradePartyIdentification1 {

    @XmlElement(name = "SubmitgPty", required = true)
    protected String submitgPty;
    @XmlElement(name = "TradPty", required = true)
    protected PartyIdentification7Choice tradPty;
    @XmlElement(name = "FndInf")
    protected FundIdentification1 fndInf;

    /**
     * Gets the value of the submitgPty property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubmitgPty() {
        return submitgPty;
    }

    /**
     * Sets the value of the submitgPty property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TradePartyIdentification1 setSubmitgPty(String value) {
        this.submitgPty = value;
        return this;
    }

    /**
     * Gets the value of the tradPty property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification7Choice }
     *     
     */
    public PartyIdentification7Choice getTradPty() {
        return tradPty;
    }

    /**
     * Sets the value of the tradPty property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification7Choice }
     *     
     */
    public TradePartyIdentification1 setTradPty(PartyIdentification7Choice value) {
        this.tradPty = value;
        return this;
    }

    /**
     * Gets the value of the fndInf property.
     * 
     * @return
     *     possible object is
     *     {@link FundIdentification1 }
     *     
     */
    public FundIdentification1 getFndInf() {
        return fndInf;
    }

    /**
     * Sets the value of the fndInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link FundIdentification1 }
     *     
     */
    public TradePartyIdentification1 setFndInf(FundIdentification1 value) {
        this.fndInf = value;
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
