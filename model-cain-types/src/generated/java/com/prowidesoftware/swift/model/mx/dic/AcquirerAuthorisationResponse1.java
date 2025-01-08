
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
 * Information related to the response of an authorisation.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AcquirerAuthorisationResponse1", propOrder = {
    "envt",
    "cntxt",
    "tx"
})
public class AcquirerAuthorisationResponse1 {

    @XmlElement(name = "Envt", required = true)
    protected CardTransactionEnvironment2 envt;
    @XmlElement(name = "Cntxt")
    protected CardTransactionContext3 cntxt;
    @XmlElement(name = "Tx")
    protected CardTransaction4 tx;

    /**
     * Gets the value of the envt property.
     * 
     * @return
     *     possible object is
     *     {@link CardTransactionEnvironment2 }
     *     
     */
    public CardTransactionEnvironment2 getEnvt() {
        return envt;
    }

    /**
     * Sets the value of the envt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardTransactionEnvironment2 }
     *     
     */
    public AcquirerAuthorisationResponse1 setEnvt(CardTransactionEnvironment2 value) {
        this.envt = value;
        return this;
    }

    /**
     * Gets the value of the cntxt property.
     * 
     * @return
     *     possible object is
     *     {@link CardTransactionContext3 }
     *     
     */
    public CardTransactionContext3 getCntxt() {
        return cntxt;
    }

    /**
     * Sets the value of the cntxt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardTransactionContext3 }
     *     
     */
    public AcquirerAuthorisationResponse1 setCntxt(CardTransactionContext3 value) {
        this.cntxt = value;
        return this;
    }

    /**
     * Gets the value of the tx property.
     * 
     * @return
     *     possible object is
     *     {@link CardTransaction4 }
     *     
     */
    public CardTransaction4 getTx() {
        return tx;
    }

    /**
     * Sets the value of the tx property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardTransaction4 }
     *     
     */
    public AcquirerAuthorisationResponse1 setTx(CardTransaction4 value) {
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
