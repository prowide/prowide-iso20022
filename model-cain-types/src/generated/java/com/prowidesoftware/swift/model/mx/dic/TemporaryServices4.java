
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
 * Information regarding the billing for services rendered on a temporary or contract basis. The component provides information such as the employee job performed, timekeeping, and billing rates.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TemporaryServices4", propOrder = {
    "cpnyNm",
    "cpnyDept",
    "cpnyId",
    "cpnyBizNm",
    "cpnyLglCorpNm",
    "cpnyAdr",
    "cpnyLclData",
    "cpnySprvsr",
    "mplyeePrsnlId",
    "mplyeeId",
    "mplyeeNm",
    "mplyeePrfssnlLvl",
    "jobCd",
    "jobDesc",
    "jobStartDt",
    "jobDrtn",
    "jobEndDt",
    "flatRateInd",
    "dscntAmt",
    "summryCmmdtyId",
    "tmSheet",
    "wkEndg",
    "chrgRate",
    "miscExpnss",
    "sbttlAmt",
    "tax",
    "ttlAmt",
    "prvtData",
    "ntlData"
})
public class TemporaryServices4 {

    @XmlElement(name = "CpnyNm")
    protected String cpnyNm;
    @XmlElement(name = "CpnyDept")
    protected String cpnyDept;
    @XmlElement(name = "CpnyId")
    protected String cpnyId;
    @XmlElement(name = "CpnyBizNm")
    protected String cpnyBizNm;
    @XmlElement(name = "CpnyLglCorpNm")
    protected String cpnyLglCorpNm;
    @XmlElement(name = "CpnyAdr")
    protected Address4 cpnyAdr;
    @XmlElement(name = "CpnyLclData")
    protected List<LocalData20> cpnyLclData;
    @XmlElement(name = "CpnySprvsr")
    protected String cpnySprvsr;
    @XmlElement(name = "MplyeePrsnlId")
    protected String mplyeePrsnlId;
    @XmlElement(name = "MplyeeId")
    protected String mplyeeId;
    @XmlElement(name = "MplyeeNm")
    protected String mplyeeNm;
    @XmlElement(name = "MplyeePrfssnlLvl")
    protected String mplyeePrfssnlLvl;
    @XmlElement(name = "JobCd")
    protected String jobCd;
    @XmlElement(name = "JobDesc")
    protected String jobDesc;
    @XmlElement(name = "JobStartDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate jobStartDt;
    @XmlElement(name = "JobDrtn")
    protected String jobDrtn;
    @XmlElement(name = "JobEndDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate jobEndDt;
    @XmlElement(name = "FlatRateInd")
    protected Boolean flatRateInd;
    @XmlElement(name = "DscntAmt")
    protected BigDecimal dscntAmt;
    @XmlElement(name = "SummryCmmdtyId")
    protected String summryCmmdtyId;
    @XmlElement(name = "TmSheet")
    protected String tmSheet;
    @XmlElement(name = "WkEndg", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate wkEndg;
    @XmlElement(name = "ChrgRate")
    protected List<TemporaryServiceChargeRate1> chrgRate;
    @XmlElement(name = "MiscExpnss")
    protected List<Amount13> miscExpnss;
    @XmlElement(name = "SbttlAmt")
    protected BigDecimal sbttlAmt;
    @XmlElement(name = "Tax")
    protected List<Tax44> tax;
    @XmlElement(name = "TtlAmt")
    protected BigDecimal ttlAmt;
    @XmlElement(name = "PrvtData")
    protected List<ATICALaxProcessing> prvtData;
    @XmlElement(name = "NtlData")
    protected List<ATICALaxProcessing> ntlData;

    /**
     * Gets the value of the cpnyNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCpnyNm() {
        return cpnyNm;
    }

    /**
     * Sets the value of the cpnyNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TemporaryServices4 setCpnyNm(String value) {
        this.cpnyNm = value;
        return this;
    }

    /**
     * Gets the value of the cpnyDept property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCpnyDept() {
        return cpnyDept;
    }

    /**
     * Sets the value of the cpnyDept property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TemporaryServices4 setCpnyDept(String value) {
        this.cpnyDept = value;
        return this;
    }

    /**
     * Gets the value of the cpnyId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCpnyId() {
        return cpnyId;
    }

    /**
     * Sets the value of the cpnyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TemporaryServices4 setCpnyId(String value) {
        this.cpnyId = value;
        return this;
    }

    /**
     * Gets the value of the cpnyBizNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCpnyBizNm() {
        return cpnyBizNm;
    }

    /**
     * Sets the value of the cpnyBizNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TemporaryServices4 setCpnyBizNm(String value) {
        this.cpnyBizNm = value;
        return this;
    }

    /**
     * Gets the value of the cpnyLglCorpNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCpnyLglCorpNm() {
        return cpnyLglCorpNm;
    }

    /**
     * Sets the value of the cpnyLglCorpNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TemporaryServices4 setCpnyLglCorpNm(String value) {
        this.cpnyLglCorpNm = value;
        return this;
    }

    /**
     * Gets the value of the cpnyAdr property.
     * 
     * @return
     *     possible object is
     *     {@link Address4 }
     *     
     */
    public Address4 getCpnyAdr() {
        return cpnyAdr;
    }

    /**
     * Sets the value of the cpnyAdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Address4 }
     *     
     */
    public TemporaryServices4 setCpnyAdr(Address4 value) {
        this.cpnyAdr = value;
        return this;
    }

    /**
     * Gets the value of the cpnyLclData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the cpnyLclData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCpnyLclData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LocalData20 }
     * 
     * 
     * @return
     *     The value of the cpnyLclData property.
     */
    public List<LocalData20> getCpnyLclData() {
        if (cpnyLclData == null) {
            cpnyLclData = new ArrayList<>();
        }
        return this.cpnyLclData;
    }

    /**
     * Gets the value of the cpnySprvsr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCpnySprvsr() {
        return cpnySprvsr;
    }

    /**
     * Sets the value of the cpnySprvsr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TemporaryServices4 setCpnySprvsr(String value) {
        this.cpnySprvsr = value;
        return this;
    }

    /**
     * Gets the value of the mplyeePrsnlId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMplyeePrsnlId() {
        return mplyeePrsnlId;
    }

    /**
     * Sets the value of the mplyeePrsnlId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TemporaryServices4 setMplyeePrsnlId(String value) {
        this.mplyeePrsnlId = value;
        return this;
    }

    /**
     * Gets the value of the mplyeeId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMplyeeId() {
        return mplyeeId;
    }

    /**
     * Sets the value of the mplyeeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TemporaryServices4 setMplyeeId(String value) {
        this.mplyeeId = value;
        return this;
    }

    /**
     * Gets the value of the mplyeeNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMplyeeNm() {
        return mplyeeNm;
    }

    /**
     * Sets the value of the mplyeeNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TemporaryServices4 setMplyeeNm(String value) {
        this.mplyeeNm = value;
        return this;
    }

    /**
     * Gets the value of the mplyeePrfssnlLvl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMplyeePrfssnlLvl() {
        return mplyeePrfssnlLvl;
    }

    /**
     * Sets the value of the mplyeePrfssnlLvl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TemporaryServices4 setMplyeePrfssnlLvl(String value) {
        this.mplyeePrfssnlLvl = value;
        return this;
    }

    /**
     * Gets the value of the jobCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJobCd() {
        return jobCd;
    }

    /**
     * Sets the value of the jobCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TemporaryServices4 setJobCd(String value) {
        this.jobCd = value;
        return this;
    }

    /**
     * Gets the value of the jobDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJobDesc() {
        return jobDesc;
    }

    /**
     * Sets the value of the jobDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TemporaryServices4 setJobDesc(String value) {
        this.jobDesc = value;
        return this;
    }

    /**
     * Gets the value of the jobStartDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getJobStartDt() {
        return jobStartDt;
    }

    /**
     * Sets the value of the jobStartDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TemporaryServices4 setJobStartDt(LocalDate value) {
        this.jobStartDt = value;
        return this;
    }

    /**
     * Gets the value of the jobDrtn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJobDrtn() {
        return jobDrtn;
    }

    /**
     * Sets the value of the jobDrtn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TemporaryServices4 setJobDrtn(String value) {
        this.jobDrtn = value;
        return this;
    }

    /**
     * Gets the value of the jobEndDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getJobEndDt() {
        return jobEndDt;
    }

    /**
     * Sets the value of the jobEndDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TemporaryServices4 setJobEndDt(LocalDate value) {
        this.jobEndDt = value;
        return this;
    }

    /**
     * Gets the value of the flatRateInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFlatRateInd() {
        return flatRateInd;
    }

    /**
     * Sets the value of the flatRateInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public TemporaryServices4 setFlatRateInd(Boolean value) {
        this.flatRateInd = value;
        return this;
    }

    /**
     * Gets the value of the dscntAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDscntAmt() {
        return dscntAmt;
    }

    /**
     * Sets the value of the dscntAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public TemporaryServices4 setDscntAmt(BigDecimal value) {
        this.dscntAmt = value;
        return this;
    }

    /**
     * Gets the value of the summryCmmdtyId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSummryCmmdtyId() {
        return summryCmmdtyId;
    }

    /**
     * Sets the value of the summryCmmdtyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TemporaryServices4 setSummryCmmdtyId(String value) {
        this.summryCmmdtyId = value;
        return this;
    }

    /**
     * Gets the value of the tmSheet property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTmSheet() {
        return tmSheet;
    }

    /**
     * Sets the value of the tmSheet property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TemporaryServices4 setTmSheet(String value) {
        this.tmSheet = value;
        return this;
    }

    /**
     * Gets the value of the wkEndg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getWkEndg() {
        return wkEndg;
    }

    /**
     * Sets the value of the wkEndg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TemporaryServices4 setWkEndg(LocalDate value) {
        this.wkEndg = value;
        return this;
    }

    /**
     * Gets the value of the chrgRate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the chrgRate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChrgRate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TemporaryServiceChargeRate1 }
     * 
     * 
     * @return
     *     The value of the chrgRate property.
     */
    public List<TemporaryServiceChargeRate1> getChrgRate() {
        if (chrgRate == null) {
            chrgRate = new ArrayList<>();
        }
        return this.chrgRate;
    }

    /**
     * Gets the value of the miscExpnss property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the miscExpnss property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMiscExpnss().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Amount13 }
     * 
     * 
     * @return
     *     The value of the miscExpnss property.
     */
    public List<Amount13> getMiscExpnss() {
        if (miscExpnss == null) {
            miscExpnss = new ArrayList<>();
        }
        return this.miscExpnss;
    }

    /**
     * Gets the value of the sbttlAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSbttlAmt() {
        return sbttlAmt;
    }

    /**
     * Sets the value of the sbttlAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public TemporaryServices4 setSbttlAmt(BigDecimal value) {
        this.sbttlAmt = value;
        return this;
    }

    /**
     * Gets the value of the tax property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the tax property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTax().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Tax44 }
     * 
     * 
     * @return
     *     The value of the tax property.
     */
    public List<Tax44> getTax() {
        if (tax == null) {
            tax = new ArrayList<>();
        }
        return this.tax;
    }

    /**
     * Gets the value of the ttlAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTtlAmt() {
        return ttlAmt;
    }

    /**
     * Sets the value of the ttlAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public TemporaryServices4 setTtlAmt(BigDecimal value) {
        this.ttlAmt = value;
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
     * Adds a new item to the cpnyLclData list.
     * @see #getCpnyLclData()
     * 
     */
    public TemporaryServices4 addCpnyLclData(LocalData20 cpnyLclData) {
        getCpnyLclData().add(cpnyLclData);
        return this;
    }

    /**
     * Adds a new item to the chrgRate list.
     * @see #getChrgRate()
     * 
     */
    public TemporaryServices4 addChrgRate(TemporaryServiceChargeRate1 chrgRate) {
        getChrgRate().add(chrgRate);
        return this;
    }

    /**
     * Adds a new item to the miscExpnss list.
     * @see #getMiscExpnss()
     * 
     */
    public TemporaryServices4 addMiscExpnss(Amount13 miscExpnss) {
        getMiscExpnss().add(miscExpnss);
        return this;
    }

    /**
     * Adds a new item to the tax list.
     * @see #getTax()
     * 
     */
    public TemporaryServices4 addTax(Tax44 tax) {
        getTax().add(tax);
        return this;
    }

    /**
     * Adds a new item to the prvtData list.
     * @see #getPrvtData()
     * 
     */
    public TemporaryServices4 addPrvtData(ATICALaxProcessing prvtData) {
        getPrvtData().add(prvtData);
        return this;
    }

    /**
     * Adds a new item to the ntlData list.
     * @see #getNtlData()
     * 
     */
    public TemporaryServices4 addNtlData(ATICALaxProcessing ntlData) {
        getNtlData().add(ntlData);
        return this;
    }

}
