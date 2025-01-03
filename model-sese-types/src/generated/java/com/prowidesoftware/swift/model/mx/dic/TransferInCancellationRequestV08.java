
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Scope
 * The TransferInCancellationRequest message is sent by, for example, an investment manager or its authorised representative, to the executing party, for example, a transfer agent, to request the cancellation of a previously sent transfer in instruction.
 * Usage
 * The TransferInCancellationRequest message is used to request the cancellation of one or more transfer in instructions.
 * There is no amendment, but a cancellation and re-instruct policy.
 * To request the cancellation of one or more transfer in instructions, the transfer reference of the transfer, as specified in the original TransferInInstruction message, is specified in the transfer reference element.
 * The message identification of the original TransferOutInstruction message may also be quoted in PreviousReference but this is not recommended.
 * The deadline and acceptance of a cancellation request is subject to a service level agreement (SLA). This cancellation message is a cancellation request. There is no automatic acceptance of the cancellation.
 * The rejection or acceptance of a TransferInCancellationRequest is made using an TransferCancellationStatusReport message.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransferInCancellationRequestV08", propOrder = {
    "msgId",
    "poolRef",
    "prvsRef",
    "rltdRef",
    "fctn",
    "refs",
    "mktPrctcVrsn",
    "cpyDtls"
})
public class TransferInCancellationRequestV08 {

    @XmlElement(name = "MsgId", required = true)
    protected MessageIdentification1 msgId;
    @XmlElement(name = "PoolRef")
    protected AdditionalReference9 poolRef;
    @XmlElement(name = "PrvsRef")
    protected AdditionalReference8 prvsRef;
    @XmlElement(name = "RltdRef")
    protected AdditionalReference8 rltdRef;
    @XmlElement(name = "Fctn")
    @XmlSchemaType(name = "string")
    protected TransferInFunction1Code fctn;
    @XmlElement(name = "Refs", required = true)
    protected List<TransferReference11> refs;
    @XmlElement(name = "MktPrctcVrsn")
    protected MarketPracticeVersion1 mktPrctcVrsn;
    @XmlElement(name = "CpyDtls")
    protected CopyInformation4 cpyDtls;

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
    public TransferInCancellationRequestV08 setMsgId(MessageIdentification1 value) {
        this.msgId = value;
        return this;
    }

    /**
     * Gets the value of the poolRef property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalReference9 }
     *     
     */
    public AdditionalReference9 getPoolRef() {
        return poolRef;
    }

    /**
     * Sets the value of the poolRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalReference9 }
     *     
     */
    public TransferInCancellationRequestV08 setPoolRef(AdditionalReference9 value) {
        this.poolRef = value;
        return this;
    }

    /**
     * Gets the value of the prvsRef property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalReference8 }
     *     
     */
    public AdditionalReference8 getPrvsRef() {
        return prvsRef;
    }

    /**
     * Sets the value of the prvsRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalReference8 }
     *     
     */
    public TransferInCancellationRequestV08 setPrvsRef(AdditionalReference8 value) {
        this.prvsRef = value;
        return this;
    }

    /**
     * Gets the value of the rltdRef property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalReference8 }
     *     
     */
    public AdditionalReference8 getRltdRef() {
        return rltdRef;
    }

    /**
     * Sets the value of the rltdRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalReference8 }
     *     
     */
    public TransferInCancellationRequestV08 setRltdRef(AdditionalReference8 value) {
        this.rltdRef = value;
        return this;
    }

    /**
     * Gets the value of the fctn property.
     * 
     * @return
     *     possible object is
     *     {@link TransferInFunction1Code }
     *     
     */
    public TransferInFunction1Code getFctn() {
        return fctn;
    }

    /**
     * Sets the value of the fctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransferInFunction1Code }
     *     
     */
    public TransferInCancellationRequestV08 setFctn(TransferInFunction1Code value) {
        this.fctn = value;
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
     * {@link TransferReference11 }
     * 
     * 
     * @return
     *     The value of the refs property.
     */
    public List<TransferReference11> getRefs() {
        if (refs == null) {
            refs = new ArrayList<>();
        }
        return this.refs;
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
    public TransferInCancellationRequestV08 setMktPrctcVrsn(MarketPracticeVersion1 value) {
        this.mktPrctcVrsn = value;
        return this;
    }

    /**
     * Gets the value of the cpyDtls property.
     * 
     * @return
     *     possible object is
     *     {@link CopyInformation4 }
     *     
     */
    public CopyInformation4 getCpyDtls() {
        return cpyDtls;
    }

    /**
     * Sets the value of the cpyDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link CopyInformation4 }
     *     
     */
    public TransferInCancellationRequestV08 setCpyDtls(CopyInformation4 value) {
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
    public TransferInCancellationRequestV08 addRefs(TransferReference11 refs) {
        getRefs().add(refs);
        return this;
    }

}
