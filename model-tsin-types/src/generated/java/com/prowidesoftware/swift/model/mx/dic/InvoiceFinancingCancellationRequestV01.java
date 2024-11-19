
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
 * The InvoiceFinancingCancellationRequest message is sent by the Financing Requestor to the Intermediary Agent (relay scenario) or First Agent (direct scenario). It is used to request the cancellation of a previously sent financing request.
 * Usage
 * The InvoiceFinancingCancellationRequest message is used by the Financing Requestor to request the cancellation of a previously sent financing request.
 * It is not possible to send a cancellation request for a single invoice contained in a bulk invoice financing request.
 * The InvoiceFinancingCancellationRequest message contains references (original group identification and original creation date and time) of the original financing request message to which is referred.
 * As for InvoiceFinancingRequest, the message can be used in a direct or a relay scenario:
 * - In a direct scenario, the message is sent directly to the First Agent. The First Agent is the account servicer of the Financing Requestor.
 * - In a relay scenario, the message is sent to an Intermediary Agent. The Intermediary Agent forwards the InvoiceFinancingCancellingRequest message to the First Agent.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvoiceFinancingCancellationRequestV01", propOrder = {
    "cxlReqId",
    "cxlReqInf"
})
public class InvoiceFinancingCancellationRequestV01 {

    @XmlElement(name = "CxlReqId", required = true)
    protected MessageIdentification1 cxlReqId;
    @XmlElement(name = "CxlReqInf", required = true)
    protected CancellationRequestInformation1 cxlReqInf;

    /**
     * Gets the value of the cxlReqId property.
     * 
     * @return
     *     possible object is
     *     {@link MessageIdentification1 }
     *     
     */
    public MessageIdentification1 getCxlReqId() {
        return cxlReqId;
    }

    /**
     * Sets the value of the cxlReqId property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageIdentification1 }
     *     
     */
    public InvoiceFinancingCancellationRequestV01 setCxlReqId(MessageIdentification1 value) {
        this.cxlReqId = value;
        return this;
    }

    /**
     * Gets the value of the cxlReqInf property.
     * 
     * @return
     *     possible object is
     *     {@link CancellationRequestInformation1 }
     *     
     */
    public CancellationRequestInformation1 getCxlReqInf() {
        return cxlReqInf;
    }

    /**
     * Sets the value of the cxlReqInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link CancellationRequestInformation1 }
     *     
     */
    public InvoiceFinancingCancellationRequestV01 setCxlReqInf(CancellationRequestInformation1 value) {
        this.cxlReqInf = value;
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
