
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * A choice between payment status reasons.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentStatusReasonCode3Choice", propOrder = {
    "umtchdStsRsn",
    "cancStsRsn",
    "sspdStsRsn",
    "pdgFlngSttlm",
    "pdgSttlm",
    "prtryRjctnRsn"
})
public class PaymentStatusReasonCode3Choice {

    @XmlElement(name = "UmtchdStsRsn")
    @XmlSchemaType(name = "string")
    protected UnmatchedStatusReason1Code umtchdStsRsn;
    @XmlElement(name = "CancStsRsn")
    @XmlSchemaType(name = "string")
    protected CancelledStatusReason1Code cancStsRsn;
    @XmlElement(name = "SspdStsRsn")
    @XmlSchemaType(name = "string")
    protected SuspendedStatusReason1Code sspdStsRsn;
    @XmlElement(name = "PdgFlngSttlm")
    @XmlSchemaType(name = "string")
    protected PendingFailingSettlement1Code pdgFlngSttlm;
    @XmlElement(name = "PdgSttlm")
    @XmlSchemaType(name = "string")
    protected PendingSettlement2Code pdgSttlm;
    @XmlElement(name = "PrtryRjctnRsn")
    protected ProprietaryStatusJustification prtryRjctnRsn;

    /**
     * Gets the value of the umtchdStsRsn property.
     * 
     * @return
     *     possible object is
     *     {@link UnmatchedStatusReason1Code }
     *     
     */
    public UnmatchedStatusReason1Code getUmtchdStsRsn() {
        return umtchdStsRsn;
    }

    /**
     * Sets the value of the umtchdStsRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnmatchedStatusReason1Code }
     *     
     */
    public PaymentStatusReasonCode3Choice setUmtchdStsRsn(UnmatchedStatusReason1Code value) {
        this.umtchdStsRsn = value;
        return this;
    }

    /**
     * Gets the value of the cancStsRsn property.
     * 
     * @return
     *     possible object is
     *     {@link CancelledStatusReason1Code }
     *     
     */
    public CancelledStatusReason1Code getCancStsRsn() {
        return cancStsRsn;
    }

    /**
     * Sets the value of the cancStsRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link CancelledStatusReason1Code }
     *     
     */
    public PaymentStatusReasonCode3Choice setCancStsRsn(CancelledStatusReason1Code value) {
        this.cancStsRsn = value;
        return this;
    }

    /**
     * Gets the value of the sspdStsRsn property.
     * 
     * @return
     *     possible object is
     *     {@link SuspendedStatusReason1Code }
     *     
     */
    public SuspendedStatusReason1Code getSspdStsRsn() {
        return sspdStsRsn;
    }

    /**
     * Sets the value of the sspdStsRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link SuspendedStatusReason1Code }
     *     
     */
    public PaymentStatusReasonCode3Choice setSspdStsRsn(SuspendedStatusReason1Code value) {
        this.sspdStsRsn = value;
        return this;
    }

    /**
     * Gets the value of the pdgFlngSttlm property.
     * 
     * @return
     *     possible object is
     *     {@link PendingFailingSettlement1Code }
     *     
     */
    public PendingFailingSettlement1Code getPdgFlngSttlm() {
        return pdgFlngSttlm;
    }

    /**
     * Sets the value of the pdgFlngSttlm property.
     * 
     * @param value
     *     allowed object is
     *     {@link PendingFailingSettlement1Code }
     *     
     */
    public PaymentStatusReasonCode3Choice setPdgFlngSttlm(PendingFailingSettlement1Code value) {
        this.pdgFlngSttlm = value;
        return this;
    }

    /**
     * Gets the value of the pdgSttlm property.
     * 
     * @return
     *     possible object is
     *     {@link PendingSettlement2Code }
     *     
     */
    public PendingSettlement2Code getPdgSttlm() {
        return pdgSttlm;
    }

    /**
     * Sets the value of the pdgSttlm property.
     * 
     * @param value
     *     allowed object is
     *     {@link PendingSettlement2Code }
     *     
     */
    public PaymentStatusReasonCode3Choice setPdgSttlm(PendingSettlement2Code value) {
        this.pdgSttlm = value;
        return this;
    }

    /**
     * Gets the value of the prtryRjctnRsn property.
     * 
     * @return
     *     possible object is
     *     {@link ProprietaryStatusJustification }
     *     
     */
    public ProprietaryStatusJustification getPrtryRjctnRsn() {
        return prtryRjctnRsn;
    }

    /**
     * Sets the value of the prtryRjctnRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProprietaryStatusJustification }
     *     
     */
    public PaymentStatusReasonCode3Choice setPrtryRjctnRsn(ProprietaryStatusJustification value) {
        this.prtryRjctnRsn = value;
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
