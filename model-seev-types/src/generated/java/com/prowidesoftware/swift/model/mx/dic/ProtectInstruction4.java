
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Provides detailed information on protect and cover protect instructions.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProtectInstruction4", propOrder = {
    "txTp",
    "prtctTxSts",
    "txId",
    "prtctDt",
    "ucvrdPrtctQty"
})
public class ProtectInstruction4 {

    @XmlElement(name = "TxTp", required = true)
    @XmlSchemaType(name = "string")
    protected ProtectTransactionType3Code txTp;
    @XmlElement(name = "PrtctTxSts")
    @XmlSchemaType(name = "string")
    protected ProtectInstructionStatus4Code prtctTxSts;
    @XmlElement(name = "TxId")
    protected String txId;
    @XmlElement(name = "PrtctDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar prtctDt;
    @XmlElement(name = "UcvrdPrtctQty")
    protected FinancialInstrumentQuantity18Choice ucvrdPrtctQty;

    /**
     * Gets the value of the txTp property.
     * 
     * @return
     *     possible object is
     *     {@link ProtectTransactionType3Code }
     *     
     */
    public ProtectTransactionType3Code getTxTp() {
        return txTp;
    }

    /**
     * Sets the value of the txTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProtectTransactionType3Code }
     *     
     */
    public ProtectInstruction4 setTxTp(ProtectTransactionType3Code value) {
        this.txTp = value;
        return this;
    }

    /**
     * Gets the value of the prtctTxSts property.
     * 
     * @return
     *     possible object is
     *     {@link ProtectInstructionStatus4Code }
     *     
     */
    public ProtectInstructionStatus4Code getPrtctTxSts() {
        return prtctTxSts;
    }

    /**
     * Sets the value of the prtctTxSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProtectInstructionStatus4Code }
     *     
     */
    public ProtectInstruction4 setPrtctTxSts(ProtectInstructionStatus4Code value) {
        this.prtctTxSts = value;
        return this;
    }

    /**
     * Gets the value of the txId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTxId() {
        return txId;
    }

    /**
     * Sets the value of the txId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ProtectInstruction4 setTxId(String value) {
        this.txId = value;
        return this;
    }

    /**
     * Gets the value of the prtctDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPrtctDt() {
        return prtctDt;
    }

    /**
     * Sets the value of the prtctDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public ProtectInstruction4 setPrtctDt(XMLGregorianCalendar value) {
        this.prtctDt = value;
        return this;
    }

    /**
     * Gets the value of the ucvrdPrtctQty property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity18Choice }
     *     
     */
    public FinancialInstrumentQuantity18Choice getUcvrdPrtctQty() {
        return ucvrdPrtctQty;
    }

    /**
     * Sets the value of the ucvrdPrtctQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity18Choice }
     *     
     */
    public ProtectInstruction4 setUcvrdPrtctQty(FinancialInstrumentQuantity18Choice value) {
        this.ucvrdPrtctQty = value;
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
