
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
 * The CCPLiquidityStressTestingResultReport message is sent from the central counterparty to the national competent authority. It is used to inform the national competent authority about the results of the liquidity stress tests.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CCPLiquidityStressTestingResultReportV01", propOrder = {
    "lqdtyStrssTstRslt",
    "splmtryData"
})
public class CCPLiquidityStressTestingResultReportV01 {

    @XmlElement(name = "LqdtyStrssTstRslt", required = true)
    protected List<LiquidityStressTestResult1> lqdtyStrssTstRslt;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the lqdtyStrssTstRslt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lqdtyStrssTstRslt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLqdtyStrssTstRslt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LiquidityStressTestResult1 }
     * 
     * 
     */
    public List<LiquidityStressTestResult1> getLqdtyStrssTstRslt() {
        if (lqdtyStrssTstRslt == null) {
            lqdtyStrssTstRslt = new ArrayList<LiquidityStressTestResult1>();
        }
        return this.lqdtyStrssTstRslt;
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
     * Adds a new item to the lqdtyStrssTstRslt list.
     * @see #getLqdtyStrssTstRslt()
     * 
     */
    public CCPLiquidityStressTestingResultReportV01 addLqdtyStrssTstRslt(LiquidityStressTestResult1 lqdtyStrssTstRslt) {
        getLqdtyStrssTstRslt().add(lqdtyStrssTstRslt);
        return this;
    }

    /**
     * Adds a new item to the splmtryData list.
     * @see #getSplmtryData()
     * 
     */
    public CCPLiquidityStressTestingResultReportV01 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
