
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateAdapter;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Data exclusively related to a card issuer financial loan of the payment transaction, or instalment.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Instalment5", propOrder = {
    "instlmtPlan",
    "planId",
    "planOwnr",
    "seqNb",
    "prdUnit",
    "instlmtPrd",
    "ttlNbOfPmts",
    "frstPmtDt",
    "ttlAmt",
    "frstAmt",
    "sbsqntAmt",
    "lastAmt",
    "chrgs",
    "dtldChrgs",
    "intrstRate",
    "gracePrd",
    "planNtce"
})
public class Instalment5 {

    @XmlElement(name = "InstlmtPlan")
    @XmlSchemaType(name = "string")
    protected List<InstalmentPlan1Code> instlmtPlan;
    @XmlElement(name = "PlanId")
    protected String planId;
    @XmlElement(name = "PlanOwnr")
    @XmlSchemaType(name = "string")
    protected PlanOwner1Code planOwnr;
    @XmlElement(name = "SeqNb")
    protected BigDecimal seqNb;
    @XmlElement(name = "PrdUnit")
    @XmlSchemaType(name = "string")
    protected Frequency3Code prdUnit;
    @XmlElement(name = "InstlmtPrd")
    protected BigDecimal instlmtPrd;
    @XmlElement(name = "TtlNbOfPmts")
    protected BigDecimal ttlNbOfPmts;
    @XmlElement(name = "FrstPmtDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar frstPmtDt;
    @XmlElement(name = "TtlAmt")
    protected ActiveCurrencyAndAmount ttlAmt;
    @XmlElement(name = "FrstAmt")
    protected BigDecimal frstAmt;
    @XmlElement(name = "SbsqntAmt")
    protected BigDecimal sbsqntAmt;
    @XmlElement(name = "LastAmt")
    protected BigDecimal lastAmt;
    @XmlElement(name = "Chrgs")
    protected BigDecimal chrgs;
    @XmlElement(name = "DtldChrgs")
    protected List<InstalmentAmountDetails1> dtldChrgs;
    @XmlElement(name = "IntrstRate")
    protected List<InterestRateDetails1> intrstRate;
    @XmlElement(name = "GracePrd")
    protected List<GracePeriod1> gracePrd;
    @XmlElement(name = "PlanNtce")
    protected List<ActionMessage11> planNtce;

    /**
     * Gets the value of the instlmtPlan property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the instlmtPlan property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInstlmtPlan().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InstalmentPlan1Code }
     * 
     * 
     */
    public List<InstalmentPlan1Code> getInstlmtPlan() {
        if (instlmtPlan == null) {
            instlmtPlan = new ArrayList<InstalmentPlan1Code>();
        }
        return this.instlmtPlan;
    }

    /**
     * Gets the value of the planId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlanId() {
        return planId;
    }

    /**
     * Sets the value of the planId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Instalment5 setPlanId(String value) {
        this.planId = value;
        return this;
    }

    /**
     * Gets the value of the planOwnr property.
     * 
     * @return
     *     possible object is
     *     {@link PlanOwner1Code }
     *     
     */
    public PlanOwner1Code getPlanOwnr() {
        return planOwnr;
    }

    /**
     * Sets the value of the planOwnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlanOwner1Code }
     *     
     */
    public Instalment5 setPlanOwnr(PlanOwner1Code value) {
        this.planOwnr = value;
        return this;
    }

    /**
     * Gets the value of the seqNb property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSeqNb() {
        return seqNb;
    }

    /**
     * Sets the value of the seqNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public Instalment5 setSeqNb(BigDecimal value) {
        this.seqNb = value;
        return this;
    }

    /**
     * Gets the value of the prdUnit property.
     * 
     * @return
     *     possible object is
     *     {@link Frequency3Code }
     *     
     */
    public Frequency3Code getPrdUnit() {
        return prdUnit;
    }

    /**
     * Sets the value of the prdUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Frequency3Code }
     *     
     */
    public Instalment5 setPrdUnit(Frequency3Code value) {
        this.prdUnit = value;
        return this;
    }

    /**
     * Gets the value of the instlmtPrd property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInstlmtPrd() {
        return instlmtPrd;
    }

    /**
     * Sets the value of the instlmtPrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public Instalment5 setInstlmtPrd(BigDecimal value) {
        this.instlmtPrd = value;
        return this;
    }

    /**
     * Gets the value of the ttlNbOfPmts property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTtlNbOfPmts() {
        return ttlNbOfPmts;
    }

    /**
     * Sets the value of the ttlNbOfPmts property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public Instalment5 setTtlNbOfPmts(BigDecimal value) {
        this.ttlNbOfPmts = value;
        return this;
    }

    /**
     * Gets the value of the frstPmtDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public XMLGregorianCalendar getFrstPmtDt() {
        return frstPmtDt;
    }

    /**
     * Sets the value of the frstPmtDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Instalment5 setFrstPmtDt(XMLGregorianCalendar value) {
        this.frstPmtDt = value;
        return this;
    }

    /**
     * Gets the value of the ttlAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getTtlAmt() {
        return ttlAmt;
    }

    /**
     * Sets the value of the ttlAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public Instalment5 setTtlAmt(ActiveCurrencyAndAmount value) {
        this.ttlAmt = value;
        return this;
    }

    /**
     * Gets the value of the frstAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFrstAmt() {
        return frstAmt;
    }

    /**
     * Sets the value of the frstAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public Instalment5 setFrstAmt(BigDecimal value) {
        this.frstAmt = value;
        return this;
    }

    /**
     * Gets the value of the sbsqntAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSbsqntAmt() {
        return sbsqntAmt;
    }

    /**
     * Sets the value of the sbsqntAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public Instalment5 setSbsqntAmt(BigDecimal value) {
        this.sbsqntAmt = value;
        return this;
    }

    /**
     * Gets the value of the lastAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLastAmt() {
        return lastAmt;
    }

    /**
     * Sets the value of the lastAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public Instalment5 setLastAmt(BigDecimal value) {
        this.lastAmt = value;
        return this;
    }

    /**
     * Gets the value of the chrgs property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getChrgs() {
        return chrgs;
    }

    /**
     * Sets the value of the chrgs property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public Instalment5 setChrgs(BigDecimal value) {
        this.chrgs = value;
        return this;
    }

    /**
     * Gets the value of the dtldChrgs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dtldChrgs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDtldChrgs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InstalmentAmountDetails1 }
     * 
     * 
     */
    public List<InstalmentAmountDetails1> getDtldChrgs() {
        if (dtldChrgs == null) {
            dtldChrgs = new ArrayList<InstalmentAmountDetails1>();
        }
        return this.dtldChrgs;
    }

    /**
     * Gets the value of the intrstRate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the intrstRate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIntrstRate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InterestRateDetails1 }
     * 
     * 
     */
    public List<InterestRateDetails1> getIntrstRate() {
        if (intrstRate == null) {
            intrstRate = new ArrayList<InterestRateDetails1>();
        }
        return this.intrstRate;
    }

    /**
     * Gets the value of the gracePrd property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the gracePrd property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGracePrd().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GracePeriod1 }
     * 
     * 
     */
    public List<GracePeriod1> getGracePrd() {
        if (gracePrd == null) {
            gracePrd = new ArrayList<GracePeriod1>();
        }
        return this.gracePrd;
    }

    /**
     * Gets the value of the planNtce property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the planNtce property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPlanNtce().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ActionMessage11 }
     * 
     * 
     */
    public List<ActionMessage11> getPlanNtce() {
        if (planNtce == null) {
            planNtce = new ArrayList<ActionMessage11>();
        }
        return this.planNtce;
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
     * Adds a new item to the instlmtPlan list.
     * @see #getInstlmtPlan()
     * 
     */
    public Instalment5 addInstlmtPlan(InstalmentPlan1Code instlmtPlan) {
        getInstlmtPlan().add(instlmtPlan);
        return this;
    }

    /**
     * Adds a new item to the dtldChrgs list.
     * @see #getDtldChrgs()
     * 
     */
    public Instalment5 addDtldChrgs(InstalmentAmountDetails1 dtldChrgs) {
        getDtldChrgs().add(dtldChrgs);
        return this;
    }

    /**
     * Adds a new item to the intrstRate list.
     * @see #getIntrstRate()
     * 
     */
    public Instalment5 addIntrstRate(InterestRateDetails1 intrstRate) {
        getIntrstRate().add(intrstRate);
        return this;
    }

    /**
     * Adds a new item to the gracePrd list.
     * @see #getGracePrd()
     * 
     */
    public Instalment5 addGracePrd(GracePeriod1 gracePrd) {
        getGracePrd().add(gracePrd);
        return this;
    }

    /**
     * Adds a new item to the planNtce list.
     * @see #getPlanNtce()
     * 
     */
    public Instalment5 addPlanNtce(ActionMessage11 planNtce) {
        getPlanNtce().add(planNtce);
        return this;
    }

}
