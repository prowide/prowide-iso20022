
package com.prowidesoftware.swift.model.mx.sys.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Java class for ResolveGapSnFResponseHandle complex type.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResolveGapSnFResponseHandle", propOrder = {
    "memberAcceptStatus",
    "originalSnFRef",
    "nonRep",
    "validationDescriptor",
    "snFInputInfo"
})
public class SwResolveGapSnFResponseHandle {

    @XmlElement(name = "MemberAcceptStatus", required = true)
    protected String memberAcceptStatus;
    @XmlElement(name = "OriginalSnFRef")
    protected String originalSnFRef;
    @XmlElement(name = "NonRep", namespace = "urn:swift:snl:ns.SwInt")
    protected SwIntNonRep nonRep;
    @XmlElement(name = "ValidationDescriptor", namespace = "urn:swift:snl:ns.SwInt")
    protected SwIntValidationDescriptor validationDescriptor;
    @XmlElement(name = "SnFInputInfo")
    protected SwSnFInputInfo snFInputInfo;

    /**
     * Gets the value of the memberAcceptStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMemberAcceptStatus() {
        return memberAcceptStatus;
    }

    /**
     * Sets the value of the memberAcceptStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwResolveGapSnFResponseHandle setMemberAcceptStatus(String value) {
        this.memberAcceptStatus = value;
        return this;
    }

    /**
     * Gets the value of the originalSnFRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginalSnFRef() {
        return originalSnFRef;
    }

    /**
     * Sets the value of the originalSnFRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwResolveGapSnFResponseHandle setOriginalSnFRef(String value) {
        this.originalSnFRef = value;
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
    public SwResolveGapSnFResponseHandle setNonRep(SwIntNonRep value) {
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
    public SwResolveGapSnFResponseHandle setValidationDescriptor(SwIntValidationDescriptor value) {
        this.validationDescriptor = value;
        return this;
    }

    /**
     * Gets the value of the snFInputInfo property.
     * 
     * @return
     *     possible object is
     *     {@link SwSnFInputInfo }
     *     
     */
    public SwSnFInputInfo getSnFInputInfo() {
        return snFInputInfo;
    }

    /**
     * Sets the value of the snFInputInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwSnFInputInfo }
     *     
     */
    public SwResolveGapSnFResponseHandle setSnFInputInfo(SwSnFInputInfo value) {
        this.snFInputInfo = value;
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
