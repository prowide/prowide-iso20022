
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
 * Java class for FileRequestDescriptor complex type.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FileRequestDescriptor", propOrder = {
    "rbac",
    "swiftRequestRef",
    "swiftTime",
    "nonRep",
    "mrrResult",
    "snFInputInfo",
    "snFOutputInfo",
    "secSecuredData",
    "signatureList",
    "copy",
    "distributionInfo"
})
public class SwFileRequestDescriptor {

    @XmlElement(name = "RBAC", namespace = "urn:swift:snl:ns.SwInt")
    protected SwRBACDescriptor rbac;
    @XmlElement(name = "SwiftRequestRef", namespace = "urn:swift:snl:ns.SwInt", required = true)
    protected String swiftRequestRef;
    @XmlElement(name = "SwiftTime", required = true)
    protected String swiftTime;
    @XmlElement(name = "NonRep", namespace = "urn:swift:snl:ns.SwInt")
    protected SwIntNonRep nonRep;
    @XmlElement(name = "MRRResult", namespace = "urn:swift:snl:ns.SwInt")
    protected SwIntMRRResult mrrResult;
    @XmlElement(name = "SnFInputInfo")
    protected SwSnFInputInfo snFInputInfo;
    @XmlElement(name = "SnFOutputInfo")
    protected SwSnFOutputInfo snFOutputInfo;
    @XmlElement(name = "SecSecuredData", namespace = "urn:swift:snl:ns.SwSec")
    protected SwSecMixedAny secSecuredData;
    @XmlElement(name = "SignatureList", namespace = "urn:swift:snl:ns.SwSec")
    protected SwSecSignatureList signatureList;
    @XmlElement(name = "Copy")
    protected SwCopy copy;
    @XmlElement(name = "DistributionInfo")
    protected SwDistributionInfo distributionInfo;

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
    public SwFileRequestDescriptor setRBAC(SwRBACDescriptor value) {
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
    public SwFileRequestDescriptor setSwiftRequestRef(String value) {
        this.swiftRequestRef = value;
        return this;
    }

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
    public SwFileRequestDescriptor setSwiftTime(String value) {
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
    public SwFileRequestDescriptor setNonRep(SwIntNonRep value) {
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
    public SwFileRequestDescriptor setMRRResult(SwIntMRRResult value) {
        this.mrrResult = value;
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
    public SwFileRequestDescriptor setSnFInputInfo(SwSnFInputInfo value) {
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
    public SwFileRequestDescriptor setSnFOutputInfo(SwSnFOutputInfo value) {
        this.snFOutputInfo = value;
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
    public SwFileRequestDescriptor setSecSecuredData(SwSecMixedAny value) {
        this.secSecuredData = value;
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
    public SwFileRequestDescriptor setSignatureList(SwSecSignatureList value) {
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
    public SwFileRequestDescriptor setCopy(SwCopy value) {
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
    public SwFileRequestDescriptor setDistributionInfo(SwDistributionInfo value) {
        this.distributionInfo = value;
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
