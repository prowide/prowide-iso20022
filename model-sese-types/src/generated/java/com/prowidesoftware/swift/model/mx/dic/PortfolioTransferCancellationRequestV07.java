
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
 * An instructing party, for example, a (new) plan manager (Transferee), sends the PortfolioTransferCancellationRequest message to the executing party, for example, a (old) plan manager (Transferor), to request the cancellation of a previously sent PortfolioTransferInstruction.
 * Usage
 * The PortfolioTransferCancellationRequest message is used to request the cancellation of an entire PortfolioTransferInstruction message, that is, all the product transfers that it contained. The cancellation request can be specified either by:
 * - quoting the transfer references of all the product transfers listed in the PortfolioTransferInstruction message, or,
 * - quoting the details of all the product transfers (this includes TransferReference) listed in PortfolioTransferInstruction message.
 * The message identification of the PortfolioTransferInstruction may also be quoted in PreviousReference. It is also possible to request the cancellation of PortfolioTransferInstruction by just quoting its message identification in PreviousReference.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PortfolioTransferCancellationRequestV07", propOrder = {
    "msgRef",
    "poolRef",
    "prvsRef",
    "rltdRef",
    "cxl",
    "mktPrctcVrsn"
})
public class PortfolioTransferCancellationRequestV07 {

    @XmlElement(name = "MsgRef", required = true)
    protected MessageIdentification1 msgRef;
    @XmlElement(name = "PoolRef")
    protected AdditionalReference6 poolRef;
    @XmlElement(name = "PrvsRef")
    protected AdditionalReference6 prvsRef;
    @XmlElement(name = "RltdRef")
    protected AdditionalReference6 rltdRef;
    @XmlElement(name = "Cxl", required = true)
    protected Cancellation11Choice cxl;
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
    public PortfolioTransferCancellationRequestV07 setMsgRef(MessageIdentification1 value) {
        this.msgRef = value;
        return this;
    }

    /**
     * Gets the value of the poolRef property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalReference6 }
     *     
     */
    public AdditionalReference6 getPoolRef() {
        return poolRef;
    }

    /**
     * Sets the value of the poolRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalReference6 }
     *     
     */
    public PortfolioTransferCancellationRequestV07 setPoolRef(AdditionalReference6 value) {
        this.poolRef = value;
        return this;
    }

    /**
     * Gets the value of the prvsRef property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalReference6 }
     *     
     */
    public AdditionalReference6 getPrvsRef() {
        return prvsRef;
    }

    /**
     * Sets the value of the prvsRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalReference6 }
     *     
     */
    public PortfolioTransferCancellationRequestV07 setPrvsRef(AdditionalReference6 value) {
        this.prvsRef = value;
        return this;
    }

    /**
     * Gets the value of the rltdRef property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalReference6 }
     *     
     */
    public AdditionalReference6 getRltdRef() {
        return rltdRef;
    }

    /**
     * Sets the value of the rltdRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalReference6 }
     *     
     */
    public PortfolioTransferCancellationRequestV07 setRltdRef(AdditionalReference6 value) {
        this.rltdRef = value;
        return this;
    }

    /**
     * Gets the value of the cxl property.
     * 
     * @return
     *     possible object is
     *     {@link Cancellation11Choice }
     *     
     */
    public Cancellation11Choice getCxl() {
        return cxl;
    }

    /**
     * Sets the value of the cxl property.
     * 
     * @param value
     *     allowed object is
     *     {@link Cancellation11Choice }
     *     
     */
    public PortfolioTransferCancellationRequestV07 setCxl(Cancellation11Choice value) {
        this.cxl = value;
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
    public PortfolioTransferCancellationRequestV07 setMktPrctcVrsn(MarketPracticeVersion1 value) {
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
