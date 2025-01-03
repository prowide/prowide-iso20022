
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
 * The PortfolioTransferCancellationRequest message is sent by, for example, an investment manager or its authorised representative, to the executing party, for example, a transfer agent, to request the cancellation of a previously sent PortfolioTransferInstruction message.
 * Usage
 * The PortfolioTransferCancellationRequest message is used to request the cancellation of a portfolio transfer instruction.
 * There is no amendment, but a cancellation and re-instruct policy.
 * To request the cancellation of a portfolio transfer instruction, the transfer reference of the portfolio transfer, as specified in the original PortfolioTransferInstruction message, is specified in the transfer reference element.
 * The message identification of the original PortfolioTransferInstruction message may also be quoted in PreviousReference but this is not recommended.
 * The deadline and acceptance of a cancellation request is subject to a service level agreement (SLA). This cancellation message is a cancellation request. There is no automatic acceptance of the cancellation.
 * The rejection or acceptance of a PortfolioTransferCancellationRequest is made using an TransferCancellationStatusReport message.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PortfolioTransferCancellationRequestV09", propOrder = {
    "msgRef",
    "poolRef",
    "prvsRef",
    "rltdRef",
    "mstrRef",
    "trfRefs",
    "mktPrctcVrsn"
})
public class PortfolioTransferCancellationRequestV09 {

    @XmlElement(name = "MsgRef", required = true)
    protected MessageIdentification1 msgRef;
    @XmlElement(name = "PoolRef")
    protected AdditionalReference11 poolRef;
    @XmlElement(name = "PrvsRef")
    protected AdditionalReference10 prvsRef;
    @XmlElement(name = "RltdRef")
    protected AdditionalReference10 rltdRef;
    @XmlElement(name = "MstrRef")
    protected String mstrRef;
    @XmlElement(name = "TrfRefs", required = true)
    protected TransferReference14 trfRefs;
    @XmlElement(name = "MktPrctcVrsn")
    protected MarketPracticeVersion1 mktPrctcVrsn;

    /**
     * Gets the value of the msgRef property.
     * 
     * @return
     *     possible object is
     *     {@link MessageIdentification1 }
     *     
     */
    public MessageIdentification1 getMsgRef() {
        return msgRef;
    }

    /**
     * Sets the value of the msgRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageIdentification1 }
     *     
     */
    public PortfolioTransferCancellationRequestV09 setMsgRef(MessageIdentification1 value) {
        this.msgRef = value;
        return this;
    }

    /**
     * Gets the value of the poolRef property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalReference11 }
     *     
     */
    public AdditionalReference11 getPoolRef() {
        return poolRef;
    }

    /**
     * Sets the value of the poolRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalReference11 }
     *     
     */
    public PortfolioTransferCancellationRequestV09 setPoolRef(AdditionalReference11 value) {
        this.poolRef = value;
        return this;
    }

    /**
     * Gets the value of the prvsRef property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalReference10 }
     *     
     */
    public AdditionalReference10 getPrvsRef() {
        return prvsRef;
    }

    /**
     * Sets the value of the prvsRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalReference10 }
     *     
     */
    public PortfolioTransferCancellationRequestV09 setPrvsRef(AdditionalReference10 value) {
        this.prvsRef = value;
        return this;
    }

    /**
     * Gets the value of the rltdRef property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalReference10 }
     *     
     */
    public AdditionalReference10 getRltdRef() {
        return rltdRef;
    }

    /**
     * Sets the value of the rltdRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalReference10 }
     *     
     */
    public PortfolioTransferCancellationRequestV09 setRltdRef(AdditionalReference10 value) {
        this.rltdRef = value;
        return this;
    }

    /**
     * Gets the value of the mstrRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMstrRef() {
        return mstrRef;
    }

    /**
     * Sets the value of the mstrRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PortfolioTransferCancellationRequestV09 setMstrRef(String value) {
        this.mstrRef = value;
        return this;
    }

    /**
     * Gets the value of the trfRefs property.
     * 
     * @return
     *     possible object is
     *     {@link TransferReference14 }
     *     
     */
    public TransferReference14 getTrfRefs() {
        return trfRefs;
    }

    /**
     * Sets the value of the trfRefs property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransferReference14 }
     *     
     */
    public PortfolioTransferCancellationRequestV09 setTrfRefs(TransferReference14 value) {
        this.trfRefs = value;
        return this;
    }

    /**
     * Gets the value of the mktPrctcVrsn property.
     * 
     * @return
     *     possible object is
     *     {@link MarketPracticeVersion1 }
     *     
     */
    public MarketPracticeVersion1 getMktPrctcVrsn() {
        return mktPrctcVrsn;
    }

    /**
     * Sets the value of the mktPrctcVrsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link MarketPracticeVersion1 }
     *     
     */
    public PortfolioTransferCancellationRequestV09 setMktPrctcVrsn(MarketPracticeVersion1 value) {
        this.mktPrctcVrsn = value;
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
