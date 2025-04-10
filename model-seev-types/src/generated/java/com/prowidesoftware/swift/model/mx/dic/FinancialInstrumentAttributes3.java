
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Description of the financial instrument.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FinancialInstrumentAttributes3", propOrder = {
    "sctyId",
    "qty",
    "rnncblEntitlmntStsTp",
    "frctnDspstn",
    "intrmdtSctiesToUndrlygRatio",
    "mktPric",
    "xpryDt",
    "pstngDt",
    "tradgPrd",
    "uinstdBal",
    "instdBal"
})
public class FinancialInstrumentAttributes3 {

    @XmlElement(name = "SctyId", required = true)
    protected SecurityIdentification11 sctyId;
    @XmlElement(name = "Qty")
    protected BigDecimal qty;
    @XmlElement(name = "RnncblEntitlmntStsTp")
    protected RenounceableEntitlementStatusTypeFormat1Choice rnncblEntitlmntStsTp;
    @XmlElement(name = "FrctnDspstn")
    protected FractionDispositionType3Choice frctnDspstn;
    @XmlElement(name = "IntrmdtSctiesToUndrlygRatio")
    protected QuantityToQuantityRatio1 intrmdtSctiesToUndrlygRatio;
    @XmlElement(name = "MktPric")
    protected AmountPrice2 mktPric;
    @XmlElement(name = "XpryDt", required = true)
    protected DateFormat5Choice xpryDt;
    @XmlElement(name = "PstngDt", required = true)
    protected DateFormat5Choice pstngDt;
    @XmlElement(name = "TradgPrd")
    protected Period3 tradgPrd;
    @XmlElement(name = "UinstdBal")
    protected BalanceFormat1Choice uinstdBal;
    @XmlElement(name = "InstdBal")
    protected BalanceFormat1Choice instdBal;

    /**
     * Gets the value of the sctyId property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityIdentification11 }
     *     
     */
    public SecurityIdentification11 getSctyId() {
        return sctyId;
    }

    /**
     * Sets the value of the sctyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityIdentification11 }
     *     
     */
    public FinancialInstrumentAttributes3 setSctyId(SecurityIdentification11 value) {
        this.sctyId = value;
        return this;
    }

    /**
     * Gets the value of the qty property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getQty() {
        return qty;
    }

    /**
     * Sets the value of the qty property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public FinancialInstrumentAttributes3 setQty(BigDecimal value) {
        this.qty = value;
        return this;
    }

    /**
     * Gets the value of the rnncblEntitlmntStsTp property.
     * 
     * @return
     *     possible object is
     *     {@link RenounceableEntitlementStatusTypeFormat1Choice }
     *     
     */
    public RenounceableEntitlementStatusTypeFormat1Choice getRnncblEntitlmntStsTp() {
        return rnncblEntitlmntStsTp;
    }

    /**
     * Sets the value of the rnncblEntitlmntStsTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link RenounceableEntitlementStatusTypeFormat1Choice }
     *     
     */
    public FinancialInstrumentAttributes3 setRnncblEntitlmntStsTp(RenounceableEntitlementStatusTypeFormat1Choice value) {
        this.rnncblEntitlmntStsTp = value;
        return this;
    }

    /**
     * Gets the value of the frctnDspstn property.
     * 
     * @return
     *     possible object is
     *     {@link FractionDispositionType3Choice }
     *     
     */
    public FractionDispositionType3Choice getFrctnDspstn() {
        return frctnDspstn;
    }

    /**
     * Sets the value of the frctnDspstn property.
     * 
     * @param value
     *     allowed object is
     *     {@link FractionDispositionType3Choice }
     *     
     */
    public FinancialInstrumentAttributes3 setFrctnDspstn(FractionDispositionType3Choice value) {
        this.frctnDspstn = value;
        return this;
    }

    /**
     * Gets the value of the intrmdtSctiesToUndrlygRatio property.
     * 
     * @return
     *     possible object is
     *     {@link QuantityToQuantityRatio1 }
     *     
     */
    public QuantityToQuantityRatio1 getIntrmdtSctiesToUndrlygRatio() {
        return intrmdtSctiesToUndrlygRatio;
    }

    /**
     * Sets the value of the intrmdtSctiesToUndrlygRatio property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantityToQuantityRatio1 }
     *     
     */
    public FinancialInstrumentAttributes3 setIntrmdtSctiesToUndrlygRatio(QuantityToQuantityRatio1 value) {
        this.intrmdtSctiesToUndrlygRatio = value;
        return this;
    }

    /**
     * Gets the value of the mktPric property.
     * 
     * @return
     *     possible object is
     *     {@link AmountPrice2 }
     *     
     */
    public AmountPrice2 getMktPric() {
        return mktPric;
    }

    /**
     * Sets the value of the mktPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountPrice2 }
     *     
     */
    public FinancialInstrumentAttributes3 setMktPric(AmountPrice2 value) {
        this.mktPric = value;
        return this;
    }

    /**
     * Gets the value of the xpryDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat5Choice }
     *     
     */
    public DateFormat5Choice getXpryDt() {
        return xpryDt;
    }

    /**
     * Sets the value of the xpryDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat5Choice }
     *     
     */
    public FinancialInstrumentAttributes3 setXpryDt(DateFormat5Choice value) {
        this.xpryDt = value;
        return this;
    }

    /**
     * Gets the value of the pstngDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat5Choice }
     *     
     */
    public DateFormat5Choice getPstngDt() {
        return pstngDt;
    }

    /**
     * Sets the value of the pstngDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat5Choice }
     *     
     */
    public FinancialInstrumentAttributes3 setPstngDt(DateFormat5Choice value) {
        this.pstngDt = value;
        return this;
    }

    /**
     * Gets the value of the tradgPrd property.
     * 
     * @return
     *     possible object is
     *     {@link Period3 }
     *     
     */
    public Period3 getTradgPrd() {
        return tradgPrd;
    }

    /**
     * Sets the value of the tradgPrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Period3 }
     *     
     */
    public FinancialInstrumentAttributes3 setTradgPrd(Period3 value) {
        this.tradgPrd = value;
        return this;
    }

    /**
     * Gets the value of the uinstdBal property.
     * 
     * @return
     *     possible object is
     *     {@link BalanceFormat1Choice }
     *     
     */
    public BalanceFormat1Choice getUinstdBal() {
        return uinstdBal;
    }

    /**
     * Sets the value of the uinstdBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BalanceFormat1Choice }
     *     
     */
    public FinancialInstrumentAttributes3 setUinstdBal(BalanceFormat1Choice value) {
        this.uinstdBal = value;
        return this;
    }

    /**
     * Gets the value of the instdBal property.
     * 
     * @return
     *     possible object is
     *     {@link BalanceFormat1Choice }
     *     
     */
    public BalanceFormat1Choice getInstdBal() {
        return instdBal;
    }

    /**
     * Sets the value of the instdBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BalanceFormat1Choice }
     *     
     */
    public FinancialInstrumentAttributes3 setInstdBal(BalanceFormat1Choice value) {
        this.instdBal = value;
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
