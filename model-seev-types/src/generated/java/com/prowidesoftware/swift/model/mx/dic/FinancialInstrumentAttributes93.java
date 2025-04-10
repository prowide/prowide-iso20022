
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
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
@XmlType(name = "FinancialInstrumentAttributes93", propOrder = {
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
public class FinancialInstrumentAttributes93 {

    @XmlElement(name = "SctyId", required = true)
    protected SecurityIdentification19 sctyId;
    @XmlElement(name = "Qty")
    protected BigDecimal qty;
    @XmlElement(name = "RnncblEntitlmntStsTp")
    protected RenounceableEntitlementStatusTypeFormat3Choice rnncblEntitlmntStsTp;
    @XmlElement(name = "FrctnDspstn")
    protected FractionDispositionType25Choice frctnDspstn;
    @XmlElement(name = "IntrmdtSctiesToUndrlygRatio")
    protected QuantityToQuantityRatio1 intrmdtSctiesToUndrlygRatio;
    @XmlElement(name = "MktPric")
    protected AmountPrice2 mktPric;
    @XmlElement(name = "XpryDt", required = true)
    protected DateFormat30Choice xpryDt;
    @XmlElement(name = "PstngDt", required = true)
    protected DateFormat30Choice pstngDt;
    @XmlElement(name = "TradgPrd")
    protected Period11 tradgPrd;
    @XmlElement(name = "UinstdBal")
    protected BalanceFormat5Choice uinstdBal;
    @XmlElement(name = "InstdBal")
    protected BalanceFormat5Choice instdBal;

    /**
     * Gets the value of the sctyId property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityIdentification19 }
     *     
     */
    public SecurityIdentification19 getSctyId() {
        return sctyId;
    }

    /**
     * Sets the value of the sctyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityIdentification19 }
     *     
     */
    public FinancialInstrumentAttributes93 setSctyId(SecurityIdentification19 value) {
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
    public FinancialInstrumentAttributes93 setQty(BigDecimal value) {
        this.qty = value;
        return this;
    }

    /**
     * Gets the value of the rnncblEntitlmntStsTp property.
     * 
     * @return
     *     possible object is
     *     {@link RenounceableEntitlementStatusTypeFormat3Choice }
     *     
     */
    public RenounceableEntitlementStatusTypeFormat3Choice getRnncblEntitlmntStsTp() {
        return rnncblEntitlmntStsTp;
    }

    /**
     * Sets the value of the rnncblEntitlmntStsTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link RenounceableEntitlementStatusTypeFormat3Choice }
     *     
     */
    public FinancialInstrumentAttributes93 setRnncblEntitlmntStsTp(RenounceableEntitlementStatusTypeFormat3Choice value) {
        this.rnncblEntitlmntStsTp = value;
        return this;
    }

    /**
     * Gets the value of the frctnDspstn property.
     * 
     * @return
     *     possible object is
     *     {@link FractionDispositionType25Choice }
     *     
     */
    public FractionDispositionType25Choice getFrctnDspstn() {
        return frctnDspstn;
    }

    /**
     * Sets the value of the frctnDspstn property.
     * 
     * @param value
     *     allowed object is
     *     {@link FractionDispositionType25Choice }
     *     
     */
    public FinancialInstrumentAttributes93 setFrctnDspstn(FractionDispositionType25Choice value) {
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
    public FinancialInstrumentAttributes93 setIntrmdtSctiesToUndrlygRatio(QuantityToQuantityRatio1 value) {
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
    public FinancialInstrumentAttributes93 setMktPric(AmountPrice2 value) {
        this.mktPric = value;
        return this;
    }

    /**
     * Gets the value of the xpryDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat30Choice }
     *     
     */
    public DateFormat30Choice getXpryDt() {
        return xpryDt;
    }

    /**
     * Sets the value of the xpryDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat30Choice }
     *     
     */
    public FinancialInstrumentAttributes93 setXpryDt(DateFormat30Choice value) {
        this.xpryDt = value;
        return this;
    }

    /**
     * Gets the value of the pstngDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat30Choice }
     *     
     */
    public DateFormat30Choice getPstngDt() {
        return pstngDt;
    }

    /**
     * Sets the value of the pstngDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat30Choice }
     *     
     */
    public FinancialInstrumentAttributes93 setPstngDt(DateFormat30Choice value) {
        this.pstngDt = value;
        return this;
    }

    /**
     * Gets the value of the tradgPrd property.
     * 
     * @return
     *     possible object is
     *     {@link Period11 }
     *     
     */
    public Period11 getTradgPrd() {
        return tradgPrd;
    }

    /**
     * Sets the value of the tradgPrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Period11 }
     *     
     */
    public FinancialInstrumentAttributes93 setTradgPrd(Period11 value) {
        this.tradgPrd = value;
        return this;
    }

    /**
     * Gets the value of the uinstdBal property.
     * 
     * @return
     *     possible object is
     *     {@link BalanceFormat5Choice }
     *     
     */
    public BalanceFormat5Choice getUinstdBal() {
        return uinstdBal;
    }

    /**
     * Sets the value of the uinstdBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BalanceFormat5Choice }
     *     
     */
    public FinancialInstrumentAttributes93 setUinstdBal(BalanceFormat5Choice value) {
        this.uinstdBal = value;
        return this;
    }

    /**
     * Gets the value of the instdBal property.
     * 
     * @return
     *     possible object is
     *     {@link BalanceFormat5Choice }
     *     
     */
    public BalanceFormat5Choice getInstdBal() {
        return instdBal;
    }

    /**
     * Sets the value of the instdBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BalanceFormat5Choice }
     *     
     */
    public FinancialInstrumentAttributes93 setInstdBal(BalanceFormat5Choice value) {
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
