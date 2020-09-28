
package com.prowidesoftware.swift.model.mx.dic;

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
 * Entity involved in an activity.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TradePartyIdentification2", propOrder = {
    "role",
    "submitgPty",
    "fndInf",
    "tradPty"
})
public class TradePartyIdentification2 {

    @XmlElement(name = "Role", required = true)
    @XmlSchemaType(name = "string")
    protected OptionParty1Code role;
    @XmlElement(name = "SubmitgPty", required = true)
    protected String submitgPty;
    @XmlElement(name = "FndInf")
    protected FundIdentification1 fndInf;
    @XmlElement(name = "TradPty", required = true)
    protected PartyIdentification7Choice tradPty;

    /**
     * Gets the value of the role property.
     * 
     * @return
     *     possible object is
     *     {@link OptionParty1Code }
     *     
     */
    public OptionParty1Code getRole() {
        return role;
    }

    /**
     * Sets the value of the role property.
     * 
     * @param value
     *     allowed object is
     *     {@link OptionParty1Code }
     *     
     */
    public TradePartyIdentification2 setRole(OptionParty1Code value) {
        this.role = value;
        return this;
    }

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
    public TradePartyIdentification2 setSubmitgPty(String value) {
        this.submitgPty = value;
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
    public TradePartyIdentification2 setFndInf(FundIdentification1 value) {
        this.fndInf = value;
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
    public TradePartyIdentification2 setTradPty(PartyIdentification7Choice value) {
        this.tradPty = value;
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
