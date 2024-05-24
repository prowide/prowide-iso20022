
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
 * Java class for Member complex type.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Member", propOrder = {
    "snFInputSeq",
    "memberAcceptStatus",
    "snFRef",
    "nonRep",
    "validationDescriptor",
    "snFInputInfo"
})
public class SwMember {

    @XmlElement(name = "SnFInputSeq", required = true)
    protected String snFInputSeq;
    @XmlElement(name = "MemberAcceptStatus", required = true)
    protected String memberAcceptStatus;
    @XmlElement(name = "SnFRef")
    protected String snFRef;
    @XmlElement(name = "NonRep", namespace = "urn:swift:snl:ns.SwInt")
    protected SwIntNonRep nonRep;
    @XmlElement(name = "ValidationDescriptor", namespace = "urn:swift:snl:ns.SwInt")
    protected SwIntValidationDescriptor validationDescriptor;
    @XmlElement(name = "SnFInputInfo")
    protected SwSnFInputInfo snFInputInfo;

    /**
     * Gets the value of the snFInputSeq property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSnFInputSeq() {
        return snFInputSeq;
    }

    /**
     * Sets the value of the snFInputSeq property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwMember setSnFInputSeq(String value) {
        this.snFInputSeq = value;
        return this;
    }

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
    public SwMember setMemberAcceptStatus(String value) {
        this.memberAcceptStatus = value;
        return this;
    }

    /**
     * Gets the value of the snFRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSnFRef() {
        return snFRef;
    }

    /**
     * Sets the value of the snFRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwMember setSnFRef(String value) {
        this.snFRef = value;
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
    public SwMember setNonRep(SwIntNonRep value) {
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
    public SwMember setValidationDescriptor(SwIntValidationDescriptor value) {
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
    public SwMember setSnFInputInfo(SwSnFInputInfo value) {
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
