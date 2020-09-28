
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
 * Execution of the subscription part, in a switch between investment funds or investment fund classes.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SwitchSubscriptionLegExecution4", propOrder = {
    "legId",
    "legExctnId",
    "finInstrmDtls",
    "unitsNb",
    "netAmt",
    "grssAmt",
    "invstmtAcctDtls",
    "tradDtTm",
    "pricDtls",
    "inftvPricDtls",
    "cumDvddInd",
    "intrmPrftAmt",
    "incmPref",
    "reqdSttlmCcy",
    "reqdNAVCcy",
    "txOvrhd",
    "inftvTaxDtls",
    "sttlmAndCtdyDtls",
    "physDlvryInd",
    "physDlvryDtls",
    "nonStdSttlmInf",
    "equlstn"
})
public class SwitchSubscriptionLegExecution4 {

    @XmlElement(name = "LegId")
    protected String legId;
    @XmlElement(name = "LegExctnId")
    protected String legExctnId;
    @XmlElement(name = "FinInstrmDtls", required = true)
    protected FinancialInstrument57 finInstrmDtls;
    @XmlElement(name = "UnitsNb", required = true)
    protected BigDecimal unitsNb;
    @XmlElement(name = "NetAmt")
    protected ActiveCurrencyAndAmount netAmt;
    @XmlElement(name = "GrssAmt")
    protected ActiveCurrencyAndAmount grssAmt;
    @XmlElement(name = "InvstmtAcctDtls")
    protected InvestmentAccount58 invstmtAcctDtls;
    @XmlElement(name = "TradDtTm", required = true)
    protected DateAndDateTimeChoice tradDtTm;
    @XmlElement(name = "PricDtls", required = true)
    protected UnitPrice22 pricDtls;
    @XmlElement(name = "InftvPricDtls")
    protected List<UnitPrice22> inftvPricDtls;
    @XmlElement(name = "CumDvddInd")
    protected boolean cumDvddInd;
    @XmlElement(name = "IntrmPrftAmt")
    protected ProfitAndLoss2Choice intrmPrftAmt;
    @XmlElement(name = "IncmPref")
    @XmlSchemaType(name = "string")
    protected IncomePreference1Code incmPref;
    @XmlElement(name = "ReqdSttlmCcy")
    protected String reqdSttlmCcy;
    @XmlElement(name = "ReqdNAVCcy")
    protected String reqdNAVCcy;
    @XmlElement(name = "TxOvrhd")
    protected TotalFeesAndTaxes40 txOvrhd;
    @XmlElement(name = "InftvTaxDtls")
    protected InformativeTax1 inftvTaxDtls;
    @XmlElement(name = "SttlmAndCtdyDtls")
    protected FundSettlementParameters12 sttlmAndCtdyDtls;
    @XmlElement(name = "PhysDlvryInd")
    protected boolean physDlvryInd;
    @XmlElement(name = "PhysDlvryDtls")
    protected DeliveryParameters3 physDlvryDtls;
    @XmlElement(name = "NonStdSttlmInf")
    protected String nonStdSttlmInf;
    @XmlElement(name = "Equlstn")
    protected Equalisation1 equlstn;

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
    public SwitchSubscriptionLegExecution4 setLegId(String value) {
        this.legId = value;
        return this;
    }

    /**
     * Gets the value of the legExctnId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLegExctnId() {
        return legExctnId;
    }

    /**
     * Sets the value of the legExctnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwitchSubscriptionLegExecution4 setLegExctnId(String value) {
        this.legExctnId = value;
        return this;
    }

    /**
     * Gets the value of the finInstrmDtls property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrument57 }
     *     
     */
    public FinancialInstrument57 getFinInstrmDtls() {
        return finInstrmDtls;
    }

    /**
     * Sets the value of the finInstrmDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrument57 }
     *     
     */
    public SwitchSubscriptionLegExecution4 setFinInstrmDtls(FinancialInstrument57 value) {
        this.finInstrmDtls = value;
        return this;
    }

    /**
     * Gets the value of the unitsNb property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getUnitsNb() {
        return unitsNb;
    }

    /**
     * Sets the value of the unitsNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public SwitchSubscriptionLegExecution4 setUnitsNb(BigDecimal value) {
        this.unitsNb = value;
        return this;
    }

    /**
     * Gets the value of the netAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getNetAmt() {
        return netAmt;
    }

    /**
     * Sets the value of the netAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public SwitchSubscriptionLegExecution4 setNetAmt(ActiveCurrencyAndAmount value) {
        this.netAmt = value;
        return this;
    }

    /**
     * Gets the value of the grssAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getGrssAmt() {
        return grssAmt;
    }

    /**
     * Sets the value of the grssAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public SwitchSubscriptionLegExecution4 setGrssAmt(ActiveCurrencyAndAmount value) {
        this.grssAmt = value;
        return this;
    }

    /**
     * Gets the value of the invstmtAcctDtls property.
     * 
     * @return
     *     possible object is
     *     {@link InvestmentAccount58 }
     *     
     */
    public InvestmentAccount58 getInvstmtAcctDtls() {
        return invstmtAcctDtls;
    }

    /**
     * Sets the value of the invstmtAcctDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvestmentAccount58 }
     *     
     */
    public SwitchSubscriptionLegExecution4 setInvstmtAcctDtls(InvestmentAccount58 value) {
        this.invstmtAcctDtls = value;
        return this;
    }

    /**
     * Gets the value of the tradDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTimeChoice }
     *     
     */
    public DateAndDateTimeChoice getTradDtTm() {
        return tradDtTm;
    }

    /**
     * Sets the value of the tradDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTimeChoice }
     *     
     */
    public SwitchSubscriptionLegExecution4 setTradDtTm(DateAndDateTimeChoice value) {
        this.tradDtTm = value;
        return this;
    }

    /**
     * Gets the value of the pricDtls property.
     * 
     * @return
     *     possible object is
     *     {@link UnitPrice22 }
     *     
     */
    public UnitPrice22 getPricDtls() {
        return pricDtls;
    }

    /**
     * Sets the value of the pricDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitPrice22 }
     *     
     */
    public SwitchSubscriptionLegExecution4 setPricDtls(UnitPrice22 value) {
        this.pricDtls = value;
        return this;
    }

    /**
     * Gets the value of the inftvPricDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the inftvPricDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInftvPricDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UnitPrice22 }
     * 
     * 
     */
    public List<UnitPrice22> getInftvPricDtls() {
        if (inftvPricDtls == null) {
            inftvPricDtls = new ArrayList<UnitPrice22>();
        }
        return this.inftvPricDtls;
    }

    /**
     * Gets the value of the cumDvddInd property.
     * 
     */
    public boolean isCumDvddInd() {
        return cumDvddInd;
    }

    /**
     * Sets the value of the cumDvddInd property.
     * 
     */
    public SwitchSubscriptionLegExecution4 setCumDvddInd(boolean value) {
        this.cumDvddInd = value;
        return this;
    }

    /**
     * Gets the value of the intrmPrftAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ProfitAndLoss2Choice }
     *     
     */
    public ProfitAndLoss2Choice getIntrmPrftAmt() {
        return intrmPrftAmt;
    }

    /**
     * Sets the value of the intrmPrftAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProfitAndLoss2Choice }
     *     
     */
    public SwitchSubscriptionLegExecution4 setIntrmPrftAmt(ProfitAndLoss2Choice value) {
        this.intrmPrftAmt = value;
        return this;
    }

    /**
     * Gets the value of the incmPref property.
     * 
     * @return
     *     possible object is
     *     {@link IncomePreference1Code }
     *     
     */
    public IncomePreference1Code getIncmPref() {
        return incmPref;
    }

    /**
     * Sets the value of the incmPref property.
     * 
     * @param value
     *     allowed object is
     *     {@link IncomePreference1Code }
     *     
     */
    public SwitchSubscriptionLegExecution4 setIncmPref(IncomePreference1Code value) {
        this.incmPref = value;
        return this;
    }

    /**
     * Gets the value of the reqdSttlmCcy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReqdSttlmCcy() {
        return reqdSttlmCcy;
    }

    /**
     * Sets the value of the reqdSttlmCcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwitchSubscriptionLegExecution4 setReqdSttlmCcy(String value) {
        this.reqdSttlmCcy = value;
        return this;
    }

    /**
     * Gets the value of the reqdNAVCcy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReqdNAVCcy() {
        return reqdNAVCcy;
    }

    /**
     * Sets the value of the reqdNAVCcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwitchSubscriptionLegExecution4 setReqdNAVCcy(String value) {
        this.reqdNAVCcy = value;
        return this;
    }

    /**
     * Gets the value of the txOvrhd property.
     * 
     * @return
     *     possible object is
     *     {@link TotalFeesAndTaxes40 }
     *     
     */
    public TotalFeesAndTaxes40 getTxOvrhd() {
        return txOvrhd;
    }

    /**
     * Sets the value of the txOvrhd property.
     * 
     * @param value
     *     allowed object is
     *     {@link TotalFeesAndTaxes40 }
     *     
     */
    public SwitchSubscriptionLegExecution4 setTxOvrhd(TotalFeesAndTaxes40 value) {
        this.txOvrhd = value;
        return this;
    }

    /**
     * Gets the value of the inftvTaxDtls property.
     * 
     * @return
     *     possible object is
     *     {@link InformativeTax1 }
     *     
     */
    public InformativeTax1 getInftvTaxDtls() {
        return inftvTaxDtls;
    }

    /**
     * Sets the value of the inftvTaxDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link InformativeTax1 }
     *     
     */
    public SwitchSubscriptionLegExecution4 setInftvTaxDtls(InformativeTax1 value) {
        this.inftvTaxDtls = value;
        return this;
    }

    /**
     * Gets the value of the sttlmAndCtdyDtls property.
     * 
     * @return
     *     possible object is
     *     {@link FundSettlementParameters12 }
     *     
     */
    public FundSettlementParameters12 getSttlmAndCtdyDtls() {
        return sttlmAndCtdyDtls;
    }

    /**
     * Sets the value of the sttlmAndCtdyDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link FundSettlementParameters12 }
     *     
     */
    public SwitchSubscriptionLegExecution4 setSttlmAndCtdyDtls(FundSettlementParameters12 value) {
        this.sttlmAndCtdyDtls = value;
        return this;
    }

    /**
     * Gets the value of the physDlvryInd property.
     * 
     */
    public boolean isPhysDlvryInd() {
        return physDlvryInd;
    }

    /**
     * Sets the value of the physDlvryInd property.
     * 
     */
    public SwitchSubscriptionLegExecution4 setPhysDlvryInd(boolean value) {
        this.physDlvryInd = value;
        return this;
    }

    /**
     * Gets the value of the physDlvryDtls property.
     * 
     * @return
     *     possible object is
     *     {@link DeliveryParameters3 }
     *     
     */
    public DeliveryParameters3 getPhysDlvryDtls() {
        return physDlvryDtls;
    }

    /**
     * Sets the value of the physDlvryDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeliveryParameters3 }
     *     
     */
    public SwitchSubscriptionLegExecution4 setPhysDlvryDtls(DeliveryParameters3 value) {
        this.physDlvryDtls = value;
        return this;
    }

    /**
     * Gets the value of the nonStdSttlmInf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNonStdSttlmInf() {
        return nonStdSttlmInf;
    }

    /**
     * Sets the value of the nonStdSttlmInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwitchSubscriptionLegExecution4 setNonStdSttlmInf(String value) {
        this.nonStdSttlmInf = value;
        return this;
    }

    /**
     * Gets the value of the equlstn property.
     * 
     * @return
     *     possible object is
     *     {@link Equalisation1 }
     *     
     */
    public Equalisation1 getEqulstn() {
        return equlstn;
    }

    /**
     * Sets the value of the equlstn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Equalisation1 }
     *     
     */
    public SwitchSubscriptionLegExecution4 setEqulstn(Equalisation1 value) {
        this.equlstn = value;
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
     * Adds a new item to the inftvPricDtls list.
     * @see #getInftvPricDtls()
     * 
     */
    public SwitchSubscriptionLegExecution4 addInftvPricDtls(UnitPrice22 inftvPricDtls) {
        getInftvPricDtls().add(inftvPricDtls);
        return this;
    }

}
