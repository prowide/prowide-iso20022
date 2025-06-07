
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
@XmlType(name = "FinancialInstrumentAttributes73", propOrder = {
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
public class FinancialInstrumentAttributes73 {

    @XmlElement(name = "SctyId", required = true)
    protected SecurityIdentification20 sctyId;
    @XmlElement(name = "Qty")
    protected BigDecimal qty;
    @XmlElement(name = "RnncblEntitlmntStsTp")
    protected RenounceableEntitlementStatusTypeFormat4Choice rnncblEntitlmntStsTp;
    @XmlElement(name = "FrctnDspstn")
    protected FractionDispositionType32Choice frctnDspstn;
    @XmlElement(name = "IntrmdtSctiesToUndrlygRatio")
    protected QuantityToQuantityRatio2 intrmdtSctiesToUndrlygRatio;
    @XmlElement(name = "MktPric")
    protected AmountPrice4 mktPric;
    @XmlElement(name = "XpryDt", required = true)
    protected DateFormat41Choice xpryDt;
    @XmlElement(name = "PstngDt", required = true)
    protected DateFormat41Choice pstngDt;
    @XmlElement(name = "TradgPrd")
    protected Period4 tradgPrd;
    @XmlElement(name = "UinstdBal")
    protected BalanceFormat7Choice uinstdBal;
    @XmlElement(name = "InstdBal")
    protected BalanceFormat7Choice instdBal;

    /**
     * Gets the value of the sctyId property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityIdentification20 }
     *     
     */
    public SecurityIdentification20 getSctyId() {
        return sctyId;
    }

    /**
     * Sets the value of the sctyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityIdentification20 }
     *     
     */
    public FinancialInstrumentAttributes73 setSctyId(SecurityIdentification20 value) {
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
    public FinancialInstrumentAttributes73 setQty(BigDecimal value) {
        this.qty = value;
        return this;
    }

    /**
     * Gets the value of the rnncblEntitlmntStsTp property.
     * 
     * @return
     *     possible object is
     *     {@link RenounceableEntitlementStatusTypeFormat4Choice }
     *     
     */
    public RenounceableEntitlementStatusTypeFormat4Choice getRnncblEntitlmntStsTp() {
        return rnncblEntitlmntStsTp;
    }

    /**
     * Sets the value of the rnncblEntitlmntStsTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link RenounceableEntitlementStatusTypeFormat4Choice }
     *     
     */
    public FinancialInstrumentAttributes73 setRnncblEntitlmntStsTp(RenounceableEntitlementStatusTypeFormat4Choice value) {
        this.rnncblEntitlmntStsTp = value;
        return this;
    }

    /**
     * Gets the value of the frctnDspstn property.
     * 
     * @return
     *     possible object is
     *     {@link FractionDispositionType32Choice }
     *     
     */
    public FractionDispositionType32Choice getFrctnDspstn() {
        return frctnDspstn;
    }

    /**
     * Sets the value of the frctnDspstn property.
     * 
     * @param value
     *     allowed object is
     *     {@link FractionDispositionType32Choice }
     *     
     */
    public FinancialInstrumentAttributes73 setFrctnDspstn(FractionDispositionType32Choice value) {
        this.frctnDspstn = value;
        return this;
    }

    /**
     * Gets the value of the intrmdtSctiesToUndrlygRatio property.
     * 
     * @return
     *     possible object is
     *     {@link QuantityToQuantityRatio2 }
     *     
     */
    public QuantityToQuantityRatio2 getIntrmdtSctiesToUndrlygRatio() {
        return intrmdtSctiesToUndrlygRatio;
    }

    /**
     * Sets the value of the intrmdtSctiesToUndrlygRatio property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantityToQuantityRatio2 }
     *     
     */
    public FinancialInstrumentAttributes73 setIntrmdtSctiesToUndrlygRatio(QuantityToQuantityRatio2 value) {
        this.intrmdtSctiesToUndrlygRatio = value;
        return this;
    }

    /**
     * Gets the value of the mktPric property.
     * 
     * @return
     *     possible object is
     *     {@link AmountPrice4 }
     *     
     */
    public AmountPrice4 getMktPric() {
        return mktPric;
    }

    /**
     * Sets the value of the mktPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountPrice4 }
     *     
     */
    public FinancialInstrumentAttributes73 setMktPric(AmountPrice4 value) {
        this.mktPric = value;
        return this;
    }

    /**
     * Gets the value of the xpryDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat41Choice }
     *     
     */
    public DateFormat41Choice getXpryDt() {
        return xpryDt;
    }

    /**
     * Sets the value of the xpryDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat41Choice }
     *     
     */
    public FinancialInstrumentAttributes73 setXpryDt(DateFormat41Choice value) {
        this.xpryDt = value;
        return this;
    }

    /**
     * Gets the value of the pstngDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat41Choice }
     *     
     */
    public DateFormat41Choice getPstngDt() {
        return pstngDt;
    }

    /**
     * Sets the value of the pstngDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat41Choice }
     *     
     */
    public FinancialInstrumentAttributes73 setPstngDt(DateFormat41Choice value) {
        this.pstngDt = value;
        return this;
    }

    /**
     * Gets the value of the tradgPrd property.
     * 
     * @return
     *     possible object is
     *     {@link Period4 }
     *     
     */
    public Period4 getTradgPrd() {
        return tradgPrd;
    }

    /**
     * Sets the value of the tradgPrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Period4 }
     *     
     */
    public FinancialInstrumentAttributes73 setTradgPrd(Period4 value) {
        this.tradgPrd = value;
        return this;
    }

    /**
     * Gets the value of the uinstdBal property.
     * 
     * @return
     *     possible object is
     *     {@link BalanceFormat7Choice }
     *     
     */
    public BalanceFormat7Choice getUinstdBal() {
        return uinstdBal;
    }

    /**
     * Sets the value of the uinstdBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BalanceFormat7Choice }
     *     
     */
    public FinancialInstrumentAttributes73 setUinstdBal(BalanceFormat7Choice value) {
        this.uinstdBal = value;
        return this;
    }

    /**
     * Gets the value of the instdBal property.
     * 
     * @return
     *     possible object is
     *     {@link BalanceFormat7Choice }
     *     
     */
    public BalanceFormat7Choice getInstdBal() {
        return instdBal;
    }

    /**
     * Sets the value of the instdBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BalanceFormat7Choice }
     *     
     */
    public FinancialInstrumentAttributes73 setInstdBal(BalanceFormat7Choice value) {
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
