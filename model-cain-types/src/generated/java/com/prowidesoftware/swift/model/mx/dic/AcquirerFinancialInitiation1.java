
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
 * Information related to financial authorisation.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AcquirerFinancialInitiation1", propOrder = {
    "envt",
    "cntxt",
    "tx"
})
public class AcquirerFinancialInitiation1 {

    @XmlElement(name = "Envt", required = true)
    protected CardTransactionEnvironment1 envt;
    @XmlElement(name = "Cntxt", required = true)
    protected CardTransactionContext1 cntxt;
    @XmlElement(name = "Tx", required = true)
    protected CardTransaction5 tx;

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
    public AcquirerFinancialInitiation1 setEnvt(CardTransactionEnvironment1 value) {
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
    public AcquirerFinancialInitiation1 setCntxt(CardTransactionContext1 value) {
        this.cntxt = value;
        return this;
    }

    /**
     * Gets the value of the tx property.
     * 
     * @return
     *     possible object is
     *     {@link CardTransaction5 }
     *     
     */
    public CardTransaction5 getTx() {
        return tx;
    }

    /**
     * Sets the value of the tx property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardTransaction5 }
     *     
     */
    public AcquirerFinancialInitiation1 setTx(CardTransaction5 value) {
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
