
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
 * Java class for RequestDescriptor complex type.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RequestDescriptor", namespace = "urn:swift:snl:ns.SwInt", propOrder = {
    "rbac",
    "swiftRequestRef",
    "swiftRef",
    "nonRep",
    "validationDescriptor",
    "snFInputInfo",
    "snFOutputInfo",
    "mrrResult",
    "signatureList",
    "copy",
    "distributionInfo",
    "retrievedDescriptor"
})
public class SwIntRequestDescriptor {

    @XmlElement(name = "RBAC")
    protected SwRBACDescriptor rbac;
    @XmlElement(name = "SwiftRequestRef", required = true)
    protected String swiftRequestRef;
    @XmlElement(name = "SwiftRef", required = true)
    protected String swiftRef;
    @XmlElement(name = "NonRep")
    protected SwIntNonRep nonRep;
    @XmlElement(name = "ValidationDescriptor")
    protected SwIntValidationDescriptor validationDescriptor;
    @XmlElement(name = "SnFInputInfo", namespace = "urn:swift:snl:ns.Sw")
    protected SwSnFInputInfo snFInputInfo;
    @XmlElement(name = "SnFOutputInfo", namespace = "urn:swift:snl:ns.Sw")
    protected SwSnFOutputInfo snFOutputInfo;
    @XmlElement(name = "MRRResult")
    protected SwIntMRRResult mrrResult;
    @XmlElement(name = "SignatureList", namespace = "urn:swift:snl:ns.SwSec")
    protected SwSecSignatureList signatureList;
    @XmlElement(name = "Copy", namespace = "urn:swift:snl:ns.Sw")
    protected SwCopy copy;
    @XmlElement(name = "DistributionInfo", namespace = "urn:swift:snl:ns.Sw")
    protected SwDistributionInfo distributionInfo;
    @XmlElement(name = "RetrievedDescriptor", namespace = "urn:swift:snl:ns.Sw")
    protected SwRetrievedDescriptor retrievedDescriptor;

    /**
     * Gets the value of the rbac property.
     * 
     * @return
     *     possible object is
     *     {@link SwRBACDescriptor }
     *     
     */
    public SwRBACDescriptor getRBAC() {
        return rbac;
    }

    /**
     * Sets the value of the rbac property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwRBACDescriptor }
     *     
     */
    public SwIntRequestDescriptor setRBAC(SwRBACDescriptor value) {
        this.rbac = value;
        return this;
    }

    /**
     * Gets the value of the swiftRequestRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSwiftRequestRef() {
        return swiftRequestRef;
    }

    /**
     * Sets the value of the swiftRequestRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwIntRequestDescriptor setSwiftRequestRef(String value) {
        this.swiftRequestRef = value;
        return this;
    }

    /**
     * Gets the value of the swiftRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSwiftRef() {
        return swiftRef;
    }

    /**
     * Sets the value of the swiftRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwIntRequestDescriptor setSwiftRef(String value) {
        this.swiftRef = value;
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
    public SwIntRequestDescriptor setNonRep(SwIntNonRep value) {
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
    public SwIntRequestDescriptor setValidationDescriptor(SwIntValidationDescriptor value) {
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
    public SwIntRequestDescriptor setSnFInputInfo(SwSnFInputInfo value) {
        this.snFInputInfo = value;
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
    public SwIntRequestDescriptor setSnFOutputInfo(SwSnFOutputInfo value) {
        this.snFOutputInfo = value;
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
    public SwIntRequestDescriptor setMRRResult(SwIntMRRResult value) {
        this.mrrResult = value;
        return this;
    }

    /**
     * Gets the value of the signatureList property.
     * 
     * @return
     *     possible object is
     *     {@link SwSecSignatureList }
     *     
     */
    public SwSecSignatureList getSignatureList() {
        return signatureList;
    }

    /**
     * Sets the value of the signatureList property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwSecSignatureList }
     *     
     */
    public SwIntRequestDescriptor setSignatureList(SwSecSignatureList value) {
        this.signatureList = value;
        return this;
    }

    /**
     * Gets the value of the copy property.
     * 
     * @return
     *     possible object is
     *     {@link SwCopy }
     *     
     */
    public SwCopy getCopy() {
        return copy;
    }

    /**
     * Sets the value of the copy property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwCopy }
     *     
     */
    public SwIntRequestDescriptor setCopy(SwCopy value) {
        this.copy = value;
        return this;
    }

    /**
     * Gets the value of the distributionInfo property.
     * 
     * @return
     *     possible object is
     *     {@link SwDistributionInfo }
     *     
     */
    public SwDistributionInfo getDistributionInfo() {
        return distributionInfo;
    }

    /**
     * Sets the value of the distributionInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwDistributionInfo }
     *     
     */
    public SwIntRequestDescriptor setDistributionInfo(SwDistributionInfo value) {
        this.distributionInfo = value;
        return this;
    }

    /**
     * Gets the value of the retrievedDescriptor property.
     * 
     * @return
     *     possible object is
     *     {@link SwRetrievedDescriptor }
     *     
     */
    public SwRetrievedDescriptor getRetrievedDescriptor() {
        return retrievedDescriptor;
    }

    /**
     * Sets the value of the retrievedDescriptor property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwRetrievedDescriptor }
     *     
     */
    public SwIntRequestDescriptor setRetrievedDescriptor(SwRetrievedDescriptor value) {
        this.retrievedDescriptor = value;
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
