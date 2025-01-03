
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
 * An executing party, for example, a transfer agent, sends the ReversalOfTransferOutConfirmation message to the instructing party, for example, an investment manager or its authorised representative, to cancel a previously sent TransferOutConfirmation message.
 * Usage
 * The ReversalOfTransferOutConfirmation message is used to reverse a previously sent TransferOutConfirmation.
 * There are two ways to specify the reversal of the transfer out confirmation. Either:
 * - the business references, for example, TransferReference, TransferConfirmationIdentification, of the transfer confirmation are quoted, or,
 * - all the details of the transfer confirmation (this includes TransferReference and TransferConfirmationIdentification) are quoted but this is not recommended.
 * The message identification of the TransferOutConfirmation message in which the transfer out confirmation was conveyed may also be quoted in PreviousReference. The message identification of the TransferOutInstruction message in which the transfer out instruction was conveyed may also be quoted in RelatedReference.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReversalOfTransferOutConfirmationV03", propOrder = {
    "msgId",
    "refs",
    "rvslByRef",
    "rvslByTrfOutConfDtls",
    "cpyDtls"
})
public class ReversalOfTransferOutConfirmationV03 {

    @XmlElement(name = "MsgId", required = true)
    protected MessageIdentification1 msgId;
    @XmlElement(name = "Refs", required = true)
    protected List<References11> refs;
    @XmlElement(name = "RvslByRef")
    protected TransferReference2 rvslByRef;
    @XmlElement(name = "RvslByTrfOutConfDtls")
    protected TransferOut8 rvslByTrfOutConfDtls;
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
    public ReversalOfTransferOutConfirmationV03 setMsgId(MessageIdentification1 value) {
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
     * {@link References11 }
     * 
     * 
     * @return
     *     The value of the refs property.
     */
    public List<References11> getRefs() {
        if (refs == null) {
            refs = new ArrayList<>();
        }
        return this.refs;
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
    public ReversalOfTransferOutConfirmationV03 setRvslByRef(TransferReference2 value) {
        this.rvslByRef = value;
        return this;
    }

    /**
     * Gets the value of the rvslByTrfOutConfDtls property.
     * 
     * @return
     *     possible object is
     *     {@link TransferOut8 }
     *     
     */
    public TransferOut8 getRvslByTrfOutConfDtls() {
        return rvslByTrfOutConfDtls;
    }

    /**
     * Sets the value of the rvslByTrfOutConfDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransferOut8 }
     *     
     */
    public ReversalOfTransferOutConfirmationV03 setRvslByTrfOutConfDtls(TransferOut8 value) {
        this.rvslByTrfOutConfDtls = value;
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
    public ReversalOfTransferOutConfirmationV03 setCpyDtls(CopyInformation2 value) {
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
    public ReversalOfTransferOutConfirmationV03 addRefs(References11 refs) {
        getRefs().add(refs);
        return this;
    }

}
