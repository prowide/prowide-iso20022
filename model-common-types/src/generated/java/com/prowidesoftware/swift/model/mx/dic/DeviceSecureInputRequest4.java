
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Request a secure input for a PIN.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeviceSecureInputRequest4", propOrder = {
    "pinReqTp",
    "pinVrfctnMtd",
    "maxWtgTm",
    "beepKeyFlg",
    "crdhldrPIN"
})
public class DeviceSecureInputRequest4 {

    @XmlElement(name = "PINReqTp", required = true)
    @XmlSchemaType(name = "string")
    protected PINRequestType1Code pinReqTp;
    @XmlElement(name = "PINVrfctnMtd")
    protected String pinVrfctnMtd;
    @XmlElement(name = "MaxWtgTm")
    protected BigDecimal maxWtgTm;
    @XmlElement(name = "BeepKeyFlg")
    protected Boolean beepKeyFlg;
    @XmlElement(name = "CrdhldrPIN")
    protected OnLinePIN9 crdhldrPIN;

    /**
     * Gets the value of the pinReqTp property.
     * 
     * @return
     *     possible object is
     *     {@link PINRequestType1Code }
     *     
     */
    public PINRequestType1Code getPINReqTp() {
        return pinReqTp;
    }

    /**
     * Sets the value of the pinReqTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link PINRequestType1Code }
     *     
     */
    public DeviceSecureInputRequest4 setPINReqTp(PINRequestType1Code value) {
        this.pinReqTp = value;
        return this;
    }

    /**
     * Gets the value of the pinVrfctnMtd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPINVrfctnMtd() {
        return pinVrfctnMtd;
    }

    /**
     * Sets the value of the pinVrfctnMtd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public DeviceSecureInputRequest4 setPINVrfctnMtd(String value) {
        this.pinVrfctnMtd = value;
        return this;
    }

    /**
     * Gets the value of the maxWtgTm property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaxWtgTm() {
        return maxWtgTm;
    }

    /**
     * Sets the value of the maxWtgTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public DeviceSecureInputRequest4 setMaxWtgTm(BigDecimal value) {
        this.maxWtgTm = value;
        return this;
    }

    /**
     * Gets the value of the beepKeyFlg property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBeepKeyFlg() {
        return beepKeyFlg;
    }

    /**
     * Sets the value of the beepKeyFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public DeviceSecureInputRequest4 setBeepKeyFlg(Boolean value) {
        this.beepKeyFlg = value;
        return this;
    }

    /**
     * Gets the value of the crdhldrPIN property.
     * 
     * @return
     *     possible object is
     *     {@link OnLinePIN9 }
     *     
     */
    public OnLinePIN9 getCrdhldrPIN() {
        return crdhldrPIN;
    }

    /**
     * Sets the value of the crdhldrPIN property.
     * 
     * @param value
     *     allowed object is
     *     {@link OnLinePIN9 }
     *     
     */
    public DeviceSecureInputRequest4 setCrdhldrPIN(OnLinePIN9 value) {
        this.crdhldrPIN = value;
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
