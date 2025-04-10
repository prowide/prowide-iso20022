
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
 * The AmendmentAcceptance message is sent by the party requested to accept or reject an amendment to the matching application.
 * The message is used to accept an amendment request.
 * Usage
 * The AmendmentAcceptance message can be sent by the party requested to accept or reject an amendment to inform that it accepts the requested amendment.
 * The message can be sent in response to a FullPushThroughReport and DeltaReport message conveying the details of a BaselineAmendmentRequest message.
 * The rejection of an amendment request can be achieved by sending an AmendmentRejection message.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AmendmentAcceptanceV02", propOrder = {
    "accptncId",
    "txId",
    "submitrTxRef",
    "dltaRptRef",
    "accptdAmdmntNb"
})
public class AmendmentAcceptanceV02 {

    @XmlElement(name = "AccptncId", required = true)
    protected MessageIdentification1 accptncId;
    @XmlElement(name = "TxId", required = true)
    protected SimpleIdentificationInformation txId;
    @XmlElement(name = "SubmitrTxRef")
    protected SimpleIdentificationInformation submitrTxRef;
    @XmlElement(name = "DltaRptRef", required = true)
    protected MessageIdentification1 dltaRptRef;
    @XmlElement(name = "AccptdAmdmntNb", required = true)
    protected Count1 accptdAmdmntNb;

    /**
     * Gets the value of the accptncId property.
     * 
     * @return
     *     possible object is
     *     {@link MessageIdentification1 }
     *     
     */
    public MessageIdentification1 getAccptncId() {
        return accptncId;
    }

    /**
     * Sets the value of the accptncId property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageIdentification1 }
     *     
     */
    public AmendmentAcceptanceV02 setAccptncId(MessageIdentification1 value) {
        this.accptncId = value;
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
    public AmendmentAcceptanceV02 setTxId(SimpleIdentificationInformation value) {
        this.txId = value;
        return this;
    }

    /**
     * Gets the value of the submitrTxRef property.
     * 
     * @return
     *     possible object is
     *     {@link SimpleIdentificationInformation }
     *     
     */
    public SimpleIdentificationInformation getSubmitrTxRef() {
        return submitrTxRef;
    }

    /**
     * Sets the value of the submitrTxRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link SimpleIdentificationInformation }
     *     
     */
    public AmendmentAcceptanceV02 setSubmitrTxRef(SimpleIdentificationInformation value) {
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
    public AmendmentAcceptanceV02 setDltaRptRef(MessageIdentification1 value) {
        this.dltaRptRef = value;
        return this;
    }

    /**
     * Gets the value of the accptdAmdmntNb property.
     * 
     * @return
     *     possible object is
     *     {@link Count1 }
     *     
     */
    public Count1 getAccptdAmdmntNb() {
        return accptdAmdmntNb;
    }

    /**
     * Sets the value of the accptdAmdmntNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link Count1 }
     *     
     */
    public AmendmentAcceptanceV02 setAccptdAmdmntNb(Count1 value) {
        this.accptdAmdmntNb = value;
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
