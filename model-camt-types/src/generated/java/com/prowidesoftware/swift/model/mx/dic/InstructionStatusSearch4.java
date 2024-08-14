
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
 * Defines the criteria which are used to search for the status of the payment.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InstructionStatusSearch4", propOrder = {
    "pmtInstrSts",
    "pmtInstrStsDtTm",
    "prtryStsRsn"
})
public class InstructionStatusSearch4 {

    @XmlElement(name = "PmtInstrSts")
    protected PaymentStatusCodeSearch2Choice pmtInstrSts;
    @XmlElement(name = "PmtInstrStsDtTm")
    protected DateTimePeriod1Choice pmtInstrStsDtTm;
    @XmlElement(name = "PrtryStsRsn")
    protected String prtryStsRsn;

    /**
     * Gets the value of the pmtInstrSts property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentStatusCodeSearch2Choice }
     *     
     */
    public PaymentStatusCodeSearch2Choice getPmtInstrSts() {
        return pmtInstrSts;
    }

    /**
     * Sets the value of the pmtInstrSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentStatusCodeSearch2Choice }
     *     
     */
    public InstructionStatusSearch4 setPmtInstrSts(PaymentStatusCodeSearch2Choice value) {
        this.pmtInstrSts = value;
        return this;
    }

    /**
     * Gets the value of the pmtInstrStsDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimePeriod1Choice }
     *     
     */
    public DateTimePeriod1Choice getPmtInstrStsDtTm() {
        return pmtInstrStsDtTm;
    }

    /**
     * Sets the value of the pmtInstrStsDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimePeriod1Choice }
     *     
     */
    public InstructionStatusSearch4 setPmtInstrStsDtTm(DateTimePeriod1Choice value) {
        this.pmtInstrStsDtTm = value;
        return this;
    }

    /**
     * Gets the value of the prtryStsRsn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrtryStsRsn() {
        return prtryStsRsn;
    }

    /**
     * Sets the value of the prtryStsRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public InstructionStatusSearch4 setPrtryStsRsn(String value) {
        this.prtryStsRsn = value;
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
