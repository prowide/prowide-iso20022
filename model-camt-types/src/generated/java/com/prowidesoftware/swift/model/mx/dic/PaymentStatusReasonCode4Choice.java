
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Reason for the status of the transaction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentStatusReasonCode4Choice", propOrder = {
    "umtchdStsRsn",
    "cancStsRsn",
    "sspdStsRsn",
    "pdgFlngSttlm",
    "pdgSttlm",
    "prtryRjctnRsn",
    "prtryRsn"
})
public class PaymentStatusReasonCode4Choice {

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
    @XmlElement(name = "PrtryRsn")
    protected String prtryRsn;

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
    public PaymentStatusReasonCode4Choice setUmtchdStsRsn(UnmatchedStatusReason1Code value) {
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
    public PaymentStatusReasonCode4Choice setCancStsRsn(CancelledStatusReason1Code value) {
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
    public PaymentStatusReasonCode4Choice setSspdStsRsn(SuspendedStatusReason1Code value) {
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
    public PaymentStatusReasonCode4Choice setPdgFlngSttlm(PendingFailingSettlement1Code value) {
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
    public PaymentStatusReasonCode4Choice setPdgSttlm(PendingSettlement2Code value) {
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
    public PaymentStatusReasonCode4Choice setPrtryRjctnRsn(ProprietaryStatusJustification value) {
        this.prtryRjctnRsn = value;
        return this;
    }

    /**
     * Gets the value of the prtryRsn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrtryRsn() {
        return prtryRsn;
    }

    /**
     * Sets the value of the prtryRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PaymentStatusReasonCode4Choice setPrtryRsn(String value) {
        this.prtryRsn = value;
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
