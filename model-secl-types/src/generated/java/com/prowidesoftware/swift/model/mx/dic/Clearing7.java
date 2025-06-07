
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
 * Provides the clearing details.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Clearing7", propOrder = {
    "sttlmNetgElgblCd",
    "clrSgmt",
    "grntedTrad",
    "nonGrntedTrad"
})
public class Clearing7 {

    @XmlElement(name = "SttlmNetgElgblCd", required = true)
    @XmlSchemaType(name = "string")
    protected NettingEligible1Code sttlmNetgElgblCd;
    @XmlElement(name = "ClrSgmt")
    protected PartyIdentification253Choice clrSgmt;
    @XmlElement(name = "GrntedTrad")
    protected Boolean grntedTrad;
    @XmlElement(name = "NonGrntedTrad")
    protected NonGuaranteedTrade4 nonGrntedTrad;

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
    public Clearing7 setSttlmNetgElgblCd(NettingEligible1Code value) {
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
    public Clearing7 setClrSgmt(PartyIdentification253Choice value) {
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
    public Clearing7 setGrntedTrad(Boolean value) {
        this.grntedTrad = value;
        return this;
    }

    /**
     * Gets the value of the nonGrntedTrad property.
     * 
     * @return
     *     possible object is
     *     {@link NonGuaranteedTrade4 }
     *     
     */
    public NonGuaranteedTrade4 getNonGrntedTrad() {
        return nonGrntedTrad;
    }

    /**
     * Sets the value of the nonGrntedTrad property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonGuaranteedTrade4 }
     *     
     */
    public Clearing7 setNonGrntedTrad(NonGuaranteedTrade4 value) {
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
