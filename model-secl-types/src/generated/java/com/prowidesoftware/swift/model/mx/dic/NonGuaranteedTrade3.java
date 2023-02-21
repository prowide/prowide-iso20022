
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Provides the non guaranteed trade details.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NonGuaranteedTrade3", propOrder = {
    "tradCtrPtyMmbId",
    "tradCtrPtyClrMmbId",
    "dlvrgPties",
    "rcvgPties"
})
public class NonGuaranteedTrade3 {

    @XmlElement(name = "TradCtrPtyMmbId", required = true)
    protected PartyIdentification35Choice tradCtrPtyMmbId;
    @XmlElement(name = "TradCtrPtyClrMmbId", required = true)
    protected PartyIdentification35Choice tradCtrPtyClrMmbId;
    @XmlElement(name = "DlvrgPties")
    protected DeliveringPartiesAndAccount11 dlvrgPties;
    @XmlElement(name = "RcvgPties")
    protected ReceivingPartiesAndAccount11 rcvgPties;

    /**
     * Gets the value of the tradCtrPtyMmbId property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification35Choice }
     *     
     */
    public PartyIdentification35Choice getTradCtrPtyMmbId() {
        return tradCtrPtyMmbId;
    }

    /**
     * Sets the value of the tradCtrPtyMmbId property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification35Choice }
     *     
     */
    public NonGuaranteedTrade3 setTradCtrPtyMmbId(PartyIdentification35Choice value) {
        this.tradCtrPtyMmbId = value;
        return this;
    }

    /**
     * Gets the value of the tradCtrPtyClrMmbId property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification35Choice }
     *     
     */
    public PartyIdentification35Choice getTradCtrPtyClrMmbId() {
        return tradCtrPtyClrMmbId;
    }

    /**
     * Sets the value of the tradCtrPtyClrMmbId property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification35Choice }
     *     
     */
    public NonGuaranteedTrade3 setTradCtrPtyClrMmbId(PartyIdentification35Choice value) {
        this.tradCtrPtyClrMmbId = value;
        return this;
    }

    /**
     * Gets the value of the dlvrgPties property.
     * 
     * @return
     *     possible object is
     *     {@link DeliveringPartiesAndAccount11 }
     *     
     */
    public DeliveringPartiesAndAccount11 getDlvrgPties() {
        return dlvrgPties;
    }

    /**
     * Sets the value of the dlvrgPties property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeliveringPartiesAndAccount11 }
     *     
     */
    public NonGuaranteedTrade3 setDlvrgPties(DeliveringPartiesAndAccount11 value) {
        this.dlvrgPties = value;
        return this;
    }

    /**
     * Gets the value of the rcvgPties property.
     * 
     * @return
     *     possible object is
     *     {@link ReceivingPartiesAndAccount11 }
     *     
     */
    public ReceivingPartiesAndAccount11 getRcvgPties() {
        return rcvgPties;
    }

    /**
     * Sets the value of the rcvgPties property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReceivingPartiesAndAccount11 }
     *     
     */
    public NonGuaranteedTrade3 setRcvgPties(ReceivingPartiesAndAccount11 value) {
        this.rcvgPties = value;
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
