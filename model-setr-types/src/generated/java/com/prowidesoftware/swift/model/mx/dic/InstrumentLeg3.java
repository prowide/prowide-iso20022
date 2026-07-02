
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
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
@XmlType(name = "InstrumentLeg3", propOrder = {
    "legId",
    "legOrdrQty",
    "legPric",
    "legOptnRatio",
    "legPosFct",
    "legDerivCvrdInd",
    "legPreAllcnDtls",
    "instrmLegDtls",
    "legFinInstrmAttrbts",
    "tradgPties",
    "cshPties",
    "othrBizPties",
    "rcvgSttlmPties",
    "dlvrgSttlmPties",
    "amtsDtls"
})
public class InstrumentLeg3 {

    @XmlElement(name = "LegId")
    protected String legId;
    @XmlElement(name = "LegOrdrQty", required = true)
    protected Quantity1Choice legOrdrQty;
    @XmlElement(name = "LegPric")
    protected Price1 legPric;
    @XmlElement(name = "LegOptnRatio")
    protected BigDecimal legOptnRatio;
    @XmlElement(name = "LegPosFct", required = true)
    @XmlSchemaType(name = "string")
    protected PositionEffect1Code legPosFct;
    @XmlElement(name = "LegDerivCvrdInd")
    protected boolean legDerivCvrdInd;
    @XmlElement(name = "LegPreAllcnDtls")
    protected PreAllocation1 legPreAllcnDtls;
    @XmlElement(name = "InstrmLegDtls")
    protected SecurityIdentification7 instrmLegDtls;
    @XmlElement(name = "LegFinInstrmAttrbts", required = true)
    protected FinancialInstrumentAttributes1 legFinInstrmAttrbts;
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
    @XmlElement(name = "AmtsDtls")
    protected List<OtherAmounts1> amtsDtls;

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
    public InstrumentLeg3 setLegId(String value) {
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
    public InstrumentLeg3 setLegOrdrQty(Quantity1Choice value) {
        this.legOrdrQty = value;
        return this;
    }

    /**
     * Gets the value of the legPric property.
     * 
     * @return
     *     possible object is
     *     {@link Price1 }
     *     
     */
    public Price1 getLegPric() {
        return legPric;
    }

    /**
     * Sets the value of the legPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link Price1 }
     *     
     */
    public InstrumentLeg3 setLegPric(Price1 value) {
        this.legPric = value;
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
    public InstrumentLeg3 setLegOptnRatio(BigDecimal value) {
        this.legOptnRatio = value;
        return this;
    }

    /**
     * Gets the value of the legPosFct property.
     * 
     * @return
     *     possible object is
     *     {@link PositionEffect1Code }
     *     
     */
    public PositionEffect1Code getLegPosFct() {
        return legPosFct;
    }

    /**
     * Sets the value of the legPosFct property.
     * 
     * @param value
     *     allowed object is
     *     {@link PositionEffect1Code }
     *     
     */
    public InstrumentLeg3 setLegPosFct(PositionEffect1Code value) {
        this.legPosFct = value;
        return this;
    }

    /**
     * Gets the value of the legDerivCvrdInd property.
     * 
     */
    public boolean isLegDerivCvrdInd() {
        return legDerivCvrdInd;
    }

    /**
     * Sets the value of the legDerivCvrdInd property.
     * 
     */
    public InstrumentLeg3 setLegDerivCvrdInd(boolean value) {
        this.legDerivCvrdInd = value;
        return this;
    }

    /**
     * Gets the value of the legPreAllcnDtls property.
     * 
     * @return
     *     possible object is
     *     {@link PreAllocation1 }
     *     
     */
    public PreAllocation1 getLegPreAllcnDtls() {
        return legPreAllcnDtls;
    }

    /**
     * Sets the value of the legPreAllcnDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link PreAllocation1 }
     *     
     */
    public InstrumentLeg3 setLegPreAllcnDtls(PreAllocation1 value) {
        this.legPreAllcnDtls = value;
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
    public InstrumentLeg3 setInstrmLegDtls(SecurityIdentification7 value) {
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
    public InstrumentLeg3 setLegFinInstrmAttrbts(FinancialInstrumentAttributes1 value) {
        this.legFinInstrmAttrbts = value;
        return this;
    }

    /**
     * Gets the value of the tradgPties property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tradgPties property.
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
     */
    public List<Intermediary14> getTradgPties() {
        if (tradgPties == null) {
            tradgPties = new ArrayList<Intermediary14>();
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
    public InstrumentLeg3 setCshPties(CashParties1 value) {
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
    public InstrumentLeg3 setOthrBizPties(OtherParties1 value) {
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
    public InstrumentLeg3 setRcvgSttlmPties(SettlementParties3 value) {
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
    public InstrumentLeg3 setDlvrgSttlmPties(SettlementParties3 value) {
        this.dlvrgSttlmPties = value;
        return this;
    }

    /**
     * Gets the value of the amtsDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the amtsDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAmtsDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OtherAmounts1 }
     * 
     * 
     */
    public List<OtherAmounts1> getAmtsDtls() {
        if (amtsDtls == null) {
            amtsDtls = new ArrayList<OtherAmounts1>();
        }
        return this.amtsDtls;
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
    public InstrumentLeg3 addTradgPties(Intermediary14 tradgPties) {
        getTradgPties().add(tradgPties);
        return this;
    }

    /**
     * Adds a new item to the amtsDtls list.
     * @see #getAmtsDtls()
     * 
     */
    public InstrumentLeg3 addAmtsDtls(OtherAmounts1 amtsDtls) {
        getAmtsDtls().add(amtsDtls);
        return this;
    }

}
