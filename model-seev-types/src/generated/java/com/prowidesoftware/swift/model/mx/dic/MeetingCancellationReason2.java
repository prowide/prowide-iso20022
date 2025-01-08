
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
 * Specifies the reason for cancelling a meeting.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MeetingCancellationReason2", propOrder = {
    "cxlRsnCd",
    "cxlRsn"
})
public class MeetingCancellationReason2 {

    @XmlElement(name = "CxlRsnCd")
    protected MeetingCancellationReason1Choice cxlRsnCd;
    @XmlElement(name = "CxlRsn")
    protected String cxlRsn;

    /**
     * Gets the value of the cxlRsnCd property.
     * 
     * @return
     *     possible object is
     *     {@link MeetingCancellationReason1Choice }
     *     
     */
    public MeetingCancellationReason1Choice getCxlRsnCd() {
        return cxlRsnCd;
    }

    /**
     * Sets the value of the cxlRsnCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeetingCancellationReason1Choice }
     *     
     */
    public MeetingCancellationReason2 setCxlRsnCd(MeetingCancellationReason1Choice value) {
        this.cxlRsnCd = value;
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
    public MeetingCancellationReason2 setCxlRsn(String value) {
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
