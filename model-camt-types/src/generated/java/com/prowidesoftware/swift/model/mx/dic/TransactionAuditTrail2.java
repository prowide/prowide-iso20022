
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Specifies the audit trails related to a specific transaction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransactionAuditTrail2", propOrder = {
    "pmtId",
    "posInQ",
    "exctnDtTm",
    "sttlmTmReq",
    "prty"
})
public class TransactionAuditTrail2 {

    @XmlElement(name = "PmtId", required = true)
    protected PaymentIdentification9 pmtId;
    @XmlElement(name = "PosInQ")
    protected UpdateLogQueuePosition1 posInQ;
    @XmlElement(name = "ExctnDtTm")
    protected UpdateLogDateTime1Choice exctnDtTm;
    @XmlElement(name = "SttlmTmReq")
    protected UpdateLogSettlementTimeRequest1 sttlmTmReq;
    @XmlElement(name = "Prty")
    protected UpdateLogTransactionPriority1 prty;

    /**
     * Gets the value of the pmtId property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentIdentification9 }
     *     
     */
    public PaymentIdentification9 getPmtId() {
        return pmtId;
    }

    /**
     * Sets the value of the pmtId property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentIdentification9 }
     *     
     */
    public TransactionAuditTrail2 setPmtId(PaymentIdentification9 value) {
        this.pmtId = value;
        return this;
    }

    /**
     * Gets the value of the posInQ property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateLogQueuePosition1 }
     *     
     */
    public UpdateLogQueuePosition1 getPosInQ() {
        return posInQ;
    }

    /**
     * Sets the value of the posInQ property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateLogQueuePosition1 }
     *     
     */
    public TransactionAuditTrail2 setPosInQ(UpdateLogQueuePosition1 value) {
        this.posInQ = value;
        return this;
    }

    /**
     * Gets the value of the exctnDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateLogDateTime1Choice }
     *     
     */
    public UpdateLogDateTime1Choice getExctnDtTm() {
        return exctnDtTm;
    }

    /**
     * Sets the value of the exctnDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateLogDateTime1Choice }
     *     
     */
    public TransactionAuditTrail2 setExctnDtTm(UpdateLogDateTime1Choice value) {
        this.exctnDtTm = value;
        return this;
    }

    /**
     * Gets the value of the sttlmTmReq property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateLogSettlementTimeRequest1 }
     *     
     */
    public UpdateLogSettlementTimeRequest1 getSttlmTmReq() {
        return sttlmTmReq;
    }

    /**
     * Sets the value of the sttlmTmReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateLogSettlementTimeRequest1 }
     *     
     */
    public TransactionAuditTrail2 setSttlmTmReq(UpdateLogSettlementTimeRequest1 value) {
        this.sttlmTmReq = value;
        return this;
    }

    /**
     * Gets the value of the prty property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateLogTransactionPriority1 }
     *     
     */
    public UpdateLogTransactionPriority1 getPrty() {
        return prty;
    }

    /**
     * Sets the value of the prty property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateLogTransactionPriority1 }
     *     
     */
    public TransactionAuditTrail2 setPrty(UpdateLogTransactionPriority1 value) {
        this.prty = value;
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
