
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
 * An instructing party, for example, an investment manager or its authorised representative, sends the TransferOutInstruction message to the executing party, for example, a transfer agent, to instruct the delivery of a financial instrument, free of payment, on a given date from a specified party.
 * This message may also be used to instruct the delivery of a financial instrument, free of payment, to another of the instructing parties own accounts or to a third party.
 * Usage
 * The TransferOutInstruction message is used to instruct the withdrawal of a financial instrument from one account and deliver it to either another account or to a third party.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransferOutInstructionV06", propOrder = {
    "msgId",
    "poolRef",
    "prvsRef",
    "rltdRef",
    "mstrRef",
    "reqdTrfDt",
    "trfDtls",
    "acctDtls",
    "sttlmDtls",
    "mktPrctcVrsn",
    "cpyDtls",
    "xtnsn"
})
public class TransferOutInstructionV06 {

    @XmlElement(name = "MsgId", required = true)
    protected MessageIdentification1 msgId;
    @XmlElement(name = "PoolRef")
    protected AdditionalReference2 poolRef;
    @XmlElement(name = "PrvsRef")
    protected AdditionalReference2 prvsRef;
    @XmlElement(name = "RltdRef")
    protected AdditionalReference2 rltdRef;
    @XmlElement(name = "MstrRef")
    protected String mstrRef;
    @XmlElement(name = "ReqdTrfDt")
    protected DateFormat1Choice reqdTrfDt;
    @XmlElement(name = "TrfDtls", required = true)
    protected List<Transfer27> trfDtls;
    @XmlElement(name = "AcctDtls", required = true)
    protected InvestmentAccount40 acctDtls;
    @XmlElement(name = "SttlmDtls")
    protected ReceiveInformation15 sttlmDtls;
    @XmlElement(name = "MktPrctcVrsn")
    protected MarketPracticeVersion1 mktPrctcVrsn;
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
    public TransferOutInstructionV06 setMsgId(MessageIdentification1 value) {
        this.msgId = value;
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
    public TransferOutInstructionV06 setPoolRef(AdditionalReference2 value) {
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
    public TransferOutInstructionV06 setPrvsRef(AdditionalReference2 value) {
        this.prvsRef = value;
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
    public TransferOutInstructionV06 setRltdRef(AdditionalReference2 value) {
        this.rltdRef = value;
        return this;
    }

    /**
     * Gets the value of the mstrRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMstrRef() {
        return mstrRef;
    }

    /**
     * Sets the value of the mstrRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TransferOutInstructionV06 setMstrRef(String value) {
        this.mstrRef = value;
        return this;
    }

    /**
     * Gets the value of the reqdTrfDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat1Choice }
     *     
     */
    public DateFormat1Choice getReqdTrfDt() {
        return reqdTrfDt;
    }

    /**
     * Sets the value of the reqdTrfDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat1Choice }
     *     
     */
    public TransferOutInstructionV06 setReqdTrfDt(DateFormat1Choice value) {
        this.reqdTrfDt = value;
        return this;
    }

    /**
     * Gets the value of the trfDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the trfDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTrfDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Transfer27 }
     * 
     * 
     * @return
     *     The value of the trfDtls property.
     */
    public List<Transfer27> getTrfDtls() {
        if (trfDtls == null) {
            trfDtls = new ArrayList<>();
        }
        return this.trfDtls;
    }

    /**
     * Gets the value of the acctDtls property.
     * 
     * @return
     *     possible object is
     *     {@link InvestmentAccount40 }
     *     
     */
    public InvestmentAccount40 getAcctDtls() {
        return acctDtls;
    }

    /**
     * Sets the value of the acctDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvestmentAccount40 }
     *     
     */
    public TransferOutInstructionV06 setAcctDtls(InvestmentAccount40 value) {
        this.acctDtls = value;
        return this;
    }

    /**
     * Gets the value of the sttlmDtls property.
     * 
     * @return
     *     possible object is
     *     {@link ReceiveInformation15 }
     *     
     */
    public ReceiveInformation15 getSttlmDtls() {
        return sttlmDtls;
    }

    /**
     * Sets the value of the sttlmDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReceiveInformation15 }
     *     
     */
    public TransferOutInstructionV06 setSttlmDtls(ReceiveInformation15 value) {
        this.sttlmDtls = value;
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
    public TransferOutInstructionV06 setMktPrctcVrsn(MarketPracticeVersion1 value) {
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
    public TransferOutInstructionV06 setCpyDtls(CopyInformation2 value) {
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
     * Adds a new item to the trfDtls list.
     * @see #getTrfDtls()
     * 
     */
    public TransferOutInstructionV06 addTrfDtls(Transfer27 trfDtls) {
        getTrfDtls().add(trfDtls);
        return this;
    }

    /**
     * Adds a new item to the xtnsn list.
     * @see #getXtnsn()
     * 
     */
    public TransferOutInstructionV06 addXtnsn(Extension1 xtnsn) {
        getXtnsn().add(xtnsn);
        return this;
    }

}
