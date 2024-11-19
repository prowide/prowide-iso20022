
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
 * The RedemptionBulkOrderConfirmation message is sent by an executing party, for example, a transfer agent, to the instructing party, for example, an investment manager or its authorised representative, to confirm the details of execution for a previously received RedemptionBulkOrder message.
 * Usage
 * The RedemptionBulkOrderConfirmation message is used to confirm the execution of all individual orders included in a previously sent RedemptionBulkOrder message.
 * There is usually one bulk confirmation message for one bulk order message.
 * Each individual order confirmation specified is identified in DealReference. The reference of the original individual order is specified in OrderReference. The message identification of the RedemptionBulkOrder message in which the individual order was conveyed may also be quoted in RelatedReference, but this is not recommended.
 * A RedemptionBulkOrder must in all cases be responded to by a RedemptionBulkOrderConfirmation and in no circumstances by a RedemptionOrderConfirmation.
 * If the executing party needs to confirm a RedemptionOrder instruction, then the RedemptionOrderConfirmation must be used.
 * When the message is used to convey a confirmation amendment/s, the AmendmentIndicator must be present with the value ‘true’ or ‘1’. When this is the case, the message must only contain a confirmation amendment/s and not contain both a confirmation amendment/s and a ‘new’ confirmation/s.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RedemptionBulkOrderConfirmationV04", propOrder = {
    "msgId",
    "poolRef",
    "prvsRef",
    "rltdRef",
    "blkExctnDtls",
    "cpyDtls",
    "xtnsn"
})
public class RedemptionBulkOrderConfirmationV04 {

    @XmlElement(name = "MsgId", required = true)
    protected MessageIdentification1 msgId;
    @XmlElement(name = "PoolRef")
    protected AdditionalReference9 poolRef;
    @XmlElement(name = "PrvsRef")
    protected List<AdditionalReference8> prvsRef;
    @XmlElement(name = "RltdRef")
    protected AdditionalReference8 rltdRef;
    @XmlElement(name = "BlkExctnDtls", required = true)
    protected RedemptionBulkExecution5 blkExctnDtls;
    @XmlElement(name = "CpyDtls")
    protected CopyInformation4 cpyDtls;
    @XmlElement(name = "Xtnsn")
    protected List<Extension1> xtnsn;

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
    public RedemptionBulkOrderConfirmationV04 setMsgId(MessageIdentification1 value) {
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
    public RedemptionBulkOrderConfirmationV04 setPoolRef(AdditionalReference9 value) {
        this.poolRef = value;
        return this;
    }

    /**
     * Gets the value of the prvsRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the prvsRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrvsRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalReference8 }
     * 
     * 
     * @return
     *     The value of the prvsRef property.
     */
    public List<AdditionalReference8> getPrvsRef() {
        if (prvsRef == null) {
            prvsRef = new ArrayList<>();
        }
        return this.prvsRef;
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
    public RedemptionBulkOrderConfirmationV04 setRltdRef(AdditionalReference8 value) {
        this.rltdRef = value;
        return this;
    }

    /**
     * Gets the value of the blkExctnDtls property.
     * 
     * @return
     *     possible object is
     *     {@link RedemptionBulkExecution5 }
     *     
     */
    public RedemptionBulkExecution5 getBlkExctnDtls() {
        return blkExctnDtls;
    }

    /**
     * Sets the value of the blkExctnDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link RedemptionBulkExecution5 }
     *     
     */
    public RedemptionBulkOrderConfirmationV04 setBlkExctnDtls(RedemptionBulkExecution5 value) {
        this.blkExctnDtls = value;
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
    public RedemptionBulkOrderConfirmationV04 setCpyDtls(CopyInformation4 value) {
        this.cpyDtls = value;
        return this;
    }

    /**
     * Gets the value of the xtnsn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the xtnsn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getXtnsn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Extension1 }
     * 
     * 
     * @return
     *     The value of the xtnsn property.
     */
    public List<Extension1> getXtnsn() {
        if (xtnsn == null) {
            xtnsn = new ArrayList<>();
        }
        return this.xtnsn;
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
     * Adds a new item to the prvsRef list.
     * @see #getPrvsRef()
     * 
     */
    public RedemptionBulkOrderConfirmationV04 addPrvsRef(AdditionalReference8 prvsRef) {
        getPrvsRef().add(prvsRef);
        return this;
    }

    /**
     * Adds a new item to the xtnsn list.
     * @see #getXtnsn()
     * 
     */
    public RedemptionBulkOrderConfirmationV04 addXtnsn(Extension1 xtnsn) {
        getXtnsn().add(xtnsn);
        return this;
    }

}
