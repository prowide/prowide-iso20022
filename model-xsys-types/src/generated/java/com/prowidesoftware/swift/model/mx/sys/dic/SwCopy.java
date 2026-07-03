
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
 * Java class for Copy complex type.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Copy", propOrder = {
    "copyType",
    "copyState",
    "copySnFRef",
    "authNotifInd",
    "origSnFRef",
    "recipientDN",
    "thirdPartyToReceiverInformation",
    "snFRefType",
    "copiedThirdPartyList",
    "skippedThirdPartyList"
})
public class SwCopy {

    @XmlElement(name = "CopyType")
    protected String copyType;
    @XmlElement(name = "CopyState")
    protected String copyState;
    @XmlElement(name = "CopySnFRef")
    protected String copySnFRef;
    @XmlElement(name = "AuthNotifInd")
    protected String authNotifInd;
    @XmlElement(name = "OrigSnFRef")
    protected String origSnFRef;
    @XmlElement(name = "RecipientDN")
    protected String recipientDN;
    @XmlElement(name = "ThirdPartyToReceiverInformation")
    protected SwAny thirdPartyToReceiverInformation;
    @XmlElement(name = "SnFRefType")
    protected String snFRefType;
    @XmlElement(name = "CopiedThirdPartyList")
    protected SwThirdPartyList copiedThirdPartyList;
    @XmlElement(name = "SkippedThirdPartyList")
    protected SwThirdPartyList skippedThirdPartyList;

    /**
     * Gets the value of the copyType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCopyType() {
        return copyType;
    }

    /**
     * Sets the value of the copyType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwCopy setCopyType(String value) {
        this.copyType = value;
        return this;
    }

    /**
     * Gets the value of the copyState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCopyState() {
        return copyState;
    }

    /**
     * Sets the value of the copyState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwCopy setCopyState(String value) {
        this.copyState = value;
        return this;
    }

    /**
     * Gets the value of the copySnFRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCopySnFRef() {
        return copySnFRef;
    }

    /**
     * Sets the value of the copySnFRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwCopy setCopySnFRef(String value) {
        this.copySnFRef = value;
        return this;
    }

    /**
     * Gets the value of the authNotifInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthNotifInd() {
        return authNotifInd;
    }

    /**
     * Sets the value of the authNotifInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwCopy setAuthNotifInd(String value) {
        this.authNotifInd = value;
        return this;
    }

    /**
     * Gets the value of the origSnFRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrigSnFRef() {
        return origSnFRef;
    }

    /**
     * Sets the value of the origSnFRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwCopy setOrigSnFRef(String value) {
        this.origSnFRef = value;
        return this;
    }

    /**
     * Gets the value of the recipientDN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecipientDN() {
        return recipientDN;
    }

    /**
     * Sets the value of the recipientDN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwCopy setRecipientDN(String value) {
        this.recipientDN = value;
        return this;
    }

    /**
     * Gets the value of the thirdPartyToReceiverInformation property.
     * 
     * @return
     *     possible object is
     *     {@link SwAny }
     *     
     */
    public SwAny getThirdPartyToReceiverInformation() {
        return thirdPartyToReceiverInformation;
    }

    /**
     * Sets the value of the thirdPartyToReceiverInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwAny }
     *     
     */
    public SwCopy setThirdPartyToReceiverInformation(SwAny value) {
        this.thirdPartyToReceiverInformation = value;
        return this;
    }

    /**
     * Gets the value of the snFRefType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSnFRefType() {
        return snFRefType;
    }

    /**
     * Sets the value of the snFRefType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwCopy setSnFRefType(String value) {
        this.snFRefType = value;
        return this;
    }

    /**
     * Gets the value of the copiedThirdPartyList property.
     * 
     * @return
     *     possible object is
     *     {@link SwThirdPartyList }
     *     
     */
    public SwThirdPartyList getCopiedThirdPartyList() {
        return copiedThirdPartyList;
    }

    /**
     * Sets the value of the copiedThirdPartyList property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwThirdPartyList }
     *     
     */
    public SwCopy setCopiedThirdPartyList(SwThirdPartyList value) {
        this.copiedThirdPartyList = value;
        return this;
    }

    /**
     * Gets the value of the skippedThirdPartyList property.
     * 
     * @return
     *     possible object is
     *     {@link SwThirdPartyList }
     *     
     */
    public SwThirdPartyList getSkippedThirdPartyList() {
        return skippedThirdPartyList;
    }

    /**
     * Sets the value of the skippedThirdPartyList property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwThirdPartyList }
     *     
     */
    public SwCopy setSkippedThirdPartyList(SwThirdPartyList value) {
        this.skippedThirdPartyList = value;
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
