
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Provides the details of the verification of identification data for which verification was requested.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VerificationReport4", propOrder = {
    "orgnlId",
    "vrfctn",
    "rsn",
    "orgnlPtyAndAcctId",
    "updtdPtyAndAcctId"
})
public class VerificationReport4 {

    @XmlElement(name = "OrgnlId", required = true)
    protected String orgnlId;
    @XmlElement(name = "Vrfctn")
    protected boolean vrfctn;
    @XmlElement(name = "Rsn")
    protected VerificationReason1Choice rsn;
    @XmlElement(name = "OrgnlPtyAndAcctId")
    protected IdentificationInformation4 orgnlPtyAndAcctId;
    @XmlElement(name = "UpdtdPtyAndAcctId")
    protected IdentificationInformation4 updtdPtyAndAcctId;

    /**
     * Gets the value of the orgnlId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgnlId() {
        return orgnlId;
    }

    /**
     * Sets the value of the orgnlId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public VerificationReport4 setOrgnlId(String value) {
        this.orgnlId = value;
        return this;
    }

    /**
     * Gets the value of the vrfctn property.
     * 
     */
    public boolean isVrfctn() {
        return vrfctn;
    }

    /**
     * Sets the value of the vrfctn property.
     * 
     */
    public VerificationReport4 setVrfctn(boolean value) {
        this.vrfctn = value;
        return this;
    }

    /**
     * Gets the value of the rsn property.
     * 
     * @return
     *     possible object is
     *     {@link VerificationReason1Choice }
     *     
     */
    public VerificationReason1Choice getRsn() {
        return rsn;
    }

    /**
     * Sets the value of the rsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link VerificationReason1Choice }
     *     
     */
    public VerificationReport4 setRsn(VerificationReason1Choice value) {
        this.rsn = value;
        return this;
    }

    /**
     * Gets the value of the orgnlPtyAndAcctId property.
     * 
     * @return
     *     possible object is
     *     {@link IdentificationInformation4 }
     *     
     */
    public IdentificationInformation4 getOrgnlPtyAndAcctId() {
        return orgnlPtyAndAcctId;
    }

    /**
     * Sets the value of the orgnlPtyAndAcctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentificationInformation4 }
     *     
     */
    public VerificationReport4 setOrgnlPtyAndAcctId(IdentificationInformation4 value) {
        this.orgnlPtyAndAcctId = value;
        return this;
    }

    /**
     * Gets the value of the updtdPtyAndAcctId property.
     * 
     * @return
     *     possible object is
     *     {@link IdentificationInformation4 }
     *     
     */
    public IdentificationInformation4 getUpdtdPtyAndAcctId() {
        return updtdPtyAndAcctId;
    }

    /**
     * Sets the value of the updtdPtyAndAcctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentificationInformation4 }
     *     
     */
    public VerificationReport4 setUpdtdPtyAndAcctId(IdentificationInformation4 value) {
        this.updtdPtyAndAcctId = value;
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
