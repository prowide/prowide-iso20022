
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
 * Choice of instruction type status.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InstructionTypeStatus1Choice", propOrder = {
    "instrSts",
    "cxlSts"
})
public class InstructionTypeStatus1Choice {

    @XmlElement(name = "InstrSts")
    protected InstructionStatus3Choice instrSts;
    @XmlElement(name = "CxlSts")
    protected CancellationStatus2Choice cxlSts;

    /**
     * Gets the value of the instrSts property.
     * 
     * @return
     *     possible object is
     *     {@link InstructionStatus3Choice }
     *     
     */
    public InstructionStatus3Choice getInstrSts() {
        return instrSts;
    }

    /**
     * Sets the value of the instrSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link InstructionStatus3Choice }
     *     
     */
    public InstructionTypeStatus1Choice setInstrSts(InstructionStatus3Choice value) {
        this.instrSts = value;
        return this;
    }

    /**
     * Gets the value of the cxlSts property.
     * 
     * @return
     *     possible object is
     *     {@link CancellationStatus2Choice }
     *     
     */
    public CancellationStatus2Choice getCxlSts() {
        return cxlSts;
    }

    /**
     * Sets the value of the cxlSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link CancellationStatus2Choice }
     *     
     */
    public InstructionTypeStatus1Choice setCxlSts(CancellationStatus2Choice value) {
        this.cxlSts = value;
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
