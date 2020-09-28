
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
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
 * Detailed statistics on reconciliation.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DetailedReconciliationStatistics1", propOrder = {
    "ttlAccptd",
    "ttlNotSubmittdToRcncltn",
    "ttlSnglSddEEAUnprd",
    "ttlSnglSddEEAPaird",
    "ttlSnglSddEEAMtchd",
    "ttlDualSddNonMtchd",
    "ttlDualSddMtchd",
    "ttlSnglSddNonEEA",
    "topRsnsForPairdNonMtchd"
})
public class DetailedReconciliationStatistics1 {

    @XmlElement(name = "TtlAccptd", required = true)
    protected BigDecimal ttlAccptd;
    @XmlElement(name = "TtlNotSubmittdToRcncltn", required = true)
    protected BigDecimal ttlNotSubmittdToRcncltn;
    @XmlElement(name = "TtlSnglSddEEAUnprd", required = true)
    protected BigDecimal ttlSnglSddEEAUnprd;
    @XmlElement(name = "TtlSnglSddEEAPaird", required = true)
    protected BigDecimal ttlSnglSddEEAPaird;
    @XmlElement(name = "TtlSnglSddEEAMtchd", required = true)
    protected BigDecimal ttlSnglSddEEAMtchd;
    @XmlElement(name = "TtlDualSddNonMtchd", required = true)
    protected BigDecimal ttlDualSddNonMtchd;
    @XmlElement(name = "TtlDualSddMtchd", required = true)
    protected BigDecimal ttlDualSddMtchd;
    @XmlElement(name = "TtlSnglSddNonEEA", required = true)
    protected BigDecimal ttlSnglSddNonEEA;
    @XmlElement(name = "TopRsnsForPairdNonMtchd", required = true)
    protected List<String> topRsnsForPairdNonMtchd;

    /**
     * Gets the value of the ttlAccptd property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTtlAccptd() {
        return ttlAccptd;
    }

    /**
     * Sets the value of the ttlAccptd property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public DetailedReconciliationStatistics1 setTtlAccptd(BigDecimal value) {
        this.ttlAccptd = value;
        return this;
    }

    /**
     * Gets the value of the ttlNotSubmittdToRcncltn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTtlNotSubmittdToRcncltn() {
        return ttlNotSubmittdToRcncltn;
    }

    /**
     * Sets the value of the ttlNotSubmittdToRcncltn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public DetailedReconciliationStatistics1 setTtlNotSubmittdToRcncltn(BigDecimal value) {
        this.ttlNotSubmittdToRcncltn = value;
        return this;
    }

    /**
     * Gets the value of the ttlSnglSddEEAUnprd property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTtlSnglSddEEAUnprd() {
        return ttlSnglSddEEAUnprd;
    }

    /**
     * Sets the value of the ttlSnglSddEEAUnprd property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public DetailedReconciliationStatistics1 setTtlSnglSddEEAUnprd(BigDecimal value) {
        this.ttlSnglSddEEAUnprd = value;
        return this;
    }

    /**
     * Gets the value of the ttlSnglSddEEAPaird property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTtlSnglSddEEAPaird() {
        return ttlSnglSddEEAPaird;
    }

    /**
     * Sets the value of the ttlSnglSddEEAPaird property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public DetailedReconciliationStatistics1 setTtlSnglSddEEAPaird(BigDecimal value) {
        this.ttlSnglSddEEAPaird = value;
        return this;
    }

    /**
     * Gets the value of the ttlSnglSddEEAMtchd property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTtlSnglSddEEAMtchd() {
        return ttlSnglSddEEAMtchd;
    }

    /**
     * Sets the value of the ttlSnglSddEEAMtchd property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public DetailedReconciliationStatistics1 setTtlSnglSddEEAMtchd(BigDecimal value) {
        this.ttlSnglSddEEAMtchd = value;
        return this;
    }

    /**
     * Gets the value of the ttlDualSddNonMtchd property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTtlDualSddNonMtchd() {
        return ttlDualSddNonMtchd;
    }

    /**
     * Sets the value of the ttlDualSddNonMtchd property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public DetailedReconciliationStatistics1 setTtlDualSddNonMtchd(BigDecimal value) {
        this.ttlDualSddNonMtchd = value;
        return this;
    }

    /**
     * Gets the value of the ttlDualSddMtchd property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTtlDualSddMtchd() {
        return ttlDualSddMtchd;
    }

    /**
     * Sets the value of the ttlDualSddMtchd property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public DetailedReconciliationStatistics1 setTtlDualSddMtchd(BigDecimal value) {
        this.ttlDualSddMtchd = value;
        return this;
    }

    /**
     * Gets the value of the ttlSnglSddNonEEA property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTtlSnglSddNonEEA() {
        return ttlSnglSddNonEEA;
    }

    /**
     * Sets the value of the ttlSnglSddNonEEA property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public DetailedReconciliationStatistics1 setTtlSnglSddNonEEA(BigDecimal value) {
        this.ttlSnglSddNonEEA = value;
        return this;
    }

    /**
     * Gets the value of the topRsnsForPairdNonMtchd property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the topRsnsForPairdNonMtchd property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTopRsnsForPairdNonMtchd().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getTopRsnsForPairdNonMtchd() {
        if (topRsnsForPairdNonMtchd == null) {
            topRsnsForPairdNonMtchd = new ArrayList<String>();
        }
        return this.topRsnsForPairdNonMtchd;
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
     * Adds a new item to the topRsnsForPairdNonMtchd list.
     * @see #getTopRsnsForPairdNonMtchd()
     * 
     */
    public DetailedReconciliationStatistics1 addTopRsnsForPairdNonMtchd(String topRsnsForPairdNonMtchd) {
        getTopRsnsForPairdNonMtchd().add(topRsnsForPairdNonMtchd);
        return this;
    }

}
