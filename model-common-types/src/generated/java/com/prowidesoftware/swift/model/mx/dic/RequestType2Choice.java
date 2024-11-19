
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
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
@XmlType(name = "RequestType2Choice", propOrder = {
    "pmtCtrl",
    "enqry",
    "prtry"
})
public class RequestType2Choice {

    @XmlElement(name = "PmtCtrl")
    @XmlSchemaType(name = "string")
    protected RequestType1Code pmtCtrl;
    @XmlElement(name = "Enqry")
    @XmlSchemaType(name = "string")
    protected RequestType2Code enqry;
    @XmlElement(name = "Prtry")
    protected GenericIdentification1 prtry;

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
    public RequestType2Choice setPmtCtrl(RequestType1Code value) {
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
    public RequestType2Choice setEnqry(RequestType2Code value) {
        this.enqry = value;
        return this;
    }

    /**
     * Gets the value of the prtry property.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification1 }
     *     
     */
    public GenericIdentification1 getPrtry() {
        return prtry;
    }

    /**
     * Sets the value of the prtry property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification1 }
     *     
     */
    public RequestType2Choice setPrtry(GenericIdentification1 value) {
        this.prtry = value;
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
