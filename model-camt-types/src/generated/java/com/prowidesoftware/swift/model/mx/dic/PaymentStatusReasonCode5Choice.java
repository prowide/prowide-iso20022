
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
 * Reason for the status of the transaction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentStatusReasonCode5Choice", propOrder = {
    "umtchd",
    "canc",
    "sspd",
    "pdgFlngSttlm",
    "pdgSttlm",
    "prtryRjctn",
    "prtry"
})
public class PaymentStatusReasonCode5Choice {

    @XmlElement(name = "Umtchd")
    @XmlSchemaType(name = "string")
    protected UnmatchedStatusReason1Code umtchd;
    @XmlElement(name = "Canc")
    @XmlSchemaType(name = "string")
    protected CancelledStatusReason1Code canc;
    @XmlElement(name = "Sspd")
    @XmlSchemaType(name = "string")
    protected SuspendedStatusReason1Code sspd;
    @XmlElement(name = "PdgFlngSttlm")
    @XmlSchemaType(name = "string")
    protected PendingFailingSettlement1Code pdgFlngSttlm;
    @XmlElement(name = "PdgSttlm")
    @XmlSchemaType(name = "string")
    protected PendingSettlement2Code pdgSttlm;
    @XmlElement(name = "PrtryRjctn")
    protected ProprietaryStatusJustification prtryRjctn;
    @XmlElement(name = "Prtry")
    protected String prtry;

    /**
     * Gets the value of the umtchd property.
     * 
     * @return
     *     possible object is
     *     {@link UnmatchedStatusReason1Code }
     *     
     */
    public UnmatchedStatusReason1Code getUmtchd() {
        return umtchd;
    }

    /**
     * Sets the value of the umtchd property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnmatchedStatusReason1Code }
     *     
     */
    public PaymentStatusReasonCode5Choice setUmtchd(UnmatchedStatusReason1Code value) {
        this.umtchd = value;
        return this;
    }

    /**
     * Gets the value of the canc property.
     * 
     * @return
     *     possible object is
     *     {@link CancelledStatusReason1Code }
     *     
     */
    public CancelledStatusReason1Code getCanc() {
        return canc;
    }

    /**
     * Sets the value of the canc property.
     * 
     * @param value
     *     allowed object is
     *     {@link CancelledStatusReason1Code }
     *     
     */
    public PaymentStatusReasonCode5Choice setCanc(CancelledStatusReason1Code value) {
        this.canc = value;
        return this;
    }

    /**
     * Gets the value of the sspd property.
     * 
     * @return
     *     possible object is
     *     {@link SuspendedStatusReason1Code }
     *     
     */
    public SuspendedStatusReason1Code getSspd() {
        return sspd;
    }

    /**
     * Sets the value of the sspd property.
     * 
     * @param value
     *     allowed object is
     *     {@link SuspendedStatusReason1Code }
     *     
     */
    public PaymentStatusReasonCode5Choice setSspd(SuspendedStatusReason1Code value) {
        this.sspd = value;
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
    public PaymentStatusReasonCode5Choice setPdgFlngSttlm(PendingFailingSettlement1Code value) {
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
    public PaymentStatusReasonCode5Choice setPdgSttlm(PendingSettlement2Code value) {
        this.pdgSttlm = value;
        return this;
    }

    /**
     * Gets the value of the prtryRjctn property.
     * 
     * @return
     *     possible object is
     *     {@link ProprietaryStatusJustification }
     *     
     */
    public ProprietaryStatusJustification getPrtryRjctn() {
        return prtryRjctn;
    }

    /**
     * Sets the value of the prtryRjctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProprietaryStatusJustification }
     *     
     */
    public PaymentStatusReasonCode5Choice setPrtryRjctn(ProprietaryStatusJustification value) {
        this.prtryRjctn = value;
        return this;
    }

    /**
     * Gets the value of the prtry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrtry() {
        return prtry;
    }

    /**
     * Sets the value of the prtry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PaymentStatusReasonCode5Choice setPrtry(String value) {
        this.prtry = value;
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
