
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
 * Defines the criteria which are used to report on the payment status.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InstructionStatusReturnCriteria", propOrder = {
    "pmtInstrStsInd",
    "pmtInstrStsDtTmInd",
    "pmtInstrStsRsnInd"
})
public class InstructionStatusReturnCriteria {

    @XmlElement(name = "PmtInstrStsInd")
    protected boolean pmtInstrStsInd;
    @XmlElement(name = "PmtInstrStsDtTmInd")
    protected Boolean pmtInstrStsDtTmInd;
    @XmlElement(name = "PmtInstrStsRsnInd")
    protected Boolean pmtInstrStsRsnInd;

    /**
     * Gets the value of the pmtInstrStsInd property.
     * 
     */
    public boolean isPmtInstrStsInd() {
        return pmtInstrStsInd;
    }

    /**
     * Sets the value of the pmtInstrStsInd property.
     * 
     */
    public InstructionStatusReturnCriteria setPmtInstrStsInd(boolean value) {
        this.pmtInstrStsInd = value;
        return this;
    }

    /**
     * Gets the value of the pmtInstrStsDtTmInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPmtInstrStsDtTmInd() {
        return pmtInstrStsDtTmInd;
    }

    /**
     * Sets the value of the pmtInstrStsDtTmInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public InstructionStatusReturnCriteria setPmtInstrStsDtTmInd(Boolean value) {
        this.pmtInstrStsDtTmInd = value;
        return this;
    }

    /**
     * Gets the value of the pmtInstrStsRsnInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPmtInstrStsRsnInd() {
        return pmtInstrStsRsnInd;
    }

    /**
     * Sets the value of the pmtInstrStsRsnInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public InstructionStatusReturnCriteria setPmtInstrStsRsnInd(Boolean value) {
        this.pmtInstrStsRsnInd = value;
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
