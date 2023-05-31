
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
 * The DTCCCACSSD1 message extends ISO corporate action Instruction Cancellation Request Status Advice (CACS) message with DTCC corporate action elements not covered in the standard message.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DTCCCACSSD1V03", propOrder = {
    "reorgInstrCxlDtls"
})
public class DTCCCACSSD1V03 {

    @XmlElement(name = "ReorgInstrCxlDtls")
    protected ReorganisationInstructionSD14 reorgInstrCxlDtls;

    /**
     * Gets the value of the reorgInstrCxlDtls property.
     * 
     * @return
     *     possible object is
     *     {@link ReorganisationInstructionSD14 }
     *     
     */
    public ReorganisationInstructionSD14 getReorgInstrCxlDtls() {
        return reorgInstrCxlDtls;
    }

    /**
     * Sets the value of the reorgInstrCxlDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReorganisationInstructionSD14 }
     *     
     */
    public DTCCCACSSD1V03 setReorgInstrCxlDtls(ReorganisationInstructionSD14 value) {
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
