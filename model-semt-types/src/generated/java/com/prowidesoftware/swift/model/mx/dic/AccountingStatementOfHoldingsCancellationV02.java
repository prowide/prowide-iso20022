
package com.prowidesoftware.swift.model.mx.dic;

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
 * An account servicer, for example, a transfer agent, sends the AccountingStatementofHoldingsCancellation message to the account owner, for example, a fund manager or an account owner's designated agent, to notify the cancellation of a previously sent AccountingStatementOfHoldings message.
 * Usage
 * The AccountingStatementOfHoldingsCancellation message is used to cancel a previously sent AccountingStatementOfHoldings message. This message must contain the reference of the message to be cancelled.
 * This message may also contain all the details of the message to be cancelled, but this is not recommended.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountingStatementOfHoldingsCancellationV02", propOrder = {
    "msgId",
    "prvsRef",
    "rltdRef",
    "msgPgntn",
    "stmtToBeCanc"
})
public class AccountingStatementOfHoldingsCancellationV02 {

    @XmlElement(name = "MsgId", required = true)
    protected MessageIdentification1 msgId;
    @XmlElement(name = "PrvsRef")
    protected AdditionalReference2 prvsRef;
    @XmlElement(name = "RltdRef")
    protected AdditionalReference2 rltdRef;
    @XmlElement(name = "MsgPgntn", required = true)
    protected Pagination msgPgntn;
    @XmlElement(name = "StmtToBeCanc")
    protected AccountingStatementOfHoldings2 stmtToBeCanc;

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
    public AccountingStatementOfHoldingsCancellationV02 setMsgId(MessageIdentification1 value) {
        this.msgId = value;
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
    public AccountingStatementOfHoldingsCancellationV02 setPrvsRef(AdditionalReference2 value) {
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
    public AccountingStatementOfHoldingsCancellationV02 setRltdRef(AdditionalReference2 value) {
        this.rltdRef = value;
        return this;
    }

    /**
     * Gets the value of the msgPgntn property.
     * 
     * @return
     *     possible object is
     *     {@link Pagination }
     *     
     */
    public Pagination getMsgPgntn() {
        return msgPgntn;
    }

    /**
     * Sets the value of the msgPgntn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Pagination }
     *     
     */
    public AccountingStatementOfHoldingsCancellationV02 setMsgPgntn(Pagination value) {
        this.msgPgntn = value;
        return this;
    }

    /**
     * Gets the value of the stmtToBeCanc property.
     * 
     * @return
     *     possible object is
     *     {@link AccountingStatementOfHoldings2 }
     *     
     */
    public AccountingStatementOfHoldings2 getStmtToBeCanc() {
        return stmtToBeCanc;
    }

    /**
     * Sets the value of the stmtToBeCanc property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountingStatementOfHoldings2 }
     *     
     */
    public AccountingStatementOfHoldingsCancellationV02 setStmtToBeCanc(AccountingStatementOfHoldings2 value) {
        this.stmtToBeCanc = value;
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

}
