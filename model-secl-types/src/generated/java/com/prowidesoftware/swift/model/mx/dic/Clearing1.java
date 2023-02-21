
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
@XmlType(name = "Clearing1", propOrder = {
    "nonClrMmb",
    "sttlmNetgElgblCd",
    "clrSgmt",
    "grntedTrad",
    "nonGrntedTrad"
})
public class Clearing1 {

    @XmlElement(name = "NonClrMmb")
    protected PartyIdentificationAndAccount31 nonClrMmb;
    @XmlElement(name = "SttlmNetgElgblCd", required = true)
    @XmlSchemaType(name = "string")
    protected NettingEligible1Code sttlmNetgElgblCd;
    @XmlElement(name = "ClrSgmt")
    protected PartyIdentification35Choice clrSgmt;
    @XmlElement(name = "GrntedTrad")
    protected Boolean grntedTrad;
    @XmlElement(name = "NonGrntedTrad")
    protected NonGuaranteedTrade1 nonGrntedTrad;

    /**
     * Gets the value of the nonClrMmb property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentificationAndAccount31 }
     *     
     */
    public PartyIdentificationAndAccount31 getNonClrMmb() {
        return nonClrMmb;
    }

    /**
     * Sets the value of the nonClrMmb property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentificationAndAccount31 }
     *     
     */
    public Clearing1 setNonClrMmb(PartyIdentificationAndAccount31 value) {
        this.nonClrMmb = value;
        return this;
    }

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
    public Clearing1 setSttlmNetgElgblCd(NettingEligible1Code value) {
        this.sttlmNetgElgblCd = value;
        return this;
    }

    /**
     * Gets the value of the clrSgmt property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification35Choice }
     *     
     */
    public PartyIdentification35Choice getClrSgmt() {
        return clrSgmt;
    }

    /**
     * Sets the value of the clrSgmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification35Choice }
     *     
     */
    public Clearing1 setClrSgmt(PartyIdentification35Choice value) {
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
    public Clearing1 setGrntedTrad(Boolean value) {
        this.grntedTrad = value;
        return this;
    }

    /**
     * Gets the value of the nonGrntedTrad property.
     * 
     * @return
     *     possible object is
     *     {@link NonGuaranteedTrade1 }
     *     
     */
    public NonGuaranteedTrade1 getNonGrntedTrad() {
        return nonGrntedTrad;
    }

    /**
     * Sets the value of the nonGrntedTrad property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonGuaranteedTrade1 }
     *     
     */
    public Clearing1 setNonGrntedTrad(NonGuaranteedTrade1 value) {
        this.nonGrntedTrad = value;
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
