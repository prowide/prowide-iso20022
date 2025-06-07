
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
 * Defines the type of action to be performed in the request.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RequestType1Choice", propOrder = {
    "pmtCtrl",
    "enqry"
})
public class RequestType1Choice {

    @XmlElement(name = "PmtCtrl")
    @XmlSchemaType(name = "string")
    protected RequestType1Code pmtCtrl;
    @XmlElement(name = "Enqry")
    @XmlSchemaType(name = "string")
    protected RequestType2Code enqry;

    /**
     * Gets the value of the pmtCtrl property.
     * 
     * @return
     *     possible object is
     *     {@link RequestType1Code }
     *     
     */
    public RequestType1Code getPmtCtrl() {
        return pmtCtrl;
    }

    /**
     * Sets the value of the pmtCtrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestType1Code }
     *     
     */
    public RequestType1Choice setPmtCtrl(RequestType1Code value) {
        this.pmtCtrl = value;
        return this;
    }

    /**
     * Gets the value of the enqry property.
     * 
     * @return
     *     possible object is
     *     {@link RequestType2Code }
     *     
     */
    public RequestType2Code getEnqry() {
        return enqry;
    }

    /**
     * Sets the value of the enqry property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestType2Code }
     *     
     */
    public RequestType1Choice setEnqry(RequestType2Code value) {
        this.enqry = value;
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
