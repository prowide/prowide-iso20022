
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
@XmlType(name = "ATMPINManagementRequest1", propOrder = {
    "envt",
    "cntxt",
    "tx"
})
public class ATMPINManagementRequest1 {

    @XmlElement(name = "Envt", required = true)
    protected ATMEnvironment1 envt;
    @XmlElement(name = "Cntxt", required = true)
    protected ATMContext7 cntxt;
    @XmlElement(name = "Tx", required = true)
    protected ATMTransaction9 tx;

    /**
     * Gets the value of the envt property.
     * 
     * @return
     *     possible object is
     *     {@link ATMEnvironment1 }
     *     
     */
    public ATMEnvironment1 getEnvt() {
        return envt;
    }

    /**
     * Sets the value of the envt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ATMEnvironment1 }
     *     
     */
    public ATMPINManagementRequest1 setEnvt(ATMEnvironment1 value) {
        this.envt = value;
        return this;
    }

    /**
     * Gets the value of the cntxt property.
     * 
     * @return
     *     possible object is
     *     {@link ATMContext7 }
     *     
     */
    public ATMContext7 getCntxt() {
        return cntxt;
    }

    /**
     * Sets the value of the cntxt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ATMContext7 }
     *     
     */
    public ATMPINManagementRequest1 setCntxt(ATMContext7 value) {
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
    public ATMPINManagementRequest1 setTx(ATMTransaction9 value) {
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
