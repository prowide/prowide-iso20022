
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
 * Authorisation response from the acquirer.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AcceptorAuthorisationResponse1", propOrder = {
    "envt",
    "tx",
    "txRspn"
})
public class AcceptorAuthorisationResponse1 {

    @XmlElement(name = "Envt", required = true)
    protected CardPaymentEnvironment3 envt;
    @XmlElement(name = "Tx", required = true)
    protected CardPaymentTransaction2 tx;
    @XmlElement(name = "TxRspn", required = true)
    protected CardPaymentTransaction9 txRspn;

    /**
     * Gets the value of the envt property.
     * 
     * @return
     *     possible object is
     *     {@link CardPaymentEnvironment3 }
     *     
     */
    public CardPaymentEnvironment3 getEnvt() {
        return envt;
    }

    /**
     * Sets the value of the envt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardPaymentEnvironment3 }
     *     
     */
    public AcceptorAuthorisationResponse1 setEnvt(CardPaymentEnvironment3 value) {
        this.envt = value;
        return this;
    }

    /**
     * Gets the value of the tx property.
     * 
     * @return
     *     possible object is
     *     {@link CardPaymentTransaction2 }
     *     
     */
    public CardPaymentTransaction2 getTx() {
        return tx;
    }

    /**
     * Sets the value of the tx property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardPaymentTransaction2 }
     *     
     */
    public AcceptorAuthorisationResponse1 setTx(CardPaymentTransaction2 value) {
        this.tx = value;
        return this;
    }

    /**
     * Gets the value of the txRspn property.
     * 
     * @return
     *     possible object is
     *     {@link CardPaymentTransaction9 }
     *     
     */
    public CardPaymentTransaction9 getTxRspn() {
        return txRspn;
    }

    /**
     * Sets the value of the txRspn property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardPaymentTransaction9 }
     *     
     */
    public AcceptorAuthorisationResponse1 setTxRspn(CardPaymentTransaction9 value) {
        this.txRspn = value;
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
