
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
 * Key elements used to identify the original transaction(s) that is being referred to.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrackerPaymentTransaction4", propOrder = {
    "trckdMsgId",
    "trckrInfrmgPty",
    "pmtId",
    "svcLvl"
})
public class TrackerPaymentTransaction4 {

    @XmlElement(name = "TrckdMsgId")
    protected OriginalBusinessInstruction2 trckdMsgId;
    @XmlElement(name = "TrckrInfrmgPty")
    protected TrackerPartyIdentification1 trckrInfrmgPty;
    @XmlElement(name = "PmtId", required = true)
    protected PaymentIdentification11 pmtId;
    @XmlElement(name = "SvcLvl")
    protected TransactionServiceLevel1 svcLvl;

    /**
     * Gets the value of the trckdMsgId property.
     * 
     * @return
     *     possible object is
     *     {@link OriginalBusinessInstruction2 }
     *     
     */
    public OriginalBusinessInstruction2 getTrckdMsgId() {
        return trckdMsgId;
    }

    /**
     * Sets the value of the trckdMsgId property.
     * 
     * @param value
     *     allowed object is
     *     {@link OriginalBusinessInstruction2 }
     *     
     */
    public TrackerPaymentTransaction4 setTrckdMsgId(OriginalBusinessInstruction2 value) {
        this.trckdMsgId = value;
        return this;
    }

    /**
     * Gets the value of the trckrInfrmgPty property.
     * 
     * @return
     *     possible object is
     *     {@link TrackerPartyIdentification1 }
     *     
     */
    public TrackerPartyIdentification1 getTrckrInfrmgPty() {
        return trckrInfrmgPty;
    }

    /**
     * Sets the value of the trckrInfrmgPty property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrackerPartyIdentification1 }
     *     
     */
    public TrackerPaymentTransaction4 setTrckrInfrmgPty(TrackerPartyIdentification1 value) {
        this.trckrInfrmgPty = value;
        return this;
    }

    /**
     * Gets the value of the pmtId property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentIdentification11 }
     *     
     */
    public PaymentIdentification11 getPmtId() {
        return pmtId;
    }

    /**
     * Sets the value of the pmtId property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentIdentification11 }
     *     
     */
    public TrackerPaymentTransaction4 setPmtId(PaymentIdentification11 value) {
        this.pmtId = value;
        return this;
    }

    /**
     * Gets the value of the svcLvl property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionServiceLevel1 }
     *     
     */
    public TransactionServiceLevel1 getSvcLvl() {
        return svcLvl;
    }

    /**
     * Sets the value of the svcLvl property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionServiceLevel1 }
     *     
     */
    public TrackerPaymentTransaction4 setSvcLvl(TransactionServiceLevel1 value) {
        this.svcLvl = value;
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
