
package com.prowidesoftware.swift.model.mx.dic;

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
 * Specific parameters attached to an ATM command.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ATMCommandParameters1Choice", propOrder = {
    "atmReqrdGblSts",
    "xpctdMsgFctn",
    "reqrdCfgtnParam"
})
public class ATMCommandParameters1Choice {

    @XmlElement(name = "ATMReqrdGblSts")
    @XmlSchemaType(name = "string")
    protected ATMStatus1Code atmReqrdGblSts;
    @XmlElement(name = "XpctdMsgFctn")
    @XmlSchemaType(name = "string")
    protected MessageFunction8Code xpctdMsgFctn;
    @XmlElement(name = "ReqrdCfgtnParam")
    protected ATMConfigurationParameter1 reqrdCfgtnParam;

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
    public ATMCommandParameters1Choice setATMReqrdGblSts(ATMStatus1Code value) {
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
    public ATMCommandParameters1Choice setXpctdMsgFctn(MessageFunction8Code value) {
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
    public ATMCommandParameters1Choice setReqrdCfgtnParam(ATMConfigurationParameter1 value) {
        this.reqrdCfgtnParam = value;
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
