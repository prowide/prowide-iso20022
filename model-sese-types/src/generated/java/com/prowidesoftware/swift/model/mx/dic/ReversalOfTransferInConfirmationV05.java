
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
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
 * An executing party, for example, a transfer agent, sends the ReversalOfTransferInConfirmation message to the instructing party, for example, an investment manager or its authorised representative, to cancel a previously sent TransferInConfirmation message.
 * Usage
 * The ReversalOfTransferInConfirmation message is used to reverse a previously sent TransferInConfirmation.
 * There are two ways to specify the reversal of the transfer in confirmation. Either:
 * - the business references, for example, TransferReference, TransferConfirmationIdentification, of the transfer confirmation are quoted, or,
 * - all the details of the transfer confirmation (this includes TransferReference and TransferConfirmationIdentification) are quoted but this is not recommended.
 * The message identification of the TransferInConfirmation message in which the transfer confirmation was conveyed may also be quoted in PreviousReference.
 * The message reference (MessageIdentification) of the TransferInInstruction message in which the transfer instruction was conveyed may also be quoted in RelatedReference.
 * 
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReversalOfTransferInConfirmationV05", propOrder = {
    "msgId",
    "refs",
    "rvsl",
    "mktPrctcVrsn",
    "cpyDtls"
})
public class ReversalOfTransferInConfirmationV05 {

    @XmlElement(name = "MsgId", required = true)
    protected MessageIdentification1 msgId;
    @XmlElement(name = "Refs")
    protected List<References15> refs;
    @XmlElement(name = "Rvsl", required = true)
    protected Reversal4Choice rvsl;
    @XmlElement(name = "MktPrctcVrsn")
    protected MarketPracticeVersion1 mktPrctcVrsn;
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
    public ReversalOfTransferInConfirmationV05 setMsgId(MessageIdentification1 value) {
        this.msgId = value;
        return this;
    }

    /**
     * Gets the value of the refs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the refs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRefs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link References15 }
     * 
     * 
     * @return
     *     The value of the refs property.
     */
    public List<References15> getRefs() {
        if (refs == null) {
            refs = new ArrayList<>();
        }
        return this.refs;
    }

    /**
     * Gets the value of the rvsl property.
     * 
     * @return
     *     possible object is
     *     {@link Reversal4Choice }
     *     
     */
    public Reversal4Choice getRvsl() {
        return rvsl;
    }

    /**
     * Sets the value of the rvsl property.
     * 
     * @param value
     *     allowed object is
     *     {@link Reversal4Choice }
     *     
     */
    public ReversalOfTransferInConfirmationV05 setRvsl(Reversal4Choice value) {
        this.rvsl = value;
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
    public ReversalOfTransferInConfirmationV05 setMktPrctcVrsn(MarketPracticeVersion1 value) {
        this.mktPrctcVrsn = value;
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
    public ReversalOfTransferInConfirmationV05 setCpyDtls(CopyInformation2 value) {
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

    /**
     * Adds a new item to the refs list.
     * @see #getRefs()
     * 
     */
    public ReversalOfTransferInConfirmationV05 addRefs(References15 refs) {
        getRefs().add(refs);
        return this;
    }

}
