
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
 * Choice of format for the repurchase agreement call acknowledgement.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RepoCallRequestStatus9Choice", propOrder = {
    "ackdAccptd",
    "dnd",
    "prtry"
})
public class RepoCallRequestStatus9Choice {

    @XmlElement(name = "AckdAccptd")
    protected AcknowledgedAcceptedStatus27Choice ackdAccptd;
    @XmlElement(name = "Dnd")
    protected DeniedStatus18Choice dnd;
    @XmlElement(name = "Prtry")
    protected ProprietaryStatusAndReason7 prtry;

    /**
     * Gets the value of the ackdAccptd property.
     * 
     * @return
     *     possible object is
     *     {@link AcknowledgedAcceptedStatus27Choice }
     *     
     */
    public AcknowledgedAcceptedStatus27Choice getAckdAccptd() {
        return ackdAccptd;
    }

    /**
     * Sets the value of the ackdAccptd property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcknowledgedAcceptedStatus27Choice }
     *     
     */
    public RepoCallRequestStatus9Choice setAckdAccptd(AcknowledgedAcceptedStatus27Choice value) {
        this.ackdAccptd = value;
        return this;
    }

    /**
     * Gets the value of the dnd property.
     * 
     * @return
     *     possible object is
     *     {@link DeniedStatus18Choice }
     *     
     */
    public DeniedStatus18Choice getDnd() {
        return dnd;
    }

    /**
     * Sets the value of the dnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeniedStatus18Choice }
     *     
     */
    public RepoCallRequestStatus9Choice setDnd(DeniedStatus18Choice value) {
        this.dnd = value;
        return this;
    }

    /**
     * Gets the value of the prtry property.
     * 
     * @return
     *     possible object is
     *     {@link ProprietaryStatusAndReason7 }
     *     
     */
    public ProprietaryStatusAndReason7 getPrtry() {
        return prtry;
    }

    /**
     * Sets the value of the prtry property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProprietaryStatusAndReason7 }
     *     
     */
    public RepoCallRequestStatus9Choice setPrtry(ProprietaryStatusAndReason7 value) {
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
