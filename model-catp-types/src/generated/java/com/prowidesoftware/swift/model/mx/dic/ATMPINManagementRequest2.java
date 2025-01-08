
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
 * Information related to the request of a PIN management from an ATM.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ATMPINManagementRequest2", propOrder = {
    "envt",
    "cntxt",
    "tx"
})
public class ATMPINManagementRequest2 {

    @XmlElement(name = "Envt", required = true)
    protected ATMEnvironment11 envt;
    @XmlElement(name = "Cntxt", required = true)
    protected ATMContext16 cntxt;
    @XmlElement(name = "Tx", required = true)
    protected ATMTransaction9 tx;

    /**
     * Gets the value of the envt property.
     * 
     * @return
     *     possible object is
     *     {@link ATMEnvironment11 }
     *     
     */
    public ATMEnvironment11 getEnvt() {
        return envt;
    }

    /**
     * Sets the value of the envt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ATMEnvironment11 }
     *     
     */
    public ATMPINManagementRequest2 setEnvt(ATMEnvironment11 value) {
        this.envt = value;
        return this;
    }

    /**
     * Gets the value of the cntxt property.
     * 
     * @return
     *     possible object is
     *     {@link ATMContext16 }
     *     
     */
    public ATMContext16 getCntxt() {
        return cntxt;
    }

    /**
     * Sets the value of the cntxt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ATMContext16 }
     *     
     */
    public ATMPINManagementRequest2 setCntxt(ATMContext16 value) {
        this.cntxt = value;
        return this;
    }

    /**
     * Gets the value of the tx property.
     * 
     * @return
     *     possible object is
     *     {@link ATMTransaction9 }
     *     
     */
    public ATMTransaction9 getTx() {
        return tx;
    }

    /**
     * Sets the value of the tx property.
     * 
     * @param value
     *     allowed object is
     *     {@link ATMTransaction9 }
     *     
     */
    public ATMPINManagementRequest2 setTx(ATMTransaction9 value) {
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
