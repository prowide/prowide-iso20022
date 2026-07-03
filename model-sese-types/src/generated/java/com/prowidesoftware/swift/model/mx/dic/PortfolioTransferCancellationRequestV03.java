
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
 * An instructing party, eg, a (new) plan manager (Transferee), sends the PortfolioTransferCancellationRequest message to the executing party, eg, a (old) plan manager (Transferor), to request the cancellation of a previously sent PortfolioTransferInstruction.
 * Usage
 * The PortfolioTransferCancellationRequest message is used to request the cancellation of an entire PortfolioTransferInstruction message, ie, all the product transfers that it contained. The cancellation request can be specified either by:
 * - quoting the transfer references of all the product transfers listed in the PortfolioTransferInstruction message, or,
 * - quoting the details of all the product transfers (this includes TransferReference) listed in PortfolioTransferInstruction message.
 * The message identification of the PortfolioTransferInstruction may also be quoted in PreviousReference. It is also possible to request the cancellation of PortfolioTransferInstruction by just quoting its message identification in PreviousReference.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PortfolioTransferCancellationRequestV03", propOrder = {
    "msgRef",
    "poolRef",
    "prvsRef",
    "rltdRef",
    "cxlByTrfInstrDtls",
    "cxlByRef"
})
public class PortfolioTransferCancellationRequestV03 {

    @XmlElement(name = "MsgRef", required = true)
    protected MessageIdentification1 msgRef;
    @XmlElement(name = "PoolRef")
    protected AdditionalReference3 poolRef;
    @XmlElement(name = "PrvsRef")
    protected AdditionalReference3 prvsRef;
    @XmlElement(name = "RltdRef")
    protected AdditionalReference3 rltdRef;
    @XmlElement(name = "CxlByTrfInstrDtls")
    protected PEPISATransfer11 cxlByTrfInstrDtls;
    @XmlElement(name = "CxlByRef")
    protected TransferReference3 cxlByRef;

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
    public PortfolioTransferCancellationRequestV03 setMsgRef(MessageIdentification1 value) {
        this.msgRef = value;
        return this;
    }

    /**
     * Gets the value of the poolRef property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalReference3 }
     *     
     */
    public AdditionalReference3 getPoolRef() {
        return poolRef;
    }

    /**
     * Sets the value of the poolRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalReference3 }
     *     
     */
    public PortfolioTransferCancellationRequestV03 setPoolRef(AdditionalReference3 value) {
        this.poolRef = value;
        return this;
    }

    /**
     * Gets the value of the prvsRef property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalReference3 }
     *     
     */
    public AdditionalReference3 getPrvsRef() {
        return prvsRef;
    }

    /**
     * Sets the value of the prvsRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalReference3 }
     *     
     */
    public PortfolioTransferCancellationRequestV03 setPrvsRef(AdditionalReference3 value) {
        this.prvsRef = value;
        return this;
    }

    /**
     * Gets the value of the rltdRef property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalReference3 }
     *     
     */
    public AdditionalReference3 getRltdRef() {
        return rltdRef;
    }

    /**
     * Sets the value of the rltdRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalReference3 }
     *     
     */
    public PortfolioTransferCancellationRequestV03 setRltdRef(AdditionalReference3 value) {
        this.rltdRef = value;
        return this;
    }

    /**
     * Gets the value of the cxlByTrfInstrDtls property.
     * 
     * @return
     *     possible object is
     *     {@link PEPISATransfer11 }
     *     
     */
    public PEPISATransfer11 getCxlByTrfInstrDtls() {
        return cxlByTrfInstrDtls;
    }

    /**
     * Sets the value of the cxlByTrfInstrDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link PEPISATransfer11 }
     *     
     */
    public PortfolioTransferCancellationRequestV03 setCxlByTrfInstrDtls(PEPISATransfer11 value) {
        this.cxlByTrfInstrDtls = value;
        return this;
    }

    /**
     * Gets the value of the cxlByRef property.
     * 
     * @return
     *     possible object is
     *     {@link TransferReference3 }
     *     
     */
    public TransferReference3 getCxlByRef() {
        return cxlByRef;
    }

    /**
     * Sets the value of the cxlByRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransferReference3 }
     *     
     */
    public PortfolioTransferCancellationRequestV03 setCxlByRef(TransferReference3 value) {
        this.cxlByRef = value;
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
