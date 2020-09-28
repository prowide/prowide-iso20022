
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
 * Provides the details of the reported transaction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransactionLoanData4Choice", propOrder = {
    "rpTrad",
    "buySellBck",
    "sctiesLndg",
    "mrgnLndg"
})
public class TransactionLoanData4Choice {

    @XmlElement(name = "RpTrad")
    protected LoanData29 rpTrad;
    @XmlElement(name = "BuySellBck")
    protected LoanData29 buySellBck;
    @XmlElement(name = "SctiesLndg")
    protected LoanData29 sctiesLndg;
    @XmlElement(name = "MrgnLndg")
    protected LoanData13 mrgnLndg;

    /**
     * Gets the value of the rpTrad property.
     * 
     * @return
     *     possible object is
     *     {@link LoanData29 }
     *     
     */
    public LoanData29 getRpTrad() {
        return rpTrad;
    }

    /**
     * Sets the value of the rpTrad property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoanData29 }
     *     
     */
    public TransactionLoanData4Choice setRpTrad(LoanData29 value) {
        this.rpTrad = value;
        return this;
    }

    /**
     * Gets the value of the buySellBck property.
     * 
     * @return
     *     possible object is
     *     {@link LoanData29 }
     *     
     */
    public LoanData29 getBuySellBck() {
        return buySellBck;
    }

    /**
     * Sets the value of the buySellBck property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoanData29 }
     *     
     */
    public TransactionLoanData4Choice setBuySellBck(LoanData29 value) {
        this.buySellBck = value;
        return this;
    }

    /**
     * Gets the value of the sctiesLndg property.
     * 
     * @return
     *     possible object is
     *     {@link LoanData29 }
     *     
     */
    public LoanData29 getSctiesLndg() {
        return sctiesLndg;
    }

    /**
     * Sets the value of the sctiesLndg property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoanData29 }
     *     
     */
    public TransactionLoanData4Choice setSctiesLndg(LoanData29 value) {
        this.sctiesLndg = value;
        return this;
    }

    /**
     * Gets the value of the mrgnLndg property.
     * 
     * @return
     *     possible object is
     *     {@link LoanData13 }
     *     
     */
    public LoanData13 getMrgnLndg() {
        return mrgnLndg;
    }

    /**
     * Sets the value of the mrgnLndg property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoanData13 }
     *     
     */
    public TransactionLoanData4Choice setMrgnLndg(LoanData13 value) {
        this.mrgnLndg = value;
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
