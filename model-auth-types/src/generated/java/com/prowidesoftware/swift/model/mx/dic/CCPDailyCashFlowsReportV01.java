
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
 * The CCPDailyCashFlowsReport message is sent from the central counterparty to the national competent authority. It is used to inform the national competent authority of the operational performance and exposures that occurred in a central counterparty payment system.
 * 
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CCPDailyCashFlowsReportV01", propOrder = {
    "cncntrtnAgt",
    "sttlmAgt",
    "splmtryData"
})
public class CCPDailyCashFlowsReportV01 {

    @XmlElement(name = "CncntrtnAgt", required = true)
    protected List<ConcentrationAgent1> cncntrtnAgt;
    @XmlElement(name = "SttlmAgt", required = true)
    protected List<SettlementAgent1> sttlmAgt;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the cncntrtnAgt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cncntrtnAgt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCncntrtnAgt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConcentrationAgent1 }
     * 
     * 
     */
    public List<ConcentrationAgent1> getCncntrtnAgt() {
        if (cncntrtnAgt == null) {
            cncntrtnAgt = new ArrayList<ConcentrationAgent1>();
        }
        return this.cncntrtnAgt;
    }

    /**
     * Gets the value of the sttlmAgt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sttlmAgt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSttlmAgt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SettlementAgent1 }
     * 
     * 
     */
    public List<SettlementAgent1> getSttlmAgt() {
        if (sttlmAgt == null) {
            sttlmAgt = new ArrayList<SettlementAgent1>();
        }
        return this.sttlmAgt;
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
     * Adds a new item to the cncntrtnAgt list.
     * @see #getCncntrtnAgt()
     * 
     */
    public CCPDailyCashFlowsReportV01 addCncntrtnAgt(ConcentrationAgent1 cncntrtnAgt) {
        getCncntrtnAgt().add(cncntrtnAgt);
        return this;
    }

    /**
     * Adds a new item to the sttlmAgt list.
     * @see #getSttlmAgt()
     * 
     */
    public CCPDailyCashFlowsReportV01 addSttlmAgt(SettlementAgent1 sttlmAgt) {
        getSttlmAgt().add(sttlmAgt);
        return this;
    }

    /**
     * Adds a new item to the splmtryData list.
     * @see #getSplmtryData()
     * 
     */
    public CCPDailyCashFlowsReportV01 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
