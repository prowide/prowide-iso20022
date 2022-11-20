
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
 * Attributes of the instalment plan.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Plan1", propOrder = {
    "planId",
    "planOwnr",
    "othrPlanOwnr",
    "instlmtPmtTp",
    "prdUnit",
    "nbOfPrds",
    "intrstRate",
    "frstPmtDt",
    "frstAmt",
    "sbsqntAmt",
    "ttlNbOfPmts",
    "instlmtCcy",
    "gracePrd",
    "amtDtls",
    "grdTtlAmt"
})
public class Plan1 {

    @XmlElement(name = "PlanId")
    protected String planId;
    @XmlElement(name = "PlanOwnr")
    @XmlSchemaType(name = "string")
    protected PlanOwner1Code planOwnr;
    @XmlElement(name = "OthrPlanOwnr")
    protected String othrPlanOwnr;
    @XmlElement(name = "InstlmtPmtTp")
    protected String instlmtPmtTp;
    @XmlElement(name = "PrdUnit")
    @XmlSchemaType(name = "string")
    protected Frequency12Code prdUnit;
    @XmlElement(name = "NbOfPrds")
    protected BigDecimal nbOfPrds;
    @XmlElement(name = "IntrstRate")
    protected List<InterestRateDetails1> intrstRate;
    @XmlElement(name = "FrstPmtDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar frstPmtDt;
    @XmlElement(name = "FrstAmt")
    protected BigDecimal frstAmt;
    @XmlElement(name = "SbsqntAmt")
    protected BigDecimal sbsqntAmt;
    @XmlElement(name = "TtlNbOfPmts")
    protected BigDecimal ttlNbOfPmts;
    @XmlElement(name = "InstlmtCcy")
    protected String instlmtCcy;
    @XmlElement(name = "GracePrd")
    protected GracePeriod1 gracePrd;
    @XmlElement(name = "AmtDtls")
    protected List<InstalmentAmountDetails1> amtDtls;
    @XmlElement(name = "GrdTtlAmt")
    protected BigDecimal grdTtlAmt;

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
    public Plan1 setPlanId(String value) {
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
    public Plan1 setPlanOwnr(PlanOwner1Code value) {
        this.planOwnr = value;
        return this;
    }

    /**
     * Gets the value of the othrPlanOwnr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOthrPlanOwnr() {
        return othrPlanOwnr;
    }

    /**
     * Sets the value of the othrPlanOwnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Plan1 setOthrPlanOwnr(String value) {
        this.othrPlanOwnr = value;
        return this;
    }

    /**
     * Gets the value of the instlmtPmtTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstlmtPmtTp() {
        return instlmtPmtTp;
    }

    /**
     * Sets the value of the instlmtPmtTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Plan1 setInstlmtPmtTp(String value) {
        this.instlmtPmtTp = value;
        return this;
    }

    /**
     * Gets the value of the prdUnit property.
     * 
     * @return
     *     possible object is
     *     {@link Frequency12Code }
     *     
     */
    public Frequency12Code getPrdUnit() {
        return prdUnit;
    }

    /**
     * Sets the value of the prdUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Frequency12Code }
     *     
     */
    public Plan1 setPrdUnit(Frequency12Code value) {
        this.prdUnit = value;
        return this;
    }

    /**
     * Gets the value of the nbOfPrds property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNbOfPrds() {
        return nbOfPrds;
    }

    /**
     * Sets the value of the nbOfPrds property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public Plan1 setNbOfPrds(BigDecimal value) {
        this.nbOfPrds = value;
        return this;
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
    public Plan1 setFrstPmtDt(XMLGregorianCalendar value) {
        this.frstPmtDt = value;
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
    public Plan1 setFrstAmt(BigDecimal value) {
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
    public Plan1 setSbsqntAmt(BigDecimal value) {
        this.sbsqntAmt = value;
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
    public Plan1 setTtlNbOfPmts(BigDecimal value) {
        this.ttlNbOfPmts = value;
        return this;
    }

    /**
     * Gets the value of the instlmtCcy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstlmtCcy() {
        return instlmtCcy;
    }

    /**
     * Sets the value of the instlmtCcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Plan1 setInstlmtCcy(String value) {
        this.instlmtCcy = value;
        return this;
    }

    /**
     * Gets the value of the gracePrd property.
     * 
     * @return
     *     possible object is
     *     {@link GracePeriod1 }
     *     
     */
    public GracePeriod1 getGracePrd() {
        return gracePrd;
    }

    /**
     * Sets the value of the gracePrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link GracePeriod1 }
     *     
     */
    public Plan1 setGracePrd(GracePeriod1 value) {
        this.gracePrd = value;
        return this;
    }

    /**
     * Gets the value of the amtDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the amtDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAmtDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InstalmentAmountDetails1 }
     * 
     * 
     */
    public List<InstalmentAmountDetails1> getAmtDtls() {
        if (amtDtls == null) {
            amtDtls = new ArrayList<InstalmentAmountDetails1>();
        }
        return this.amtDtls;
    }

    /**
     * Gets the value of the grdTtlAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getGrdTtlAmt() {
        return grdTtlAmt;
    }

    /**
     * Sets the value of the grdTtlAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public Plan1 setGrdTtlAmt(BigDecimal value) {
        this.grdTtlAmt = value;
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
     * Adds a new item to the intrstRate list.
     * @see #getIntrstRate()
     * 
     */
    public Plan1 addIntrstRate(InterestRateDetails1 intrstRate) {
        getIntrstRate().add(intrstRate);
        return this;
    }

    /**
     * Adds a new item to the amtDtls list.
     * @see #getAmtDtls()
     * 
     */
    public Plan1 addAmtDtls(InstalmentAmountDetails1 amtDtls) {
        getAmtDtls().add(amtDtls);
        return this;
    }

}
