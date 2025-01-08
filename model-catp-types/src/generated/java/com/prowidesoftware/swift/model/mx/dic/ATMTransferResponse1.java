
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
 * Information related to the response of an ATM transfer from an ATM manager.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ATMTransferResponse1", propOrder = {
    "envt",
    "cntxt",
    "tx"
})
public class ATMTransferResponse1 {

    @XmlElement(name = "Envt", required = true)
    protected ATMEnvironment12 envt;
    @XmlElement(name = "Cntxt", required = true)
    protected ATMContext19 cntxt;
    @XmlElement(name = "Tx", required = true)
    protected ATMTransaction24 tx;

    /**
     * Gets the value of the envt property.
     * 
     * @return
     *     possible object is
     *     {@link ATMEnvironment12 }
     *     
     */
    public ATMEnvironment12 getEnvt() {
        return envt;
    }

    /**
     * Sets the value of the envt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ATMEnvironment12 }
     *     
     */
    public ATMTransferResponse1 setEnvt(ATMEnvironment12 value) {
        this.envt = value;
        return this;
    }

    /**
     * Gets the value of the cntxt property.
     * 
     * @return
     *     possible object is
     *     {@link ATMContext19 }
     *     
     */
    public ATMContext19 getCntxt() {
        return cntxt;
    }

    /**
     * Sets the value of the cntxt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ATMContext19 }
     *     
     */
    public ATMTransferResponse1 setCntxt(ATMContext19 value) {
        this.cntxt = value;
        return this;
    }

    /**
     * Gets the value of the tx property.
     * 
     * @return
     *     possible object is
     *     {@link ATMTransaction24 }
     *     
     */
    public ATMTransaction24 getTx() {
        return tx;
    }

    /**
     * Sets the value of the tx property.
     * 
     * @param value
     *     allowed object is
     *     {@link ATMTransaction24 }
     *     
     */
    public ATMTransferResponse1 setTx(ATMTransaction24 value) {
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
