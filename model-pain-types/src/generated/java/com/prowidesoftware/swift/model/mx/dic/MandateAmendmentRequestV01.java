
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
 * The MandateAmendmentRequest message is sent by the initiator of the request to his agent and/or counterparty. The initiator can both be the debtor or the creditor (or where appropriate the debtor agent).
 * The MandateAmendmentRequest message is forwarded by the agent of the initiator to the agent of the counterparty.
 * A MandateAmendmentRequest message is used to request the amendment of specific information in an existing mandate. 
 * The MandateAmendmentRequest message must reflect the new data of the element(s) to be amended and at a minimum a unique reference to the existing mandate. If accepted, this MandateAmendmentRequest message together with the MandateAcceptanceReport message confirming the acceptance will be considered as a valid amendment on an existing mandate, agreed upon by all parties. The amended mandate will from then on be considered the valid mandate.
 * Usage
 * The MandateAmendmentRequest message can contain only one request to amend one specific mandate.
 * The messages can be exchanged between creditor and creditor agent or debtor and debtor agent and between creditor agent and debtor agent.
 * The message can also be used by an initiating party that has authority to send the message on behalf of the creditor or debtor.
 * The MandateAmendmentRequest message can be used in domestic and cross-border scenarios.
 * If all elements in the existing Mandate need to be amended or the underlying contract is different, then the MandateAmendmentRequest message should not be used. The existing Mandate has to be cancelled and a new Mandate has to be initiated.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MandateAmendmentRequestV01", propOrder = {
    "grpHdr",
    "undrlygAmdmntDtls"
})
public class MandateAmendmentRequestV01 {

    @XmlElement(name = "GrpHdr", required = true)
    protected GroupHeader31 grpHdr;
    @XmlElement(name = "UndrlygAmdmntDtls", required = true)
    protected MandateAmendment1 undrlygAmdmntDtls;

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
    public MandateAmendmentRequestV01 setGrpHdr(GroupHeader31 value) {
        this.grpHdr = value;
        return this;
    }

    /**
     * Gets the value of the undrlygAmdmntDtls property.
     * 
     * @return
     *     possible object is
     *     {@link MandateAmendment1 }
     *     
     */
    public MandateAmendment1 getUndrlygAmdmntDtls() {
        return undrlygAmdmntDtls;
    }

    /**
     * Sets the value of the undrlygAmdmntDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link MandateAmendment1 }
     *     
     */
    public MandateAmendmentRequestV01 setUndrlygAmdmntDtls(MandateAmendment1 value) {
        this.undrlygAmdmntDtls = value;
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
