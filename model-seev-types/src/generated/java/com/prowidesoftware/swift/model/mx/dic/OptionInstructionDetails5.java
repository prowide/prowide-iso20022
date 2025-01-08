
package com.prowidesoftware.swift.model.mx.dic;

import java.time.LocalDate;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateAdapter;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
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
@XmlType(name = "OptionInstructionDetails5", propOrder = {
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
public class OptionInstructionDetails5 {

    @XmlElement(name = "InstrId", required = true)
    protected String instrId;
    @XmlElement(name = "InstrSeqNb")
    protected String instrSeqNb;
    @XmlElement(name = "PrtctInd")
    @XmlSchemaType(name = "string")
    protected ProtectTransactionType2Code prtctInd;
    @XmlElement(name = "InstrQty", required = true)
    protected FinancialInstrumentQuantity1Choice instrQty;
    @XmlElement(name = "InstrDt", required = true, type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate instrDt;
    @XmlElement(name = "PrtctDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate prtctDt;
    @XmlElement(name = "CoverPrtctDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate coverPrtctDt;
    @XmlElement(name = "BidPric")
    protected PriceFormat45Choice bidPric;
    @XmlElement(name = "CondlQty")
    protected FinancialInstrumentQuantity1Choice condlQty;
    @XmlElement(name = "CstmrRef")
    protected String cstmrRef;
    @XmlElement(name = "InstrNrrtv")
    protected String instrNrrtv;
    @XmlElement(name = "InstrSts", required = true)
    protected InstructionProcessingStatus41Choice instrSts;

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
    public OptionInstructionDetails5 setInstrId(String value) {
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
    public OptionInstructionDetails5 setInstrSeqNb(String value) {
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
    public OptionInstructionDetails5 setPrtctInd(ProtectTransactionType2Code value) {
        this.prtctInd = value;
        return this;
    }

    /**
     * Gets the value of the instrQty property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity1Choice }
     *     
     */
    public FinancialInstrumentQuantity1Choice getInstrQty() {
        return instrQty;
    }

    /**
     * Sets the value of the instrQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity1Choice }
     *     
     */
    public OptionInstructionDetails5 setInstrQty(FinancialInstrumentQuantity1Choice value) {
        this.instrQty = value;
        return this;
    }

    /**
     * Gets the value of the instrDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getInstrDt() {
        return instrDt;
    }

    /**
     * Sets the value of the instrDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public OptionInstructionDetails5 setInstrDt(LocalDate value) {
        this.instrDt = value;
        return this;
    }

    /**
     * Gets the value of the prtctDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getPrtctDt() {
        return prtctDt;
    }

    /**
     * Sets the value of the prtctDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public OptionInstructionDetails5 setPrtctDt(LocalDate value) {
        this.prtctDt = value;
        return this;
    }

    /**
     * Gets the value of the coverPrtctDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getCoverPrtctDt() {
        return coverPrtctDt;
    }

    /**
     * Sets the value of the coverPrtctDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public OptionInstructionDetails5 setCoverPrtctDt(LocalDate value) {
        this.coverPrtctDt = value;
        return this;
    }

    /**
     * Gets the value of the bidPric property.
     * 
     * @return
     *     possible object is
     *     {@link PriceFormat45Choice }
     *     
     */
    public PriceFormat45Choice getBidPric() {
        return bidPric;
    }

    /**
     * Sets the value of the bidPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceFormat45Choice }
     *     
     */
    public OptionInstructionDetails5 setBidPric(PriceFormat45Choice value) {
        this.bidPric = value;
        return this;
    }

    /**
     * Gets the value of the condlQty property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity1Choice }
     *     
     */
    public FinancialInstrumentQuantity1Choice getCondlQty() {
        return condlQty;
    }

    /**
     * Sets the value of the condlQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity1Choice }
     *     
     */
    public OptionInstructionDetails5 setCondlQty(FinancialInstrumentQuantity1Choice value) {
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
    public OptionInstructionDetails5 setCstmrRef(String value) {
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
    public OptionInstructionDetails5 setInstrNrrtv(String value) {
        this.instrNrrtv = value;
        return this;
    }

    /**
     * Gets the value of the instrSts property.
     * 
     * @return
     *     possible object is
     *     {@link InstructionProcessingStatus41Choice }
     *     
     */
    public InstructionProcessingStatus41Choice getInstrSts() {
        return instrSts;
    }

    /**
     * Sets the value of the instrSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link InstructionProcessingStatus41Choice }
     *     
     */
    public OptionInstructionDetails5 setInstrSts(InstructionProcessingStatus41Choice value) {
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
