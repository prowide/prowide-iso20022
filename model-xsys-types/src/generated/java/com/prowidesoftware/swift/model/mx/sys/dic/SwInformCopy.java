
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
 * Java class for InformCopy complex type.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InformCopy", propOrder = {
    "informCopyName",
    "informCopyType",
    "informCopyState",
    "copySnFRef",
    "origSnFRef",
    "recipientDN",
    "thirdPartyToReceiverInformation"
})
public class SwInformCopy {

    @XmlElement(name = "InformCopyName", required = true)
    protected String informCopyName;
    @XmlElement(name = "InformCopyType")
    protected String informCopyType;
    @XmlElement(name = "InformCopyState")
    protected String informCopyState;
    @XmlElement(name = "CopySnFRef")
    protected String copySnFRef;
    @XmlElement(name = "OrigSnFRef")
    protected String origSnFRef;
    @XmlElement(name = "RecipientDN")
    protected String recipientDN;
    @XmlElement(name = "ThirdPartyToReceiverInformation")
    protected SwAny thirdPartyToReceiverInformation;

    /**
     * Gets the value of the informCopyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInformCopyName() {
        return informCopyName;
    }

    /**
     * Sets the value of the informCopyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwInformCopy setInformCopyName(String value) {
        this.informCopyName = value;
        return this;
    }

    /**
     * Gets the value of the informCopyType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInformCopyType() {
        return informCopyType;
    }

    /**
     * Sets the value of the informCopyType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwInformCopy setInformCopyType(String value) {
        this.informCopyType = value;
        return this;
    }

    /**
     * Gets the value of the informCopyState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInformCopyState() {
        return informCopyState;
    }

    /**
     * Sets the value of the informCopyState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwInformCopy setInformCopyState(String value) {
        this.informCopyState = value;
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
    public SwInformCopy setCopySnFRef(String value) {
        this.copySnFRef = value;
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
    public SwInformCopy setOrigSnFRef(String value) {
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
    public SwInformCopy setRecipientDN(String value) {
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
    public SwInformCopy setThirdPartyToReceiverInformation(SwAny value) {
        this.thirdPartyToReceiverInformation = value;
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
