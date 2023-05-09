
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateAdapter;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Amount of money due to the government or tax authority, according to various pre-defined parameters such as thresholds or income.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LineItemTax1", propOrder = {
    "clctdAmt",
    "tpCd",
    "taxPtDt",
    "clctdRate",
    "ctgyCd",
    "ctgyNm"
})
public class LineItemTax1 {

    @XmlElement(name = "ClctdAmt")
    protected List<CurrencyAndAmount> clctdAmt;
    @XmlElement(name = "TpCd")
    protected TaxTypeFormat1Choice tpCd;
    @XmlElement(name = "TaxPtDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate taxPtDt;
    @XmlElement(name = "ClctdRate")
    protected BigDecimal clctdRate;
    @XmlElement(name = "CtgyCd")
    protected String ctgyCd;
    @XmlElement(name = "CtgyNm")
    protected List<String> ctgyNm;

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
     * Gets the value of the tpCd property.
     * 
     * @return
     *     possible object is
     *     {@link TaxTypeFormat1Choice }
     *     
     */
    public TaxTypeFormat1Choice getTpCd() {
        return tpCd;
    }

    /**
     * Sets the value of the tpCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxTypeFormat1Choice }
     *     
     */
    public LineItemTax1 setTpCd(TaxTypeFormat1Choice value) {
        this.tpCd = value;
        return this;
    }

    /**
     * Gets the value of the taxPtDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getTaxPtDt() {
        return taxPtDt;
    }

    /**
     * Sets the value of the taxPtDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public LineItemTax1 setTaxPtDt(LocalDate value) {
        this.taxPtDt = value;
        return this;
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
    public LineItemTax1 setClctdRate(BigDecimal value) {
        this.clctdRate = value;
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
    public LineItemTax1 setCtgyCd(String value) {
        this.ctgyCd = value;
        return this;
    }

    /**
     * Gets the value of the ctgyNm property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the ctgyNm property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCtgyNm().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     * @return
     *     The value of the ctgyNm property.
     */
    public List<String> getCtgyNm() {
        if (ctgyNm == null) {
            ctgyNm = new ArrayList<>();
        }
        return this.ctgyNm;
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
    public LineItemTax1 addClctdAmt(CurrencyAndAmount clctdAmt) {
        getClctdAmt().add(clctdAmt);
        return this;
    }

    /**
     * Adds a new item to the ctgyNm list.
     * @see #getCtgyNm()
     * 
     */
    public LineItemTax1 addCtgyNm(String ctgyNm) {
        getCtgyNm().add(ctgyNm);
        return this;
    }

}
