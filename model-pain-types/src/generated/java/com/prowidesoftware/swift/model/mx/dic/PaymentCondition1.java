
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
 * Specifies the conditions for the execution of the payment.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentCondition1", propOrder = {
    "amtModAllwd",
    "earlyPmtAllwd",
    "delyPnlty",
    "imdtPmtRbt",
    "grntedPmtReqd"
})
public class PaymentCondition1 {

    @XmlElement(name = "AmtModAllwd")
    protected boolean amtModAllwd;
    @XmlElement(name = "EarlyPmtAllwd")
    protected boolean earlyPmtAllwd;
    @XmlElement(name = "DelyPnlty")
    protected String delyPnlty;
    @XmlElement(name = "ImdtPmtRbt")
    protected AmountOrRate1Choice imdtPmtRbt;
    @XmlElement(name = "GrntedPmtReqd")
    protected boolean grntedPmtReqd;

    /**
     * Gets the value of the amtModAllwd property.
     * 
     */
    public boolean isAmtModAllwd() {
        return amtModAllwd;
    }

    /**
     * Sets the value of the amtModAllwd property.
     * 
     */
    public PaymentCondition1 setAmtModAllwd(boolean value) {
        this.amtModAllwd = value;
        return this;
    }

    /**
     * Gets the value of the earlyPmtAllwd property.
     * 
     */
    public boolean isEarlyPmtAllwd() {
        return earlyPmtAllwd;
    }

    /**
     * Sets the value of the earlyPmtAllwd property.
     * 
     */
    public PaymentCondition1 setEarlyPmtAllwd(boolean value) {
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
    public PaymentCondition1 setDelyPnlty(String value) {
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
    public PaymentCondition1 setImdtPmtRbt(AmountOrRate1Choice value) {
        this.imdtPmtRbt = value;
        return this;
    }

    /**
     * Gets the value of the grntedPmtReqd property.
     * 
     */
    public boolean isGrntedPmtReqd() {
        return grntedPmtReqd;
    }

    /**
     * Sets the value of the grntedPmtReqd property.
     * 
     */
    public PaymentCondition1 setGrntedPmtReqd(boolean value) {
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
