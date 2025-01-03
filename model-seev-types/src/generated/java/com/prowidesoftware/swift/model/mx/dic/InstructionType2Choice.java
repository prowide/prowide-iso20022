
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
 * Type of instruction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InstructionType2Choice", propOrder = {
    "instrId",
    "instrCxlId"
})
public class InstructionType2Choice {

    @XmlElement(name = "InstrId")
    protected String instrId;
    @XmlElement(name = "InstrCxlId")
    protected String instrCxlId;

    /**
     * Gets the value of the instrId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstrId() {
        return instrId;
    }

    /**
     * Sets the value of the instrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public InstructionType2Choice setInstrId(String value) {
        this.instrId = value;
        return this;
    }

    /**
     * Gets the value of the instrCxlId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstrCxlId() {
        return instrCxlId;
    }

    /**
     * Sets the value of the instrCxlId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public InstructionType2Choice setInstrCxlId(String value) {
        this.instrCxlId = value;
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
