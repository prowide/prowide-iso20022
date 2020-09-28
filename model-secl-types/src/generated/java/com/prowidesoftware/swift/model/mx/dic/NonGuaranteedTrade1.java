
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
 * Provides the non guaranteed trade details.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NonGuaranteedTrade1", propOrder = {
    "tradCtrPtyMmbId",
    "tradCtrPtyClrMmbId",
    "dlvrgPties",
    "rcvgPties"
})
public class NonGuaranteedTrade1 {

    @XmlElement(name = "TradCtrPtyMmbId", required = true)
    protected PartyIdentification35Choice tradCtrPtyMmbId;
    @XmlElement(name = "TradCtrPtyClrMmbId", required = true)
    protected PartyIdentification35Choice tradCtrPtyClrMmbId;
    @XmlElement(name = "DlvrgPties")
    protected DeliveringPartiesAndAccount5 dlvrgPties;
    @XmlElement(name = "RcvgPties")
    protected ReceivingPartiesAndAccount6 rcvgPties;

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
    public NonGuaranteedTrade1 setTradCtrPtyMmbId(PartyIdentification35Choice value) {
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
    public NonGuaranteedTrade1 setTradCtrPtyClrMmbId(PartyIdentification35Choice value) {
        this.tradCtrPtyClrMmbId = value;
        return this;
    }

    /**
     * Gets the value of the dlvrgPties property.
     * 
     * @return
     *     possible object is
     *     {@link DeliveringPartiesAndAccount5 }
     *     
     */
    public DeliveringPartiesAndAccount5 getDlvrgPties() {
        return dlvrgPties;
    }

    /**
     * Sets the value of the dlvrgPties property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeliveringPartiesAndAccount5 }
     *     
     */
    public NonGuaranteedTrade1 setDlvrgPties(DeliveringPartiesAndAccount5 value) {
        this.dlvrgPties = value;
        return this;
    }

    /**
     * Gets the value of the rcvgPties property.
     * 
     * @return
     *     possible object is
     *     {@link ReceivingPartiesAndAccount6 }
     *     
     */
    public ReceivingPartiesAndAccount6 getRcvgPties() {
        return rcvgPties;
    }

    /**
     * Sets the value of the rcvgPties property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReceivingPartiesAndAccount6 }
     *     
     */
    public NonGuaranteedTrade1 setRcvgPties(ReceivingPartiesAndAccount6 value) {
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
