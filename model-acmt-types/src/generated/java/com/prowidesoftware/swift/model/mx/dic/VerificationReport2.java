
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
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
@XmlType(name = "VerificationReport2", propOrder = {
    "orgnlId",
    "vrfctn",
    "rsn",
    "orgnlPtyAndAcctId",
    "updtdPtyAndAcctId"
})
public class VerificationReport2 {

    @XmlElement(name = "OrgnlId", required = true)
    protected String orgnlId;
    @XmlElement(name = "Vrfctn")
    protected boolean vrfctn;
    @XmlElement(name = "Rsn")
    protected VerificationReason1Choice rsn;
    @XmlElement(name = "OrgnlPtyAndAcctId")
    protected IdentificationInformation2 orgnlPtyAndAcctId;
    @XmlElement(name = "UpdtdPtyAndAcctId")
    protected IdentificationInformation2 updtdPtyAndAcctId;

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
    public VerificationReport2 setOrgnlId(String value) {
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
    public VerificationReport2 setVrfctn(boolean value) {
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
    public VerificationReport2 setRsn(VerificationReason1Choice value) {
        this.rsn = value;
        return this;
    }

    /**
     * Gets the value of the orgnlPtyAndAcctId property.
     * 
     * @return
     *     possible object is
     *     {@link IdentificationInformation2 }
     *     
     */
    public IdentificationInformation2 getOrgnlPtyAndAcctId() {
        return orgnlPtyAndAcctId;
    }

    /**
     * Sets the value of the orgnlPtyAndAcctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentificationInformation2 }
     *     
     */
    public VerificationReport2 setOrgnlPtyAndAcctId(IdentificationInformation2 value) {
        this.orgnlPtyAndAcctId = value;
        return this;
    }

    /**
     * Gets the value of the updtdPtyAndAcctId property.
     * 
     * @return
     *     possible object is
     *     {@link IdentificationInformation2 }
     *     
     */
    public IdentificationInformation2 getUpdtdPtyAndAcctId() {
        return updtdPtyAndAcctId;
    }

    /**
     * Sets the value of the updtdPtyAndAcctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentificationInformation2 }
     *     
     */
    public VerificationReport2 setUpdtdPtyAndAcctId(IdentificationInformation2 value) {
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
