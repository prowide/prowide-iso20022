
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
 * Parties used for acting parties that apply either to the whole message or to individual sides.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConfirmationPartyDetails7", propOrder = {
    "id",
    "altrnId",
    "prcgId",
    "addtlInf",
    "invstrCpcty",
    "tradgPtyCpcty"
})
public class ConfirmationPartyDetails7 {

    @XmlElement(name = "Id", required = true)
    protected PartyIdentification117Choice id;
    @XmlElement(name = "AltrnId")
    protected AlternatePartyIdentification8 altrnId;
    @XmlElement(name = "PrcgId")
    protected String prcgId;
    @XmlElement(name = "AddtlInf")
    protected PartyTextInformation5 addtlInf;
    @XmlElement(name = "InvstrCpcty")
    protected InvestorCapacity4Choice invstrCpcty;
    @XmlElement(name = "TradgPtyCpcty")
    protected TradingPartyCapacity4Choice tradgPtyCpcty;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification117Choice }
     *     
     */
    public PartyIdentification117Choice getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification117Choice }
     *     
     */
    public ConfirmationPartyDetails7 setId(PartyIdentification117Choice value) {
        this.id = value;
        return this;
    }

    /**
     * Gets the value of the altrnId property.
     * 
     * @return
     *     possible object is
     *     {@link AlternatePartyIdentification8 }
     *     
     */
    public AlternatePartyIdentification8 getAltrnId() {
        return altrnId;
    }

    /**
     * Sets the value of the altrnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlternatePartyIdentification8 }
     *     
     */
    public ConfirmationPartyDetails7 setAltrnId(AlternatePartyIdentification8 value) {
        this.altrnId = value;
        return this;
    }

    /**
     * Gets the value of the prcgId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrcgId() {
        return prcgId;
    }

    /**
     * Sets the value of the prcgId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ConfirmationPartyDetails7 setPrcgId(String value) {
        this.prcgId = value;
        return this;
    }

    /**
     * Gets the value of the addtlInf property.
     * 
     * @return
     *     possible object is
     *     {@link PartyTextInformation5 }
     *     
     */
    public PartyTextInformation5 getAddtlInf() {
        return addtlInf;
    }

    /**
     * Sets the value of the addtlInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyTextInformation5 }
     *     
     */
    public ConfirmationPartyDetails7 setAddtlInf(PartyTextInformation5 value) {
        this.addtlInf = value;
        return this;
    }

    /**
     * Gets the value of the invstrCpcty property.
     * 
     * @return
     *     possible object is
     *     {@link InvestorCapacity4Choice }
     *     
     */
    public InvestorCapacity4Choice getInvstrCpcty() {
        return invstrCpcty;
    }

    /**
     * Sets the value of the invstrCpcty property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvestorCapacity4Choice }
     *     
     */
    public ConfirmationPartyDetails7 setInvstrCpcty(InvestorCapacity4Choice value) {
        this.invstrCpcty = value;
        return this;
    }

    /**
     * Gets the value of the tradgPtyCpcty property.
     * 
     * @return
     *     possible object is
     *     {@link TradingPartyCapacity4Choice }
     *     
     */
    public TradingPartyCapacity4Choice getTradgPtyCpcty() {
        return tradgPtyCpcty;
    }

    /**
     * Sets the value of the tradgPtyCpcty property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradingPartyCapacity4Choice }
     *     
     */
    public ConfirmationPartyDetails7 setTradgPtyCpcty(TradingPartyCapacity4Choice value) {
        this.tradgPtyCpcty = value;
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
