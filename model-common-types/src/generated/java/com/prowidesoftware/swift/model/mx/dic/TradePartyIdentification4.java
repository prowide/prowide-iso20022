
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
@XmlType(name = "TradePartyIdentification4", propOrder = {
    "fndInf",
    "buyrOrSellrInd",
    "submitgPty",
    "tradPty"
})
public class TradePartyIdentification4 {

    @XmlElement(name = "FndInf")
    protected FundIdentification2 fndInf;
    @XmlElement(name = "BuyrOrSellrInd", required = true)
    @XmlSchemaType(name = "string")
    protected OptionParty1Code buyrOrSellrInd;
    @XmlElement(name = "SubmitgPty", required = true)
    protected PartyIdentification8Choice submitgPty;
    @XmlElement(name = "TradPty", required = true)
    protected PartyIdentification8Choice tradPty;

    /**
     * Gets the value of the fndInf property.
     * 
     * @return
     *     possible object is
     *     {@link FundIdentification2 }
     *     
     */
    public FundIdentification2 getFndInf() {
        return fndInf;
    }

    /**
     * Sets the value of the fndInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link FundIdentification2 }
     *     
     */
    public TradePartyIdentification4 setFndInf(FundIdentification2 value) {
        this.fndInf = value;
        return this;
    }

    /**
     * Gets the value of the buyrOrSellrInd property.
     * 
     * @return
     *     possible object is
     *     {@link OptionParty1Code }
     *     
     */
    public OptionParty1Code getBuyrOrSellrInd() {
        return buyrOrSellrInd;
    }

    /**
     * Sets the value of the buyrOrSellrInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link OptionParty1Code }
     *     
     */
    public TradePartyIdentification4 setBuyrOrSellrInd(OptionParty1Code value) {
        this.buyrOrSellrInd = value;
        return this;
    }

    /**
     * Gets the value of the submitgPty property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification8Choice }
     *     
     */
    public PartyIdentification8Choice getSubmitgPty() {
        return submitgPty;
    }

    /**
     * Sets the value of the submitgPty property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification8Choice }
     *     
     */
    public TradePartyIdentification4 setSubmitgPty(PartyIdentification8Choice value) {
        this.submitgPty = value;
        return this;
    }

    /**
     * Gets the value of the tradPty property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification8Choice }
     *     
     */
    public PartyIdentification8Choice getTradPty() {
        return tradPty;
    }

    /**
     * Sets the value of the tradPty property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification8Choice }
     *     
     */
    public TradePartyIdentification4 setTradPty(PartyIdentification8Choice value) {
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
