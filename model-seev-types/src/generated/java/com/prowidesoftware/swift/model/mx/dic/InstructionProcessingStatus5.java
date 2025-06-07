
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Status advising on the processing of the instruction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InstructionProcessingStatus5", propOrder = {
    "sts",
    "attndncCardNb",
    "addtlInf"
})
public class InstructionProcessingStatus5 {

    @XmlElement(name = "Sts", required = true)
    @XmlSchemaType(name = "string")
    protected Status9Code sts;
    @XmlElement(name = "AttndncCardNb")
    protected String attndncCardNb;
    @XmlElement(name = "AddtlInf")
    protected String addtlInf;

    /**
     * Gets the value of the sts property.
     * 
     * @return
     *     possible object is
     *     {@link Status9Code }
     *     
     */
    public Status9Code getSts() {
        return sts;
    }

    /**
     * Sets the value of the sts property.
     * 
     * @param value
     *     allowed object is
     *     {@link Status9Code }
     *     
     */
    public InstructionProcessingStatus5 setSts(Status9Code value) {
        this.sts = value;
        return this;
    }

    /**
     * Gets the value of the attndncCardNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttndncCardNb() {
        return attndncCardNb;
    }

    /**
     * Sets the value of the attndncCardNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public InstructionProcessingStatus5 setAttndncCardNb(String value) {
        this.attndncCardNb = value;
        return this;
    }

    /**
     * Gets the value of the addtlInf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddtlInf() {
        return addtlInf;
    }

    /**
     * Sets the value of the addtlInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public InstructionProcessingStatus5 setAddtlInf(String value) {
        this.addtlInf = value;
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
