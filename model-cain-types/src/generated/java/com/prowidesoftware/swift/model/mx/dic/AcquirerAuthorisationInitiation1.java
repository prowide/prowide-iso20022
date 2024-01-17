
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
 * Information related to the authorisation initiation.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AcquirerAuthorisationInitiation1", propOrder = {
    "envt",
    "cntxt",
    "tx"
})
public class AcquirerAuthorisationInitiation1 {

    @XmlElement(name = "Envt", required = true)
    protected CardTransactionEnvironment1 envt;
    @XmlElement(name = "Cntxt", required = true)
    protected CardTransactionContext1 cntxt;
    @XmlElement(name = "Tx", required = true)
    protected CardTransaction15 tx;

    /**
     * Gets the value of the envt property.
     * 
     * @return
     *     possible object is
     *     {@link CardTransactionEnvironment1 }
     *     
     */
    public CardTransactionEnvironment1 getEnvt() {
        return envt;
    }

    /**
     * Sets the value of the envt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardTransactionEnvironment1 }
     *     
     */
    public AcquirerAuthorisationInitiation1 setEnvt(CardTransactionEnvironment1 value) {
        this.envt = value;
        return this;
    }

    /**
     * Gets the value of the cntxt property.
     * 
     * @return
     *     possible object is
     *     {@link CardTransactionContext1 }
     *     
     */
    public CardTransactionContext1 getCntxt() {
        return cntxt;
    }

    /**
     * Sets the value of the cntxt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardTransactionContext1 }
     *     
     */
    public AcquirerAuthorisationInitiation1 setCntxt(CardTransactionContext1 value) {
        this.cntxt = value;
        return this;
    }

    /**
     * Gets the value of the tx property.
     * 
     * @return
     *     possible object is
     *     {@link CardTransaction15 }
     *     
     */
    public CardTransaction15 getTx() {
        return tx;
    }

    /**
     * Sets the value of the tx property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardTransaction15 }
     *     
     */
    public AcquirerAuthorisationInitiation1 setTx(CardTransaction15 value) {
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
