
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
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
 * Specifies the subtotal calculated tax applicable for this settlement.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SettlementSubTotalCalculatedTax1", propOrder = {
    "tpCd",
    "ctgyCd",
    "clctdAmt",
    "bsisAmt",
    "clctdRate",
    "xmptnRsn"
})
public class SettlementSubTotalCalculatedTax1 {

    @XmlElement(name = "TpCd")
    protected String tpCd;
    @XmlElement(name = "CtgyCd")
    protected String ctgyCd;
    @XmlElement(name = "ClctdAmt")
    protected List<CurrencyAndAmount> clctdAmt;
    @XmlElement(name = "BsisAmt")
    protected List<CurrencyAndAmount> bsisAmt;
    @XmlElement(name = "ClctdRate")
    protected BigDecimal clctdRate;
    @XmlElement(name = "XmptnRsn")
    protected TaxExemptionReason1 xmptnRsn;

    /**
     * Gets the value of the tpCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTpCd() {
        return tpCd;
    }

    /**
     * Sets the value of the tpCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SettlementSubTotalCalculatedTax1 setTpCd(String value) {
        this.tpCd = value;
        return this;
    }

    /**
     * Gets the value of the ctgyCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCtgyCd() {
        return ctgyCd;
    }

    /**
     * Sets the value of the ctgyCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SettlementSubTotalCalculatedTax1 setCtgyCd(String value) {
        this.ctgyCd = value;
        return this;
    }

    /**
     * Gets the value of the clctdAmt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the clctdAmt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClctdAmt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CurrencyAndAmount }
     * 
     * 
     * @return
     *     The value of the clctdAmt property.
     */
    public List<CurrencyAndAmount> getClctdAmt() {
        if (clctdAmt == null) {
            clctdAmt = new ArrayList<>();
        }
        return this.clctdAmt;
    }

    /**
     * Gets the value of the bsisAmt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the bsisAmt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBsisAmt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CurrencyAndAmount }
     * 
     * 
     * @return
     *     The value of the bsisAmt property.
     */
    public List<CurrencyAndAmount> getBsisAmt() {
        if (bsisAmt == null) {
            bsisAmt = new ArrayList<>();
        }
        return this.bsisAmt;
    }

    /**
     * Gets the value of the clctdRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getClctdRate() {
        return clctdRate;
    }

    /**
     * Sets the value of the clctdRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public SettlementSubTotalCalculatedTax1 setClctdRate(BigDecimal value) {
        this.clctdRate = value;
        return this;
    }

    /**
     * Gets the value of the xmptnRsn property.
     * 
     * @return
     *     possible object is
     *     {@link TaxExemptionReason1 }
     *     
     */
    public TaxExemptionReason1 getXmptnRsn() {
        return xmptnRsn;
    }

    /**
     * Sets the value of the xmptnRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxExemptionReason1 }
     *     
     */
    public SettlementSubTotalCalculatedTax1 setXmptnRsn(TaxExemptionReason1 value) {
        this.xmptnRsn = value;
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

    /**
     * Adds a new item to the clctdAmt list.
     * @see #getClctdAmt()
     * 
     */
    public SettlementSubTotalCalculatedTax1 addClctdAmt(CurrencyAndAmount clctdAmt) {
        getClctdAmt().add(clctdAmt);
        return this;
    }

    /**
     * Adds a new item to the bsisAmt list.
     * @see #getBsisAmt()
     * 
     */
    public SettlementSubTotalCalculatedTax1 addBsisAmt(CurrencyAndAmount bsisAmt) {
        getBsisAmt().add(bsisAmt);
        return this;
    }

}
