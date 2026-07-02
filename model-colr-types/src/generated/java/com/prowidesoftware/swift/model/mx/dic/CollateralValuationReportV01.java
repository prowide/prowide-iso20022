
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
 * Scope
 * This message is sent:
 * - either by the collateral giver, or its collateral manager, to the collateral taker, or its collateral manager, or
 * - or by the collateral taker, or its collateral manager to the collateral giver, or its collateral manager
 * It is used to provide the details of the valuation of the collateral that is posted as at a specific calculation date.
 * The ISO 20022 Business Application Header must be used
 * Usage
 * The CollateralValuationReport is used to provide the details of the valuation of the collateral that is posted as at a specific calculation date.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CollateralValuationReportV01", propOrder = {
    "rptParams",
    "pgntn",
    "agrmt",
    "ptyA",
    "svcgPtyA",
    "ptyB",
    "svcgPtyB",
    "collRptDtls",
    "splmtryData"
})
public class CollateralValuationReportV01 {

    @XmlElement(name = "RptParams", required = true)
    protected ReportParameters2 rptParams;
    @XmlElement(name = "Pgntn")
    protected Pagination pgntn;
    @XmlElement(name = "Agrmt")
    protected Agreement2 agrmt;
    @XmlElement(name = "PtyA", required = true)
    protected PartyIdentification33Choice ptyA;
    @XmlElement(name = "SvcgPtyA")
    protected PartyIdentification33Choice svcgPtyA;
    @XmlElement(name = "PtyB", required = true)
    protected PartyIdentification33Choice ptyB;
    @XmlElement(name = "SvcgPtyB")
    protected PartyIdentification33Choice svcgPtyB;
    @XmlElement(name = "CollRptDtls", required = true)
    protected List<Collateral5> collRptDtls;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the rptParams property.
     * 
     * @return
     *     possible object is
     *     {@link ReportParameters2 }
     *     
     */
    public ReportParameters2 getRptParams() {
        return rptParams;
    }

    /**
     * Sets the value of the rptParams property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportParameters2 }
     *     
     */
    public CollateralValuationReportV01 setRptParams(ReportParameters2 value) {
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
    public CollateralValuationReportV01 setPgntn(Pagination value) {
        this.pgntn = value;
        return this;
    }

    /**
     * Gets the value of the agrmt property.
     * 
     * @return
     *     possible object is
     *     {@link Agreement2 }
     *     
     */
    public Agreement2 getAgrmt() {
        return agrmt;
    }

    /**
     * Sets the value of the agrmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Agreement2 }
     *     
     */
    public CollateralValuationReportV01 setAgrmt(Agreement2 value) {
        this.agrmt = value;
        return this;
    }

    /**
     * Gets the value of the ptyA property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification33Choice }
     *     
     */
    public PartyIdentification33Choice getPtyA() {
        return ptyA;
    }

    /**
     * Sets the value of the ptyA property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification33Choice }
     *     
     */
    public CollateralValuationReportV01 setPtyA(PartyIdentification33Choice value) {
        this.ptyA = value;
        return this;
    }

    /**
     * Gets the value of the svcgPtyA property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification33Choice }
     *     
     */
    public PartyIdentification33Choice getSvcgPtyA() {
        return svcgPtyA;
    }

    /**
     * Sets the value of the svcgPtyA property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification33Choice }
     *     
     */
    public CollateralValuationReportV01 setSvcgPtyA(PartyIdentification33Choice value) {
        this.svcgPtyA = value;
        return this;
    }

    /**
     * Gets the value of the ptyB property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification33Choice }
     *     
     */
    public PartyIdentification33Choice getPtyB() {
        return ptyB;
    }

    /**
     * Sets the value of the ptyB property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification33Choice }
     *     
     */
    public CollateralValuationReportV01 setPtyB(PartyIdentification33Choice value) {
        this.ptyB = value;
        return this;
    }

    /**
     * Gets the value of the svcgPtyB property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification33Choice }
     *     
     */
    public PartyIdentification33Choice getSvcgPtyB() {
        return svcgPtyB;
    }

    /**
     * Sets the value of the svcgPtyB property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification33Choice }
     *     
     */
    public CollateralValuationReportV01 setSvcgPtyB(PartyIdentification33Choice value) {
        this.svcgPtyB = value;
        return this;
    }

    /**
     * Gets the value of the collRptDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the collRptDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCollRptDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Collateral5 }
     * 
     * 
     */
    public List<Collateral5> getCollRptDtls() {
        if (collRptDtls == null) {
            collRptDtls = new ArrayList<Collateral5>();
        }
        return this.collRptDtls;
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
     * Adds a new item to the collRptDtls list.
     * @see #getCollRptDtls()
     * 
     */
    public CollateralValuationReportV01 addCollRptDtls(Collateral5 collRptDtls) {
        getCollRptDtls().add(collRptDtls);
        return this;
    }

    /**
     * Adds a new item to the splmtryData list.
     * @see #getSplmtryData()
     * 
     */
    public CollateralValuationReportV01 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
