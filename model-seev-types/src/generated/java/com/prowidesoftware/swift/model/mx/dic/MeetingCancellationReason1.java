
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
 * Specifies the reason for cancelling a meeting.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MeetingCancellationReason1", propOrder = {
    "cd",
    "xtndedCd",
    "cxlRsn"
})
public class MeetingCancellationReason1 {

    @XmlElement(name = "Cd")
    @XmlSchemaType(name = "string")
    protected MeetingCancellationReason2Code cd;
    @XmlElement(name = "XtndedCd")
    protected String xtndedCd;
    @XmlElement(name = "CxlRsn")
    protected String cxlRsn;

    /**
     * Gets the value of the cd property.
     * 
     * @return
     *     possible object is
     *     {@link MeetingCancellationReason2Code }
     *     
     */
    public MeetingCancellationReason2Code getCd() {
        return cd;
    }

    /**
     * Sets the value of the cd property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeetingCancellationReason2Code }
     *     
     */
    public MeetingCancellationReason1 setCd(MeetingCancellationReason2Code value) {
        this.cd = value;
        return this;
    }

    /**
     * Gets the value of the xtndedCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXtndedCd() {
        return xtndedCd;
    }

    /**
     * Sets the value of the xtndedCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public MeetingCancellationReason1 setXtndedCd(String value) {
        this.xtndedCd = value;
        return this;
    }

    /**
     * Gets the value of the cxlRsn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCxlRsn() {
        return cxlRsn;
    }

    /**
     * Sets the value of the cxlRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public MeetingCancellationReason1 setCxlRsn(String value) {
        this.cxlRsn = value;
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
