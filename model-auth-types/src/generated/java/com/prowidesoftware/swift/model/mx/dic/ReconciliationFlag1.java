
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Specifies the process type used for the trade repository reconciliation.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReconciliationFlag1", propOrder = {
    "rptTp",
    "bothCtrPtiesRptg",
    "pairdSts",
    "lnRcncltnSts",
    "collRcncltnSts",
    "modSts"
})
public class ReconciliationFlag1 {

    @XmlElement(name = "RptTp")
    @XmlSchemaType(name = "string")
    protected TradeRepositoryReportingType1Code rptTp;
    @XmlElement(name = "BothCtrPtiesRptg")
    protected Boolean bothCtrPtiesRptg;
    @XmlElement(name = "PairdSts")
    protected Boolean pairdSts;
    @XmlElement(name = "LnRcncltnSts")
    protected Boolean lnRcncltnSts;
    @XmlElement(name = "CollRcncltnSts")
    protected Boolean collRcncltnSts;
    @XmlElement(name = "ModSts")
    protected Boolean modSts;

    /**
     * Gets the value of the rptTp property.
     * 
     * @return
     *     possible object is
     *     {@link TradeRepositoryReportingType1Code }
     *     
     */
    public TradeRepositoryReportingType1Code getRptTp() {
        return rptTp;
    }

    /**
     * Sets the value of the rptTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeRepositoryReportingType1Code }
     *     
     */
    public ReconciliationFlag1 setRptTp(TradeRepositoryReportingType1Code value) {
        this.rptTp = value;
        return this;
    }

    /**
     * Gets the value of the bothCtrPtiesRptg property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBothCtrPtiesRptg() {
        return bothCtrPtiesRptg;
    }

    /**
     * Sets the value of the bothCtrPtiesRptg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public ReconciliationFlag1 setBothCtrPtiesRptg(Boolean value) {
        this.bothCtrPtiesRptg = value;
        return this;
    }

    /**
     * Gets the value of the pairdSts property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPairdSts() {
        return pairdSts;
    }

    /**
     * Sets the value of the pairdSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public ReconciliationFlag1 setPairdSts(Boolean value) {
        this.pairdSts = value;
        return this;
    }

    /**
     * Gets the value of the lnRcncltnSts property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLnRcncltnSts() {
        return lnRcncltnSts;
    }

    /**
     * Sets the value of the lnRcncltnSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public ReconciliationFlag1 setLnRcncltnSts(Boolean value) {
        this.lnRcncltnSts = value;
        return this;
    }

    /**
     * Gets the value of the collRcncltnSts property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCollRcncltnSts() {
        return collRcncltnSts;
    }

    /**
     * Sets the value of the collRcncltnSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public ReconciliationFlag1 setCollRcncltnSts(Boolean value) {
        this.collRcncltnSts = value;
        return this;
    }

    /**
     * Gets the value of the modSts property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isModSts() {
        return modSts;
    }

    /**
     * Sets the value of the modSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public ReconciliationFlag1 setModSts(Boolean value) {
        this.modSts = value;
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
