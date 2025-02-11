
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
 * Java class for SnFRequestDescriptor complex type.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SnFRequestDescriptor", propOrder = {
    "swiftTime",
    "nonRep",
    "mrrResult",
    "snFOutputInfo"
})
public class SwSnFRequestDescriptor {

    @XmlElement(name = "SwiftTime")
    protected String swiftTime;
    @XmlElement(name = "NonRep", namespace = "urn:swift:snl:ns.SwInt")
    protected SwIntNonRep nonRep;
    @XmlElement(name = "MRRResult", namespace = "urn:swift:snl:ns.SwInt")
    protected SwIntMRRResult mrrResult;
    @XmlElement(name = "SnFOutputInfo")
    protected SwSnFOutputInfo snFOutputInfo;

    /**
     * Gets the value of the swiftTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSwiftTime() {
        return swiftTime;
    }

    /**
     * Sets the value of the swiftTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwSnFRequestDescriptor setSwiftTime(String value) {
        this.swiftTime = value;
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
    public SwSnFRequestDescriptor setNonRep(SwIntNonRep value) {
        this.nonRep = value;
        return this;
    }

    /**
     * Gets the value of the mrrResult property.
     * 
     * @return
     *     possible object is
     *     {@link SwIntMRRResult }
     *     
     */
    public SwIntMRRResult getMRRResult() {
        return mrrResult;
    }

    /**
     * Sets the value of the mrrResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwIntMRRResult }
     *     
     */
    public SwSnFRequestDescriptor setMRRResult(SwIntMRRResult value) {
        this.mrrResult = value;
        return this;
    }

    /**
     * Gets the value of the snFOutputInfo property.
     * 
     * @return
     *     possible object is
     *     {@link SwSnFOutputInfo }
     *     
     */
    public SwSnFOutputInfo getSnFOutputInfo() {
        return snFOutputInfo;
    }

    /**
     * Sets the value of the snFOutputInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwSnFOutputInfo }
     *     
     */
    public SwSnFRequestDescriptor setSnFOutputInfo(SwSnFOutputInfo value) {
        this.snFOutputInfo = value;
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
