
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
 * Reference of the PayInSchedule or the PayInCall being acknowledged. This is the Message Identification element from the Report Data sequence of the Pay In Schedule message or the Pay In Call message.
 * 
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AcknowledgementDetails1Choice", propOrder = {
    "payInSchdlRef",
    "payInCallRef"
})
public class AcknowledgementDetails1Choice {

    @XmlElement(name = "PayInSchdlRef")
    protected String payInSchdlRef;
    @XmlElement(name = "PayInCallRef")
    protected String payInCallRef;

    /**
     * Gets the value of the payInSchdlRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayInSchdlRef() {
        return payInSchdlRef;
    }

    /**
     * Sets the value of the payInSchdlRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public AcknowledgementDetails1Choice setPayInSchdlRef(String value) {
        this.payInSchdlRef = value;
        return this;
    }

    /**
     * Gets the value of the payInCallRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayInCallRef() {
        return payInCallRef;
    }

    /**
     * Sets the value of the payInCallRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public AcknowledgementDetails1Choice setPayInCallRef(String value) {
        this.payInCallRef = value;
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
