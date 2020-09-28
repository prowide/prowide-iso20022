
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
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
@XmlType(name = "InvestmentPlan4", propOrder = {
    "frqcy",
    "xtndedFrqcy",
    "startDt",
    "endDt",
    "amt",
    "grssAmtInd",
    "incmPref",
    "initlNbOfInstlmt",
    "ttlNbOfInstlmt",
    "rndgDrctn",
    "sctyDtls",
    "cshSttlm"
})
public class InvestmentPlan4 {

    @XmlElement(name = "Frqcy")
    @XmlSchemaType(name = "string")
    protected EventFrequency1Code frqcy;
    @XmlElement(name = "XtndedFrqcy")
    protected String xtndedFrqcy;
    @XmlElement(name = "StartDt", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar startDt;
    @XmlElement(name = "EndDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar endDt;
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
    @XmlElement(name = "RndgDrctn")
    @XmlSchemaType(name = "string")
    protected RoundingDirection1Code rndgDrctn;
    @XmlElement(name = "SctyDtls", required = true)
    protected List<Repartition1> sctyDtls;
    @XmlElement(name = "CshSttlm")
    protected InvestmentFundCashSettlementInformation3 cshSttlm;

    /**
     * Gets the value of the frqcy property.
     * 
     * @return
     *     possible object is
     *     {@link EventFrequency1Code }
     *     
     */
    public EventFrequency1Code getFrqcy() {
        return frqcy;
    }

    /**
     * Sets the value of the frqcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventFrequency1Code }
     *     
     */
    public InvestmentPlan4 setFrqcy(EventFrequency1Code value) {
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
    public InvestmentPlan4 setXtndedFrqcy(String value) {
        this.xtndedFrqcy = value;
        return this;
    }

    /**
     * Gets the value of the startDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartDt() {
        return startDt;
    }

    /**
     * Sets the value of the startDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public InvestmentPlan4 setStartDt(XMLGregorianCalendar value) {
        this.startDt = value;
        return this;
    }

    /**
     * Gets the value of the endDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndDt() {
        return endDt;
    }

    /**
     * Sets the value of the endDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public InvestmentPlan4 setEndDt(XMLGregorianCalendar value) {
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
    public InvestmentPlan4 setAmt(ActiveCurrencyAndAmount value) {
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
    public InvestmentPlan4 setGrssAmtInd(Boolean value) {
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
    public InvestmentPlan4 setIncmPref(IncomePreference1Code value) {
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
    public InvestmentPlan4 setInitlNbOfInstlmt(BigDecimal value) {
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
    public InvestmentPlan4 setTtlNbOfInstlmt(BigDecimal value) {
        this.ttlNbOfInstlmt = value;
        return this;
    }

    /**
     * Gets the value of the rndgDrctn property.
     * 
     * @return
     *     possible object is
     *     {@link RoundingDirection1Code }
     *     
     */
    public RoundingDirection1Code getRndgDrctn() {
        return rndgDrctn;
    }

    /**
     * Sets the value of the rndgDrctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link RoundingDirection1Code }
     *     
     */
    public InvestmentPlan4 setRndgDrctn(RoundingDirection1Code value) {
        this.rndgDrctn = value;
        return this;
    }

    /**
     * Gets the value of the sctyDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sctyDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSctyDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Repartition1 }
     * 
     * 
     */
    public List<Repartition1> getSctyDtls() {
        if (sctyDtls == null) {
            sctyDtls = new ArrayList<Repartition1>();
        }
        return this.sctyDtls;
    }

    /**
     * Gets the value of the cshSttlm property.
     * 
     * @return
     *     possible object is
     *     {@link InvestmentFundCashSettlementInformation3 }
     *     
     */
    public InvestmentFundCashSettlementInformation3 getCshSttlm() {
        return cshSttlm;
    }

    /**
     * Sets the value of the cshSttlm property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvestmentFundCashSettlementInformation3 }
     *     
     */
    public InvestmentPlan4 setCshSttlm(InvestmentFundCashSettlementInformation3 value) {
        this.cshSttlm = value;
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
     * Adds a new item to the sctyDtls list.
     * @see #getSctyDtls()
     * 
     */
    public InvestmentPlan4 addSctyDtls(Repartition1 sctyDtls) {
        getSctyDtls().add(sctyDtls);
        return this;
    }

}
