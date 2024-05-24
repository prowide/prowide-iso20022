
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
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
@XmlType(name = "InvestmentPlan9", propOrder = {
    "frqcy",
    "startDt",
    "endDt",
    "qty",
    "grssAmtInd",
    "incmPref",
    "initlNbOfInstlmts",
    "ttlNbOfInstlmts",
    "rndgDrctn",
    "sctyDtls",
    "cshSttlm",
    "ctrctRef",
    "rltdCtrctRef",
    "pdctId",
    "slaChrgAndComssnRef",
    "insrncCover"
})
public class InvestmentPlan9 {

    @XmlElement(name = "Frqcy", required = true)
    protected Frequency20Choice frqcy;
    @XmlElement(name = "StartDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate startDt;
    @XmlElement(name = "EndDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate endDt;
    @XmlElement(name = "Qty", required = true)
    protected UnitsOrAmount1Choice qty;
    @XmlElement(name = "GrssAmtInd")
    protected Boolean grssAmtInd;
    @XmlElement(name = "IncmPref")
    @XmlSchemaType(name = "string")
    protected IncomePreference1Code incmPref;
    @XmlElement(name = "InitlNbOfInstlmts")
    protected BigDecimal initlNbOfInstlmts;
    @XmlElement(name = "TtlNbOfInstlmts")
    protected BigDecimal ttlNbOfInstlmts;
    @XmlElement(name = "RndgDrctn")
    @XmlSchemaType(name = "string")
    protected RoundingDirection1Code rndgDrctn;
    @XmlElement(name = "SctyDtls", required = true)
    protected List<Repartition2> sctyDtls;
    @XmlElement(name = "CshSttlm")
    protected List<InvestmentFundCashSettlementInformation7> cshSttlm;
    @XmlElement(name = "CtrctRef")
    protected String ctrctRef;
    @XmlElement(name = "RltdCtrctRef")
    protected String rltdCtrctRef;
    @XmlElement(name = "PdctId")
    protected String pdctId;
    @XmlElement(name = "SLAChrgAndComssnRef")
    protected String slaChrgAndComssnRef;
    @XmlElement(name = "InsrncCover")
    protected InsuranceType1Choice insrncCover;

    /**
     * Gets the value of the frqcy property.
     * 
     * @return
     *     possible object is
     *     {@link Frequency20Choice }
     *     
     */
    public Frequency20Choice getFrqcy() {
        return frqcy;
    }

    /**
     * Sets the value of the frqcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link Frequency20Choice }
     *     
     */
    public InvestmentPlan9 setFrqcy(Frequency20Choice value) {
        this.frqcy = value;
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
    public LocalDate getStartDt() {
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
    public InvestmentPlan9 setStartDt(LocalDate value) {
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
    public LocalDate getEndDt() {
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
    public InvestmentPlan9 setEndDt(LocalDate value) {
        this.endDt = value;
        return this;
    }

    /**
     * Gets the value of the qty property.
     * 
     * @return
     *     possible object is
     *     {@link UnitsOrAmount1Choice }
     *     
     */
    public UnitsOrAmount1Choice getQty() {
        return qty;
    }

    /**
     * Sets the value of the qty property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitsOrAmount1Choice }
     *     
     */
    public InvestmentPlan9 setQty(UnitsOrAmount1Choice value) {
        this.qty = value;
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
    public InvestmentPlan9 setGrssAmtInd(Boolean value) {
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
    public InvestmentPlan9 setIncmPref(IncomePreference1Code value) {
        this.incmPref = value;
        return this;
    }

    /**
     * Gets the value of the initlNbOfInstlmts property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInitlNbOfInstlmts() {
        return initlNbOfInstlmts;
    }

    /**
     * Sets the value of the initlNbOfInstlmts property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public InvestmentPlan9 setInitlNbOfInstlmts(BigDecimal value) {
        this.initlNbOfInstlmts = value;
        return this;
    }

    /**
     * Gets the value of the ttlNbOfInstlmts property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTtlNbOfInstlmts() {
        return ttlNbOfInstlmts;
    }

    /**
     * Sets the value of the ttlNbOfInstlmts property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public InvestmentPlan9 setTtlNbOfInstlmts(BigDecimal value) {
        this.ttlNbOfInstlmts = value;
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
    public InvestmentPlan9 setRndgDrctn(RoundingDirection1Code value) {
        this.rndgDrctn = value;
        return this;
    }

    /**
     * Gets the value of the sctyDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the sctyDtls property.
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
     * {@link Repartition2 }
     * 
     * 
     * @return
     *     The value of the sctyDtls property.
     */
    public List<Repartition2> getSctyDtls() {
        if (sctyDtls == null) {
            sctyDtls = new ArrayList<>();
        }
        return this.sctyDtls;
    }

    /**
     * Gets the value of the cshSttlm property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the cshSttlm property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCshSttlm().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InvestmentFundCashSettlementInformation7 }
     * 
     * 
     * @return
     *     The value of the cshSttlm property.
     */
    public List<InvestmentFundCashSettlementInformation7> getCshSttlm() {
        if (cshSttlm == null) {
            cshSttlm = new ArrayList<>();
        }
        return this.cshSttlm;
    }

    /**
     * Gets the value of the ctrctRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCtrctRef() {
        return ctrctRef;
    }

    /**
     * Sets the value of the ctrctRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public InvestmentPlan9 setCtrctRef(String value) {
        this.ctrctRef = value;
        return this;
    }

    /**
     * Gets the value of the rltdCtrctRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRltdCtrctRef() {
        return rltdCtrctRef;
    }

    /**
     * Sets the value of the rltdCtrctRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public InvestmentPlan9 setRltdCtrctRef(String value) {
        this.rltdCtrctRef = value;
        return this;
    }

    /**
     * Gets the value of the pdctId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPdctId() {
        return pdctId;
    }

    /**
     * Sets the value of the pdctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public InvestmentPlan9 setPdctId(String value) {
        this.pdctId = value;
        return this;
    }

    /**
     * Gets the value of the slaChrgAndComssnRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSLAChrgAndComssnRef() {
        return slaChrgAndComssnRef;
    }

    /**
     * Sets the value of the slaChrgAndComssnRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public InvestmentPlan9 setSLAChrgAndComssnRef(String value) {
        this.slaChrgAndComssnRef = value;
        return this;
    }

    /**
     * Gets the value of the insrncCover property.
     * 
     * @return
     *     possible object is
     *     {@link InsuranceType1Choice }
     *     
     */
    public InsuranceType1Choice getInsrncCover() {
        return insrncCover;
    }

    /**
     * Sets the value of the insrncCover property.
     * 
     * @param value
     *     allowed object is
     *     {@link InsuranceType1Choice }
     *     
     */
    public InvestmentPlan9 setInsrncCover(InsuranceType1Choice value) {
        this.insrncCover = value;
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
    public InvestmentPlan9 addSctyDtls(Repartition2 sctyDtls) {
        getSctyDtls().add(sctyDtls);
        return this;
    }

    /**
     * Adds a new item to the cshSttlm list.
     * @see #getCshSttlm()
     * 
     */
    public InvestmentPlan9 addCshSttlm(InvestmentFundCashSettlementInformation7 cshSttlm) {
        getCshSttlm().add(cshSttlm);
        return this;
    }

}
