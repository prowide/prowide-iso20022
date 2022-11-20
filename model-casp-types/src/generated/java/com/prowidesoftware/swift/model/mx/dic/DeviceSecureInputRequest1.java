
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
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
@XmlType(name = "DeviceSecureInputRequest1", propOrder = {
    "pinReqTp",
    "pinVrfctnMtd",
    "maxWtgTm",
    "beepKeyFlg",
    "crdhldrPIN"
})
public class DeviceSecureInputRequest1 {

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
    protected OnLinePIN6 crdhldrPIN;

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
    public DeviceSecureInputRequest1 setPINReqTp(PINRequestType1Code value) {
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
    public DeviceSecureInputRequest1 setPINVrfctnMtd(String value) {
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
    public DeviceSecureInputRequest1 setMaxWtgTm(BigDecimal value) {
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
    public DeviceSecureInputRequest1 setBeepKeyFlg(Boolean value) {
        this.beepKeyFlg = value;
        return this;
    }

    /**
     * Gets the value of the crdhldrPIN property.
     * 
     * @return
     *     possible object is
     *     {@link OnLinePIN6 }
     *     
     */
    public OnLinePIN6 getCrdhldrPIN() {
        return crdhldrPIN;
    }

    /**
     * Sets the value of the crdhldrPIN property.
     * 
     * @param value
     *     allowed object is
     *     {@link OnLinePIN6 }
     *     
     */
    public DeviceSecureInputRequest1 setCrdhldrPIN(OnLinePIN6 value) {
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
