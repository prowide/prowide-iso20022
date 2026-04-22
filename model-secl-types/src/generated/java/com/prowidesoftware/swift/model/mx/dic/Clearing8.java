
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
 * Provides the clearing details.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Clearing8", propOrder = {
    "sttlmNetgElgblCd",
    "clrSgmt",
    "grntedTrad",
    "tradCtrPtyId"
})
public class Clearing8 {

    @XmlElement(name = "SttlmNetgElgblCd", required = true)
    @XmlSchemaType(name = "string")
    protected NettingEligible1Code sttlmNetgElgblCd;
    @XmlElement(name = "ClrSgmt")
    protected PartyIdentification253Choice clrSgmt;
    @XmlElement(name = "GrntedTrad")
    protected Boolean grntedTrad;
    @XmlElement(name = "TradCtrPtyId")
    protected NonGuaranteedTrade4 tradCtrPtyId;

    /**
     * Gets the value of the sttlmNetgElgblCd property.
     * 
     * @return
     *     possible object is
     *     {@link NettingEligible1Code }
     *     
     */
    public NettingEligible1Code getSttlmNetgElgblCd() {
        return sttlmNetgElgblCd;
    }

    /**
     * Sets the value of the sttlmNetgElgblCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link NettingEligible1Code }
     *     
     */
    public Clearing8 setSttlmNetgElgblCd(NettingEligible1Code value) {
        this.sttlmNetgElgblCd = value;
        return this;
    }

    /**
     * Gets the value of the clrSgmt property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification253Choice }
     *     
     */
    public PartyIdentification253Choice getClrSgmt() {
        return clrSgmt;
    }

    /**
     * Sets the value of the clrSgmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification253Choice }
     *     
     */
    public Clearing8 setClrSgmt(PartyIdentification253Choice value) {
        this.clrSgmt = value;
        return this;
    }

    /**
     * Gets the value of the grntedTrad property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGrntedTrad() {
        return grntedTrad;
    }

    /**
     * Sets the value of the grntedTrad property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public Clearing8 setGrntedTrad(Boolean value) {
        this.grntedTrad = value;
        return this;
    }

    /**
     * Gets the value of the tradCtrPtyId property.
     * 
     * @return
     *     possible object is
     *     {@link NonGuaranteedTrade4 }
     *     
     */
    public NonGuaranteedTrade4 getTradCtrPtyId() {
        return tradCtrPtyId;
    }

    /**
     * Sets the value of the tradCtrPtyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonGuaranteedTrade4 }
     *     
     */
    public Clearing8 setTradCtrPtyId(NonGuaranteedTrade4 value) {
        this.tradCtrPtyId = value;
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
