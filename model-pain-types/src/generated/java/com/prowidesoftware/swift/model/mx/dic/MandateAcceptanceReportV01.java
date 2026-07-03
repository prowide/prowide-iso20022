
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
 * The MandateAcceptanceReport message is sent from the agent of the receiver (debtor or creditor) of the MandateRequest message (initiation, amendment or cancellation) to the agent of the initiator of the MandateRequest message (debtor or creditor).
 * A MandateAcceptanceReport message is used to confirm the acceptance or rejection of a MandateRequest message. 
 * Where acceptance is part of the full process flow, a MandateRequest message only becomes valid after a confirmation of acceptance is received through a MandateAcceptanceReport message from the agent of the receiver.
 * Usage
 * The MandateAcceptanceReport message can contain only one confirmation of acceptance of rejection of one specific MandateRequest message.
 * The messages can be exchanged between debtor agent and creditor agent and between debtor agent and debtor and creditor agent and creditor.
 * The MandateAcceptanceReport message can be used in domestic and cross-border scenarios.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MandateAcceptanceReportV01", propOrder = {
    "grpHdr",
    "undrlygAccptncDtls"
})
public class MandateAcceptanceReportV01 {

    @XmlElement(name = "GrpHdr", required = true)
    protected GroupHeader31 grpHdr;
    @XmlElement(name = "UndrlygAccptncDtls", required = true)
    protected MandateAcceptance1 undrlygAccptncDtls;

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
    public MandateAcceptanceReportV01 setGrpHdr(GroupHeader31 value) {
        this.grpHdr = value;
        return this;
    }

    /**
     * Gets the value of the undrlygAccptncDtls property.
     * 
     * @return
     *     possible object is
     *     {@link MandateAcceptance1 }
     *     
     */
    public MandateAcceptance1 getUndrlygAccptncDtls() {
        return undrlygAccptncDtls;
    }

    /**
     * Sets the value of the undrlygAccptncDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link MandateAcceptance1 }
     *     
     */
    public MandateAcceptanceReportV01 setUndrlygAccptncDtls(MandateAcceptance1 value) {
        this.undrlygAccptncDtls = value;
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
