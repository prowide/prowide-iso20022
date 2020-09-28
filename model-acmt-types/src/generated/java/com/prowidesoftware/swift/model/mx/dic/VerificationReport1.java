
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
 * Set of elements used  to provide information concerning the verification of identification data for which verification was requested.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VerificationReport1", propOrder = {
    "orgnlId",
    "vrfctn",
    "rsn",
    "orgnlPtyAndAcctId",
    "updtdPtyAndAcctId"
})
public class VerificationReport1 {

    @XmlElement(name = "OrgnlId", required = true)
    protected String orgnlId;
    @XmlElement(name = "Vrfctn")
    protected boolean vrfctn;
    @XmlElement(name = "Rsn")
    protected VerificationReason1Choice rsn;
    @XmlElement(name = "OrgnlPtyAndAcctId")
    protected IdentificationInformation1 orgnlPtyAndAcctId;
    @XmlElement(name = "UpdtdPtyAndAcctId")
    protected IdentificationInformation1 updtdPtyAndAcctId;

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
    public VerificationReport1 setOrgnlId(String value) {
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
    public VerificationReport1 setVrfctn(boolean value) {
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
    public VerificationReport1 setRsn(VerificationReason1Choice value) {
        this.rsn = value;
        return this;
    }

    /**
     * Gets the value of the orgnlPtyAndAcctId property.
     * 
     * @return
     *     possible object is
     *     {@link IdentificationInformation1 }
     *     
     */
    public IdentificationInformation1 getOrgnlPtyAndAcctId() {
        return orgnlPtyAndAcctId;
    }

    /**
     * Sets the value of the orgnlPtyAndAcctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentificationInformation1 }
     *     
     */
    public VerificationReport1 setOrgnlPtyAndAcctId(IdentificationInformation1 value) {
        this.orgnlPtyAndAcctId = value;
        return this;
    }

    /**
     * Gets the value of the updtdPtyAndAcctId property.
     * 
     * @return
     *     possible object is
     *     {@link IdentificationInformation1 }
     *     
     */
    public IdentificationInformation1 getUpdtdPtyAndAcctId() {
        return updtdPtyAndAcctId;
    }

    /**
     * Sets the value of the updtdPtyAndAcctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentificationInformation1 }
     *     
     */
    public VerificationReport1 setUpdtdPtyAndAcctId(IdentificationInformation1 value) {
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
