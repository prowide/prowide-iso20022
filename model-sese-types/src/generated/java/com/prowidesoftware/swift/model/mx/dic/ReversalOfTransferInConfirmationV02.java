
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
 * An executing party, eg, a transfer agent, sends the ReversalOfTransferInConfirmation message to the instructing party, eg, an investment manager or its authorised representative, to cancel a previously sent TransferInConfirmation message.
 * Usage
 * The ReversalOfTransferInConfirmation message is used to reverse a previously sent TransferInConfirmation.
 * There are two ways to specify the reversal of the transfer in confirmation. Either:
 * - the business references, eg, TransferReference, TransferConfirmationIdentification, of the transfer confirmation are quoted, or,
 * - all the details of the transfer confirmation (this includes TransferReference and TransferConfirmationIdentification) are quoted but this is not recommended.
 * The message identification of the TransferInConfirmation message in which the transfer confirmation was conveyed may also be quoted in PreviousReference.
 * The message reference (MessageIdentification) of the TransferInInstruction message in which the transfer instruction was conveyed may also be quoted in RelatedReference.
 * It is also possible to request a reversal of a TransferInConfirmation by quoting its message reference (MessageIdentification) in PreviousReference.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReversalOfTransferInConfirmationV02", propOrder = {
    "msgId",
    "prvsRef",
    "poolRef",
    "rltdRef",
    "rvslByRef",
    "rvslByTrfInConfDtls",
    "cpyDtls"
})
public class ReversalOfTransferInConfirmationV02 {

    @XmlElement(name = "MsgId", required = true)
    protected MessageIdentification1 msgId;
    @XmlElement(name = "PrvsRef")
    protected AdditionalReference2 prvsRef;
    @XmlElement(name = "PoolRef")
    protected AdditionalReference2 poolRef;
    @XmlElement(name = "RltdRef")
    protected AdditionalReference2 rltdRef;
    @XmlElement(name = "RvslByRef")
    protected TransferReference2 rvslByRef;
    @XmlElement(name = "RvslByTrfInConfDtls")
    protected TransferIn4 rvslByTrfInConfDtls;
    @XmlElement(name = "CpyDtls")
    protected CopyInformation2 cpyDtls;

    /**
     * Gets the value of the msgId property.
     * 
     * @return
     *     possible object is
     *     {@link MessageIdentification1 }
     *     
     */
    public MessageIdentification1 getMsgId() {
        return msgId;
    }

    /**
     * Sets the value of the msgId property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageIdentification1 }
     *     
     */
    public ReversalOfTransferInConfirmationV02 setMsgId(MessageIdentification1 value) {
        this.msgId = value;
        return this;
    }

    /**
     * Gets the value of the prvsRef property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalReference2 }
     *     
     */
    public AdditionalReference2 getPrvsRef() {
        return prvsRef;
    }

    /**
     * Sets the value of the prvsRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalReference2 }
     *     
     */
    public ReversalOfTransferInConfirmationV02 setPrvsRef(AdditionalReference2 value) {
        this.prvsRef = value;
        return this;
    }

    /**
     * Gets the value of the poolRef property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalReference2 }
     *     
     */
    public AdditionalReference2 getPoolRef() {
        return poolRef;
    }

    /**
     * Sets the value of the poolRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalReference2 }
     *     
     */
    public ReversalOfTransferInConfirmationV02 setPoolRef(AdditionalReference2 value) {
        this.poolRef = value;
        return this;
    }

    /**
     * Gets the value of the rltdRef property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalReference2 }
     *     
     */
    public AdditionalReference2 getRltdRef() {
        return rltdRef;
    }

    /**
     * Sets the value of the rltdRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalReference2 }
     *     
     */
    public ReversalOfTransferInConfirmationV02 setRltdRef(AdditionalReference2 value) {
        this.rltdRef = value;
        return this;
    }

    /**
     * Gets the value of the rvslByRef property.
     * 
     * @return
     *     possible object is
     *     {@link TransferReference2 }
     *     
     */
    public TransferReference2 getRvslByRef() {
        return rvslByRef;
    }

    /**
     * Sets the value of the rvslByRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransferReference2 }
     *     
     */
    public ReversalOfTransferInConfirmationV02 setRvslByRef(TransferReference2 value) {
        this.rvslByRef = value;
        return this;
    }

    /**
     * Gets the value of the rvslByTrfInConfDtls property.
     * 
     * @return
     *     possible object is
     *     {@link TransferIn4 }
     *     
     */
    public TransferIn4 getRvslByTrfInConfDtls() {
        return rvslByTrfInConfDtls;
    }

    /**
     * Sets the value of the rvslByTrfInConfDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransferIn4 }
     *     
     */
    public ReversalOfTransferInConfirmationV02 setRvslByTrfInConfDtls(TransferIn4 value) {
        this.rvslByTrfInConfDtls = value;
        return this;
    }

    /**
     * Gets the value of the cpyDtls property.
     * 
     * @return
     *     possible object is
     *     {@link CopyInformation2 }
     *     
     */
    public CopyInformation2 getCpyDtls() {
        return cpyDtls;
    }

    /**
     * Sets the value of the cpyDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link CopyInformation2 }
     *     
     */
    public ReversalOfTransferInConfirmationV02 setCpyDtls(CopyInformation2 value) {
        this.cpyDtls = value;
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
