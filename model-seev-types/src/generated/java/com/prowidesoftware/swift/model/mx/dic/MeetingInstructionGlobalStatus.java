
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
 * Unique status applying to a meeting instruction message and therefore to each instruction contained in the message.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MeetingInstructionGlobalStatus", propOrder = {
    "prcgSts",
    "rjctnSts",
    "cxlSts",
    "stsRsn"
})
public class MeetingInstructionGlobalStatus {

    @XmlElement(name = "PrcgSts")
    @XmlSchemaType(name = "string")
    protected Status1Code prcgSts;
    @XmlElement(name = "RjctnSts")
    @XmlSchemaType(name = "string")
    protected MeetingInstructionRejection1Code rjctnSts;
    @XmlElement(name = "CxlSts")
    @XmlSchemaType(name = "string")
    protected MeetingInstructionCancellationStatus1Code cxlSts;
    @XmlElement(name = "StsRsn")
    protected String stsRsn;

    /**
     * Gets the value of the prcgSts property.
     * 
     * @return
     *     possible object is
     *     {@link Status1Code }
     *     
     */
    public Status1Code getPrcgSts() {
        return prcgSts;
    }

    /**
     * Sets the value of the prcgSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link Status1Code }
     *     
     */
    public MeetingInstructionGlobalStatus setPrcgSts(Status1Code value) {
        this.prcgSts = value;
        return this;
    }

    /**
     * Gets the value of the rjctnSts property.
     * 
     * @return
     *     possible object is
     *     {@link MeetingInstructionRejection1Code }
     *     
     */
    public MeetingInstructionRejection1Code getRjctnSts() {
        return rjctnSts;
    }

    /**
     * Sets the value of the rjctnSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeetingInstructionRejection1Code }
     *     
     */
    public MeetingInstructionGlobalStatus setRjctnSts(MeetingInstructionRejection1Code value) {
        this.rjctnSts = value;
        return this;
    }

    /**
     * Gets the value of the cxlSts property.
     * 
     * @return
     *     possible object is
     *     {@link MeetingInstructionCancellationStatus1Code }
     *     
     */
    public MeetingInstructionCancellationStatus1Code getCxlSts() {
        return cxlSts;
    }

    /**
     * Sets the value of the cxlSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeetingInstructionCancellationStatus1Code }
     *     
     */
    public MeetingInstructionGlobalStatus setCxlSts(MeetingInstructionCancellationStatus1Code value) {
        this.cxlSts = value;
        return this;
    }

    /**
     * Gets the value of the stsRsn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStsRsn() {
        return stsRsn;
    }

    /**
     * Sets the value of the stsRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public MeetingInstructionGlobalStatus setStsRsn(String value) {
        this.stsRsn = value;
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
