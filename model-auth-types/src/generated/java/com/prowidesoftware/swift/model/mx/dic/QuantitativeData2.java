
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Provides the details of each money market fund quantitative information.
 * 
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QuantitativeData2", propOrder = {
    "prtflPrfrmnc",
    "strssTst",
    "asstInf",
    "lbltyInf",
    "lwVoltlyNetAsstValRptData"
})
public class QuantitativeData2 {

    @XmlElement(name = "PrtflPrfrmnc", required = true)
    protected PerformanceFactors2 prtflPrfrmnc;
    @XmlElement(name = "StrssTst")
    protected StressTestReport1 strssTst;
    @XmlElement(name = "AsstInf", required = true)
    protected HoldingAsset2 asstInf;
    @XmlElement(name = "LbltyInf", required = true)
    protected LiabilityDetails2 lbltyInf;
    @XmlElement(name = "LwVoltlyNetAsstValRptData")
    protected LowVolatilityNetAssetValueReportData1 lwVoltlyNetAsstValRptData;

    /**
     * Gets the value of the prtflPrfrmnc property.
     * 
     * @return
     *     possible object is
     *     {@link PerformanceFactors2 }
     *     
     */
    public PerformanceFactors2 getPrtflPrfrmnc() {
        return prtflPrfrmnc;
    }

    /**
     * Sets the value of the prtflPrfrmnc property.
     * 
     * @param value
     *     allowed object is
     *     {@link PerformanceFactors2 }
     *     
     */
    public QuantitativeData2 setPrtflPrfrmnc(PerformanceFactors2 value) {
        this.prtflPrfrmnc = value;
        return this;
    }

    /**
     * Gets the value of the strssTst property.
     * 
     * @return
     *     possible object is
     *     {@link StressTestReport1 }
     *     
     */
    public StressTestReport1 getStrssTst() {
        return strssTst;
    }

    /**
     * Sets the value of the strssTst property.
     * 
     * @param value
     *     allowed object is
     *     {@link StressTestReport1 }
     *     
     */
    public QuantitativeData2 setStrssTst(StressTestReport1 value) {
        this.strssTst = value;
        return this;
    }

    /**
     * Gets the value of the asstInf property.
     * 
     * @return
     *     possible object is
     *     {@link HoldingAsset2 }
     *     
     */
    public HoldingAsset2 getAsstInf() {
        return asstInf;
    }

    /**
     * Sets the value of the asstInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link HoldingAsset2 }
     *     
     */
    public QuantitativeData2 setAsstInf(HoldingAsset2 value) {
        this.asstInf = value;
        return this;
    }

    /**
     * Gets the value of the lbltyInf property.
     * 
     * @return
     *     possible object is
     *     {@link LiabilityDetails2 }
     *     
     */
    public LiabilityDetails2 getLbltyInf() {
        return lbltyInf;
    }

    /**
     * Sets the value of the lbltyInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link LiabilityDetails2 }
     *     
     */
    public QuantitativeData2 setLbltyInf(LiabilityDetails2 value) {
        this.lbltyInf = value;
        return this;
    }

    /**
     * Gets the value of the lwVoltlyNetAsstValRptData property.
     * 
     * @return
     *     possible object is
     *     {@link LowVolatilityNetAssetValueReportData1 }
     *     
     */
    public LowVolatilityNetAssetValueReportData1 getLwVoltlyNetAsstValRptData() {
        return lwVoltlyNetAsstValRptData;
    }

    /**
     * Sets the value of the lwVoltlyNetAsstValRptData property.
     * 
     * @param value
     *     allowed object is
     *     {@link LowVolatilityNetAssetValueReportData1 }
     *     
     */
    public QuantitativeData2 setLwVoltlyNetAsstValRptData(LowVolatilityNetAssetValueReportData1 value) {
        this.lwVoltlyNetAsstValRptData = value;
        return this;
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

}
