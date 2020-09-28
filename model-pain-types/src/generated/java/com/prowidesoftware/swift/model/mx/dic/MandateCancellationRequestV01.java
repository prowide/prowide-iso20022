
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
 * Scope
 * The MandateCancellationRequest message is sent by the initiator of the request to his agent. The initiator can either be the debtor or the creditor.
 * The MandateCancellationRequest message is forwarded by the agent of the initiator to the agent of the counterparty.
 * A MandateCancellationRequest message is used to request the cancellation of an existing mandate. If accepted, this MandateCancellationRequest message together with the MandateAcceptanceReport message confirming the acceptance will be considered a valid cancellation of an existing mandate, agreed upon by all parties.
 * Usage
 * The MandateCancellationRequest message can contain only one request to cancel one specific mandate.
 * The messages can be exchanged between creditor and creditor agent or debtor and debtor agent and between creditor agent and debtor agent.
 * The message can also be used by an initiating party that has authority to send the message on behalf of the creditor or debtor.
 * The MandateCancellationRequest message can be used in domestic and cross-border scenarios.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MandateCancellationRequestV01", propOrder = {
    "grpHdr",
    "undrlygCxlDtls"
})
public class MandateCancellationRequestV01 {

    @XmlElement(name = "GrpHdr", required = true)
    protected GroupHeader31 grpHdr;
    @XmlElement(name = "UndrlygCxlDtls", required = true)
    protected MandateCancellation1 undrlygCxlDtls;

    /**
     * Gets the value of the grpHdr property.
     * 
     * @return
     *     possible object is
     *     {@link GroupHeader31 }
     *     
     */
    public GroupHeader31 getGrpHdr() {
        return grpHdr;
    }

    /**
     * Sets the value of the grpHdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link GroupHeader31 }
     *     
     */
    public MandateCancellationRequestV01 setGrpHdr(GroupHeader31 value) {
        this.grpHdr = value;
        return this;
    }

    /**
     * Gets the value of the undrlygCxlDtls property.
     * 
     * @return
     *     possible object is
     *     {@link MandateCancellation1 }
     *     
     */
    public MandateCancellation1 getUndrlygCxlDtls() {
        return undrlygCxlDtls;
    }

    /**
     * Sets the value of the undrlygCxlDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link MandateCancellation1 }
     *     
     */
    public MandateCancellationRequestV01 setUndrlygCxlDtls(MandateCancellation1 value) {
        this.undrlygCxlDtls = value;
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
