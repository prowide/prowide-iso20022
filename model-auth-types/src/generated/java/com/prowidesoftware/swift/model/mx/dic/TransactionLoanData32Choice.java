
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
 * Provides the details of the reported transaction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransactionLoanData32Choice", propOrder = {
    "rpTrad",
    "buySellBck",
    "sctiesLndg"
})
public class TransactionLoanData32Choice {

    @XmlElement(name = "RpTrad")
    protected LoanData143 rpTrad;
    @XmlElement(name = "BuySellBck")
    protected LoanData144 buySellBck;
    @XmlElement(name = "SctiesLndg")
    protected LoanData145 sctiesLndg;

    /**
     * Gets the value of the rpTrad property.
     * 
     * @return
     *     possible object is
     *     {@link LoanData143 }
     *     
     */
    public LoanData143 getRpTrad() {
        return rpTrad;
    }

    /**
     * Sets the value of the rpTrad property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoanData143 }
     *     
     */
    public TransactionLoanData32Choice setRpTrad(LoanData143 value) {
        this.rpTrad = value;
        return this;
    }

    /**
     * Gets the value of the buySellBck property.
     * 
     * @return
     *     possible object is
     *     {@link LoanData144 }
     *     
     */
    public LoanData144 getBuySellBck() {
        return buySellBck;
    }

    /**
     * Sets the value of the buySellBck property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoanData144 }
     *     
     */
    public TransactionLoanData32Choice setBuySellBck(LoanData144 value) {
        this.buySellBck = value;
        return this;
    }

    /**
     * Gets the value of the sctiesLndg property.
     * 
     * @return
     *     possible object is
     *     {@link LoanData145 }
     *     
     */
    public LoanData145 getSctiesLndg() {
        return sctiesLndg;
    }

    /**
     * Sets the value of the sctiesLndg property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoanData145 }
     *     
     */
    public TransactionLoanData32Choice setSctiesLndg(LoanData145 value) {
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
