
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
 * An account servicer, for example, a registrar, transfer agent or custodian bank sends the AccountManagementStatusReport message to the account owner or its designated agent, for example, an investor to report on the receipt or the processing status of a previously received AccountOpeningInstruction or AccountModificationInstruction or GetAccountDetails message.
 * Usage
 * The AccountManagementStatusReport message is used to provide the processing status of a previously received AccountOpeningInstruction or of an AccountModificationInstruction message.
 * The AccountManagementStatusReport message is also used by an account servicer to reject an AccountOpeningInstruction or AccountModificationInstruction or GetAccountDetails message when the message is not compliant with the agreed SLA or when the account cannot be uniquely identified.
 * The account owner may report that the status of the instruction is either rejected, accepted, that the instruction is being processed or that the instruction has been forwarded to the next intermediary party for further processing.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountManagementStatusReportV04", propOrder = {
    "msgId",
    "rltdRef",
    "stsRpt",
    "mktPrctcVrsn",
    "xtnsn"
})
public class AccountManagementStatusReportV04 {

    @XmlElement(name = "MsgId", required = true)
    protected MessageIdentification1 msgId;
    @XmlElement(name = "RltdRef", required = true)
    protected List<AdditionalReference3> rltdRef;
    @XmlElement(name = "StsRpt", required = true)
    protected AccountManagementStatusAndReason3 stsRpt;
    @XmlElement(name = "MktPrctcVrsn")
    protected MarketPracticeVersion1 mktPrctcVrsn;
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
    public AccountManagementStatusReportV04 setMsgId(MessageIdentification1 value) {
        this.msgId = value;
        return this;
    }

    /**
     * Gets the value of the rltdRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the rltdRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRltdRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalReference3 }
     * 
     * 
     * @return
     *     The value of the rltdRef property.
     */
    public List<AdditionalReference3> getRltdRef() {
        if (rltdRef == null) {
            rltdRef = new ArrayList<>();
        }
        return this.rltdRef;
    }

    /**
     * Gets the value of the stsRpt property.
     * 
     * @return
     *     possible object is
     *     {@link AccountManagementStatusAndReason3 }
     *     
     */
    public AccountManagementStatusAndReason3 getStsRpt() {
        return stsRpt;
    }

    /**
     * Sets the value of the stsRpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountManagementStatusAndReason3 }
     *     
     */
    public AccountManagementStatusReportV04 setStsRpt(AccountManagementStatusAndReason3 value) {
        this.stsRpt = value;
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
    public AccountManagementStatusReportV04 setMktPrctcVrsn(MarketPracticeVersion1 value) {
        this.mktPrctcVrsn = value;
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
     * Adds a new item to the rltdRef list.
     * @see #getRltdRef()
     * 
     */
    public AccountManagementStatusReportV04 addRltdRef(AdditionalReference3 rltdRef) {
        getRltdRef().add(rltdRef);
        return this;
    }

    /**
     * Adds a new item to the xtnsn list.
     * @see #getXtnsn()
     * 
     */
    public AccountManagementStatusReportV04 addXtnsn(Extension1 xtnsn) {
        getXtnsn().add(xtnsn);
        return this;
    }

}
