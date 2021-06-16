
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
 * Instructions information received for a given option.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OptionInstructionDetails6", propOrder = {
    "instrId",
    "instrSeqNb",
    "prtctInd",
    "instrQty",
    "instrDt",
    "prtctDt",
    "coverPrtctDt",
    "bidPric",
    "condlQty",
    "cstmrRef",
    "instrNrrtv",
    "instrSts"
})
public class OptionInstructionDetails6 {

    @XmlElement(name = "InstrId", required = true)
    protected String instrId;
    @XmlElement(name = "InstrSeqNb")
    protected String instrSeqNb;
    @XmlElement(name = "PrtctInd")
    @XmlSchemaType(name = "string")
    protected ProtectTransactionType2Code prtctInd;
    @XmlElement(name = "InstrQty", required = true)
    protected FinancialInstrumentQuantity15Choice instrQty;
    @XmlElement(name = "InstrDt", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar instrDt;
    @XmlElement(name = "PrtctDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar prtctDt;
    @XmlElement(name = "CoverPrtctDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar coverPrtctDt;
    @XmlElement(name = "BidPric")
    protected PriceFormat57Choice bidPric;
    @XmlElement(name = "CondlQty")
    protected FinancialInstrumentQuantity15Choice condlQty;
    @XmlElement(name = "CstmrRef")
    protected String cstmrRef;
    @XmlElement(name = "InstrNrrtv")
    protected String instrNrrtv;
    @XmlElement(name = "InstrSts", required = true)
    protected InstructionProcessingStatus43Choice instrSts;

    /**
     * Gets the value of the instrId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstrId() {
        return instrId;
    }

    /**
     * Sets the value of the instrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public OptionInstructionDetails6 setInstrId(String value) {
        this.instrId = value;
        return this;
    }

    /**
     * Gets the value of the instrSeqNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstrSeqNb() {
        return instrSeqNb;
    }

    /**
     * Sets the value of the instrSeqNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public OptionInstructionDetails6 setInstrSeqNb(String value) {
        this.instrSeqNb = value;
        return this;
    }

    /**
     * Gets the value of the prtctInd property.
     * 
     * @return
     *     possible object is
     *     {@link ProtectTransactionType2Code }
     *     
     */
    public ProtectTransactionType2Code getPrtctInd() {
        return prtctInd;
    }

    /**
     * Sets the value of the prtctInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProtectTransactionType2Code }
     *     
     */
    public OptionInstructionDetails6 setPrtctInd(ProtectTransactionType2Code value) {
        this.prtctInd = value;
        return this;
    }

    /**
     * Gets the value of the instrQty property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity15Choice }
     *     
     */
    public FinancialInstrumentQuantity15Choice getInstrQty() {
        return instrQty;
    }

    /**
     * Sets the value of the instrQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity15Choice }
     *     
     */
    public OptionInstructionDetails6 setInstrQty(FinancialInstrumentQuantity15Choice value) {
        this.instrQty = value;
        return this;
    }

    /**
     * Gets the value of the instrDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInstrDt() {
        return instrDt;
    }

    /**
     * Sets the value of the instrDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public OptionInstructionDetails6 setInstrDt(XMLGregorianCalendar value) {
        this.instrDt = value;
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
    public OptionInstructionDetails6 setPrtctDt(XMLGregorianCalendar value) {
        this.prtctDt = value;
        return this;
    }

    /**
     * Gets the value of the coverPrtctDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCoverPrtctDt() {
        return coverPrtctDt;
    }

    /**
     * Sets the value of the coverPrtctDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public OptionInstructionDetails6 setCoverPrtctDt(XMLGregorianCalendar value) {
        this.coverPrtctDt = value;
        return this;
    }

    /**
     * Gets the value of the bidPric property.
     * 
     * @return
     *     possible object is
     *     {@link PriceFormat57Choice }
     *     
     */
    public PriceFormat57Choice getBidPric() {
        return bidPric;
    }

    /**
     * Sets the value of the bidPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceFormat57Choice }
     *     
     */
    public OptionInstructionDetails6 setBidPric(PriceFormat57Choice value) {
        this.bidPric = value;
        return this;
    }

    /**
     * Gets the value of the condlQty property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity15Choice }
     *     
     */
    public FinancialInstrumentQuantity15Choice getCondlQty() {
        return condlQty;
    }

    /**
     * Sets the value of the condlQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity15Choice }
     *     
     */
    public OptionInstructionDetails6 setCondlQty(FinancialInstrumentQuantity15Choice value) {
        this.condlQty = value;
        return this;
    }

    /**
     * Gets the value of the cstmrRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCstmrRef() {
        return cstmrRef;
    }

    /**
     * Sets the value of the cstmrRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public OptionInstructionDetails6 setCstmrRef(String value) {
        this.cstmrRef = value;
        return this;
    }

    /**
     * Gets the value of the instrNrrtv property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstrNrrtv() {
        return instrNrrtv;
    }

    /**
     * Sets the value of the instrNrrtv property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public OptionInstructionDetails6 setInstrNrrtv(String value) {
        this.instrNrrtv = value;
        return this;
    }

    /**
     * Gets the value of the instrSts property.
     * 
     * @return
     *     possible object is
     *     {@link InstructionProcessingStatus43Choice }
     *     
     */
    public InstructionProcessingStatus43Choice getInstrSts() {
        return instrSts;
    }

    /**
     * Sets the value of the instrSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link InstructionProcessingStatus43Choice }
     *     
     */
    public OptionInstructionDetails6 setInstrSts(InstructionProcessingStatus43Choice value) {
        this.instrSts = value;
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
