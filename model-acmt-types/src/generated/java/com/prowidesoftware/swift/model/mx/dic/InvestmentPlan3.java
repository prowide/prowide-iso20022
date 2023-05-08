
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
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
 * Plan that allows investors to schedule periodical investments or divestments, according to pre-defined criteria.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvestmentPlan3", propOrder = {
    "frqcy",
    "xtndedFrqcy",
    "startDt",
    "endDt",
    "amt",
    "grssAmtInd",
    "incmPref",
    "initlNbOfInstlmt",
    "ttlNbOfInstlmt",
    "sctyDtls",
    "modfdCshSttlm"
})
public class InvestmentPlan3 {

    @XmlElement(name = "Frqcy")
    @XmlSchemaType(name = "string")
    protected Frequency1Code frqcy;
    @XmlElement(name = "XtndedFrqcy")
    protected String xtndedFrqcy;
    @XmlElement(name = "StartDt", required = true, type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected Calendar startDt;
    @XmlElement(name = "EndDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected Calendar endDt;
    @XmlElement(name = "Amt", required = true)
    protected ActiveCurrencyAndAmount amt;
    @XmlElement(name = "GrssAmtInd")
    protected Boolean grssAmtInd;
    @XmlElement(name = "IncmPref")
    @XmlSchemaType(name = "string")
    protected IncomePreference1Code incmPref;
    @XmlElement(name = "InitlNbOfInstlmt")
    protected BigDecimal initlNbOfInstlmt;
    @XmlElement(name = "TtlNbOfInstlmt")
    protected BigDecimal ttlNbOfInstlmt;
    @XmlElement(name = "SctyDtls", required = true)
    protected FinancialInstrument6 sctyDtls;
    @XmlElement(name = "ModfdCshSttlm")
    protected List<InvestmentFundCashSettlementInformation2> modfdCshSttlm;

    /**
     * Gets the value of the frqcy property.
     * 
     * @return
     *     possible object is
     *     {@link Frequency1Code }
     *     
     */
    public Frequency1Code getFrqcy() {
        return frqcy;
    }

    /**
     * Sets the value of the frqcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link Frequency1Code }
     *     
     */
    public InvestmentPlan3 setFrqcy(Frequency1Code value) {
        this.frqcy = value;
        return this;
    }

    /**
     * Gets the value of the xtndedFrqcy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXtndedFrqcy() {
        return xtndedFrqcy;
    }

    /**
     * Sets the value of the xtndedFrqcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public InvestmentPlan3 setXtndedFrqcy(String value) {
        this.xtndedFrqcy = value;
        return this;
    }

    /**
     * Gets the value of the startDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getStartDt() {
        return startDt;
    }

    /**
     * Sets the value of the startDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public InvestmentPlan3 setStartDt(Calendar value) {
        this.startDt = value;
        return this;
    }

    /**
     * Gets the value of the endDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getEndDt() {
        return endDt;
    }

    /**
     * Sets the value of the endDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public InvestmentPlan3 setEndDt(Calendar value) {
        this.endDt = value;
        return this;
    }

    /**
     * Gets the value of the amt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getAmt() {
        return amt;
    }

    /**
     * Sets the value of the amt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public InvestmentPlan3 setAmt(ActiveCurrencyAndAmount value) {
        this.amt = value;
        return this;
    }

    /**
     * Gets the value of the grssAmtInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGrssAmtInd() {
        return grssAmtInd;
    }

    /**
     * Sets the value of the grssAmtInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public InvestmentPlan3 setGrssAmtInd(Boolean value) {
        this.grssAmtInd = value;
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
    public InvestmentPlan3 setIncmPref(IncomePreference1Code value) {
        this.incmPref = value;
        return this;
    }

    /**
     * Gets the value of the initlNbOfInstlmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInitlNbOfInstlmt() {
        return initlNbOfInstlmt;
    }

    /**
     * Sets the value of the initlNbOfInstlmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public InvestmentPlan3 setInitlNbOfInstlmt(BigDecimal value) {
        this.initlNbOfInstlmt = value;
        return this;
    }

    /**
     * Gets the value of the ttlNbOfInstlmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTtlNbOfInstlmt() {
        return ttlNbOfInstlmt;
    }

    /**
     * Sets the value of the ttlNbOfInstlmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public InvestmentPlan3 setTtlNbOfInstlmt(BigDecimal value) {
        this.ttlNbOfInstlmt = value;
        return this;
    }

    /**
     * Gets the value of the sctyDtls property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrument6 }
     *     
     */
    public FinancialInstrument6 getSctyDtls() {
        return sctyDtls;
    }

    /**
     * Sets the value of the sctyDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrument6 }
     *     
     */
    public InvestmentPlan3 setSctyDtls(FinancialInstrument6 value) {
        this.sctyDtls = value;
        return this;
    }

    /**
     * Gets the value of the modfdCshSttlm property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the modfdCshSttlm property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getModfdCshSttlm().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InvestmentFundCashSettlementInformation2 }
     * 
     * 
     * @return
     *     The value of the modfdCshSttlm property.
     */
    public List<InvestmentFundCashSettlementInformation2> getModfdCshSttlm() {
        if (modfdCshSttlm == null) {
            modfdCshSttlm = new ArrayList<>();
        }
        return this.modfdCshSttlm;
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
     * Adds a new item to the modfdCshSttlm list.
     * @see #getModfdCshSttlm()
     * 
     */
    public InvestmentPlan3 addModfdCshSttlm(InvestmentFundCashSettlementInformation2 modfdCshSttlm) {
        getModfdCshSttlm().add(modfdCshSttlm);
        return this;
    }

}
