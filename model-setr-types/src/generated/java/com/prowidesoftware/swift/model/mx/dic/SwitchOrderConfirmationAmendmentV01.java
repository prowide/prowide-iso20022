
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
 * An executing party, for example, a transfer agent, sends the SwitchOrderConfirmationAmendment message to the instructing party, for example, an investment manager or its authorised representative to amend a previously sent SwitchOrderConfirmation message.
 * Usage
 * The SwitchOrderConfirmationAmendment message is used to amend a previously sent switch order confirmation.
 * Each order confirmation amendment specified is identified in DealReference. The reference of the original order is specified in OrderReference.
 * The message identification of the SwitchOrder message in which the switch order was conveyed may also be quoted in RelatedReference. The message identification of the SwitchOrderConfirmation message in which the original switch order confirmation was conveyed may also be quoted in PreviousReference.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SwitchOrderConfirmationAmendmentV01", propOrder = {
    "msgId",
    "poolRef",
    "prvsRef",
    "rltdRef",
    "swtchExctnDtls",
    "cpyDtls",
    "xtnsn"
})
public class SwitchOrderConfirmationAmendmentV01 {

    @XmlElement(name = "MsgId", required = true)
    protected MessageIdentification1 msgId;
    @XmlElement(name = "PoolRef")
    protected AdditionalReference3 poolRef;
    @XmlElement(name = "PrvsRef")
    protected List<AdditionalReference3> prvsRef;
    @XmlElement(name = "RltdRef")
    protected AdditionalReference3 rltdRef;
    @XmlElement(name = "SwtchExctnDtls", required = true)
    protected List<SwitchExecution4> swtchExctnDtls;
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
    public SwitchOrderConfirmationAmendmentV01 setMsgId(MessageIdentification1 value) {
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
    public SwitchOrderConfirmationAmendmentV01 setPoolRef(AdditionalReference3 value) {
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
     * {@link AdditionalReference3 }
     * 
     * 
     * @return
     *     The value of the prvsRef property.
     */
    public List<AdditionalReference3> getPrvsRef() {
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
    public SwitchOrderConfirmationAmendmentV01 setRltdRef(AdditionalReference3 value) {
        this.rltdRef = value;
        return this;
    }

    /**
     * Gets the value of the swtchExctnDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the swtchExctnDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSwtchExctnDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SwitchExecution4 }
     * 
     * 
     * @return
     *     The value of the swtchExctnDtls property.
     */
    public List<SwitchExecution4> getSwtchExctnDtls() {
        if (swtchExctnDtls == null) {
            swtchExctnDtls = new ArrayList<>();
        }
        return this.swtchExctnDtls;
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
    public SwitchOrderConfirmationAmendmentV01 setCpyDtls(CopyInformation2 value) {
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
    public SwitchOrderConfirmationAmendmentV01 addPrvsRef(AdditionalReference3 prvsRef) {
        getPrvsRef().add(prvsRef);
        return this;
    }

    /**
     * Adds a new item to the swtchExctnDtls list.
     * @see #getSwtchExctnDtls()
     * 
     */
    public SwitchOrderConfirmationAmendmentV01 addSwtchExctnDtls(SwitchExecution4 swtchExctnDtls) {
        getSwtchExctnDtls().add(swtchExctnDtls);
        return this;
    }

    /**
     * Adds a new item to the xtnsn list.
     * @see #getXtnsn()
     * 
     */
    public SwitchOrderConfirmationAmendmentV01 addXtnsn(Extension1 xtnsn) {
        getXtnsn().add(xtnsn);
        return this;
    }

}
