
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
 * Parameters to be used to update the configuration or the status security device.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ATMCommandParameters1", propOrder = {
    "srlNb",
    "reqrdCfgtn",
    "reqrdSts"
})
public class ATMCommandParameters1 {

    @XmlElement(name = "SrlNb")
    protected String srlNb;
    @XmlElement(name = "ReqrdCfgtn")
    protected ATMSecurityConfiguration1 reqrdCfgtn;
    @XmlElement(name = "ReqrdSts")
    @XmlSchemaType(name = "string")
    protected ATMStatus2Code reqrdSts;

    /**
     * Gets the value of the srlNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSrlNb() {
        return srlNb;
    }

    /**
     * Sets the value of the srlNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ATMCommandParameters1 setSrlNb(String value) {
        this.srlNb = value;
        return this;
    }

    /**
     * Gets the value of the reqrdCfgtn property.
     * 
     * @return
     *     possible object is
     *     {@link ATMSecurityConfiguration1 }
     *     
     */
    public ATMSecurityConfiguration1 getReqrdCfgtn() {
        return reqrdCfgtn;
    }

    /**
     * Sets the value of the reqrdCfgtn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ATMSecurityConfiguration1 }
     *     
     */
    public ATMCommandParameters1 setReqrdCfgtn(ATMSecurityConfiguration1 value) {
        this.reqrdCfgtn = value;
        return this;
    }

    /**
     * Gets the value of the reqrdSts property.
     * 
     * @return
     *     possible object is
     *     {@link ATMStatus2Code }
     *     
     */
    public ATMStatus2Code getReqrdSts() {
        return reqrdSts;
    }

    /**
     * Sets the value of the reqrdSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link ATMStatus2Code }
     *     
     */
    public ATMCommandParameters1 setReqrdSts(ATMStatus2Code value) {
        this.reqrdSts = value;
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
