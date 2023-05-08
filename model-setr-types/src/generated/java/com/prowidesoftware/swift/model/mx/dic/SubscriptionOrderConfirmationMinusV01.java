
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
 * An executing party, eg, a transfer agent, sends the SubscriptionOrderConfirmation message to the instructing party, eg, an investment manager or its authorised representative to confirm the details of the execution of a SubscriptionOrder instruction.
 * Usage
 * The SubscriptionOrderConfirmation message is used to confirm the execution of one order.
 * the order confirmation is identified in DealReference. The reference of the original order is specified in OrderReference. The message identification of the SubscriptionOrder message in which the individual orders was conveyed may also be quoted in RelatedReference.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubscriptionOrderConfirmation.MinusV01", propOrder = {
    "msgId",
    "prvsRef",
    "rltdRef",
    "mltplExctnDtls",
    "cpyDtls",
    "xtnsn"
})
public class SubscriptionOrderConfirmationMinusV01 {

    @XmlElement(name = "MsgId", required = true)
    protected MessageIdentification3 msgId;
    @XmlElement(name = "PrvsRef")
    protected AdditionalReference5 prvsRef;
    @XmlElement(name = "RltdRef")
    protected AdditionalReference5 rltdRef;
    @XmlElement(name = "MltplExctnDtls", required = true)
    protected SubscriptionMultipleExecution4 mltplExctnDtls;
    @XmlElement(name = "CpyDtls")
    protected CopyInformation3 cpyDtls;
    @XmlElement(name = "Xtnsn")
    protected List<Extension1> xtnsn;

    /**
     * Gets the value of the msgId property.
     * 
     * @return
     *     possible object is
     *     {@link MessageIdentification3 }
     *     
     */
    public MessageIdentification3 getMsgId() {
        return msgId;
    }

    /**
     * Sets the value of the msgId property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageIdentification3 }
     *     
     */
    public SubscriptionOrderConfirmationMinusV01 setMsgId(MessageIdentification3 value) {
        this.msgId = value;
        return this;
    }

    /**
     * Gets the value of the prvsRef property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalReference5 }
     *     
     */
    public AdditionalReference5 getPrvsRef() {
        return prvsRef;
    }

    /**
     * Sets the value of the prvsRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalReference5 }
     *     
     */
    public SubscriptionOrderConfirmationMinusV01 setPrvsRef(AdditionalReference5 value) {
        this.prvsRef = value;
        return this;
    }

    /**
     * Gets the value of the rltdRef property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalReference5 }
     *     
     */
    public AdditionalReference5 getRltdRef() {
        return rltdRef;
    }

    /**
     * Sets the value of the rltdRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalReference5 }
     *     
     */
    public SubscriptionOrderConfirmationMinusV01 setRltdRef(AdditionalReference5 value) {
        this.rltdRef = value;
        return this;
    }

    /**
     * Gets the value of the mltplExctnDtls property.
     * 
     * @return
     *     possible object is
     *     {@link SubscriptionMultipleExecution4 }
     *     
     */
    public SubscriptionMultipleExecution4 getMltplExctnDtls() {
        return mltplExctnDtls;
    }

    /**
     * Sets the value of the mltplExctnDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubscriptionMultipleExecution4 }
     *     
     */
    public SubscriptionOrderConfirmationMinusV01 setMltplExctnDtls(SubscriptionMultipleExecution4 value) {
        this.mltplExctnDtls = value;
        return this;
    }

    /**
     * Gets the value of the cpyDtls property.
     * 
     * @return
     *     possible object is
     *     {@link CopyInformation3 }
     *     
     */
    public CopyInformation3 getCpyDtls() {
        return cpyDtls;
    }

    /**
     * Sets the value of the cpyDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link CopyInformation3 }
     *     
     */
    public SubscriptionOrderConfirmationMinusV01 setCpyDtls(CopyInformation3 value) {
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
    public SubscriptionOrderConfirmationMinusV01 addXtnsn(Extension1 xtnsn) {
        getXtnsn().add(xtnsn);
        return this;
    }

}
