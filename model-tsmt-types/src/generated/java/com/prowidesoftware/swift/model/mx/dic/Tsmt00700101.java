
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
 * The AmendmentRejection message is sent by the party requested to accept or reject an amendment to the matching application.
 * This message is used to reject an amendment request.
 * Usage
 * The AmendmentRejection message can be sent by the party requested to accept or reject an amendment to inform that it rejects the requested amendment.
 * The message can be sent in response to a FullPushThroughReport and DeltaReport message conveying the details of a BaselineAmendmentRequest message.
 * The acceptance of an amendment request can be achieved by sending an AmendmentAcceptance message.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tsmt.007.001.01", propOrder = {
    "rjctnId",
    "txId",
    "submitrTxRef",
    "dltaRptRef",
    "rjctdAmdmntNb",
    "rjctnRsn"
})
public class Tsmt00700101 {

    @XmlElement(name = "RjctnId", required = true)
    protected MessageIdentification1 rjctnId;
    @XmlElement(name = "TxId", required = true)
    protected SimpleIdentificationInformation txId;
    @XmlElement(name = "SubmitrTxRef", required = true)
    protected DocumentIdentification5 submitrTxRef;
    @XmlElement(name = "DltaRptRef", required = true)
    protected MessageIdentification1 dltaRptRef;
    @XmlElement(name = "RjctdAmdmntNb", required = true)
    protected Count1 rjctdAmdmntNb;
    @XmlElement(name = "RjctnRsn", required = true)
    protected RejectionReason1Choice rjctnRsn;

    /**
     * Gets the value of the rjctnId property.
     * 
     * @return
     *     possible object is
     *     {@link MessageIdentification1 }
     *     
     */
    public MessageIdentification1 getRjctnId() {
        return rjctnId;
    }

    /**
     * Sets the value of the rjctnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageIdentification1 }
     *     
     */
    public Tsmt00700101 setRjctnId(MessageIdentification1 value) {
        this.rjctnId = value;
        return this;
    }

    /**
     * Gets the value of the txId property.
     * 
     * @return
     *     possible object is
     *     {@link SimpleIdentificationInformation }
     *     
     */
    public SimpleIdentificationInformation getTxId() {
        return txId;
    }

    /**
     * Sets the value of the txId property.
     * 
     * @param value
     *     allowed object is
     *     {@link SimpleIdentificationInformation }
     *     
     */
    public Tsmt00700101 setTxId(SimpleIdentificationInformation value) {
        this.txId = value;
        return this;
    }

    /**
     * Gets the value of the submitrTxRef property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentIdentification5 }
     *     
     */
    public DocumentIdentification5 getSubmitrTxRef() {
        return submitrTxRef;
    }

    /**
     * Sets the value of the submitrTxRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentIdentification5 }
     *     
     */
    public Tsmt00700101 setSubmitrTxRef(DocumentIdentification5 value) {
        this.submitrTxRef = value;
        return this;
    }

    /**
     * Gets the value of the dltaRptRef property.
     * 
     * @return
     *     possible object is
     *     {@link MessageIdentification1 }
     *     
     */
    public MessageIdentification1 getDltaRptRef() {
        return dltaRptRef;
    }

    /**
     * Sets the value of the dltaRptRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageIdentification1 }
     *     
     */
    public Tsmt00700101 setDltaRptRef(MessageIdentification1 value) {
        this.dltaRptRef = value;
        return this;
    }

    /**
     * Gets the value of the rjctdAmdmntNb property.
     * 
     * @return
     *     possible object is
     *     {@link Count1 }
     *     
     */
    public Count1 getRjctdAmdmntNb() {
        return rjctdAmdmntNb;
    }

    /**
     * Sets the value of the rjctdAmdmntNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link Count1 }
     *     
     */
    public Tsmt00700101 setRjctdAmdmntNb(Count1 value) {
        this.rjctdAmdmntNb = value;
        return this;
    }

    /**
     * Gets the value of the rjctnRsn property.
     * 
     * @return
     *     possible object is
     *     {@link RejectionReason1Choice }
     *     
     */
    public RejectionReason1Choice getRjctnRsn() {
        return rjctnRsn;
    }

    /**
     * Sets the value of the rjctnRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link RejectionReason1Choice }
     *     
     */
    public Tsmt00700101 setRjctnRsn(RejectionReason1Choice value) {
        this.rjctnRsn = value;
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
