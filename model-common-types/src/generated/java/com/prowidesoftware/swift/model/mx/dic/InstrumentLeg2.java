
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
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
@XmlType(name = "InstrumentLeg2", propOrder = {
    "legId",
    "legOrdrQty",
    "legBidPric",
    "legOfferPric",
    "legOptnRatio",
    "legSwpTp",
    "legSttlmDt",
    "legSttlmDtCd",
    "instrmLegDtls",
    "legFinInstrmAttrbts",
    "legStiptns",
    "legBchmkCrvDtls",
    "tradgPties",
    "cshPties",
    "othrBizPties",
    "rcvgSttlmPties",
    "dlvrgSttlmPties"
})
public class InstrumentLeg2 {

    @XmlElement(name = "LegId")
    protected String legId;
    @XmlElement(name = "LegOrdrQty", required = true)
    protected Quantity1Choice legOrdrQty;
    @XmlElement(name = "LegBidPric")
    protected Price1 legBidPric;
    @XmlElement(name = "LegOfferPric")
    protected Price1 legOfferPric;
    @XmlElement(name = "LegOptnRatio")
    protected BigDecimal legOptnRatio;
    @XmlElement(name = "LegSwpTp")
    @XmlSchemaType(name = "string")
    protected LegSwapType1Code legSwpTp;
    @XmlElement(name = "LegSttlmDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected OffsetDateTime legSttlmDt;
    @XmlElement(name = "LegSttlmDtCd")
    protected DateType1Choice legSttlmDtCd;
    @XmlElement(name = "InstrmLegDtls")
    protected SecurityIdentification7 instrmLegDtls;
    @XmlElement(name = "LegFinInstrmAttrbts")
    protected FinancialInstrumentAttributes1 legFinInstrmAttrbts;
    @XmlElement(name = "LegStiptns")
    protected FinancialInstrumentStipulations legStiptns;
    @XmlElement(name = "LegBchmkCrvDtls")
    protected BenchmarkCurve1 legBchmkCrvDtls;
    @XmlElement(name = "TradgPties")
    protected List<Intermediary14> tradgPties;
    @XmlElement(name = "CshPties")
    protected CashParties1 cshPties;
    @XmlElement(name = "OthrBizPties")
    protected OtherParties1 othrBizPties;
    @XmlElement(name = "RcvgSttlmPties")
    protected SettlementParties3 rcvgSttlmPties;
    @XmlElement(name = "DlvrgSttlmPties")
    protected SettlementParties3 dlvrgSttlmPties;

    /**
     * Gets the value of the legId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLegId() {
        return legId;
    }

    /**
     * Sets the value of the legId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public InstrumentLeg2 setLegId(String value) {
        this.legId = value;
        return this;
    }

    /**
     * Gets the value of the legOrdrQty property.
     * 
     * @return
     *     possible object is
     *     {@link Quantity1Choice }
     *     
     */
    public Quantity1Choice getLegOrdrQty() {
        return legOrdrQty;
    }

    /**
     * Sets the value of the legOrdrQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Quantity1Choice }
     *     
     */
    public InstrumentLeg2 setLegOrdrQty(Quantity1Choice value) {
        this.legOrdrQty = value;
        return this;
    }

    /**
     * Gets the value of the legBidPric property.
     * 
     * @return
     *     possible object is
     *     {@link Price1 }
     *     
     */
    public Price1 getLegBidPric() {
        return legBidPric;
    }

    /**
     * Sets the value of the legBidPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link Price1 }
     *     
     */
    public InstrumentLeg2 setLegBidPric(Price1 value) {
        this.legBidPric = value;
        return this;
    }

    /**
     * Gets the value of the legOfferPric property.
     * 
     * @return
     *     possible object is
     *     {@link Price1 }
     *     
     */
    public Price1 getLegOfferPric() {
        return legOfferPric;
    }

    /**
     * Sets the value of the legOfferPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link Price1 }
     *     
     */
    public InstrumentLeg2 setLegOfferPric(Price1 value) {
        this.legOfferPric = value;
        return this;
    }

    /**
     * Gets the value of the legOptnRatio property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLegOptnRatio() {
        return legOptnRatio;
    }

    /**
     * Sets the value of the legOptnRatio property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public InstrumentLeg2 setLegOptnRatio(BigDecimal value) {
        this.legOptnRatio = value;
        return this;
    }

    /**
     * Gets the value of the legSwpTp property.
     * 
     * @return
     *     possible object is
     *     {@link LegSwapType1Code }
     *     
     */
    public LegSwapType1Code getLegSwpTp() {
        return legSwpTp;
    }

    /**
     * Sets the value of the legSwpTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link LegSwapType1Code }
     *     
     */
    public InstrumentLeg2 setLegSwpTp(LegSwapType1Code value) {
        this.legSwpTp = value;
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
    public InstrumentLeg2 setLegSttlmDt(OffsetDateTime value) {
        this.legSttlmDt = value;
        return this;
    }

    /**
     * Gets the value of the legSttlmDtCd property.
     * 
     * @return
     *     possible object is
     *     {@link DateType1Choice }
     *     
     */
    public DateType1Choice getLegSttlmDtCd() {
        return legSttlmDtCd;
    }

    /**
     * Sets the value of the legSttlmDtCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateType1Choice }
     *     
     */
    public InstrumentLeg2 setLegSttlmDtCd(DateType1Choice value) {
        this.legSttlmDtCd = value;
        return this;
    }

    /**
     * Gets the value of the instrmLegDtls property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityIdentification7 }
     *     
     */
    public SecurityIdentification7 getInstrmLegDtls() {
        return instrmLegDtls;
    }

    /**
     * Sets the value of the instrmLegDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityIdentification7 }
     *     
     */
    public InstrumentLeg2 setInstrmLegDtls(SecurityIdentification7 value) {
        this.instrmLegDtls = value;
        return this;
    }

    /**
     * Gets the value of the legFinInstrmAttrbts property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentAttributes1 }
     *     
     */
    public FinancialInstrumentAttributes1 getLegFinInstrmAttrbts() {
        return legFinInstrmAttrbts;
    }

    /**
     * Sets the value of the legFinInstrmAttrbts property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentAttributes1 }
     *     
     */
    public InstrumentLeg2 setLegFinInstrmAttrbts(FinancialInstrumentAttributes1 value) {
        this.legFinInstrmAttrbts = value;
        return this;
    }

    /**
     * Gets the value of the legStiptns property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentStipulations }
     *     
     */
    public FinancialInstrumentStipulations getLegStiptns() {
        return legStiptns;
    }

    /**
     * Sets the value of the legStiptns property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentStipulations }
     *     
     */
    public InstrumentLeg2 setLegStiptns(FinancialInstrumentStipulations value) {
        this.legStiptns = value;
        return this;
    }

    /**
     * Gets the value of the legBchmkCrvDtls property.
     * 
     * @return
     *     possible object is
     *     {@link BenchmarkCurve1 }
     *     
     */
    public BenchmarkCurve1 getLegBchmkCrvDtls() {
        return legBchmkCrvDtls;
    }

    /**
     * Sets the value of the legBchmkCrvDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link BenchmarkCurve1 }
     *     
     */
    public InstrumentLeg2 setLegBchmkCrvDtls(BenchmarkCurve1 value) {
        this.legBchmkCrvDtls = value;
        return this;
    }

    /**
     * Gets the value of the tradgPties property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the tradgPties property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTradgPties().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Intermediary14 }
     * 
     * 
     * @return
     *     The value of the tradgPties property.
     */
    public List<Intermediary14> getTradgPties() {
        if (tradgPties == null) {
            tradgPties = new ArrayList<>();
        }
        return this.tradgPties;
    }

    /**
     * Gets the value of the cshPties property.
     * 
     * @return
     *     possible object is
     *     {@link CashParties1 }
     *     
     */
    public CashParties1 getCshPties() {
        return cshPties;
    }

    /**
     * Sets the value of the cshPties property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashParties1 }
     *     
     */
    public InstrumentLeg2 setCshPties(CashParties1 value) {
        this.cshPties = value;
        return this;
    }

    /**
     * Gets the value of the othrBizPties property.
     * 
     * @return
     *     possible object is
     *     {@link OtherParties1 }
     *     
     */
    public OtherParties1 getOthrBizPties() {
        return othrBizPties;
    }

    /**
     * Sets the value of the othrBizPties property.
     * 
     * @param value
     *     allowed object is
     *     {@link OtherParties1 }
     *     
     */
    public InstrumentLeg2 setOthrBizPties(OtherParties1 value) {
        this.othrBizPties = value;
        return this;
    }

    /**
     * Gets the value of the rcvgSttlmPties property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementParties3 }
     *     
     */
    public SettlementParties3 getRcvgSttlmPties() {
        return rcvgSttlmPties;
    }

    /**
     * Sets the value of the rcvgSttlmPties property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementParties3 }
     *     
     */
    public InstrumentLeg2 setRcvgSttlmPties(SettlementParties3 value) {
        this.rcvgSttlmPties = value;
        return this;
    }

    /**
     * Gets the value of the dlvrgSttlmPties property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementParties3 }
     *     
     */
    public SettlementParties3 getDlvrgSttlmPties() {
        return dlvrgSttlmPties;
    }

    /**
     * Sets the value of the dlvrgSttlmPties property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementParties3 }
     *     
     */
    public InstrumentLeg2 setDlvrgSttlmPties(SettlementParties3 value) {
        this.dlvrgSttlmPties = value;
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

    /**
     * Adds a new item to the tradgPties list.
     * @see #getTradgPties()
     * 
     */
    public InstrumentLeg2 addTradgPties(Intermediary14 tradgPties) {
        getTradgPties().add(tradgPties);
        return this;
    }

}
