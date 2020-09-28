
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
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
 * An executing party, for example, a transfer agent, sends the SwitchOrderConfirmationCancellationInstruction message to the instructing party, for example, an investment manager or its authorised representative to amend a previously sent SwitchOrderConfirmation message.
 * Usage
 * The SwitchOrderConfirmationCancellationInstruction message is used to cancel a previously sent SwitchOrderConfirmation.
 * The amendment indicator element is used to specify whether the switch order confirmation cancellation is to be followed by a switch order confirmation amendment.
 * There are two ways to specify the switch order confirmation cancellation. Either:
 * - the business references, for example, OrderReference, DealReference, of the switch order confirmation are quoted, or,
 * - all the details of the switch order confirmation (this includes the OrderReference and DealReference) are quoted, but this is not recommended.
 * The message identification of the SwitchOrderConfirmation message may also be quoted in PreviousReference.
 * It is also possible to instruct the cancellation of the confirmation message by quoting its message identification in PreviousReference, but this is not recommended.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SwitchOrderConfirmationCancellationInstructionV01", propOrder = {
    "msgId",
    "poolRef",
    "prvsRef",
    "rltdRef",
    "cxlByRef",
    "cxlByOrdrConfDtls",
    "cpyDtls"
})
public class SwitchOrderConfirmationCancellationInstructionV01 {

    @XmlElement(name = "MsgId", required = true)
    protected MessageIdentification1 msgId;
    @XmlElement(name = "PoolRef")
    protected AdditionalReference3 poolRef;
    @XmlElement(name = "PrvsRef")
    protected List<AdditionalReference3> prvsRef;
    @XmlElement(name = "RltdRef")
    protected AdditionalReference3 rltdRef;
    @XmlElement(name = "CxlByRef")
    protected InvestmentFundOrderExecution1 cxlByRef;
    @XmlElement(name = "CxlByOrdrConfDtls")
    protected SwitchOrderConfirmation1 cxlByOrdrConfDtls;
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
    public SwitchOrderConfirmationCancellationInstructionV01 setMsgId(MessageIdentification1 value) {
        this.msgId = value;
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
    public SwitchOrderConfirmationCancellationInstructionV01 setPoolRef(AdditionalReference3 value) {
        this.poolRef = value;
        return this;
    }

    /**
     * Gets the value of the prvsRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the prvsRef property.
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
     * {@link AdditionalReference3 }
     * 
     * 
     */
    public List<AdditionalReference3> getPrvsRef() {
        if (prvsRef == null) {
            prvsRef = new ArrayList<AdditionalReference3>();
        }
        return this.prvsRef;
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
    public SwitchOrderConfirmationCancellationInstructionV01 setRltdRef(AdditionalReference3 value) {
        this.rltdRef = value;
        return this;
    }

    /**
     * Gets the value of the cxlByRef property.
     * 
     * @return
     *     possible object is
     *     {@link InvestmentFundOrderExecution1 }
     *     
     */
    public InvestmentFundOrderExecution1 getCxlByRef() {
        return cxlByRef;
    }

    /**
     * Sets the value of the cxlByRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvestmentFundOrderExecution1 }
     *     
     */
    public SwitchOrderConfirmationCancellationInstructionV01 setCxlByRef(InvestmentFundOrderExecution1 value) {
        this.cxlByRef = value;
        return this;
    }

    /**
     * Gets the value of the cxlByOrdrConfDtls property.
     * 
     * @return
     *     possible object is
     *     {@link SwitchOrderConfirmation1 }
     *     
     */
    public SwitchOrderConfirmation1 getCxlByOrdrConfDtls() {
        return cxlByOrdrConfDtls;
    }

    /**
     * Sets the value of the cxlByOrdrConfDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwitchOrderConfirmation1 }
     *     
     */
    public SwitchOrderConfirmationCancellationInstructionV01 setCxlByOrdrConfDtls(SwitchOrderConfirmation1 value) {
        this.cxlByOrdrConfDtls = value;
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
    public SwitchOrderConfirmationCancellationInstructionV01 setCpyDtls(CopyInformation2 value) {
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
     * Adds a new item to the prvsRef list.
     * @see #getPrvsRef()
     * 
     */
    public SwitchOrderConfirmationCancellationInstructionV01 addPrvsRef(AdditionalReference3 prvsRef) {
        getPrvsRef().add(prvsRef);
        return this;
    }

}
