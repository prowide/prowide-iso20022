
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
 * Choice of payment instruments.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentInstrument18Choice", propOrder = {
    "pmtCardDtls",
    "drctDbtDtls",
    "chq",
    "bkrsDrft"
})
public class PaymentInstrument18Choice {

    @XmlElement(name = "PmtCardDtls")
    protected PaymentCard18 pmtCardDtls;
    @XmlElement(name = "DrctDbtDtls")
    protected DirectDebitMandate5 drctDbtDtls;
    @XmlElement(name = "Chq")
    protected Boolean chq;
    @XmlElement(name = "BkrsDrft")
    protected Boolean bkrsDrft;

    /**
     * Gets the value of the pmtCardDtls property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentCard18 }
     *     
     */
    public PaymentCard18 getPmtCardDtls() {
        return pmtCardDtls;
    }

    /**
     * Sets the value of the pmtCardDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentCard18 }
     *     
     */
    public PaymentInstrument18Choice setPmtCardDtls(PaymentCard18 value) {
        this.pmtCardDtls = value;
        return this;
    }

    /**
     * Gets the value of the drctDbtDtls property.
     * 
     * @return
     *     possible object is
     *     {@link DirectDebitMandate5 }
     *     
     */
    public DirectDebitMandate5 getDrctDbtDtls() {
        return drctDbtDtls;
    }

    /**
     * Sets the value of the drctDbtDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link DirectDebitMandate5 }
     *     
     */
    public PaymentInstrument18Choice setDrctDbtDtls(DirectDebitMandate5 value) {
        this.drctDbtDtls = value;
        return this;
    }

    /**
     * Gets the value of the chq property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isChq() {
        return chq;
    }

    /**
     * Sets the value of the chq property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public PaymentInstrument18Choice setChq(Boolean value) {
        this.chq = value;
        return this;
    }

    /**
     * Gets the value of the bkrsDrft property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBkrsDrft() {
        return bkrsDrft;
    }

    /**
     * Sets the value of the bkrsDrft property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public PaymentInstrument18Choice setBkrsDrft(Boolean value) {
        this.bkrsDrft = value;
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
