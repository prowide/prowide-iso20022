
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
 * Java class for FileResponseDescriptor complex type.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FileResponseDescriptor", propOrder = {
    "swiftResponseRef",
    "nonRep",
    "secSecuredData"
})
public class SwFileResponseDescriptor {

    @XmlElement(name = "SwiftResponseRef", namespace = "urn:swift:snl:ns.SwInt", required = true)
    protected String swiftResponseRef;
    @XmlElement(name = "NonRep", namespace = "urn:swift:snl:ns.SwInt")
    protected SwIntNonRep nonRep;
    @XmlElement(name = "SecSecuredData", namespace = "urn:swift:snl:ns.SwSec")
    protected SwSecMixedAny secSecuredData;

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
    public SwFileResponseDescriptor setSwiftResponseRef(String value) {
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
    public SwFileResponseDescriptor setNonRep(SwIntNonRep value) {
        this.nonRep = value;
        return this;
    }

    /**
     * Gets the value of the secSecuredData property.
     * 
     * @return
     *     possible object is
     *     {@link SwSecMixedAny }
     *     
     */
    public SwSecMixedAny getSecSecuredData() {
        return secSecuredData;
    }

    /**
     * Sets the value of the secSecuredData property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwSecMixedAny }
     *     
     */
    public SwFileResponseDescriptor setSecSecuredData(SwSecMixedAny value) {
        this.secSecuredData = value;
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
