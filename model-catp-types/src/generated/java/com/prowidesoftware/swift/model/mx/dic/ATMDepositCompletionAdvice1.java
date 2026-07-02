
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Information related to the completion of a deposit transaction on the ATM.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ATMDepositCompletionAdvice1", propOrder = {
    "envt",
    "cntxt",
    "tx"
})
public class ATMDepositCompletionAdvice1 {

    @XmlElement(name = "Envt", required = true)
    protected ATMEnvironment13 envt;
    @XmlElement(name = "Cntxt", required = true)
    protected ATMContext12 cntxt;
    @XmlElement(name = "Tx", required = true)
    protected ATMTransaction19 tx;

    /**
     * Gets the value of the envt property.
     * 
     * @return
     *     possible object is
     *     {@link ATMEnvironment13 }
     *     
     */
    public ATMEnvironment13 getEnvt() {
        return envt;
    }

    /**
     * Sets the value of the envt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ATMEnvironment13 }
     *     
     */
    public ATMDepositCompletionAdvice1 setEnvt(ATMEnvironment13 value) {
        this.envt = value;
        return this;
    }

    /**
     * Gets the value of the cntxt property.
     * 
     * @return
     *     possible object is
     *     {@link ATMContext12 }
     *     
     */
    public ATMContext12 getCntxt() {
        return cntxt;
    }

    /**
     * Sets the value of the cntxt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ATMContext12 }
     *     
     */
    public ATMDepositCompletionAdvice1 setCntxt(ATMContext12 value) {
        this.cntxt = value;
        return this;
    }

    /**
     * Gets the value of the tx property.
     * 
     * @return
     *     possible object is
     *     {@link ATMTransaction19 }
     *     
     */
    public ATMTransaction19 getTx() {
        return tx;
    }

    /**
     * Sets the value of the tx property.
     * 
     * @param value
     *     allowed object is
     *     {@link ATMTransaction19 }
     *     
     */
    public ATMDepositCompletionAdvice1 setTx(ATMTransaction19 value) {
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
