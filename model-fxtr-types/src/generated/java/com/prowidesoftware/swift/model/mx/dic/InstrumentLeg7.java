
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateAdapter;
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
 * Additionnal details related to the leg.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InstrumentLeg7", propOrder = {
    "legSd",
    "legSttlmTp",
    "legSttlmDt",
    "legLastPric",
    "legSttlmCcy",
    "legOrdrQty",
    "legFwdPts",
    "legClctdCtrPtyCcyLastQty",
    "legRskAmt",
    "legValtnRate",
    "legValDt",
    "legCcy",
    "legSymb",
    "legSctyId"
})
public class InstrumentLeg7 {

    @XmlElement(name = "LegSd", required = true)
    @XmlSchemaType(name = "string")
    protected Side1Code legSd;
    @XmlElement(name = "LegSttlmTp", required = true)
    @XmlSchemaType(name = "string")
    protected SettlementDate8Code legSttlmTp;
    @XmlElement(name = "LegSttlmDt", required = true, type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected OffsetDateTime legSttlmDt;
    @XmlElement(name = "LegLastPric", required = true)
    protected ActiveCurrencyAnd13DecimalAmount legLastPric;
    @XmlElement(name = "LegSttlmCcy", required = true)
    protected String legSttlmCcy;
    @XmlElement(name = "LegOrdrQty", required = true)
    protected ActiveCurrencyAndAmount legOrdrQty;
    @XmlElement(name = "LegFwdPts", required = true)
    protected BigDecimal legFwdPts;
    @XmlElement(name = "LegClctdCtrPtyCcyLastQty", required = true)
    protected ActiveCurrencyAndAmount legClctdCtrPtyCcyLastQty;
    @XmlElement(name = "LegRskAmt", required = true)
    protected ActiveCurrencyAndAmount legRskAmt;
    @XmlElement(name = "LegValtnRate", required = true)
    protected AgreedRate3 legValtnRate;
    @XmlElement(name = "LegValDt", required = true, type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate legValDt;
    @XmlElement(name = "LegCcy", required = true)
    protected String legCcy;
    @XmlElement(name = "LegSymb", required = true)
    protected String legSymb;
    @XmlElement(name = "LegSctyId", required = true)
    protected SecurityIdentification18 legSctyId;

    /**
     * Gets the value of the legSd property.
     * 
     * @return
     *     possible object is
     *     {@link Side1Code }
     *     
     */
    public Side1Code getLegSd() {
        return legSd;
    }

    /**
     * Sets the value of the legSd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Side1Code }
     *     
     */
    public InstrumentLeg7 setLegSd(Side1Code value) {
        this.legSd = value;
        return this;
    }

    /**
     * Gets the value of the legSttlmTp property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementDate8Code }
     *     
     */
    public SettlementDate8Code getLegSttlmTp() {
        return legSttlmTp;
    }

    /**
     * Sets the value of the legSttlmTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementDate8Code }
     *     
     */
    public InstrumentLeg7 setLegSttlmTp(SettlementDate8Code value) {
        this.legSttlmTp = value;
        return this;
    }

    /**
     * Gets the value of the legSttlmDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public OffsetDateTime getLegSttlmDt() {
        return legSttlmDt;
    }

    /**
     * Sets the value of the legSttlmDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public InstrumentLeg7 setLegSttlmDt(OffsetDateTime value) {
        this.legSttlmDt = value;
        return this;
    }

    /**
     * Gets the value of the legLastPric property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAnd13DecimalAmount }
     *     
     */
    public ActiveCurrencyAnd13DecimalAmount getLegLastPric() {
        return legLastPric;
    }

    /**
     * Sets the value of the legLastPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAnd13DecimalAmount }
     *     
     */
    public InstrumentLeg7 setLegLastPric(ActiveCurrencyAnd13DecimalAmount value) {
        this.legLastPric = value;
        return this;
    }

    /**
     * Gets the value of the legSttlmCcy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLegSttlmCcy() {
        return legSttlmCcy;
    }

    /**
     * Sets the value of the legSttlmCcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public InstrumentLeg7 setLegSttlmCcy(String value) {
        this.legSttlmCcy = value;
        return this;
    }

    /**
     * Gets the value of the legOrdrQty property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getLegOrdrQty() {
        return legOrdrQty;
    }

    /**
     * Sets the value of the legOrdrQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public InstrumentLeg7 setLegOrdrQty(ActiveCurrencyAndAmount value) {
        this.legOrdrQty = value;
        return this;
    }

    /**
     * Gets the value of the legFwdPts property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLegFwdPts() {
        return legFwdPts;
    }

    /**
     * Sets the value of the legFwdPts property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public InstrumentLeg7 setLegFwdPts(BigDecimal value) {
        this.legFwdPts = value;
        return this;
    }

    /**
     * Gets the value of the legClctdCtrPtyCcyLastQty property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getLegClctdCtrPtyCcyLastQty() {
        return legClctdCtrPtyCcyLastQty;
    }

    /**
     * Sets the value of the legClctdCtrPtyCcyLastQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public InstrumentLeg7 setLegClctdCtrPtyCcyLastQty(ActiveCurrencyAndAmount value) {
        this.legClctdCtrPtyCcyLastQty = value;
        return this;
    }

    /**
     * Gets the value of the legRskAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getLegRskAmt() {
        return legRskAmt;
    }

    /**
     * Sets the value of the legRskAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public InstrumentLeg7 setLegRskAmt(ActiveCurrencyAndAmount value) {
        this.legRskAmt = value;
        return this;
    }

    /**
     * Gets the value of the legValtnRate property.
     * 
     * @return
     *     possible object is
     *     {@link AgreedRate3 }
     *     
     */
    public AgreedRate3 getLegValtnRate() {
        return legValtnRate;
    }

    /**
     * Sets the value of the legValtnRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgreedRate3 }
     *     
     */
    public InstrumentLeg7 setLegValtnRate(AgreedRate3 value) {
        this.legValtnRate = value;
        return this;
    }

    /**
     * Gets the value of the legValDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getLegValDt() {
        return legValDt;
    }

    /**
     * Sets the value of the legValDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public InstrumentLeg7 setLegValDt(LocalDate value) {
        this.legValDt = value;
        return this;
    }

    /**
     * Gets the value of the legCcy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLegCcy() {
        return legCcy;
    }

    /**
     * Sets the value of the legCcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public InstrumentLeg7 setLegCcy(String value) {
        this.legCcy = value;
        return this;
    }

    /**
     * Gets the value of the legSymb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLegSymb() {
        return legSymb;
    }

    /**
     * Sets the value of the legSymb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public InstrumentLeg7 setLegSymb(String value) {
        this.legSymb = value;
        return this;
    }

    /**
     * Gets the value of the legSctyId property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityIdentification18 }
     *     
     */
    public SecurityIdentification18 getLegSctyId() {
        return legSctyId;
    }

    /**
     * Sets the value of the legSctyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityIdentification18 }
     *     
     */
    public InstrumentLeg7 setLegSctyId(SecurityIdentification18 value) {
        this.legSctyId = value;
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
