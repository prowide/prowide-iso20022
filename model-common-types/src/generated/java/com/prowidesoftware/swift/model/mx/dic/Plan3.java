
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
@XmlType(name = "Plan3", propOrder = {
    "id",
    "ownr",
    "othrOwnr",
    "ownrNm",
    "regnSysId",
    "pmtTp",
    "dfrrd",
    "prdUnit",
    "nbOfPrds",
    "dfrrdPrds",
    "intrstRate",
    "frstPmtDt",
    "frstAmt",
    "nrmlPmtAmt",
    "ttlNbOfPmts",
    "ccy",
    "gracePrdUnitTp",
    "othrGracePrdUnitTp",
    "nbOfGracePrdUnits",
    "cstmrSelctdGracePrd",
    "amtDtls",
    "grdTtlAmt",
    "addtlData"
})
public class Plan3 {

    @XmlElement(name = "Id")
    protected String id;
    @XmlElement(name = "Ownr")
    @XmlSchemaType(name = "string")
    protected PlanOwner1Code ownr;
    @XmlElement(name = "OthrOwnr")
    protected String othrOwnr;
    @XmlElement(name = "OwnrNm")
    protected String ownrNm;
    @XmlElement(name = "RegnSysId")
    protected String regnSysId;
    @XmlElement(name = "PmtTp")
    protected String pmtTp;
    @XmlElement(name = "Dfrrd")
    protected Boolean dfrrd;
    @XmlElement(name = "PrdUnit")
    @XmlSchemaType(name = "string")
    protected Frequency18Code prdUnit;
    @XmlElement(name = "NbOfPrds")
    protected BigDecimal nbOfPrds;
    @XmlElement(name = "DfrrdPrds")
    protected BigDecimal dfrrdPrds;
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
    @XmlElement(name = "Ccy")
    protected String ccy;
    @XmlElement(name = "GracePrdUnitTp")
    @XmlSchemaType(name = "string")
    protected GracePeriodUnitType1Code gracePrdUnitTp;
    @XmlElement(name = "OthrGracePrdUnitTp")
    protected String othrGracePrdUnitTp;
    @XmlElement(name = "NbOfGracePrdUnits")
    protected String nbOfGracePrdUnits;
    @XmlElement(name = "CstmrSelctdGracePrd")
    protected Boolean cstmrSelctdGracePrd;
    @XmlElement(name = "AmtDtls")
    protected List<InstalmentAmountDetails3> amtDtls;
    @XmlElement(name = "GrdTtlAmt")
    protected BigDecimal grdTtlAmt;
    @XmlElement(name = "AddtlData")
    protected List<AdditionalData1> addtlData;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Plan3 setId(String value) {
        this.id = value;
        return this;
    }

    /**
     * Gets the value of the ownr property.
     * 
     * @return
     *     possible object is
     *     {@link PlanOwner1Code }
     *     
     */
    public PlanOwner1Code getOwnr() {
        return ownr;
    }

    /**
     * Sets the value of the ownr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlanOwner1Code }
     *     
     */
    public Plan3 setOwnr(PlanOwner1Code value) {
        this.ownr = value;
        return this;
    }

    /**
     * Gets the value of the othrOwnr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOthrOwnr() {
        return othrOwnr;
    }

    /**
     * Sets the value of the othrOwnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Plan3 setOthrOwnr(String value) {
        this.othrOwnr = value;
        return this;
    }

    /**
     * Gets the value of the ownrNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwnrNm() {
        return ownrNm;
    }

    /**
     * Sets the value of the ownrNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Plan3 setOwnrNm(String value) {
        this.ownrNm = value;
        return this;
    }

    /**
     * Gets the value of the regnSysId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegnSysId() {
        return regnSysId;
    }

    /**
     * Sets the value of the regnSysId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Plan3 setRegnSysId(String value) {
        this.regnSysId = value;
        return this;
    }

    /**
     * Gets the value of the pmtTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPmtTp() {
        return pmtTp;
    }

    /**
     * Sets the value of the pmtTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Plan3 setPmtTp(String value) {
        this.pmtTp = value;
        return this;
    }

    /**
     * Gets the value of the dfrrd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDfrrd() {
        return dfrrd;
    }

    /**
     * Sets the value of the dfrrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public Plan3 setDfrrd(Boolean value) {
        this.dfrrd = value;
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
    public Plan3 setPrdUnit(Frequency18Code value) {
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
    public Plan3 setNbOfPrds(BigDecimal value) {
        this.nbOfPrds = value;
        return this;
    }

    /**
     * Gets the value of the dfrrdPrds property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDfrrdPrds() {
        return dfrrdPrds;
    }

    /**
     * Sets the value of the dfrrdPrds property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public Plan3 setDfrrdPrds(BigDecimal value) {
        this.dfrrdPrds = value;
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
    public Plan3 setFrstPmtDt(LocalDate value) {
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
    public Plan3 setFrstAmt(BigDecimal value) {
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
    public Plan3 setNrmlPmtAmt(BigDecimal value) {
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
    public Plan3 setTtlNbOfPmts(BigDecimal value) {
        this.ttlNbOfPmts = value;
        return this;
    }

    /**
     * Gets the value of the ccy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCcy() {
        return ccy;
    }

    /**
     * Sets the value of the ccy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Plan3 setCcy(String value) {
        this.ccy = value;
        return this;
    }

    /**
     * Gets the value of the gracePrdUnitTp property.
     * 
     * @return
     *     possible object is
     *     {@link GracePeriodUnitType1Code }
     *     
     */
    public GracePeriodUnitType1Code getGracePrdUnitTp() {
        return gracePrdUnitTp;
    }

    /**
     * Sets the value of the gracePrdUnitTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link GracePeriodUnitType1Code }
     *     
     */
    public Plan3 setGracePrdUnitTp(GracePeriodUnitType1Code value) {
        this.gracePrdUnitTp = value;
        return this;
    }

    /**
     * Gets the value of the othrGracePrdUnitTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOthrGracePrdUnitTp() {
        return othrGracePrdUnitTp;
    }

    /**
     * Sets the value of the othrGracePrdUnitTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Plan3 setOthrGracePrdUnitTp(String value) {
        this.othrGracePrdUnitTp = value;
        return this;
    }

    /**
     * Gets the value of the nbOfGracePrdUnits property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNbOfGracePrdUnits() {
        return nbOfGracePrdUnits;
    }

    /**
     * Sets the value of the nbOfGracePrdUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Plan3 setNbOfGracePrdUnits(String value) {
        this.nbOfGracePrdUnits = value;
        return this;
    }

    /**
     * Gets the value of the cstmrSelctdGracePrd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCstmrSelctdGracePrd() {
        return cstmrSelctdGracePrd;
    }

    /**
     * Sets the value of the cstmrSelctdGracePrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public Plan3 setCstmrSelctdGracePrd(Boolean value) {
        this.cstmrSelctdGracePrd = value;
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
     * {@link InstalmentAmountDetails3 }
     * 
     * 
     * @return
     *     The value of the amtDtls property.
     */
    public List<InstalmentAmountDetails3> getAmtDtls() {
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
    public Plan3 setGrdTtlAmt(BigDecimal value) {
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
    public Plan3 addIntrstRate(InterestRateDetails2 intrstRate) {
        getIntrstRate().add(intrstRate);
        return this;
    }

    /**
     * Adds a new item to the amtDtls list.
     * @see #getAmtDtls()
     * 
     */
    public Plan3 addAmtDtls(InstalmentAmountDetails3 amtDtls) {
        getAmtDtls().add(amtDtls);
        return this;
    }

    /**
     * Adds a new item to the addtlData list.
     * @see #getAddtlData()
     * 
     */
    public Plan3 addAddtlData(AdditionalData1 addtlData) {
        getAddtlData().add(addtlData);
        return this;
    }

}
