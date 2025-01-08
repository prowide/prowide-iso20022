
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
 * The CustodyStatementOfHoldingsCancellation message is sent by an account servicer to the account owner or the account owner's designated agent. The account servicer may be a local agent (sub-custodian) acting on behalf of its global custodian customer, a custodian acting on behalf of an investment management institution or a broker/dealer, a fund administrator or fund intermediary, trustee or registrar, etc.
 * This message is used to cancel a previously sent CustodyStatementOfHoldings message.
 * Usage
 * The CustodyStatementOfHoldingsCancellation message is sent by an account servicer to the account owner to cancel a previously sent CustodyStatementOfHoldings message.
 * This message must contain the reference of the message to be cancelled. This message may also contain details of the message to be cancelled, but this is not recommended.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "semt.004.001.01", propOrder = {
    "prvsRef",
    "rltdRef",
    "msgPgntn",
    "stmtToBeCanc"
})
public class Semt00400101 {

    @XmlElement(name = "PrvsRef", required = true)
    protected AdditionalReference2 prvsRef;
    @XmlElement(name = "RltdRef")
    protected AdditionalReference2 rltdRef;
    @XmlElement(name = "MsgPgntn", required = true)
    protected Pagination msgPgntn;
    @XmlElement(name = "StmtToBeCanc")
    protected CustodyStatementOfHoldings1 stmtToBeCanc;

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
    public Semt00400101 setPrvsRef(AdditionalReference2 value) {
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
    public Semt00400101 setRltdRef(AdditionalReference2 value) {
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
    public Semt00400101 setMsgPgntn(Pagination value) {
        this.msgPgntn = value;
        return this;
    }

    /**
     * Gets the value of the stmtToBeCanc property.
     * 
     * @return
     *     possible object is
     *     {@link CustodyStatementOfHoldings1 }
     *     
     */
    public CustodyStatementOfHoldings1 getStmtToBeCanc() {
        return stmtToBeCanc;
    }

    /**
     * Sets the value of the stmtToBeCanc property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustodyStatementOfHoldings1 }
     *     
     */
    public Semt00400101 setStmtToBeCanc(CustodyStatementOfHoldings1 value) {
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
