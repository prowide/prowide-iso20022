
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
 * Indicates that the report is correcting the erroneous data fields of a previously submitted position.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReuseDataReportCorrection3", propOrder = {
    "techRcrdId",
    "ctrPtyData",
    "collCmpnt",
    "cshRinvstmtRate",
    "evtDay",
    "rptgDtTm",
    "fndgSrc",
    "rcncltnFlg",
    "ctrctMod",
    "splmtryData"
})
public class ReuseDataReportCorrection3 {

    @XmlElement(name = "TechRcrdId")
    protected String techRcrdId;
    @XmlElement(name = "CtrPtyData", required = true)
    protected CounterpartyData46 ctrPtyData;
    @XmlElement(name = "CollCmpnt", required = true)
    protected List<CollateralType6Choice> collCmpnt;
    @XmlElement(name = "CshRinvstmtRate")
    protected BigDecimal cshRinvstmtRate;
    @XmlElement(name = "EvtDay", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar evtDay;
    @XmlElement(name = "RptgDtTm", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar rptgDtTm;
    @XmlElement(name = "FndgSrc")
    protected List<FundingSource1> fndgSrc;
    @XmlElement(name = "RcncltnFlg")
    protected ReconciliationFlag1 rcncltnFlg;
    @XmlElement(name = "CtrctMod", required = true)
    protected ContractModification1 ctrctMod;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the techRcrdId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTechRcrdId() {
        return techRcrdId;
    }

    /**
     * Sets the value of the techRcrdId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ReuseDataReportCorrection3 setTechRcrdId(String value) {
        this.techRcrdId = value;
        return this;
    }

    /**
     * Gets the value of the ctrPtyData property.
     * 
     * @return
     *     possible object is
     *     {@link CounterpartyData46 }
     *     
     */
    public CounterpartyData46 getCtrPtyData() {
        return ctrPtyData;
    }

    /**
     * Sets the value of the ctrPtyData property.
     * 
     * @param value
     *     allowed object is
     *     {@link CounterpartyData46 }
     *     
     */
    public ReuseDataReportCorrection3 setCtrPtyData(CounterpartyData46 value) {
        this.ctrPtyData = value;
        return this;
    }

    /**
     * Gets the value of the collCmpnt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the collCmpnt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCollCmpnt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CollateralType6Choice }
     * 
     * 
     */
    public List<CollateralType6Choice> getCollCmpnt() {
        if (collCmpnt == null) {
            collCmpnt = new ArrayList<CollateralType6Choice>();
        }
        return this.collCmpnt;
    }

    /**
     * Gets the value of the cshRinvstmtRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCshRinvstmtRate() {
        return cshRinvstmtRate;
    }

    /**
     * Sets the value of the cshRinvstmtRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public ReuseDataReportCorrection3 setCshRinvstmtRate(BigDecimal value) {
        this.cshRinvstmtRate = value;
        return this;
    }

    /**
     * Gets the value of the evtDay property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEvtDay() {
        return evtDay;
    }

    /**
     * Sets the value of the evtDay property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public ReuseDataReportCorrection3 setEvtDay(XMLGregorianCalendar value) {
        this.evtDay = value;
        return this;
    }

    /**
     * Gets the value of the rptgDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRptgDtTm() {
        return rptgDtTm;
    }

    /**
     * Sets the value of the rptgDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public ReuseDataReportCorrection3 setRptgDtTm(XMLGregorianCalendar value) {
        this.rptgDtTm = value;
        return this;
    }

    /**
     * Gets the value of the fndgSrc property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fndgSrc property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFndgSrc().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FundingSource1 }
     * 
     * 
     */
    public List<FundingSource1> getFndgSrc() {
        if (fndgSrc == null) {
            fndgSrc = new ArrayList<FundingSource1>();
        }
        return this.fndgSrc;
    }

    /**
     * Gets the value of the rcncltnFlg property.
     * 
     * @return
     *     possible object is
     *     {@link ReconciliationFlag1 }
     *     
     */
    public ReconciliationFlag1 getRcncltnFlg() {
        return rcncltnFlg;
    }

    /**
     * Sets the value of the rcncltnFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReconciliationFlag1 }
     *     
     */
    public ReuseDataReportCorrection3 setRcncltnFlg(ReconciliationFlag1 value) {
        this.rcncltnFlg = value;
        return this;
    }

    /**
     * Gets the value of the ctrctMod property.
     * 
     * @return
     *     possible object is
     *     {@link ContractModification1 }
     *     
     */
    public ContractModification1 getCtrctMod() {
        return ctrctMod;
    }

    /**
     * Sets the value of the ctrctMod property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContractModification1 }
     *     
     */
    public ReuseDataReportCorrection3 setCtrctMod(ContractModification1 value) {
        this.ctrctMod = value;
        return this;
    }

    /**
     * Gets the value of the splmtryData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the splmtryData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSplmtryData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SupplementaryData1 }
     * 
     * 
     */
    public List<SupplementaryData1> getSplmtryData() {
        if (splmtryData == null) {
            splmtryData = new ArrayList<SupplementaryData1>();
        }
        return this.splmtryData;
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
     * Adds a new item to the collCmpnt list.
     * @see #getCollCmpnt()
     * 
     */
    public ReuseDataReportCorrection3 addCollCmpnt(CollateralType6Choice collCmpnt) {
        getCollCmpnt().add(collCmpnt);
        return this;
    }

    /**
     * Adds a new item to the fndgSrc list.
     * @see #getFndgSrc()
     * 
     */
    public ReuseDataReportCorrection3 addFndgSrc(FundingSource1 fndgSrc) {
        getFndgSrc().add(fndgSrc);
        return this;
    }

    /**
     * Adds a new item to the splmtryData list.
     * @see #getSplmtryData()
     * 
     */
    public ReuseDataReportCorrection3 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
