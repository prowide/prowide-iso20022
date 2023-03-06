
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateAdapter;
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
@XmlType(name = "InvestmentPlan13", propOrder = {
    "frqcy",
    "startDt",
    "endDt",
    "qty",
    "grssAmtInd",
    "incmPref",
    "initlAmt",
    "ttlNbOfInstlmts",
    "rndgDrctn",
    "sctyDtls",
    "modfdCshSttlm",
    "ctrctRef",
    "rltdCtrctRef",
    "pdctId",
    "slaChrgAndComssnRef",
    "insrncCover",
    "planSts",
    "instlmtMgrRole"
})
public class InvestmentPlan13 {

    @XmlElement(name = "Frqcy", required = true)
    protected Frequency20Choice frqcy;
    @XmlElement(name = "StartDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar startDt;
    @XmlElement(name = "EndDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar endDt;
    @XmlElement(name = "Qty", required = true)
    protected UnitsOrAmount1Choice qty;
    @XmlElement(name = "GrssAmtInd")
    protected Boolean grssAmtInd;
    @XmlElement(name = "IncmPref")
    @XmlSchemaType(name = "string")
    protected IncomePreference2Code incmPref;
    @XmlElement(name = "InitlAmt")
    protected InitialAmount1Choice initlAmt;
    @XmlElement(name = "TtlNbOfInstlmts")
    protected BigDecimal ttlNbOfInstlmts;
    @XmlElement(name = "RndgDrctn")
    @XmlSchemaType(name = "string")
    protected RoundingDirection1Code rndgDrctn;
    @XmlElement(name = "SctyDtls", required = true)
    protected List<Repartition4> sctyDtls;
    @XmlElement(name = "ModfdCshSttlm")
    protected List<CashSettlement2> modfdCshSttlm;
    @XmlElement(name = "CtrctRef")
    protected String ctrctRef;
    @XmlElement(name = "RltdCtrctRef")
    protected String rltdCtrctRef;
    @XmlElement(name = "PdctId")
    protected String pdctId;
    @XmlElement(name = "SLAChrgAndComssnRef")
    protected String slaChrgAndComssnRef;
    @XmlElement(name = "InsrncCover")
    protected InsuranceType2Choice insrncCover;
    @XmlElement(name = "PlanSts")
    protected PlanStatus2Choice planSts;
    @XmlElement(name = "InstlmtMgrRole")
    protected PartyRole4Choice instlmtMgrRole;

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
    public InvestmentPlan13 setFrqcy(Frequency20Choice value) {
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
    public XMLGregorianCalendar getStartDt() {
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
    public InvestmentPlan13 setStartDt(XMLGregorianCalendar value) {
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
    public XMLGregorianCalendar getEndDt() {
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
    public InvestmentPlan13 setEndDt(XMLGregorianCalendar value) {
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
    public InvestmentPlan13 setQty(UnitsOrAmount1Choice value) {
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
    public InvestmentPlan13 setGrssAmtInd(Boolean value) {
        this.grssAmtInd = value;
        return this;
    }

    /**
     * Gets the value of the incmPref property.
     * 
     * @return
     *     possible object is
     *     {@link IncomePreference2Code }
     *     
     */
    public IncomePreference2Code getIncmPref() {
        return incmPref;
    }

    /**
     * Sets the value of the incmPref property.
     * 
     * @param value
     *     allowed object is
     *     {@link IncomePreference2Code }
     *     
     */
    public InvestmentPlan13 setIncmPref(IncomePreference2Code value) {
        this.incmPref = value;
        return this;
    }

    /**
     * Gets the value of the initlAmt property.
     * 
     * @return
     *     possible object is
     *     {@link InitialAmount1Choice }
     *     
     */
    public InitialAmount1Choice getInitlAmt() {
        return initlAmt;
    }

    /**
     * Sets the value of the initlAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link InitialAmount1Choice }
     *     
     */
    public InvestmentPlan13 setInitlAmt(InitialAmount1Choice value) {
        this.initlAmt = value;
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
    public InvestmentPlan13 setTtlNbOfInstlmts(BigDecimal value) {
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
    public InvestmentPlan13 setRndgDrctn(RoundingDirection1Code value) {
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
     * {@link Repartition4 }
     * 
     * 
     */
    public List<Repartition4> getSctyDtls() {
        if (sctyDtls == null) {
            sctyDtls = new ArrayList<Repartition4>();
        }
        return this.sctyDtls;
    }

    /**
     * Gets the value of the modfdCshSttlm property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the modfdCshSttlm property.
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
     * {@link CashSettlement2 }
     * 
     * 
     */
    public List<CashSettlement2> getModfdCshSttlm() {
        if (modfdCshSttlm == null) {
            modfdCshSttlm = new ArrayList<CashSettlement2>();
        }
        return this.modfdCshSttlm;
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
    public InvestmentPlan13 setCtrctRef(String value) {
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
    public InvestmentPlan13 setRltdCtrctRef(String value) {
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
    public InvestmentPlan13 setPdctId(String value) {
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
    public InvestmentPlan13 setSLAChrgAndComssnRef(String value) {
        this.slaChrgAndComssnRef = value;
        return this;
    }

    /**
     * Gets the value of the insrncCover property.
     * 
     * @return
     *     possible object is
     *     {@link InsuranceType2Choice }
     *     
     */
    public InsuranceType2Choice getInsrncCover() {
        return insrncCover;
    }

    /**
     * Sets the value of the insrncCover property.
     * 
     * @param value
     *     allowed object is
     *     {@link InsuranceType2Choice }
     *     
     */
    public InvestmentPlan13 setInsrncCover(InsuranceType2Choice value) {
        this.insrncCover = value;
        return this;
    }

    /**
     * Gets the value of the planSts property.
     * 
     * @return
     *     possible object is
     *     {@link PlanStatus2Choice }
     *     
     */
    public PlanStatus2Choice getPlanSts() {
        return planSts;
    }

    /**
     * Sets the value of the planSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlanStatus2Choice }
     *     
     */
    public InvestmentPlan13 setPlanSts(PlanStatus2Choice value) {
        this.planSts = value;
        return this;
    }

    /**
     * Gets the value of the instlmtMgrRole property.
     * 
     * @return
     *     possible object is
     *     {@link PartyRole4Choice }
     *     
     */
    public PartyRole4Choice getInstlmtMgrRole() {
        return instlmtMgrRole;
    }

    /**
     * Sets the value of the instlmtMgrRole property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyRole4Choice }
     *     
     */
    public InvestmentPlan13 setInstlmtMgrRole(PartyRole4Choice value) {
        this.instlmtMgrRole = value;
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
    public InvestmentPlan13 addSctyDtls(Repartition4 sctyDtls) {
        getSctyDtls().add(sctyDtls);
        return this;
    }

    /**
     * Adds a new item to the modfdCshSttlm list.
     * @see #getModfdCshSttlm()
     * 
     */
    public InvestmentPlan13 addModfdCshSttlm(CashSettlement2 modfdCshSttlm) {
        getModfdCshSttlm().add(modfdCshSttlm);
        return this;
    }

}
