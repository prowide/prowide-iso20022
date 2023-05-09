
package com.prowidesoftware.swift.model.mx.dic;

import java.time.OffsetDateTime;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateTimeAdapter;
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
 * Provides additional information regarding corporate action instructed balance details at option protect level.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD1", propOrder = {
    "plcAndNm",
    "prtctId",
    "prtctSeqNb",
    "optnNb",
    "prtctDt",
    "coverPrtctDt",
    "prtctIdQty",
    "prtctIdUcvrdQty",
    "prtctIdOvrsbcptQty",
    "prtctIdSts",
    "prtctCondlQty",
    "prtctTndrBidPric",
    "cstmrRefId"
})
public class CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD1 {

    @XmlElement(name = "PlcAndNm", required = true)
    protected String plcAndNm;
    @XmlElement(name = "PrtctId", required = true)
    protected String prtctId;
    @XmlElement(name = "PrtctSeqNb")
    protected String prtctSeqNb;
    @XmlElement(name = "OptnNb", required = true)
    protected OptionNumber1Choice optnNb;
    @XmlElement(name = "PrtctDt", required = true, type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected OffsetDateTime prtctDt;
    @XmlElement(name = "CoverPrtctDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected OffsetDateTime coverPrtctDt;
    @XmlElement(name = "PrtctIdQty", required = true)
    protected FinancialInstrumentQuantity15Choice prtctIdQty;
    @XmlElement(name = "PrtctIdUcvrdQty")
    protected FinancialInstrumentQuantity15Choice prtctIdUcvrdQty;
    @XmlElement(name = "PrtctIdOvrsbcptQty")
    protected FinancialInstrumentQuantity15Choice prtctIdOvrsbcptQty;
    @XmlElement(name = "PrtctIdSts")
    @XmlSchemaType(name = "string")
    protected DTCProtectInstructionStatus1Code prtctIdSts;
    @XmlElement(name = "PrtctCondlQty")
    protected FinancialInstrumentQuantity15Choice prtctCondlQty;
    @XmlElement(name = "PrtctTndrBidPric")
    protected PriceFormat57Choice prtctTndrBidPric;
    @XmlElement(name = "CstmrRefId")
    protected String cstmrRefId;

    /**
     * Gets the value of the plcAndNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlcAndNm() {
        return plcAndNm;
    }

    /**
     * Sets the value of the plcAndNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD1 setPlcAndNm(String value) {
        this.plcAndNm = value;
        return this;
    }

    /**
     * Gets the value of the prtctId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrtctId() {
        return prtctId;
    }

    /**
     * Sets the value of the prtctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD1 setPrtctId(String value) {
        this.prtctId = value;
        return this;
    }

    /**
     * Gets the value of the prtctSeqNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrtctSeqNb() {
        return prtctSeqNb;
    }

    /**
     * Sets the value of the prtctSeqNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD1 setPrtctSeqNb(String value) {
        this.prtctSeqNb = value;
        return this;
    }

    /**
     * Gets the value of the optnNb property.
     * 
     * @return
     *     possible object is
     *     {@link OptionNumber1Choice }
     *     
     */
    public OptionNumber1Choice getOptnNb() {
        return optnNb;
    }

    /**
     * Sets the value of the optnNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link OptionNumber1Choice }
     *     
     */
    public CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD1 setOptnNb(OptionNumber1Choice value) {
        this.optnNb = value;
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
    public OffsetDateTime getPrtctDt() {
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
    public CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD1 setPrtctDt(OffsetDateTime value) {
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
    public OffsetDateTime getCoverPrtctDt() {
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
    public CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD1 setCoverPrtctDt(OffsetDateTime value) {
        this.coverPrtctDt = value;
        return this;
    }

    /**
     * Gets the value of the prtctIdQty property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity15Choice }
     *     
     */
    public FinancialInstrumentQuantity15Choice getPrtctIdQty() {
        return prtctIdQty;
    }

    /**
     * Sets the value of the prtctIdQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity15Choice }
     *     
     */
    public CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD1 setPrtctIdQty(FinancialInstrumentQuantity15Choice value) {
        this.prtctIdQty = value;
        return this;
    }

    /**
     * Gets the value of the prtctIdUcvrdQty property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity15Choice }
     *     
     */
    public FinancialInstrumentQuantity15Choice getPrtctIdUcvrdQty() {
        return prtctIdUcvrdQty;
    }

    /**
     * Sets the value of the prtctIdUcvrdQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity15Choice }
     *     
     */
    public CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD1 setPrtctIdUcvrdQty(FinancialInstrumentQuantity15Choice value) {
        this.prtctIdUcvrdQty = value;
        return this;
    }

    /**
     * Gets the value of the prtctIdOvrsbcptQty property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity15Choice }
     *     
     */
    public FinancialInstrumentQuantity15Choice getPrtctIdOvrsbcptQty() {
        return prtctIdOvrsbcptQty;
    }

    /**
     * Sets the value of the prtctIdOvrsbcptQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity15Choice }
     *     
     */
    public CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD1 setPrtctIdOvrsbcptQty(FinancialInstrumentQuantity15Choice value) {
        this.prtctIdOvrsbcptQty = value;
        return this;
    }

    /**
     * Gets the value of the prtctIdSts property.
     * 
     * @return
     *     possible object is
     *     {@link DTCProtectInstructionStatus1Code }
     *     
     */
    public DTCProtectInstructionStatus1Code getPrtctIdSts() {
        return prtctIdSts;
    }

    /**
     * Sets the value of the prtctIdSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link DTCProtectInstructionStatus1Code }
     *     
     */
    public CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD1 setPrtctIdSts(DTCProtectInstructionStatus1Code value) {
        this.prtctIdSts = value;
        return this;
    }

    /**
     * Gets the value of the prtctCondlQty property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity15Choice }
     *     
     */
    public FinancialInstrumentQuantity15Choice getPrtctCondlQty() {
        return prtctCondlQty;
    }

    /**
     * Sets the value of the prtctCondlQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity15Choice }
     *     
     */
    public CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD1 setPrtctCondlQty(FinancialInstrumentQuantity15Choice value) {
        this.prtctCondlQty = value;
        return this;
    }

    /**
     * Gets the value of the prtctTndrBidPric property.
     * 
     * @return
     *     possible object is
     *     {@link PriceFormat57Choice }
     *     
     */
    public PriceFormat57Choice getPrtctTndrBidPric() {
        return prtctTndrBidPric;
    }

    /**
     * Sets the value of the prtctTndrBidPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceFormat57Choice }
     *     
     */
    public CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD1 setPrtctTndrBidPric(PriceFormat57Choice value) {
        this.prtctTndrBidPric = value;
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
    public CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD1 setCstmrRefId(String value) {
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
