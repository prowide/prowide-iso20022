
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
 * Choice of status.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatusAndReason38__1", propOrder = {
    "mtchgSts",
    "sttlmSts",
    "instrPrcgSts",
    "sttld"
})
public class StatusAndReason381 {

    @XmlElement(name = "MtchgSts")
    protected MatchingStatus24Choice1 mtchgSts;
    @XmlElement(name = "SttlmSts")
    protected SettlementStatus17Choice1 sttlmSts;
    @XmlElement(name = "InstrPrcgSts")
    protected InstructionProcessingStatus37Choice1 instrPrcgSts;
    @XmlElement(name = "Sttld")
    protected ProprietaryReason41 sttld;

    /**
     * Gets the value of the mtchgSts property.
     * 
     * @return
     *     possible object is
     *     {@link MatchingStatus24Choice1 }
     *     
     */
    public MatchingStatus24Choice1 getMtchgSts() {
        return mtchgSts;
    }

    /**
     * Sets the value of the mtchgSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link MatchingStatus24Choice1 }
     *     
     */
    public StatusAndReason381 setMtchgSts(MatchingStatus24Choice1 value) {
        this.mtchgSts = value;
        return this;
    }

    /**
     * Gets the value of the sttlmSts property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementStatus17Choice1 }
     *     
     */
    public SettlementStatus17Choice1 getSttlmSts() {
        return sttlmSts;
    }

    /**
     * Sets the value of the sttlmSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementStatus17Choice1 }
     *     
     */
    public StatusAndReason381 setSttlmSts(SettlementStatus17Choice1 value) {
        this.sttlmSts = value;
        return this;
    }

    /**
     * Gets the value of the instrPrcgSts property.
     * 
     * @return
     *     possible object is
     *     {@link InstructionProcessingStatus37Choice1 }
     *     
     */
    public InstructionProcessingStatus37Choice1 getInstrPrcgSts() {
        return instrPrcgSts;
    }

    /**
     * Sets the value of the instrPrcgSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link InstructionProcessingStatus37Choice1 }
     *     
     */
    public StatusAndReason381 setInstrPrcgSts(InstructionProcessingStatus37Choice1 value) {
        this.instrPrcgSts = value;
        return this;
    }

    /**
     * Gets the value of the sttld property.
     * 
     * @return
     *     possible object is
     *     {@link ProprietaryReason41 }
     *     
     */
    public ProprietaryReason41 getSttld() {
        return sttld;
    }

    /**
     * Sets the value of the sttld property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProprietaryReason41 }
     *     
     */
    public StatusAndReason381 setSttld(ProprietaryReason41 value) {
        this.sttld = value;
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
