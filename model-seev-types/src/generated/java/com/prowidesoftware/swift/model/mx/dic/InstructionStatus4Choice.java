
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
 * Status applying globally to the instruction received.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InstructionStatus4Choice", propOrder = {
    "prcgSts",
    "rjctnSts"
})
public class InstructionStatus4Choice {

    @XmlElement(name = "PrcgSts")
    protected InstructionProcessingStatus1 prcgSts;
    @XmlElement(name = "RjctnSts")
    protected AdditionalStatus1 rjctnSts;

    /**
     * Gets the value of the prcgSts property.
     * 
     * @return
     *     possible object is
     *     {@link InstructionProcessingStatus1 }
     *     
     */
    public InstructionProcessingStatus1 getPrcgSts() {
        return prcgSts;
    }

    /**
     * Sets the value of the prcgSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link InstructionProcessingStatus1 }
     *     
     */
    public InstructionStatus4Choice setPrcgSts(InstructionProcessingStatus1 value) {
        this.prcgSts = value;
        return this;
    }

    /**
     * Gets the value of the rjctnSts property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalStatus1 }
     *     
     */
    public AdditionalStatus1 getRjctnSts() {
        return rjctnSts;
    }

    /**
     * Sets the value of the rjctnSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalStatus1 }
     *     
     */
    public InstructionStatus4Choice setRjctnSts(AdditionalStatus1 value) {
        this.rjctnSts = value;
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
