
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
 * Scope
 * An account servicer, for example, a registrar, transfer agent, first intermediary or custodian bank, sends the SecuritiesMessageRejection message to the sender (for example account owner, an investor, an issuer or its authorised agent), to reject a previously received message on which action cannot be taken.
 * The message may also be sent by an executing party, for example, transfer agent to the instructing party, for example, investment manager or its authorised representative to reject a previously received message on which action cannot be taken.
 * Usage
 * The SecuritiesMessageRejection message is used for the following reasons:
 * - the executing party does not recognise the linked reference, so the executing party cannot process the message
 * - the instructing party should not have sent the message.
 * Reasons that a receiver does not expect a message include no SLA in place between the Sender and the Receiver.
 * The sender doesn’t comply with minimum requirements to allow processing at first intermediary level (for example for seev.045, seev.001, seev.031). 
 * The SecuritiesMessageRejection message must not be used to reject an instruction message (for example sese.023, seev.004, seev.047, seev.033) that cannot be processed for business reasons, for example, if information is missing in an instruction message or because securities are not available for settlement.
 * The message should be used with the business Application Header.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecuritiesMessageRejectionV04", propOrder = {
    "rltdRef",
    "rsn"
})
public class SecuritiesMessageRejectionV04 {

    @XmlElement(name = "RltdRef", required = true)
    protected AdditionalReference14 rltdRef;
    @XmlElement(name = "Rsn", required = true)
    protected RejectionReason69 rsn;

    /**
     * Gets the value of the rltdRef property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalReference14 }
     *     
     */
    public AdditionalReference14 getRltdRef() {
        return rltdRef;
    }

    /**
     * Sets the value of the rltdRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalReference14 }
     *     
     */
    public SecuritiesMessageRejectionV04 setRltdRef(AdditionalReference14 value) {
        this.rltdRef = value;
        return this;
    }

    /**
     * Gets the value of the rsn property.
     * 
     * @return
     *     possible object is
     *     {@link RejectionReason69 }
     *     
     */
    public RejectionReason69 getRsn() {
        return rsn;
    }

    /**
     * Sets the value of the rsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link RejectionReason69 }
     *     
     */
    public SecuritiesMessageRejectionV04 setRsn(RejectionReason69 value) {
        this.rsn = value;
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
