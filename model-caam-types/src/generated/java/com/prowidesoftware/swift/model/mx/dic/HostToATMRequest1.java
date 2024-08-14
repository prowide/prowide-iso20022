
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
 * Information related to the request to an ATM to contact the ATM manager.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostToATMRequest1", propOrder = {
    "envt",
    "cmdId",
    "xpctdMsgFctn"
})
public class HostToATMRequest1 {

    @XmlElement(name = "Envt", required = true)
    protected ATMEnvironment9 envt;
    @XmlElement(name = "CmdId")
    protected ATMCommandIdentification1 cmdId;
    @XmlElement(name = "XpctdMsgFctn", required = true)
    @XmlSchemaType(name = "string")
    protected MessageFunction8Code xpctdMsgFctn;

    /**
     * Gets the value of the envt property.
     * 
     * @return
     *     possible object is
     *     {@link ATMEnvironment9 }
     *     
     */
    public ATMEnvironment9 getEnvt() {
        return envt;
    }

    /**
     * Sets the value of the envt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ATMEnvironment9 }
     *     
     */
    public HostToATMRequest1 setEnvt(ATMEnvironment9 value) {
        this.envt = value;
        return this;
    }

    /**
     * Gets the value of the cmdId property.
     * 
     * @return
     *     possible object is
     *     {@link ATMCommandIdentification1 }
     *     
     */
    public ATMCommandIdentification1 getCmdId() {
        return cmdId;
    }

    /**
     * Sets the value of the cmdId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ATMCommandIdentification1 }
     *     
     */
    public HostToATMRequest1 setCmdId(ATMCommandIdentification1 value) {
        this.cmdId = value;
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
    public HostToATMRequest1 setXpctdMsgFctn(MessageFunction8Code value) {
        this.xpctdMsgFctn = value;
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
