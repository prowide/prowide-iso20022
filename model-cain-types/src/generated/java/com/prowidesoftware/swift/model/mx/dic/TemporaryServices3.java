
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
 * Information regarding the billing for services rendered on a temporary or contract basis. The component provides information such as the employee job performed, timekeeping, and billing rates.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TemporaryServices3", propOrder = {
    "cpnyNm",
    "cpnyDept",
    "cpnyId",
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
    "chrg",
    "miscExpnss",
    "sbttlAmt",
    "tax",
    "addtlData"
})
public class TemporaryServices3 {

    @XmlElement(name = "CpnyNm")
    protected String cpnyNm;
    @XmlElement(name = "CpnyDept")
    protected String cpnyDept;
    @XmlElement(name = "CpnyId")
    protected PartyIdentification285 cpnyId;
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
    protected XMLGregorianCalendar jobStartDt;
    @XmlElement(name = "JobDrtn")
    protected String jobDrtn;
    @XmlElement(name = "JobEndDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar jobEndDt;
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
    protected XMLGregorianCalendar wkEndg;
    @XmlElement(name = "Chrg")
    protected List<Amount12> chrg;
    @XmlElement(name = "MiscExpnss")
    protected List<Amount13> miscExpnss;
    @XmlElement(name = "SbttlAmt")
    protected BigDecimal sbttlAmt;
    @XmlElement(name = "Tax")
    protected List<Tax41> tax;
    @XmlElement(name = "AddtlData")
    protected List<AdditionalData1> addtlData;

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
    public TemporaryServices3 setCpnyNm(String value) {
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
    public TemporaryServices3 setCpnyDept(String value) {
        this.cpnyDept = value;
        return this;
    }

    /**
     * Gets the value of the cpnyId property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification285 }
     *     
     */
    public PartyIdentification285 getCpnyId() {
        return cpnyId;
    }

    /**
     * Sets the value of the cpnyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification285 }
     *     
     */
    public TemporaryServices3 setCpnyId(PartyIdentification285 value) {
        this.cpnyId = value;
        return this;
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
    public TemporaryServices3 setCpnySprvsr(String value) {
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
    public TemporaryServices3 setMplyeePrsnlId(String value) {
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
    public TemporaryServices3 setMplyeeId(String value) {
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
    public TemporaryServices3 setMplyeeNm(String value) {
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
    public TemporaryServices3 setMplyeePrfssnlLvl(String value) {
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
    public TemporaryServices3 setJobCd(String value) {
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
    public TemporaryServices3 setJobDesc(String value) {
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
    public XMLGregorianCalendar getJobStartDt() {
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
    public TemporaryServices3 setJobStartDt(XMLGregorianCalendar value) {
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
    public TemporaryServices3 setJobDrtn(String value) {
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
    public XMLGregorianCalendar getJobEndDt() {
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
    public TemporaryServices3 setJobEndDt(XMLGregorianCalendar value) {
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
    public TemporaryServices3 setFlatRateInd(Boolean value) {
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
    public TemporaryServices3 setDscntAmt(BigDecimal value) {
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
    public TemporaryServices3 setSummryCmmdtyId(String value) {
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
    public TemporaryServices3 setTmSheet(String value) {
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
    public XMLGregorianCalendar getWkEndg() {
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
    public TemporaryServices3 setWkEndg(XMLGregorianCalendar value) {
        this.wkEndg = value;
        return this;
    }

    /**
     * Gets the value of the chrg property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the chrg property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChrg().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Amount12 }
     * 
     * 
     */
    public List<Amount12> getChrg() {
        if (chrg == null) {
            chrg = new ArrayList<Amount12>();
        }
        return this.chrg;
    }

    /**
     * Gets the value of the miscExpnss property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the miscExpnss property.
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
     */
    public List<Amount13> getMiscExpnss() {
        if (miscExpnss == null) {
            miscExpnss = new ArrayList<Amount13>();
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
    public TemporaryServices3 setSbttlAmt(BigDecimal value) {
        this.sbttlAmt = value;
        return this;
    }

    /**
     * Gets the value of the tax property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tax property.
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
     * {@link Tax41 }
     * 
     * 
     */
    public List<Tax41> getTax() {
        if (tax == null) {
            tax = new ArrayList<Tax41>();
        }
        return this.tax;
    }

    /**
     * Gets the value of the addtlData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addtlData property.
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
     */
    public List<AdditionalData1> getAddtlData() {
        if (addtlData == null) {
            addtlData = new ArrayList<AdditionalData1>();
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
     * Adds a new item to the chrg list.
     * @see #getChrg()
     * 
     */
    public TemporaryServices3 addChrg(Amount12 chrg) {
        getChrg().add(chrg);
        return this;
    }

    /**
     * Adds a new item to the miscExpnss list.
     * @see #getMiscExpnss()
     * 
     */
    public TemporaryServices3 addMiscExpnss(Amount13 miscExpnss) {
        getMiscExpnss().add(miscExpnss);
        return this;
    }

    /**
     * Adds a new item to the tax list.
     * @see #getTax()
     * 
     */
    public TemporaryServices3 addTax(Tax41 tax) {
        getTax().add(tax);
        return this;
    }

    /**
     * Adds a new item to the addtlData list.
     * @see #getAddtlData()
     * 
     */
    public TemporaryServices3 addAddtlData(AdditionalData1 addtlData) {
        getAddtlData().add(addtlData);
        return this;
    }

}
