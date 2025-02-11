
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
 * Information related to the response of an ATM PIN Management from an ATM manager.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ATMPINManagementResponse1", propOrder = {
    "envt",
    "cntxt",
    "tx"
})
public class ATMPINManagementResponse1 {

    @XmlElement(name = "Envt", required = true)
    protected ATMEnvironment2 envt;
    @XmlElement(name = "Cntxt", required = true)
    protected ATMContext4 cntxt;
    @XmlElement(name = "Tx", required = true)
    protected ATMTransaction10 tx;

    /**
     * Gets the value of the envt property.
     * 
     * @return
     *     possible object is
     *     {@link ATMEnvironment2 }
     *     
     */
    public ATMEnvironment2 getEnvt() {
        return envt;
    }

    /**
     * Sets the value of the envt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ATMEnvironment2 }
     *     
     */
    public ATMPINManagementResponse1 setEnvt(ATMEnvironment2 value) {
        this.envt = value;
        return this;
    }

    /**
     * Gets the value of the cntxt property.
     * 
     * @return
     *     possible object is
     *     {@link ATMContext4 }
     *     
     */
    public ATMContext4 getCntxt() {
        return cntxt;
    }

    /**
     * Sets the value of the cntxt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ATMContext4 }
     *     
     */
    public ATMPINManagementResponse1 setCntxt(ATMContext4 value) {
        this.cntxt = value;
        return this;
    }

    /**
     * Gets the value of the tx property.
     * 
     * @return
     *     possible object is
     *     {@link ATMTransaction10 }
     *     
     */
    public ATMTransaction10 getTx() {
        return tx;
    }

    /**
     * Sets the value of the tx property.
     * 
     * @param value
     *     allowed object is
     *     {@link ATMTransaction10 }
     *     
     */
    public ATMPINManagementResponse1 setTx(ATMTransaction10 value) {
        this.tx = value;
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
