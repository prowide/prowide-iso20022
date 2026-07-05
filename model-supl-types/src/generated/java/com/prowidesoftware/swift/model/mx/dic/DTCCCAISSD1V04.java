
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
 * The DTCCCAISSD1 message extends ISO Corporate Action Instruction Status Advice message with DTCC corporate action elements not covered in the standard message.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DTCCCAISSD1V04", propOrder = {
    "reorgInstrDtls"
})
public class DTCCCAISSD1V04 {

    @XmlElement(name = "ReorgInstrDtls")
    protected ReorganisationInstructionSD9 reorgInstrDtls;

    /**
     * Gets the value of the reorgInstrDtls property.
     * 
     * @return
     *     possible object is
     *     {@link ReorganisationInstructionSD9 }
     *     
     */
    public ReorganisationInstructionSD9 getReorgInstrDtls() {
        return reorgInstrDtls;
    }

    /**
     * Sets the value of the reorgInstrDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReorganisationInstructionSD9 }
     *     
     */
    public DTCCCAISSD1V04 setReorgInstrDtls(ReorganisationInstructionSD9 value) {
        this.reorgInstrDtls = value;
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
