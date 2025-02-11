
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
 * Scope
 * The CollateralAndExposureReport message is sent:
 * - either by the collateral giver, or its collateral manager, to the collateral taker, or its collateral manager, or
 * - or by the collateral taker, or its collateral manager to the collateral giver, or its collateral manager
 * 
 * The message definition is intended for use with the ISO20022 Business Application Header.
 * 
 * Usage
 * The CollateralAndExposureReport is used to provide the details of the valuation of the collateral, that is, the valuation of securities collateral, cash collateral or other type of collateral, posted at a specific calculation date.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CollateralAndExposureReportV03", propOrder = {
    "rptParams",
    "pgntn",
    "oblgtn",
    "agrmt",
    "collRpt",
    "splmtryData"
})
public class CollateralAndExposureReportV03 {

    @XmlElement(name = "RptParams", required = true)
    protected ReportParameters5 rptParams;
    @XmlElement(name = "Pgntn")
    protected Pagination pgntn;
    @XmlElement(name = "Oblgtn", required = true)
    protected Obligation4 oblgtn;
    @XmlElement(name = "Agrmt")
    protected Agreement4 agrmt;
    @XmlElement(name = "CollRpt", required = true)
    protected List<Collateral13> collRpt;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the rptParams property.
     * 
     * @return
     *     possible object is
     *     {@link ReportParameters5 }
     *     
     */
    public ReportParameters5 getRptParams() {
        return rptParams;
    }

    /**
     * Sets the value of the rptParams property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportParameters5 }
     *     
     */
    public CollateralAndExposureReportV03 setRptParams(ReportParameters5 value) {
        this.rptParams = value;
        return this;
    }

    /**
     * Gets the value of the pgntn property.
     * 
     * @return
     *     possible object is
     *     {@link Pagination }
     *     
     */
    public Pagination getPgntn() {
        return pgntn;
    }

    /**
     * Sets the value of the pgntn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Pagination }
     *     
     */
    public CollateralAndExposureReportV03 setPgntn(Pagination value) {
        this.pgntn = value;
        return this;
    }

    /**
     * Gets the value of the oblgtn property.
     * 
     * @return
     *     possible object is
     *     {@link Obligation4 }
     *     
     */
    public Obligation4 getOblgtn() {
        return oblgtn;
    }

    /**
     * Sets the value of the oblgtn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Obligation4 }
     *     
     */
    public CollateralAndExposureReportV03 setOblgtn(Obligation4 value) {
        this.oblgtn = value;
        return this;
    }

    /**
     * Gets the value of the agrmt property.
     * 
     * @return
     *     possible object is
     *     {@link Agreement4 }
     *     
     */
    public Agreement4 getAgrmt() {
        return agrmt;
    }

    /**
     * Sets the value of the agrmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Agreement4 }
     *     
     */
    public CollateralAndExposureReportV03 setAgrmt(Agreement4 value) {
        this.agrmt = value;
        return this;
    }

    /**
     * Gets the value of the collRpt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the collRpt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCollRpt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Collateral13 }
     * 
     * 
     * @return
     *     The value of the collRpt property.
     */
    public List<Collateral13> getCollRpt() {
        if (collRpt == null) {
            collRpt = new ArrayList<>();
        }
        return this.collRpt;
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
     * Adds a new item to the collRpt list.
     * @see #getCollRpt()
     * 
     */
    public CollateralAndExposureReportV03 addCollRpt(Collateral13 collRpt) {
        getCollRpt().add(collRpt);
        return this;
    }

    /**
     * Adds a new item to the splmtryData list.
     * @see #getSplmtryData()
     * 
     */
    public CollateralAndExposureReportV03 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
