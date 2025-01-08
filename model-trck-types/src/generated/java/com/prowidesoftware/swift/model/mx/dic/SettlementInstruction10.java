
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
 * Provides further details on the settlement of the instruction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SettlementInstruction10", propOrder = {
    "sttlmMtd",
    "clrSys"
})
public class SettlementInstruction10 {

    @XmlElement(name = "SttlmMtd", required = true)
    @XmlSchemaType(name = "string")
    protected SettlementMethod1Code sttlmMtd;
    @XmlElement(name = "ClrSys")
    protected TrackerClearingSystemIdentification1 clrSys;

    /**
     * Gets the value of the sttlmMtd property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementMethod1Code }
     *     
     */
    public SettlementMethod1Code getSttlmMtd() {
        return sttlmMtd;
    }

    /**
     * Sets the value of the sttlmMtd property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementMethod1Code }
     *     
     */
    public SettlementInstruction10 setSttlmMtd(SettlementMethod1Code value) {
        this.sttlmMtd = value;
        return this;
    }

    /**
     * Gets the value of the clrSys property.
     * 
     * @return
     *     possible object is
     *     {@link TrackerClearingSystemIdentification1 }
     *     
     */
    public TrackerClearingSystemIdentification1 getClrSys() {
        return clrSys;
    }

    /**
     * Sets the value of the clrSys property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrackerClearingSystemIdentification1 }
     *     
     */
    public SettlementInstruction10 setClrSys(TrackerClearingSystemIdentification1 value) {
        this.clrSys = value;
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
