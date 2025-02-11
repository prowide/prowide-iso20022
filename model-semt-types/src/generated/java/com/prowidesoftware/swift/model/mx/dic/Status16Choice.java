
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
 * Choice of status.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Status16Choice", propOrder = {
    "prtry",
    "mtchgSts",
    "ifrrdMtchgSts",
    "sttlmSts",
    "instrPrcgSts"
})
public class Status16Choice {

    @XmlElement(name = "Prtry")
    protected ProprietaryStatusAndReason2 prtry;
    @XmlElement(name = "MtchgSts")
    protected MatchingStatus22Choice mtchgSts;
    @XmlElement(name = "IfrrdMtchgSts")
    protected MatchingStatus22Choice ifrrdMtchgSts;
    @XmlElement(name = "SttlmSts")
    protected SettlementStatus13Choice sttlmSts;
    @XmlElement(name = "InstrPrcgSts")
    protected InstructionProcessingStatus17Choice instrPrcgSts;

    /**
     * Gets the value of the prtry property.
     * 
     * @return
     *     possible object is
     *     {@link ProprietaryStatusAndReason2 }
     *     
     */
    public ProprietaryStatusAndReason2 getPrtry() {
        return prtry;
    }

    /**
     * Sets the value of the prtry property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProprietaryStatusAndReason2 }
     *     
     */
    public Status16Choice setPrtry(ProprietaryStatusAndReason2 value) {
        this.prtry = value;
        return this;
    }

    /**
     * Gets the value of the mtchgSts property.
     * 
     * @return
     *     possible object is
     *     {@link MatchingStatus22Choice }
     *     
     */
    public MatchingStatus22Choice getMtchgSts() {
        return mtchgSts;
    }

    /**
     * Sets the value of the mtchgSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link MatchingStatus22Choice }
     *     
     */
    public Status16Choice setMtchgSts(MatchingStatus22Choice value) {
        this.mtchgSts = value;
        return this;
    }

    /**
     * Gets the value of the ifrrdMtchgSts property.
     * 
     * @return
     *     possible object is
     *     {@link MatchingStatus22Choice }
     *     
     */
    public MatchingStatus22Choice getIfrrdMtchgSts() {
        return ifrrdMtchgSts;
    }

    /**
     * Sets the value of the ifrrdMtchgSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link MatchingStatus22Choice }
     *     
     */
    public Status16Choice setIfrrdMtchgSts(MatchingStatus22Choice value) {
        this.ifrrdMtchgSts = value;
        return this;
    }

    /**
     * Gets the value of the sttlmSts property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementStatus13Choice }
     *     
     */
    public SettlementStatus13Choice getSttlmSts() {
        return sttlmSts;
    }

    /**
     * Sets the value of the sttlmSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementStatus13Choice }
     *     
     */
    public Status16Choice setSttlmSts(SettlementStatus13Choice value) {
        this.sttlmSts = value;
        return this;
    }

    /**
     * Gets the value of the instrPrcgSts property.
     * 
     * @return
     *     possible object is
     *     {@link InstructionProcessingStatus17Choice }
     *     
     */
    public InstructionProcessingStatus17Choice getInstrPrcgSts() {
        return instrPrcgSts;
    }

    /**
     * Sets the value of the instrPrcgSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link InstructionProcessingStatus17Choice }
     *     
     */
    public Status16Choice setInstrPrcgSts(InstructionProcessingStatus17Choice value) {
        this.instrPrcgSts = value;
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
