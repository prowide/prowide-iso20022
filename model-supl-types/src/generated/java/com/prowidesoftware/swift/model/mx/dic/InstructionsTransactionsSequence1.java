
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
 * Provides input capability for multiple instructions on elective corporate action events via a single instruction message through using Transaction Sequence Number.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InstructionsTransactionsSequence1", propOrder = {
    "txSeqNb",
    "instrQty",
    "ovrsbcptQty",
    "cstmrRefId"
})
public class InstructionsTransactionsSequence1 {

    @XmlElement(name = "TxSeqNb")
    protected String txSeqNb;
    @XmlElement(name = "InstrQty")
    protected FinancialInstrumentQuantity31Choice instrQty;
    @XmlElement(name = "OvrsbcptQty")
    protected FinancialInstrumentQuantity4 ovrsbcptQty;
    @XmlElement(name = "CstmrRefId")
    protected String cstmrRefId;

    /**
     * Gets the value of the txSeqNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTxSeqNb() {
        return txSeqNb;
    }

    /**
     * Sets the value of the txSeqNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public InstructionsTransactionsSequence1 setTxSeqNb(String value) {
        this.txSeqNb = value;
        return this;
    }

    /**
     * Gets the value of the instrQty property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity31Choice }
     *     
     */
    public FinancialInstrumentQuantity31Choice getInstrQty() {
        return instrQty;
    }

    /**
     * Sets the value of the instrQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity31Choice }
     *     
     */
    public InstructionsTransactionsSequence1 setInstrQty(FinancialInstrumentQuantity31Choice value) {
        this.instrQty = value;
        return this;
    }

    /**
     * Gets the value of the ovrsbcptQty property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity4 }
     *     
     */
    public FinancialInstrumentQuantity4 getOvrsbcptQty() {
        return ovrsbcptQty;
    }

    /**
     * Sets the value of the ovrsbcptQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity4 }
     *     
     */
    public InstructionsTransactionsSequence1 setOvrsbcptQty(FinancialInstrumentQuantity4 value) {
        this.ovrsbcptQty = value;
        return this;
    }

    /**
     * Gets the value of the cstmrRefId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCstmrRefId() {
        return cstmrRefId;
    }

    /**
     * Sets the value of the cstmrRefId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public InstructionsTransactionsSequence1 setCstmrRefId(String value) {
        this.cstmrRefId = value;
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
