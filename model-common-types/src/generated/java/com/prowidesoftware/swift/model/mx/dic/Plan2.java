
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
 * Attributes of the instalment plan.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Plan2", propOrder = {
    "planId",
    "planOwnr",
    "othrPlanOwnr",
    "instlmtPmtTp",
    "dfrrdInstlmtInd",
    "prdUnit",
    "nbOfPrds",
    "intrstRate",
    "frstPmtDt",
    "frstAmt",
    "nrmlPmtAmt",
    "ttlNbOfPmts",
    "instlmtCcy",
    "gracePrd",
    "amtDtls",
    "grdTtlAmt",
    "addtlData"
})
public class Plan2 {

    @XmlElement(name = "PlanId")
    protected String planId;
    @XmlElement(name = "PlanOwnr")
    @XmlSchemaType(name = "string")
    protected PlanOwner1Code planOwnr;
    @XmlElement(name = "OthrPlanOwnr")
    protected String othrPlanOwnr;
    @XmlElement(name = "InstlmtPmtTp")
    protected String instlmtPmtTp;
    @XmlElement(name = "DfrrdInstlmtInd")
    protected Boolean dfrrdInstlmtInd;
    @XmlElement(name = "PrdUnit")
    @XmlSchemaType(name = "string")
    protected Frequency18Code prdUnit;
    @XmlElement(name = "NbOfPrds")
    protected BigDecimal nbOfPrds;
    @XmlElement(name = "IntrstRate")
    protected List<InterestRateDetails2> intrstRate;
    @XmlElement(name = "FrstPmtDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate frstPmtDt;
    @XmlElement(name = "FrstAmt")
    protected BigDecimal frstAmt;
    @XmlElement(name = "NrmlPmtAmt")
    protected BigDecimal nrmlPmtAmt;
    @XmlElement(name = "TtlNbOfPmts")
    protected BigDecimal ttlNbOfPmts;
    @XmlElement(name = "InstlmtCcy")
    protected String instlmtCcy;
    @XmlElement(name = "GracePrd")
    protected GracePeriod2 gracePrd;
    @XmlElement(name = "AmtDtls")
    protected List<InstalmentAmountDetails2> amtDtls;
    @XmlElement(name = "GrdTtlAmt")
    protected BigDecimal grdTtlAmt;
    @XmlElement(name = "AddtlData")
    protected List<AdditionalData1> addtlData;

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
    public Plan2 setPlanId(String value) {
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
    public Plan2 setPlanOwnr(PlanOwner1Code value) {
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
    public Plan2 setOthrPlanOwnr(String value) {
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
    public Plan2 setInstlmtPmtTp(String value) {
        this.instlmtPmtTp = value;
        return this;
    }

    /**
     * Gets the value of the dfrrdInstlmtInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDfrrdInstlmtInd() {
        return dfrrdInstlmtInd;
    }

    /**
     * Sets the value of the dfrrdInstlmtInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public Plan2 setDfrrdInstlmtInd(Boolean value) {
        this.dfrrdInstlmtInd = value;
        return this;
    }

    /**
     * Gets the value of the prdUnit property.
     * 
     * @return
     *     possible object is
     *     {@link Frequency18Code }
     *     
     */
    public Frequency18Code getPrdUnit() {
        return prdUnit;
    }

    /**
     * Sets the value of the prdUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Frequency18Code }
     *     
     */
    public Plan2 setPrdUnit(Frequency18Code value) {
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
    public Plan2 setNbOfPrds(BigDecimal value) {
        this.nbOfPrds = value;
        return this;
    }

    /**
     * Gets the value of the intrstRate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the intrstRate property.
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
     * {@link InterestRateDetails2 }
     * 
     * 
     * @return
     *     The value of the intrstRate property.
     */
    public List<InterestRateDetails2> getIntrstRate() {
        if (intrstRate == null) {
            intrstRate = new ArrayList<>();
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
    public LocalDate getFrstPmtDt() {
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
    public Plan2 setFrstPmtDt(LocalDate value) {
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
    public Plan2 setFrstAmt(BigDecimal value) {
        this.frstAmt = value;
        return this;
    }

    /**
     * Gets the value of the nrmlPmtAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNrmlPmtAmt() {
        return nrmlPmtAmt;
    }

    /**
     * Sets the value of the nrmlPmtAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public Plan2 setNrmlPmtAmt(BigDecimal value) {
        this.nrmlPmtAmt = value;
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
    public Plan2 setTtlNbOfPmts(BigDecimal value) {
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
    public Plan2 setInstlmtCcy(String value) {
        this.instlmtCcy = value;
        return this;
    }

    /**
     * Gets the value of the gracePrd property.
     * 
     * @return
     *     possible object is
     *     {@link GracePeriod2 }
     *     
     */
    public GracePeriod2 getGracePrd() {
        return gracePrd;
    }

    /**
     * Sets the value of the gracePrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link GracePeriod2 }
     *     
     */
    public Plan2 setGracePrd(GracePeriod2 value) {
        this.gracePrd = value;
        return this;
    }

    /**
     * Gets the value of the amtDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the amtDtls property.
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
     * {@link InstalmentAmountDetails2 }
     * 
     * 
     * @return
     *     The value of the amtDtls property.
     */
    public List<InstalmentAmountDetails2> getAmtDtls() {
        if (amtDtls == null) {
            amtDtls = new ArrayList<>();
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
    public Plan2 setGrdTtlAmt(BigDecimal value) {
        this.grdTtlAmt = value;
        return this;
    }

    /**
     * Gets the value of the addtlData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the addtlData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddtlData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalData1 }
     * 
     * 
     * @return
     *     The value of the addtlData property.
     */
    public List<AdditionalData1> getAddtlData() {
        if (addtlData == null) {
            addtlData = new ArrayList<>();
        }
        return this.addtlData;
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
    public Plan2 addIntrstRate(InterestRateDetails2 intrstRate) {
        getIntrstRate().add(intrstRate);
        return this;
    }

    /**
     * Adds a new item to the amtDtls list.
     * @see #getAmtDtls()
     * 
     */
    public Plan2 addAmtDtls(InstalmentAmountDetails2 amtDtls) {
        getAmtDtls().add(amtDtls);
        return this;
    }

    /**
     * Adds a new item to the addtlData list.
     * @see #getAddtlData()
     * 
     */
    public Plan2 addAddtlData(AdditionalData1 addtlData) {
        getAddtlData().add(addtlData);
        return this;
    }

}
