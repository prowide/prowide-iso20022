
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
 * Limit of amounts for the customer.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ATMTransactionAmounts8", propOrder = {
    "ccy",
    "maxPssblAmt",
    "minPssblAmt",
    "addtlAmt",
    "dpstLmts"
})
public class ATMTransactionAmounts8 {

    @XmlElement(name = "Ccy")
    protected String ccy;
    @XmlElement(name = "MaxPssblAmt")
    protected BigDecimal maxPssblAmt;
    @XmlElement(name = "MinPssblAmt")
    protected BigDecimal minPssblAmt;
    @XmlElement(name = "AddtlAmt")
    protected List<ATMTransactionAmounts7> addtlAmt;
    @XmlElement(name = "DpstLmts")
    protected List<ATMTransactionAmounts9> dpstLmts;

    /**
     * Gets the value of the ccy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCcy() {
        return ccy;
    }

    /**
     * Sets the value of the ccy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ATMTransactionAmounts8 setCcy(String value) {
        this.ccy = value;
        return this;
    }

    /**
     * Gets the value of the maxPssblAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaxPssblAmt() {
        return maxPssblAmt;
    }

    /**
     * Sets the value of the maxPssblAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public ATMTransactionAmounts8 setMaxPssblAmt(BigDecimal value) {
        this.maxPssblAmt = value;
        return this;
    }

    /**
     * Gets the value of the minPssblAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMinPssblAmt() {
        return minPssblAmt;
    }

    /**
     * Sets the value of the minPssblAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public ATMTransactionAmounts8 setMinPssblAmt(BigDecimal value) {
        this.minPssblAmt = value;
        return this;
    }

    /**
     * Gets the value of the addtlAmt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the addtlAmt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddtlAmt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ATMTransactionAmounts7 }
     * 
     * 
     * @return
     *     The value of the addtlAmt property.
     */
    public List<ATMTransactionAmounts7> getAddtlAmt() {
        if (addtlAmt == null) {
            addtlAmt = new ArrayList<>();
        }
        return this.addtlAmt;
    }

    /**
     * Gets the value of the dpstLmts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the dpstLmts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDpstLmts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ATMTransactionAmounts9 }
     * 
     * 
     * @return
     *     The value of the dpstLmts property.
     */
    public List<ATMTransactionAmounts9> getDpstLmts() {
        if (dpstLmts == null) {
            dpstLmts = new ArrayList<>();
        }
        return this.dpstLmts;
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
     * Adds a new item to the addtlAmt list.
     * @see #getAddtlAmt()
     * 
     */
    public ATMTransactionAmounts8 addAddtlAmt(ATMTransactionAmounts7 addtlAmt) {
        getAddtlAmt().add(addtlAmt);
        return this;
    }

    /**
     * Adds a new item to the dpstLmts list.
     * @see #getDpstLmts()
     * 
     */
    public ATMTransactionAmounts8 addDpstLmts(ATMTransactionAmounts9 dpstLmts) {
        getDpstLmts().add(dpstLmts);
        return this;
    }

}
