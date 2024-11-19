
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
 * An instructing party, for example, a transfer agent, sends the TransferInCancellationRequest message to the executing party, for example, a transfer agent, to request the cancellation of a previously sent TransferInInstruction.
 * Usage
 * The TransferInCancellationRequest message is used to request cancellation of a previously sent TransferInInstruction.
 * There are two ways to specify the transfer cancellation request. Either:
 * - the transfer reference of the original transfer is quoted, or,
 * - all the details of the original transfer (this includes TransferReference) are quoted but this is not recommended.
 * The message identification of the TransferInInstruction message in which the transfer was conveyed may also be quoted in PreviousReference. It is also possible to request the cancellation of a TransferInInstruction message by quoting its message identification in PreviousReference.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransferInCancellationRequestV03", propOrder = {
    "msgId",
    "refs",
    "cxlByRef",
    "cxlByTrfInDtls",
    "cpyDtls"
})
public class TransferInCancellationRequestV03 {

    @XmlElement(name = "MsgId", required = true)
    protected MessageIdentification1 msgId;
    @XmlElement(name = "Refs", required = true)
    protected List<References11> refs;
    @XmlElement(name = "CxlByRef")
    protected TransferReference1 cxlByRef;
    @XmlElement(name = "CxlByTrfInDtls")
    protected TransferIn5 cxlByTrfInDtls;
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
    public TransferInCancellationRequestV03 setMsgId(MessageIdentification1 value) {
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
     * Gets the value of the cxlByRef property.
     * 
     * @return
     *     possible object is
     *     {@link TransferReference1 }
     *     
     */
    public TransferReference1 getCxlByRef() {
        return cxlByRef;
    }

    /**
     * Sets the value of the cxlByRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransferReference1 }
     *     
     */
    public TransferInCancellationRequestV03 setCxlByRef(TransferReference1 value) {
        this.cxlByRef = value;
        return this;
    }

    /**
     * Gets the value of the cxlByTrfInDtls property.
     * 
     * @return
     *     possible object is
     *     {@link TransferIn5 }
     *     
     */
    public TransferIn5 getCxlByTrfInDtls() {
        return cxlByTrfInDtls;
    }

    /**
     * Sets the value of the cxlByTrfInDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransferIn5 }
     *     
     */
    public TransferInCancellationRequestV03 setCxlByTrfInDtls(TransferIn5 value) {
        this.cxlByTrfInDtls = value;
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
    public TransferInCancellationRequestV03 setCpyDtls(CopyInformation2 value) {
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
    public TransferInCancellationRequestV03 addRefs(References11 refs) {
        getRefs().add(refs);
        return this;
    }

}
