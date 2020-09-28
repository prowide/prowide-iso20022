
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
@XmlType(name = "ConfirmationPartyDetails2", propOrder = {
    "id",
    "altrnId",
    "prcgId",
    "addtlInf",
    "invstrCpcty",
    "tradgPtyCpcty"
})
public class ConfirmationPartyDetails2 {

    @XmlElement(name = "Id", required = true)
    protected PartyIdentification32Choice id;
    @XmlElement(name = "AltrnId")
    protected AlternatePartyIdentification5 altrnId;
    @XmlElement(name = "PrcgId")
    protected String prcgId;
    @XmlElement(name = "AddtlInf")
    protected PartyTextInformation5 addtlInf;
    @XmlElement(name = "InvstrCpcty")
    protected InvestorCapacity3Choice invstrCpcty;
    @XmlElement(name = "TradgPtyCpcty")
    protected TradingPartyCapacity1Choice tradgPtyCpcty;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification32Choice }
     *     
     */
    public PartyIdentification32Choice getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification32Choice }
     *     
     */
    public ConfirmationPartyDetails2 setId(PartyIdentification32Choice value) {
        this.id = value;
        return this;
    }

    /**
     * Gets the value of the altrnId property.
     * 
     * @return
     *     possible object is
     *     {@link AlternatePartyIdentification5 }
     *     
     */
    public AlternatePartyIdentification5 getAltrnId() {
        return altrnId;
    }

    /**
     * Sets the value of the altrnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlternatePartyIdentification5 }
     *     
     */
    public ConfirmationPartyDetails2 setAltrnId(AlternatePartyIdentification5 value) {
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
    public ConfirmationPartyDetails2 setPrcgId(String value) {
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
    public ConfirmationPartyDetails2 setAddtlInf(PartyTextInformation5 value) {
        this.addtlInf = value;
        return this;
    }

    /**
     * Gets the value of the invstrCpcty property.
     * 
     * @return
     *     possible object is
     *     {@link InvestorCapacity3Choice }
     *     
     */
    public InvestorCapacity3Choice getInvstrCpcty() {
        return invstrCpcty;
    }

    /**
     * Sets the value of the invstrCpcty property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvestorCapacity3Choice }
     *     
     */
    public ConfirmationPartyDetails2 setInvstrCpcty(InvestorCapacity3Choice value) {
        this.invstrCpcty = value;
        return this;
    }

    /**
     * Gets the value of the tradgPtyCpcty property.
     * 
     * @return
     *     possible object is
     *     {@link TradingPartyCapacity1Choice }
     *     
     */
    public TradingPartyCapacity1Choice getTradgPtyCpcty() {
        return tradgPtyCpcty;
    }

    /**
     * Sets the value of the tradgPtyCpcty property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradingPartyCapacity1Choice }
     *     
     */
    public ConfirmationPartyDetails2 setTradgPtyCpcty(TradingPartyCapacity1Choice value) {
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
