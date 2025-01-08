
package com.prowidesoftware.swift.model.mx.sys.dic;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Java class for ResponseDescriptor complex type.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResponseDescriptor", namespace = "urn:swift:snl:ns.SwInt", propOrder = {
    "swiftResponseRef",
    "nonRep",
    "validationDescriptor"
})
public class SwIntResponseDescriptor {

    @XmlElement(name = "SwiftResponseRef", required = true)
    protected String swiftResponseRef;
    @XmlElement(name = "NonRep")
    protected SwIntNonRep nonRep;
    @XmlElement(name = "ValidationDescriptor")
    protected SwIntValidationDescriptor validationDescriptor;

    /**
     * Gets the value of the swiftResponseRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSwiftResponseRef() {
        return swiftResponseRef;
    }

    /**
     * Sets the value of the swiftResponseRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwIntResponseDescriptor setSwiftResponseRef(String value) {
        this.swiftResponseRef = value;
        return this;
    }

    /**
     * Gets the value of the nonRep property.
     * 
     * @return
     *     possible object is
     *     {@link SwIntNonRep }
     *     
     */
    public SwIntNonRep getNonRep() {
        return nonRep;
    }

    /**
     * Sets the value of the nonRep property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwIntNonRep }
     *     
     */
    public SwIntResponseDescriptor setNonRep(SwIntNonRep value) {
        this.nonRep = value;
        return this;
    }

    /**
     * Gets the value of the validationDescriptor property.
     * 
     * @return
     *     possible object is
     *     {@link SwIntValidationDescriptor }
     *     
     */
    public SwIntValidationDescriptor getValidationDescriptor() {
        return validationDescriptor;
    }

    /**
     * Sets the value of the validationDescriptor property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwIntValidationDescriptor }
     *     
     */
    public SwIntResponseDescriptor setValidationDescriptor(SwIntValidationDescriptor value) {
        this.validationDescriptor = value;
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
