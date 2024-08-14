
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
 * Java class for GetFileDigestRequest complex type.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetFileDigestRequest", propOrder = {
    "physicalName",
    "transferEP",
    "digestAlgorithm",
    "transferEPVerifier"
})
public class SwGetFileDigestRequest {

    @XmlElement(name = "PhysicalName", required = true)
    protected String physicalName;
    @XmlElement(name = "TransferEP")
    protected String transferEP;
    @XmlElement(name = "DigestAlgorithm")
    protected String digestAlgorithm;
    @XmlElement(name = "TransferEPVerifier")
    protected String transferEPVerifier;

    /**
     * Gets the value of the physicalName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhysicalName() {
        return physicalName;
    }

    /**
     * Sets the value of the physicalName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwGetFileDigestRequest setPhysicalName(String value) {
        this.physicalName = value;
        return this;
    }

    /**
     * Gets the value of the transferEP property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransferEP() {
        return transferEP;
    }

    /**
     * Sets the value of the transferEP property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwGetFileDigestRequest setTransferEP(String value) {
        this.transferEP = value;
        return this;
    }

    /**
     * Gets the value of the digestAlgorithm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDigestAlgorithm() {
        return digestAlgorithm;
    }

    /**
     * Sets the value of the digestAlgorithm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwGetFileDigestRequest setDigestAlgorithm(String value) {
        this.digestAlgorithm = value;
        return this;
    }

    /**
     * Gets the value of the transferEPVerifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransferEPVerifier() {
        return transferEPVerifier;
    }

    /**
     * Sets the value of the transferEPVerifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwGetFileDigestRequest setTransferEPVerifier(String value) {
        this.transferEPVerifier = value;
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
