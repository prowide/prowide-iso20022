
package com.prowidesoftware.swift.model.mx.dic;

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
 * Indicates whether transaction is reported for the first time.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReuseDataReportNew2", propOrder = {
    "techRcrdId",
    "rptgDtTm",
    "ctrPtyData",
    "collCmpnt",
    "evtDay",
    "fndgSrc",
    "splmtryData"
})
public class ReuseDataReportNew2 {

    @XmlElement(name = "TechRcrdId", required = true)
    protected String techRcrdId;
    @XmlElement(name = "RptgDtTm", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar rptgDtTm;
    @XmlElement(name = "CtrPtyData", required = true)
    protected CounterpartyData46 ctrPtyData;
    @XmlElement(name = "CollCmpnt", required = true)
    protected List<CollateralType6Choice> collCmpnt;
    @XmlElement(name = "EvtDay", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar evtDay;
    @XmlElement(name = "FndgSrc")
    protected List<FundingSource1> fndgSrc;
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
    public ReuseDataReportNew2 setTechRcrdId(String value) {
        this.techRcrdId = value;
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
    public ReuseDataReportNew2 setRptgDtTm(XMLGregorianCalendar value) {
        this.rptgDtTm = value;
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
    public ReuseDataReportNew2 setCtrPtyData(CounterpartyData46 value) {
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
    public ReuseDataReportNew2 setEvtDay(XMLGregorianCalendar value) {
        this.evtDay = value;
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
    public ReuseDataReportNew2 addCollCmpnt(CollateralType6Choice collCmpnt) {
        getCollCmpnt().add(collCmpnt);
        return this;
    }

    /**
     * Adds a new item to the fndgSrc list.
     * @see #getFndgSrc()
     * 
     */
    public ReuseDataReportNew2 addFndgSrc(FundingSource1 fndgSrc) {
        getFndgSrc().add(fndgSrc);
        return this;
    }

    /**
     * Adds a new item to the splmtryData list.
     * @see #getSplmtryData()
     * 
     */
    public ReuseDataReportNew2 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
