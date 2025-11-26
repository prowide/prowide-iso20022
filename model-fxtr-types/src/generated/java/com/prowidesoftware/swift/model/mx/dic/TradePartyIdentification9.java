
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
 * Entity involved in an activity.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TradePartyIdentification9", propOrder = {
    "fndInf",
    "buyrOrSellrInd",
    "initrInd",
    "tradPtyId",
    "submitgPty"
})
public class TradePartyIdentification9 {

    @XmlElement(name = "FndInf")
    protected FundIdentification6 fndInf;
    @XmlElement(name = "BuyrOrSellrInd", required = true)
    @XmlSchemaType(name = "string")
    protected OptionParty1Code buyrOrSellrInd;
    @XmlElement(name = "InitrInd", required = true)
    @XmlSchemaType(name = "string")
    protected OptionParty3Code initrInd;
    @XmlElement(name = "TradPtyId", required = true)
    protected PartyIdentification78 tradPtyId;
    @XmlElement(name = "SubmitgPty", required = true)
    protected PartyIdentificationAndAccount119 submitgPty;

    /**
     * Gets the value of the fndInf property.
     * 
     * @return
     *     possible object is
     *     {@link FundIdentification6 }
     *     
     */
    public FundIdentification6 getFndInf() {
        return fndInf;
    }

    /**
     * Sets the value of the fndInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link FundIdentification6 }
     *     
     */
    public TradePartyIdentification9 setFndInf(FundIdentification6 value) {
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
    public TradePartyIdentification9 setBuyrOrSellrInd(OptionParty1Code value) {
        this.buyrOrSellrInd = value;
        return this;
    }

    /**
     * Gets the value of the initrInd property.
     * 
     * @return
     *     possible object is
     *     {@link OptionParty3Code }
     *     
     */
    public OptionParty3Code getInitrInd() {
        return initrInd;
    }

    /**
     * Sets the value of the initrInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link OptionParty3Code }
     *     
     */
    public TradePartyIdentification9 setInitrInd(OptionParty3Code value) {
        this.initrInd = value;
        return this;
    }

    /**
     * Gets the value of the tradPtyId property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification78 }
     *     
     */
    public PartyIdentification78 getTradPtyId() {
        return tradPtyId;
    }

    /**
     * Sets the value of the tradPtyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification78 }
     *     
     */
    public TradePartyIdentification9 setTradPtyId(PartyIdentification78 value) {
        this.tradPtyId = value;
        return this;
    }

    /**
     * Gets the value of the submitgPty property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentificationAndAccount119 }
     *     
     */
    public PartyIdentificationAndAccount119 getSubmitgPty() {
        return submitgPty;
    }

    /**
     * Sets the value of the submitgPty property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentificationAndAccount119 }
     *     
     */
    public TradePartyIdentification9 setSubmitgPty(PartyIdentificationAndAccount119 value) {
        this.submitgPty = value;
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
