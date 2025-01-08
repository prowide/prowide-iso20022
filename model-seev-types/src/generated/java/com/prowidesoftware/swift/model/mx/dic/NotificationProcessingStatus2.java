
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
 * Provide processing status information for a notification advice.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NotificationProcessingStatus2", propOrder = {
    "sts",
    "addtlInf"
})
public class NotificationProcessingStatus2 {

    @XmlElement(name = "Sts", required = true)
    protected ProcessedStatus1Format1Choice sts;
    @XmlElement(name = "AddtlInf")
    protected String addtlInf;

    /**
     * Gets the value of the sts property.
     * 
     * @return
     *     possible object is
     *     {@link ProcessedStatus1Format1Choice }
     *     
     */
    public ProcessedStatus1Format1Choice getSts() {
        return sts;
    }

    /**
     * Sets the value of the sts property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProcessedStatus1Format1Choice }
     *     
     */
    public NotificationProcessingStatus2 setSts(ProcessedStatus1Format1Choice value) {
        this.sts = value;
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
    public NotificationProcessingStatus2 setAddtlInf(String value) {
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
