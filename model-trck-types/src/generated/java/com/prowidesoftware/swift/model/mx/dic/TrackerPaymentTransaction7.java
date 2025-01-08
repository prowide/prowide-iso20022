
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
@XmlType(name = "TrackerPaymentTransaction7", propOrder = {
    "trckdMsgId",
    "trckrInfrmgPty",
    "trckrInfrmdPty",
    "pmtId",
    "svcLvl"
})
public class TrackerPaymentTransaction7 {

    @XmlElement(name = "TrckdMsgId")
    protected OriginalBusinessInstruction4 trckdMsgId;
    @XmlElement(name = "TrckrInfrmgPty")
    protected TrackerPartyIdentification2 trckrInfrmgPty;
    @XmlElement(name = "TrckrInfrmdPty")
    protected TrackerPartyIdentification2 trckrInfrmdPty;
    @XmlElement(name = "PmtId")
    protected PaymentIdentification10 pmtId;
    @XmlElement(name = "SvcLvl")
    protected ServiceLevel8Choice svcLvl;

    /**
     * Gets the value of the trckdMsgId property.
     * 
     * @return
     *     possible object is
     *     {@link OriginalBusinessInstruction4 }
     *     
     */
    public OriginalBusinessInstruction4 getTrckdMsgId() {
        return trckdMsgId;
    }

    /**
     * Sets the value of the trckdMsgId property.
     * 
     * @param value
     *     allowed object is
     *     {@link OriginalBusinessInstruction4 }
     *     
     */
    public TrackerPaymentTransaction7 setTrckdMsgId(OriginalBusinessInstruction4 value) {
        this.trckdMsgId = value;
        return this;
    }

    /**
     * Gets the value of the trckrInfrmgPty property.
     * 
     * @return
     *     possible object is
     *     {@link TrackerPartyIdentification2 }
     *     
     */
    public TrackerPartyIdentification2 getTrckrInfrmgPty() {
        return trckrInfrmgPty;
    }

    /**
     * Sets the value of the trckrInfrmgPty property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrackerPartyIdentification2 }
     *     
     */
    public TrackerPaymentTransaction7 setTrckrInfrmgPty(TrackerPartyIdentification2 value) {
        this.trckrInfrmgPty = value;
        return this;
    }

    /**
     * Gets the value of the trckrInfrmdPty property.
     * 
     * @return
     *     possible object is
     *     {@link TrackerPartyIdentification2 }
     *     
     */
    public TrackerPartyIdentification2 getTrckrInfrmdPty() {
        return trckrInfrmdPty;
    }

    /**
     * Sets the value of the trckrInfrmdPty property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrackerPartyIdentification2 }
     *     
     */
    public TrackerPaymentTransaction7 setTrckrInfrmdPty(TrackerPartyIdentification2 value) {
        this.trckrInfrmdPty = value;
        return this;
    }

    /**
     * Gets the value of the pmtId property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentIdentification10 }
     *     
     */
    public PaymentIdentification10 getPmtId() {
        return pmtId;
    }

    /**
     * Sets the value of the pmtId property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentIdentification10 }
     *     
     */
    public TrackerPaymentTransaction7 setPmtId(PaymentIdentification10 value) {
        this.pmtId = value;
        return this;
    }

    /**
     * Gets the value of the svcLvl property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceLevel8Choice }
     *     
     */
    public ServiceLevel8Choice getSvcLvl() {
        return svcLvl;
    }

    /**
     * Sets the value of the svcLvl property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceLevel8Choice }
     *     
     */
    public TrackerPaymentTransaction7 setSvcLvl(ServiceLevel8Choice value) {
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
