
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * The Netting Cut Off Reference Data Report message is sent to a participant by a central system to provide details of scheduled, changed, existing and previous netting cut off data held at a central system.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NettingCutOffReferenceDataReportV01", propOrder = {
    "rptData",
    "ptcptNetgCutOffData",
    "splmtryData"
})
public class NettingCutOffReferenceDataReportV01 {

    @XmlElement(name = "RptData", required = true)
    protected NettingCutOffReportData1 rptData;
    @XmlElement(name = "PtcptNetgCutOffData", required = true)
    protected List<CutOffData1> ptcptNetgCutOffData;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the rptData property.
     * 
     * @return
     *     possible object is
     *     {@link NettingCutOffReportData1 }
     *     
     */
    public NettingCutOffReportData1 getRptData() {
        return rptData;
    }

    /**
     * Sets the value of the rptData property.
     * 
     * @param value
     *     allowed object is
     *     {@link NettingCutOffReportData1 }
     *     
     */
    public NettingCutOffReferenceDataReportV01 setRptData(NettingCutOffReportData1 value) {
        this.rptData = value;
        return this;
    }

    /**
     * Gets the value of the ptcptNetgCutOffData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ptcptNetgCutOffData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPtcptNetgCutOffData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CutOffData1 }
     * 
     * 
     */
    public List<CutOffData1> getPtcptNetgCutOffData() {
        if (ptcptNetgCutOffData == null) {
            ptcptNetgCutOffData = new ArrayList<CutOffData1>();
        }
        return this.ptcptNetgCutOffData;
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
     * Adds a new item to the ptcptNetgCutOffData list.
     * @see #getPtcptNetgCutOffData()
     * 
     */
    public NettingCutOffReferenceDataReportV01 addPtcptNetgCutOffData(CutOffData1 ptcptNetgCutOffData) {
        getPtcptNetgCutOffData().add(ptcptNetgCutOffData);
        return this;
    }

    /**
     * Adds a new item to the splmtryData list.
     * @see #getSplmtryData()
     * 
     */
    public NettingCutOffReferenceDataReportV01 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
