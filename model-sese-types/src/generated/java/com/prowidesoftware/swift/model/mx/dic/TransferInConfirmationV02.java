
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
 * An executing party, eg, a transfer agent, sends the TransferInConfirmation message to the instructing party, eg, an investment manager or its authorised representative, to confirm the receipt of a financial instrument, free of payment, on a given date, from a specified party.
 * This message may also be used to confirm the receipt of a financial instrument, free of payment, from another of the instructing parties own accounts or from a third party.
 * Usage
 * The TransferInConfirmation message is used to confirm receipt of a financial instrument, either from another account owned by the instructing party or from a third party. The reference of the transfer confirmation is identified in TransferConfirmationReference.
 * The reference of the original transfer instruction is specified in TransferReference. The message identification of the TransferInInstruction message in which the transfer instruction was conveyed may also be quoted in RelatedReference.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransferInConfirmationV02", propOrder = {
    "msgId",
    "rltdRef",
    "poolRef",
    "prvsRef",
    "trfDtls",
    "finInstrmDtls",
    "acctDtls",
    "sttlmDtls",
    "cpyDtls",
    "xtnsn"
})
public class TransferInConfirmationV02 {

    @XmlElement(name = "MsgId", required = true)
    protected MessageIdentification1 msgId;
    @XmlElement(name = "RltdRef")
    protected AdditionalReference2 rltdRef;
    @XmlElement(name = "PoolRef")
    protected AdditionalReference2 poolRef;
    @XmlElement(name = "PrvsRef")
    protected AdditionalReference2 prvsRef;
    @XmlElement(name = "TrfDtls", required = true)
    protected Transfer7 trfDtls;
    @XmlElement(name = "FinInstrmDtls", required = true)
    protected FinancialInstrument13 finInstrmDtls;
    @XmlElement(name = "AcctDtls", required = true)
    protected InvestmentAccount22 acctDtls;
    @XmlElement(name = "SttlmDtls", required = true)
    protected DeliverInformation4 sttlmDtls;
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
    public TransferInConfirmationV02 setMsgId(MessageIdentification1 value) {
        this.msgId = value;
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
    public TransferInConfirmationV02 setRltdRef(AdditionalReference2 value) {
        this.rltdRef = value;
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
    public TransferInConfirmationV02 setPoolRef(AdditionalReference2 value) {
        this.poolRef = value;
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
    public TransferInConfirmationV02 setPrvsRef(AdditionalReference2 value) {
        this.prvsRef = value;
        return this;
    }

    /**
     * Gets the value of the trfDtls property.
     * 
     * @return
     *     possible object is
     *     {@link Transfer7 }
     *     
     */
    public Transfer7 getTrfDtls() {
        return trfDtls;
    }

    /**
     * Sets the value of the trfDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link Transfer7 }
     *     
     */
    public TransferInConfirmationV02 setTrfDtls(Transfer7 value) {
        this.trfDtls = value;
        return this;
    }

    /**
     * Gets the value of the finInstrmDtls property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrument13 }
     *     
     */
    public FinancialInstrument13 getFinInstrmDtls() {
        return finInstrmDtls;
    }

    /**
     * Sets the value of the finInstrmDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrument13 }
     *     
     */
    public TransferInConfirmationV02 setFinInstrmDtls(FinancialInstrument13 value) {
        this.finInstrmDtls = value;
        return this;
    }

    /**
     * Gets the value of the acctDtls property.
     * 
     * @return
     *     possible object is
     *     {@link InvestmentAccount22 }
     *     
     */
    public InvestmentAccount22 getAcctDtls() {
        return acctDtls;
    }

    /**
     * Sets the value of the acctDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvestmentAccount22 }
     *     
     */
    public TransferInConfirmationV02 setAcctDtls(InvestmentAccount22 value) {
        this.acctDtls = value;
        return this;
    }

    /**
     * Gets the value of the sttlmDtls property.
     * 
     * @return
     *     possible object is
     *     {@link DeliverInformation4 }
     *     
     */
    public DeliverInformation4 getSttlmDtls() {
        return sttlmDtls;
    }

    /**
     * Sets the value of the sttlmDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeliverInformation4 }
     *     
     */
    public TransferInConfirmationV02 setSttlmDtls(DeliverInformation4 value) {
        this.sttlmDtls = value;
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
    public TransferInConfirmationV02 setCpyDtls(CopyInformation2 value) {
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
    public TransferInConfirmationV02 addXtnsn(Extension1 xtnsn) {
        getXtnsn().add(xtnsn);
        return this;
    }

}
