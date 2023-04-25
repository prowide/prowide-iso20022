
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateAdapter;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateTimeAdapter;
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
 * Indicates that the report is correcting the erroneous data fields of a previously submitted position.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReuseDataReportCorrection9", propOrder = {
    "techRcrdId",
    "ctrPtyData",
    "collCmpnt",
    "evtDay",
    "rptgDtTm",
    "fndgSrc",
    "rcncltnFlg",
    "ctrctMod",
    "splmtryData"
})
public class ReuseDataReportCorrection9 {

    @XmlElement(name = "TechRcrdId")
    protected String techRcrdId;
    @XmlElement(name = "CtrPtyData", required = true)
    protected CounterpartyData46 ctrPtyData;
    @XmlElement(name = "CollCmpnt", required = true)
    protected CollateralType12 collCmpnt;
    @XmlElement(name = "EvtDay", required = true, type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected Calendar evtDay;
    @XmlElement(name = "RptgDtTm", required = true, type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar rptgDtTm;
    @XmlElement(name = "FndgSrc")
    protected List<FundingSource1> fndgSrc;
    @XmlElement(name = "RcncltnFlg")
    protected ReconciliationFlag1 rcncltnFlg;
    @XmlElement(name = "CtrctMod", required = true)
    protected ContractModification3 ctrctMod;
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
    public ReuseDataReportCorrection9 setTechRcrdId(String value) {
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
    public ReuseDataReportCorrection9 setCtrPtyData(CounterpartyData46 value) {
        this.ctrPtyData = value;
        return this;
    }

    /**
     * Gets the value of the collCmpnt property.
     * 
     * @return
     *     possible object is
     *     {@link CollateralType12 }
     *     
     */
    public CollateralType12 getCollCmpnt() {
        return collCmpnt;
    }

    /**
     * Sets the value of the collCmpnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollateralType12 }
     *     
     */
    public ReuseDataReportCorrection9 setCollCmpnt(CollateralType12 value) {
        this.collCmpnt = value;
        return this;
    }

    /**
     * Gets the value of the evtDay property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getEvtDay() {
        return evtDay;
    }

    /**
     * Sets the value of the evtDay property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ReuseDataReportCorrection9 setEvtDay(Calendar value) {
        this.evtDay = value;
        return this;
    }

    /**
     * Gets the value of the rptgDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getRptgDtTm() {
        return rptgDtTm;
    }

    /**
     * Sets the value of the rptgDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ReuseDataReportCorrection9 setRptgDtTm(Calendar value) {
        this.rptgDtTm = value;
        return this;
    }

    /**
     * Gets the value of the fndgSrc property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the fndgSrc property.
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
     * @return
     *     The value of the fndgSrc property.
     */
    public List<FundingSource1> getFndgSrc() {
        if (fndgSrc == null) {
            fndgSrc = new ArrayList<>();
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
    public ReuseDataReportCorrection9 setRcncltnFlg(ReconciliationFlag1 value) {
        this.rcncltnFlg = value;
        return this;
    }

    /**
     * Gets the value of the ctrctMod property.
     * 
     * @return
     *     possible object is
     *     {@link ContractModification3 }
     *     
     */
    public ContractModification3 getCtrctMod() {
        return ctrctMod;
    }

    /**
     * Sets the value of the ctrctMod property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContractModification3 }
     *     
     */
    public ReuseDataReportCorrection9 setCtrctMod(ContractModification3 value) {
        this.ctrctMod = value;
        return this;
    }

    /**
     * Gets the value of the splmtryData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the splmtryData property.
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
     * @return
     *     The value of the splmtryData property.
     */
    public List<SupplementaryData1> getSplmtryData() {
        if (splmtryData == null) {
            splmtryData = new ArrayList<>();
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
     * Adds a new item to the fndgSrc list.
     * @see #getFndgSrc()
     * 
     */
    public ReuseDataReportCorrection9 addFndgSrc(FundingSource1 fndgSrc) {
        getFndgSrc().add(fndgSrc);
        return this;
    }

    /**
     * Adds a new item to the splmtryData list.
     * @see #getSplmtryData()
     * 
     */
    public ReuseDataReportCorrection9 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
