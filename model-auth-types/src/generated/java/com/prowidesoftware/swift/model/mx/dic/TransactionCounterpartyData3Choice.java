
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
 * Transaction related data of the counterparty.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransactionCounterpartyData3Choice", propOrder = {
    "rpTrad",
    "buySellBck",
    "sctiesLndg"
})
public class TransactionCounterpartyData3Choice {

    @XmlElement(name = "RpTrad")
    protected TransactionCounterpartyData7 rpTrad;
    @XmlElement(name = "BuySellBck")
    protected TransactionCounterpartyData7 buySellBck;
    @XmlElement(name = "SctiesLndg")
    protected TransactionCounterpartyData7 sctiesLndg;

    /**
     * Gets the value of the rpTrad property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionCounterpartyData7 }
     *     
     */
    public TransactionCounterpartyData7 getRpTrad() {
        return rpTrad;
    }

    /**
     * Sets the value of the rpTrad property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionCounterpartyData7 }
     *     
     */
    public TransactionCounterpartyData3Choice setRpTrad(TransactionCounterpartyData7 value) {
        this.rpTrad = value;
        return this;
    }

    /**
     * Gets the value of the buySellBck property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionCounterpartyData7 }
     *     
     */
    public TransactionCounterpartyData7 getBuySellBck() {
        return buySellBck;
    }

    /**
     * Sets the value of the buySellBck property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionCounterpartyData7 }
     *     
     */
    public TransactionCounterpartyData3Choice setBuySellBck(TransactionCounterpartyData7 value) {
        this.buySellBck = value;
        return this;
    }

    /**
     * Gets the value of the sctiesLndg property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionCounterpartyData7 }
     *     
     */
    public TransactionCounterpartyData7 getSctiesLndg() {
        return sctiesLndg;
    }

    /**
     * Sets the value of the sctiesLndg property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionCounterpartyData7 }
     *     
     */
    public TransactionCounterpartyData3Choice setSctiesLndg(TransactionCounterpartyData7 value) {
        this.sctiesLndg = value;
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
