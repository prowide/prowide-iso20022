
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
 * The DTCCCACSSD1 message extends ISO corporate action Instruction Cancellation Request Status Advice (CACS) message with DTCC corporate action elements not covered in the standard message.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DTCCCACSSD1V02", propOrder = {
    "reorgInstrCxlDtls"
})
public class DTCCCACSSD1V02 {

    @XmlElement(name = "ReorgInstrCxlDtls")
    protected ReorganisationInstructionSD8 reorgInstrCxlDtls;

    /**
     * Gets the value of the reorgInstrCxlDtls property.
     * 
     * @return
     *     possible object is
     *     {@link ReorganisationInstructionSD8 }
     *     
     */
    public ReorganisationInstructionSD8 getReorgInstrCxlDtls() {
        return reorgInstrCxlDtls;
    }

    /**
     * Sets the value of the reorgInstrCxlDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReorganisationInstructionSD8 }
     *     
     */
    public DTCCCACSSD1V02 setReorgInstrCxlDtls(ReorganisationInstructionSD8 value) {
        this.reorgInstrCxlDtls = value;
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
