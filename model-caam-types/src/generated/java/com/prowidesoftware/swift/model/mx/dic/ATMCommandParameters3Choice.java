
package com.prowidesoftware.swift.model.mx.dic;

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
 * Specific parameters attached to an ATM command.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ATMCommandParameters3Choice", propOrder = {
    "atmReqrdGblSts",
    "xpctdMsgFctn",
    "reqrdCfgtnParam",
    "reqrdSctySchme",
    "sctyDvc",
    "key"
})
public class ATMCommandParameters3Choice {

    @XmlElement(name = "ATMReqrdGblSts")
    @XmlSchemaType(name = "string")
    protected ATMStatus1Code atmReqrdGblSts;
    @XmlElement(name = "XpctdMsgFctn")
    @XmlSchemaType(name = "string")
    protected MessageFunction8Code xpctdMsgFctn;
    @XmlElement(name = "ReqrdCfgtnParam")
    protected ATMConfigurationParameter1 reqrdCfgtnParam;
    @XmlElement(name = "ReqrdSctySchme")
    @XmlSchemaType(name = "string")
    protected ATMSecurityScheme4Code reqrdSctySchme;
    @XmlElement(name = "SctyDvc")
    protected ATMCommandParameters1 sctyDvc;
    @XmlElement(name = "Key")
    protected ATMConfigurationParameter2 key;

    /**
     * Gets the value of the atmReqrdGblSts property.
     * 
     * @return
     *     possible object is
     *     {@link ATMStatus1Code }
     *     
     */
    public ATMStatus1Code getATMReqrdGblSts() {
        return atmReqrdGblSts;
    }

    /**
     * Sets the value of the atmReqrdGblSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link ATMStatus1Code }
     *     
     */
    public ATMCommandParameters3Choice setATMReqrdGblSts(ATMStatus1Code value) {
        this.atmReqrdGblSts = value;
        return this;
    }

    /**
     * Gets the value of the xpctdMsgFctn property.
     * 
     * @return
     *     possible object is
     *     {@link MessageFunction8Code }
     *     
     */
    public MessageFunction8Code getXpctdMsgFctn() {
        return xpctdMsgFctn;
    }

    /**
     * Sets the value of the xpctdMsgFctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageFunction8Code }
     *     
     */
    public ATMCommandParameters3Choice setXpctdMsgFctn(MessageFunction8Code value) {
        this.xpctdMsgFctn = value;
        return this;
    }

    /**
     * Gets the value of the reqrdCfgtnParam property.
     * 
     * @return
     *     possible object is
     *     {@link ATMConfigurationParameter1 }
     *     
     */
    public ATMConfigurationParameter1 getReqrdCfgtnParam() {
        return reqrdCfgtnParam;
    }

    /**
     * Sets the value of the reqrdCfgtnParam property.
     * 
     * @param value
     *     allowed object is
     *     {@link ATMConfigurationParameter1 }
     *     
     */
    public ATMCommandParameters3Choice setReqrdCfgtnParam(ATMConfigurationParameter1 value) {
        this.reqrdCfgtnParam = value;
        return this;
    }

    /**
     * Gets the value of the reqrdSctySchme property.
     * 
     * @return
     *     possible object is
     *     {@link ATMSecurityScheme4Code }
     *     
     */
    public ATMSecurityScheme4Code getReqrdSctySchme() {
        return reqrdSctySchme;
    }

    /**
     * Sets the value of the reqrdSctySchme property.
     * 
     * @param value
     *     allowed object is
     *     {@link ATMSecurityScheme4Code }
     *     
     */
    public ATMCommandParameters3Choice setReqrdSctySchme(ATMSecurityScheme4Code value) {
        this.reqrdSctySchme = value;
        return this;
    }

    /**
     * Gets the value of the sctyDvc property.
     * 
     * @return
     *     possible object is
     *     {@link ATMCommandParameters1 }
     *     
     */
    public ATMCommandParameters1 getSctyDvc() {
        return sctyDvc;
    }

    /**
     * Sets the value of the sctyDvc property.
     * 
     * @param value
     *     allowed object is
     *     {@link ATMCommandParameters1 }
     *     
     */
    public ATMCommandParameters3Choice setSctyDvc(ATMCommandParameters1 value) {
        this.sctyDvc = value;
        return this;
    }

    /**
     * Gets the value of the key property.
     * 
     * @return
     *     possible object is
     *     {@link ATMConfigurationParameter2 }
     *     
     */
    public ATMConfigurationParameter2 getKey() {
        return key;
    }

    /**
     * Sets the value of the key property.
     * 
     * @param value
     *     allowed object is
     *     {@link ATMConfigurationParameter2 }
     *     
     */
    public ATMCommandParameters3Choice setKey(ATMConfigurationParameter2 value) {
        this.key = value;
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
