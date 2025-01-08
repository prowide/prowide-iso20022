
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
 * Provides details about the securities compensation such as the depository and the total settlement amount.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecuritiesCompensation1", propOrder = {
    "dpstry",
    "sttlmAmt",
    "fees"
})
public class SecuritiesCompensation1 {

    @XmlElement(name = "Dpstry", required = true)
    protected PartyIdentification34Choice dpstry;
    @XmlElement(name = "SttlmAmt", required = true)
    protected AmountAndDirection20 sttlmAmt;
    @XmlElement(name = "Fees")
    protected AmountAndDirection20 fees;

    /**
     * Gets the value of the dpstry property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification34Choice }
     *     
     */
    public PartyIdentification34Choice getDpstry() {
        return dpstry;
    }

    /**
     * Sets the value of the dpstry property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification34Choice }
     *     
     */
    public SecuritiesCompensation1 setDpstry(PartyIdentification34Choice value) {
        this.dpstry = value;
        return this;
    }

    /**
     * Gets the value of the sttlmAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection20 }
     *     
     */
    public AmountAndDirection20 getSttlmAmt() {
        return sttlmAmt;
    }

    /**
     * Sets the value of the sttlmAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection20 }
     *     
     */
    public SecuritiesCompensation1 setSttlmAmt(AmountAndDirection20 value) {
        this.sttlmAmt = value;
        return this;
    }

    /**
     * Gets the value of the fees property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection20 }
     *     
     */
    public AmountAndDirection20 getFees() {
        return fees;
    }

    /**
     * Sets the value of the fees property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection20 }
     *     
     */
    public SecuritiesCompensation1 setFees(AmountAndDirection20 value) {
        this.fees = value;
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
