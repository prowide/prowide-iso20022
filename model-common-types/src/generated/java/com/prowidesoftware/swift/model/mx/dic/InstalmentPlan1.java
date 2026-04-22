
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
@XmlType(name = "InstalmentPlan1", propOrder = {
    "id",
    "ownr",
    "ownrNm",
    "regnSysId",
    "pmtTp",
    "dfrrd",
    "prdUnit",
    "dfrrdPrds",
    "mnthlyIntrstRate",
    "anlIntrstRate",
    "frstPmtDt",
    "frstAmt",
    "nrmlPmtAmt",
    "ttlNbOfPmts",
    "ccy",
    "gracePrdUnitTp",
    "nbOfGracePrdUnits",
    "cstmrSelctdGracePrd",
    "amtDtls",
    "grdTtlAmt",
    "prvtData",
    "ntlData"
})
public class InstalmentPlan1 {

    @XmlElement(name = "Id")
    protected String id;
    @XmlElement(name = "Ownr")
    @XmlSchemaType(name = "string")
    protected PlanOwner2Code ownr;
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
    @XmlElement(name = "DfrrdPrds")
    protected BigDecimal dfrrdPrds;
    @XmlElement(name = "MnthlyIntrstRate")
    protected BigDecimal mnthlyIntrstRate;
    @XmlElement(name = "AnlIntrstRate")
    protected BigDecimal anlIntrstRate;
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
    protected GracePeriodUnitType2Code gracePrdUnitTp;
    @XmlElement(name = "NbOfGracePrdUnits")
    protected String nbOfGracePrdUnits;
    @XmlElement(name = "CstmrSelctdGracePrd")
    protected Boolean cstmrSelctdGracePrd;
    @XmlElement(name = "AmtDtls")
    protected List<InstalmentAmountData1> amtDtls;
    @XmlElement(name = "GrdTtlAmt")
    protected BigDecimal grdTtlAmt;
    @XmlElement(name = "PrvtData")
    protected List<ATICALaxProcessing> prvtData;
    @XmlElement(name = "NtlData")
    protected List<ATICALaxProcessing> ntlData;

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
    public InstalmentPlan1 setId(String value) {
        this.id = value;
        return this;
    }

    /**
     * Gets the value of the ownr property.
     * 
     * @return
     *     possible object is
     *     {@link PlanOwner2Code }
     *     
     */
    public PlanOwner2Code getOwnr() {
        return ownr;
    }

    /**
     * Sets the value of the ownr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlanOwner2Code }
     *     
     */
    public InstalmentPlan1 setOwnr(PlanOwner2Code value) {
        this.ownr = value;
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
    public InstalmentPlan1 setOwnrNm(String value) {
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
    public InstalmentPlan1 setRegnSysId(String value) {
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
    public InstalmentPlan1 setPmtTp(String value) {
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
    public InstalmentPlan1 setDfrrd(Boolean value) {
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
    public InstalmentPlan1 setPrdUnit(Frequency18Code value) {
        this.prdUnit = value;
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
    public InstalmentPlan1 setDfrrdPrds(BigDecimal value) {
        this.dfrrdPrds = value;
        return this;
    }

    /**
     * Gets the value of the mnthlyIntrstRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMnthlyIntrstRate() {
        return mnthlyIntrstRate;
    }

    /**
     * Sets the value of the mnthlyIntrstRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public InstalmentPlan1 setMnthlyIntrstRate(BigDecimal value) {
        this.mnthlyIntrstRate = value;
        return this;
    }

    /**
     * Gets the value of the anlIntrstRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAnlIntrstRate() {
        return anlIntrstRate;
    }

    /**
     * Sets the value of the anlIntrstRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public InstalmentPlan1 setAnlIntrstRate(BigDecimal value) {
        this.anlIntrstRate = value;
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
    public InstalmentPlan1 setFrstPmtDt(LocalDate value) {
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
    public InstalmentPlan1 setFrstAmt(BigDecimal value) {
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
    public InstalmentPlan1 setNrmlPmtAmt(BigDecimal value) {
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
    public InstalmentPlan1 setTtlNbOfPmts(BigDecimal value) {
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
    public InstalmentPlan1 setCcy(String value) {
        this.ccy = value;
        return this;
    }

    /**
     * Gets the value of the gracePrdUnitTp property.
     * 
     * @return
     *     possible object is
     *     {@link GracePeriodUnitType2Code }
     *     
     */
    public GracePeriodUnitType2Code getGracePrdUnitTp() {
        return gracePrdUnitTp;
    }

    /**
     * Sets the value of the gracePrdUnitTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link GracePeriodUnitType2Code }
     *     
     */
    public InstalmentPlan1 setGracePrdUnitTp(GracePeriodUnitType2Code value) {
        this.gracePrdUnitTp = value;
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
    public InstalmentPlan1 setNbOfGracePrdUnits(String value) {
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
    public InstalmentPlan1 setCstmrSelctdGracePrd(Boolean value) {
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
     * {@link InstalmentAmountData1 }
     * 
     * 
     * @return
     *     The value of the amtDtls property.
     */
    public List<InstalmentAmountData1> getAmtDtls() {
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
    public InstalmentPlan1 setGrdTtlAmt(BigDecimal value) {
        this.grdTtlAmt = value;
        return this;
    }

    /**
     * Gets the value of the prvtData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the prvtData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrvtData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ATICALaxProcessing }
     * 
     * 
     * @return
     *     The value of the prvtData property.
     */
    public List<ATICALaxProcessing> getPrvtData() {
        if (prvtData == null) {
            prvtData = new ArrayList<>();
        }
        return this.prvtData;
    }

    /**
     * Gets the value of the ntlData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the ntlData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNtlData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ATICALaxProcessing }
     * 
     * 
     * @return
     *     The value of the ntlData property.
     */
    public List<ATICALaxProcessing> getNtlData() {
        if (ntlData == null) {
            ntlData = new ArrayList<>();
        }
        return this.ntlData;
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
     * Adds a new item to the amtDtls list.
     * @see #getAmtDtls()
     * 
     */
    public InstalmentPlan1 addAmtDtls(InstalmentAmountData1 amtDtls) {
        getAmtDtls().add(amtDtls);
        return this;
    }

    /**
     * Adds a new item to the prvtData list.
     * @see #getPrvtData()
     * 
     */
    public InstalmentPlan1 addPrvtData(ATICALaxProcessing prvtData) {
        getPrvtData().add(prvtData);
        return this;
    }

    /**
     * Adds a new item to the ntlData list.
     * @see #getNtlData()
     * 
     */
    public InstalmentPlan1 addNtlData(ATICALaxProcessing ntlData) {
        getNtlData().add(ntlData);
        return this;
    }

}
