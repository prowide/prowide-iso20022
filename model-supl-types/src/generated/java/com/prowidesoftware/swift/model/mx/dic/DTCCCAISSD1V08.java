
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
 * The DTCCCAISSD1 message extends ISO corporate action instruction status advice message with DTCC corporate action elements not covered in the standard message.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DTCCCAISSD1V08", propOrder = {
    "reorgInstrDtls",
    "dstrbtnInstrDtls"
})
public class DTCCCAISSD1V08 {

    @XmlElement(name = "ReorgInstrDtls")
    protected ReorganisationInstructionSD15 reorgInstrDtls;
    @XmlElement(name = "DstrbtnInstrDtls")
    protected DistributionInstructionSD1 dstrbtnInstrDtls;

    /**
     * Gets the value of the reorgInstrDtls property.
     * 
     * @return
     *     possible object is
     *     {@link ReorganisationInstructionSD15 }
     *     
     */
    public ReorganisationInstructionSD15 getReorgInstrDtls() {
        return reorgInstrDtls;
    }

    /**
     * Sets the value of the reorgInstrDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReorganisationInstructionSD15 }
     *     
     */
    public DTCCCAISSD1V08 setReorgInstrDtls(ReorganisationInstructionSD15 value) {
        this.reorgInstrDtls = value;
        return this;
    }

    /**
     * Gets the value of the dstrbtnInstrDtls property.
     * 
     * @return
     *     possible object is
     *     {@link DistributionInstructionSD1 }
     *     
     */
    public DistributionInstructionSD1 getDstrbtnInstrDtls() {
        return dstrbtnInstrDtls;
    }

    /**
     * Sets the value of the dstrbtnInstrDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link DistributionInstructionSD1 }
     *     
     */
    public DTCCCAISSD1V08 setDstrbtnInstrDtls(DistributionInstructionSD1 value) {
        this.dstrbtnInstrDtls = value;
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
