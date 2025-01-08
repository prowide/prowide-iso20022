
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
 * Specifies the conditions for the execution of the payment.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentCondition2", propOrder = {
    "amtModAllwd",
    "earlyPmtAllwd",
    "delyPnlty",
    "imdtPmtRbt",
    "grntedPmtReqd"
})
public class PaymentCondition2 {

    @XmlElement(name = "AmtModAllwd")
    protected Boolean amtModAllwd;
    @XmlElement(name = "EarlyPmtAllwd")
    protected Boolean earlyPmtAllwd;
    @XmlElement(name = "DelyPnlty")
    protected String delyPnlty;
    @XmlElement(name = "ImdtPmtRbt")
    protected AmountOrRate1Choice imdtPmtRbt;
    @XmlElement(name = "GrntedPmtReqd")
    protected Boolean grntedPmtReqd;

    /**
     * Gets the value of the amtModAllwd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAmtModAllwd() {
        return amtModAllwd;
    }

    /**
     * Sets the value of the amtModAllwd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public PaymentCondition2 setAmtModAllwd(Boolean value) {
        this.amtModAllwd = value;
        return this;
    }

    /**
     * Gets the value of the earlyPmtAllwd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEarlyPmtAllwd() {
        return earlyPmtAllwd;
    }

    /**
     * Sets the value of the earlyPmtAllwd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public PaymentCondition2 setEarlyPmtAllwd(Boolean value) {
        this.earlyPmtAllwd = value;
        return this;
    }

    /**
     * Gets the value of the delyPnlty property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDelyPnlty() {
        return delyPnlty;
    }

    /**
     * Sets the value of the delyPnlty property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PaymentCondition2 setDelyPnlty(String value) {
        this.delyPnlty = value;
        return this;
    }

    /**
     * Gets the value of the imdtPmtRbt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountOrRate1Choice }
     *     
     */
    public AmountOrRate1Choice getImdtPmtRbt() {
        return imdtPmtRbt;
    }

    /**
     * Sets the value of the imdtPmtRbt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountOrRate1Choice }
     *     
     */
    public PaymentCondition2 setImdtPmtRbt(AmountOrRate1Choice value) {
        this.imdtPmtRbt = value;
        return this;
    }

    /**
     * Gets the value of the grntedPmtReqd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGrntedPmtReqd() {
        return grntedPmtReqd;
    }

    /**
     * Sets the value of the grntedPmtReqd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public PaymentCondition2 setGrntedPmtReqd(Boolean value) {
        this.grntedPmtReqd = value;
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
