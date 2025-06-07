
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
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
@XmlType(name = "NettingCutOffReferenceDataReportV02", propOrder = {
    "rptData",
    "ptcptNetgCutOffData",
    "splmtryData"
})
public class NettingCutOffReferenceDataReportV02 {

    @XmlElement(name = "RptData", required = true)
    protected NettingCutOffReportData2 rptData;
    @XmlElement(name = "PtcptNetgCutOffData", required = true)
    protected List<CutOffData2> ptcptNetgCutOffData;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the rptData property.
     * 
     * @return
     *     possible object is
     *     {@link NettingCutOffReportData2 }
     *     
     */
    public NettingCutOffReportData2 getRptData() {
        return rptData;
    }

    /**
     * Sets the value of the rptData property.
     * 
     * @param value
     *     allowed object is
     *     {@link NettingCutOffReportData2 }
     *     
     */
    public NettingCutOffReferenceDataReportV02 setRptData(NettingCutOffReportData2 value) {
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
     * {@link CutOffData2 }
     * 
     * 
     */
    public List<CutOffData2> getPtcptNetgCutOffData() {
        if (ptcptNetgCutOffData == null) {
            ptcptNetgCutOffData = new ArrayList<CutOffData2>();
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
    public NettingCutOffReferenceDataReportV02 addPtcptNetgCutOffData(CutOffData2 ptcptNetgCutOffData) {
        getPtcptNetgCutOffData().add(ptcptNetgCutOffData);
        return this;
    }

    /**
     * Adds a new item to the splmtryData list.
     * @see #getSplmtryData()
     * 
     */
    public NettingCutOffReferenceDataReportV02 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
