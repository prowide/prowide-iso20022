
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
 * Card used to represent a financial account for the purpose of payment settlement.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FinancialCard1", propOrder = {
    "cdtLmtAmt",
    "cdtAvlblAmt",
    "intrstRatePct"
})
public class FinancialCard1 {

    @XmlElement(name = "CdtLmtAmt")
    protected List<CurrencyAndAmount> cdtLmtAmt;
    @XmlElement(name = "CdtAvlblAmt")
    protected List<CurrencyAndAmount> cdtAvlblAmt;
    @XmlElement(name = "IntrstRatePct")
    protected BigDecimal intrstRatePct;

    /**
     * Gets the value of the cdtLmtAmt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cdtLmtAmt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCdtLmtAmt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CurrencyAndAmount }
     * 
     * 
     */
    public List<CurrencyAndAmount> getCdtLmtAmt() {
        if (cdtLmtAmt == null) {
            cdtLmtAmt = new ArrayList<CurrencyAndAmount>();
        }
        return this.cdtLmtAmt;
    }

    /**
     * Gets the value of the cdtAvlblAmt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cdtAvlblAmt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCdtAvlblAmt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CurrencyAndAmount }
     * 
     * 
     */
    public List<CurrencyAndAmount> getCdtAvlblAmt() {
        if (cdtAvlblAmt == null) {
            cdtAvlblAmt = new ArrayList<CurrencyAndAmount>();
        }
        return this.cdtAvlblAmt;
    }

    /**
     * Gets the value of the intrstRatePct property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getIntrstRatePct() {
        return intrstRatePct;
    }

    /**
     * Sets the value of the intrstRatePct property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public FinancialCard1 setIntrstRatePct(BigDecimal value) {
        this.intrstRatePct = value;
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
     * Adds a new item to the cdtLmtAmt list.
     * @see #getCdtLmtAmt()
     * 
     */
    public FinancialCard1 addCdtLmtAmt(CurrencyAndAmount cdtLmtAmt) {
        getCdtLmtAmt().add(cdtLmtAmt);
        return this;
    }

    /**
     * Adds a new item to the cdtAvlblAmt list.
     * @see #getCdtAvlblAmt()
     * 
     */
    public FinancialCard1 addCdtAvlblAmt(CurrencyAndAmount cdtAvlblAmt) {
        getCdtAvlblAmt().add(cdtAvlblAmt);
        return this;
    }

}
