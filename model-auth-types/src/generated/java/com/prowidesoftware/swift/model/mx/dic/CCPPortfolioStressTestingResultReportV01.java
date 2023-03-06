
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
 * The CCPPortfolioStressTestingResultReport message is sent from the central counterparty to the national competent authority. It is used to inform the national competent authority about the results of the stress testing carried out by the central counterparty on clearing member positions.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CCPPortfolioStressTestingResultReportV01", propOrder = {
    "scnroStrssTstRslt",
    "splmtryData"
})
public class CCPPortfolioStressTestingResultReportV01 {

    @XmlElement(name = "ScnroStrssTstRslt", required = true)
    protected List<ScenarioStressTestResult1> scnroStrssTstRslt;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the scnroStrssTstRslt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the scnroStrssTstRslt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getScnroStrssTstRslt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ScenarioStressTestResult1 }
     * 
     * 
     */
    public List<ScenarioStressTestResult1> getScnroStrssTstRslt() {
        if (scnroStrssTstRslt == null) {
            scnroStrssTstRslt = new ArrayList<ScenarioStressTestResult1>();
        }
        return this.scnroStrssTstRslt;
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
     * Adds a new item to the scnroStrssTstRslt list.
     * @see #getScnroStrssTstRslt()
     * 
     */
    public CCPPortfolioStressTestingResultReportV01 addScnroStrssTstRslt(ScenarioStressTestResult1 scnroStrssTstRslt) {
        getScnroStrssTstRslt().add(scnroStrssTstRslt);
        return this;
    }

    /**
     * Adds a new item to the splmtryData list.
     * @see #getSplmtryData()
     * 
     */
    public CCPPortfolioStressTestingResultReportV01 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
