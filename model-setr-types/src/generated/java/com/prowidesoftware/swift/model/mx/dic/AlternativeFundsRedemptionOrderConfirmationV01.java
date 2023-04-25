
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
 * An executing party, for example, a transfer agent or administrator, sends the AlternativeFundsRedemptionOrderConfirmation message to the instructing party, for example, an investment manager, custodian or its authorised representative to confirm the details of execution of a previously received AlternativeFundsRedemptionOrder instruction.
 * There may be one or more parties between the executing party and the instructing party.
 * Usage
 * The AlternativeFundsRedemptionOrderConfirmation message is used to confirm the execution of a redemption order.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AlternativeFundsRedemptionOrderConfirmationV01", propOrder = {
    "msgId",
    "prvsRef",
    "rltdRef",
    "ordrExctnDtls",
    "cpyDtls",
    "xtnsn"
})
public class AlternativeFundsRedemptionOrderConfirmationV01 {

    @XmlElement(name = "MsgId", required = true)
    protected MessageIdentification1 msgId;
    @XmlElement(name = "PrvsRef")
    protected AdditionalReference4 prvsRef;
    @XmlElement(name = "RltdRef")
    protected AdditionalReference4 rltdRef;
    @XmlElement(name = "OrdrExctnDtls", required = true)
    protected RedemptionExecution10 ordrExctnDtls;
    @XmlElement(name = "CpyDtls")
    protected CopyInformation2 cpyDtls;
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
    public AlternativeFundsRedemptionOrderConfirmationV01 setMsgId(MessageIdentification1 value) {
        this.msgId = value;
        return this;
    }

    /**
     * Gets the value of the prvsRef property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalReference4 }
     *     
     */
    public AdditionalReference4 getPrvsRef() {
        return prvsRef;
    }

    /**
     * Sets the value of the prvsRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalReference4 }
     *     
     */
    public AlternativeFundsRedemptionOrderConfirmationV01 setPrvsRef(AdditionalReference4 value) {
        this.prvsRef = value;
        return this;
    }

    /**
     * Gets the value of the rltdRef property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalReference4 }
     *     
     */
    public AdditionalReference4 getRltdRef() {
        return rltdRef;
    }

    /**
     * Sets the value of the rltdRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalReference4 }
     *     
     */
    public AlternativeFundsRedemptionOrderConfirmationV01 setRltdRef(AdditionalReference4 value) {
        this.rltdRef = value;
        return this;
    }

    /**
     * Gets the value of the ordrExctnDtls property.
     * 
     * @return
     *     possible object is
     *     {@link RedemptionExecution10 }
     *     
     */
    public RedemptionExecution10 getOrdrExctnDtls() {
        return ordrExctnDtls;
    }

    /**
     * Sets the value of the ordrExctnDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link RedemptionExecution10 }
     *     
     */
    public AlternativeFundsRedemptionOrderConfirmationV01 setOrdrExctnDtls(RedemptionExecution10 value) {
        this.ordrExctnDtls = value;
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
    public AlternativeFundsRedemptionOrderConfirmationV01 setCpyDtls(CopyInformation2 value) {
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
     * Adds a new item to the xtnsn list.
     * @see #getXtnsn()
     * 
     */
    public AlternativeFundsRedemptionOrderConfirmationV01 addXtnsn(Extension1 xtnsn) {
        getXtnsn().add(xtnsn);
        return this;
    }

}
