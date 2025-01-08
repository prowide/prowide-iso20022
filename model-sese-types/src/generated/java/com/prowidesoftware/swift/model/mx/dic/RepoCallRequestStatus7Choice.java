
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
 * Choice of format for the repurchase agreement call acknowledgement.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RepoCallRequestStatus7Choice", propOrder = {
    "ackdAccptd",
    "dnd",
    "prtry"
})
public class RepoCallRequestStatus7Choice {

    @XmlElement(name = "AckdAccptd")
    protected AcknowledgedAcceptedStatus22Choice ackdAccptd;
    @XmlElement(name = "Dnd")
    protected DeniedStatus17Choice dnd;
    @XmlElement(name = "Prtry")
    protected ProprietaryStatusAndReason6 prtry;

    /**
     * Gets the value of the ackdAccptd property.
     * 
     * @return
     *     possible object is
     *     {@link AcknowledgedAcceptedStatus22Choice }
     *     
     */
    public AcknowledgedAcceptedStatus22Choice getAckdAccptd() {
        return ackdAccptd;
    }

    /**
     * Sets the value of the ackdAccptd property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcknowledgedAcceptedStatus22Choice }
     *     
     */
    public RepoCallRequestStatus7Choice setAckdAccptd(AcknowledgedAcceptedStatus22Choice value) {
        this.ackdAccptd = value;
        return this;
    }

    /**
     * Gets the value of the dnd property.
     * 
     * @return
     *     possible object is
     *     {@link DeniedStatus17Choice }
     *     
     */
    public DeniedStatus17Choice getDnd() {
        return dnd;
    }

    /**
     * Sets the value of the dnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeniedStatus17Choice }
     *     
     */
    public RepoCallRequestStatus7Choice setDnd(DeniedStatus17Choice value) {
        this.dnd = value;
        return this;
    }

    /**
     * Gets the value of the prtry property.
     * 
     * @return
     *     possible object is
     *     {@link ProprietaryStatusAndReason6 }
     *     
     */
    public ProprietaryStatusAndReason6 getPrtry() {
        return prtry;
    }

    /**
     * Sets the value of the prtry property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProprietaryStatusAndReason6 }
     *     
     */
    public RepoCallRequestStatus7Choice setPrtry(ProprietaryStatusAndReason6 value) {
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
