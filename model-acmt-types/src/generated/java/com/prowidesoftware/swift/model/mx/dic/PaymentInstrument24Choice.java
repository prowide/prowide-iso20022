
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
 * Choice of payment instruments.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentInstrument24Choice", propOrder = {
    "pmtCardDtls",
    "drctDbtDtls",
    "chq",
    "bkrsDrft"
})
public class PaymentInstrument24Choice {

    @XmlElement(name = "PmtCardDtls")
    protected PaymentCard29 pmtCardDtls;
    @XmlElement(name = "DrctDbtDtls")
    protected DirectDebitMandate7 drctDbtDtls;
    @XmlElement(name = "Chq")
    protected Boolean chq;
    @XmlElement(name = "BkrsDrft")
    protected Boolean bkrsDrft;

    /**
     * Gets the value of the pmtCardDtls property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentCard29 }
     *     
     */
    public PaymentCard29 getPmtCardDtls() {
        return pmtCardDtls;
    }

    /**
     * Sets the value of the pmtCardDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentCard29 }
     *     
     */
    public PaymentInstrument24Choice setPmtCardDtls(PaymentCard29 value) {
        this.pmtCardDtls = value;
        return this;
    }

    /**
     * Gets the value of the drctDbtDtls property.
     * 
     * @return
     *     possible object is
     *     {@link DirectDebitMandate7 }
     *     
     */
    public DirectDebitMandate7 getDrctDbtDtls() {
        return drctDbtDtls;
    }

    /**
     * Sets the value of the drctDbtDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link DirectDebitMandate7 }
     *     
     */
    public PaymentInstrument24Choice setDrctDbtDtls(DirectDebitMandate7 value) {
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
    public PaymentInstrument24Choice setChq(Boolean value) {
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
    public PaymentInstrument24Choice setBkrsDrft(Boolean value) {
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
