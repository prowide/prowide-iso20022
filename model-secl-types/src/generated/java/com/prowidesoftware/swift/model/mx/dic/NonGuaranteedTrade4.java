
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
@XmlType(name = "NonGuaranteedTrade4", propOrder = {
    "tradCtrPtyMmbId",
    "tradCtrPtyClrMmbId",
    "dlvrgPties",
    "rcvgPties"
})
public class NonGuaranteedTrade4 {

    @XmlElement(name = "TradCtrPtyMmbId", required = true)
    protected PartyIdentification253Choice tradCtrPtyMmbId;
    @XmlElement(name = "TradCtrPtyClrMmbId", required = true)
    protected PartyIdentification253Choice tradCtrPtyClrMmbId;
    @XmlElement(name = "DlvrgPties")
    protected DeliveringPartiesAndAccount22 dlvrgPties;
    @XmlElement(name = "RcvgPties")
    protected ReceivingPartiesAndAccount22 rcvgPties;

    /**
     * Gets the value of the tradCtrPtyMmbId property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification253Choice }
     *     
     */
    public PartyIdentification253Choice getTradCtrPtyMmbId() {
        return tradCtrPtyMmbId;
    }

    /**
     * Sets the value of the tradCtrPtyMmbId property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification253Choice }
     *     
     */
    public NonGuaranteedTrade4 setTradCtrPtyMmbId(PartyIdentification253Choice value) {
        this.tradCtrPtyMmbId = value;
        return this;
    }

    /**
     * Gets the value of the tradCtrPtyClrMmbId property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification253Choice }
     *     
     */
    public PartyIdentification253Choice getTradCtrPtyClrMmbId() {
        return tradCtrPtyClrMmbId;
    }

    /**
     * Sets the value of the tradCtrPtyClrMmbId property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification253Choice }
     *     
     */
    public NonGuaranteedTrade4 setTradCtrPtyClrMmbId(PartyIdentification253Choice value) {
        this.tradCtrPtyClrMmbId = value;
        return this;
    }

    /**
     * Gets the value of the dlvrgPties property.
     * 
     * @return
     *     possible object is
     *     {@link DeliveringPartiesAndAccount22 }
     *     
     */
    public DeliveringPartiesAndAccount22 getDlvrgPties() {
        return dlvrgPties;
    }

    /**
     * Sets the value of the dlvrgPties property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeliveringPartiesAndAccount22 }
     *     
     */
    public NonGuaranteedTrade4 setDlvrgPties(DeliveringPartiesAndAccount22 value) {
        this.dlvrgPties = value;
        return this;
    }

    /**
     * Gets the value of the rcvgPties property.
     * 
     * @return
     *     possible object is
     *     {@link ReceivingPartiesAndAccount22 }
     *     
     */
    public ReceivingPartiesAndAccount22 getRcvgPties() {
        return rcvgPties;
    }

    /**
     * Sets the value of the rcvgPties property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReceivingPartiesAndAccount22 }
     *     
     */
    public NonGuaranteedTrade4 setRcvgPties(ReceivingPartiesAndAccount22 value) {
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
