
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
@XmlType(name = "InvestmentPlan7", propOrder = {
    "frqcy",
    "startDt",
    "endDt",
    "qty",
    "grssAmtInd",
    "incmPref",
    "initlNbOfInstlmt",
    "ttlNbOfInstlmt",
    "rndgDrctn",
    "sctyDtls",
    "modfdCshSttlm",
    "ctrctRef",
    "rltdCtrctRef",
    "pdctId",
    "slaChrgAndComssnRef",
    "insrncCover"
})
public class InvestmentPlan7 {

    @XmlElement(name = "Frqcy", required = true)
    protected Frequency19Choice frqcy;
    @XmlElement(name = "StartDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar startDt;
    @XmlElement(name = "EndDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar endDt;
    @XmlElement(name = "Qty", required = true)
    protected UnitsOrAmount1Choice qty;
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
    protected List<Repartition2> sctyDtls;
    @XmlElement(name = "ModfdCshSttlm")
    protected List<InvestmentFundCashSettlementInformation6> modfdCshSttlm;
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
     *     {@link Frequency19Choice }
     *     
     */
    public Frequency19Choice getFrqcy() {
        return frqcy;
    }

    /**
     * Sets the value of the frqcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link Frequency19Choice }
     *     
     */
    public InvestmentPlan7 setFrqcy(Frequency19Choice value) {
        this.frqcy = value;
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
    public InvestmentPlan7 setStartDt(XMLGregorianCalendar value) {
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
    public InvestmentPlan7 setEndDt(XMLGregorianCalendar value) {
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
    public InvestmentPlan7 setQty(UnitsOrAmount1Choice value) {
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
    public InvestmentPlan7 setGrssAmtInd(Boolean value) {
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
    public InvestmentPlan7 setIncmPref(IncomePreference1Code value) {
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
    public InvestmentPlan7 setInitlNbOfInstlmt(BigDecimal value) {
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
    public InvestmentPlan7 setTtlNbOfInstlmt(BigDecimal value) {
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
    public InvestmentPlan7 setRndgDrctn(RoundingDirection1Code value) {
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
     * {@link Repartition2 }
     * 
     * 
     */
    public List<Repartition2> getSctyDtls() {
        if (sctyDtls == null) {
            sctyDtls = new ArrayList<Repartition2>();
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
     * {@link InvestmentFundCashSettlementInformation6 }
     * 
     * 
     */
    public List<InvestmentFundCashSettlementInformation6> getModfdCshSttlm() {
        if (modfdCshSttlm == null) {
            modfdCshSttlm = new ArrayList<InvestmentFundCashSettlementInformation6>();
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
    public InvestmentPlan7 setCtrctRef(String value) {
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
    public InvestmentPlan7 setRltdCtrctRef(String value) {
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
    public InvestmentPlan7 setPdctId(String value) {
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
    public InvestmentPlan7 setSLAChrgAndComssnRef(String value) {
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
    public InvestmentPlan7 setInsrncCover(InsuranceType1Choice value) {
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
    public InvestmentPlan7 addSctyDtls(Repartition2 sctyDtls) {
        getSctyDtls().add(sctyDtls);
        return this;
    }

    /**
     * Adds a new item to the modfdCshSttlm list.
     * @see #getModfdCshSttlm()
     * 
     */
    public InvestmentPlan7 addModfdCshSttlm(InvestmentFundCashSettlementInformation6 modfdCshSttlm) {
        getModfdCshSttlm().add(modfdCshSttlm);
        return this;
    }

}
