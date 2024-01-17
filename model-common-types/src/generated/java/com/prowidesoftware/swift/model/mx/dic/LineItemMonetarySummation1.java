
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
 * Trade settlement monetary summation specified for this supply chain trade settlement.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LineItemMonetarySummation1", propOrder = {
    "lineTtlAmt",
    "allwncTtlAmt",
    "chrgTtlAmt",
    "taxTtlAmt",
    "taxBsisTtlAmt",
    "infAmt"
})
public class LineItemMonetarySummation1 {

    @XmlElement(name = "LineTtlAmt")
    protected List<CurrencyAndAmount> lineTtlAmt;
    @XmlElement(name = "AllwncTtlAmt")
    protected List<CurrencyAndAmount> allwncTtlAmt;
    @XmlElement(name = "ChrgTtlAmt")
    protected List<CurrencyAndAmount> chrgTtlAmt;
    @XmlElement(name = "TaxTtlAmt")
    protected List<CurrencyAndAmount> taxTtlAmt;
    @XmlElement(name = "TaxBsisTtlAmt")
    protected List<CurrencyAndAmount> taxBsisTtlAmt;
    @XmlElement(name = "InfAmt")
    protected List<CurrencyAndAmount> infAmt;

    /**
     * Gets the value of the lineTtlAmt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the lineTtlAmt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLineTtlAmt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CurrencyAndAmount }
     * 
     * 
     * @return
     *     The value of the lineTtlAmt property.
     */
    public List<CurrencyAndAmount> getLineTtlAmt() {
        if (lineTtlAmt == null) {
            lineTtlAmt = new ArrayList<>();
        }
        return this.lineTtlAmt;
    }

    /**
     * Gets the value of the allwncTtlAmt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the allwncTtlAmt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAllwncTtlAmt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CurrencyAndAmount }
     * 
     * 
     * @return
     *     The value of the allwncTtlAmt property.
     */
    public List<CurrencyAndAmount> getAllwncTtlAmt() {
        if (allwncTtlAmt == null) {
            allwncTtlAmt = new ArrayList<>();
        }
        return this.allwncTtlAmt;
    }

    /**
     * Gets the value of the chrgTtlAmt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the chrgTtlAmt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChrgTtlAmt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CurrencyAndAmount }
     * 
     * 
     * @return
     *     The value of the chrgTtlAmt property.
     */
    public List<CurrencyAndAmount> getChrgTtlAmt() {
        if (chrgTtlAmt == null) {
            chrgTtlAmt = new ArrayList<>();
        }
        return this.chrgTtlAmt;
    }

    /**
     * Gets the value of the taxTtlAmt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the taxTtlAmt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTaxTtlAmt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CurrencyAndAmount }
     * 
     * 
     * @return
     *     The value of the taxTtlAmt property.
     */
    public List<CurrencyAndAmount> getTaxTtlAmt() {
        if (taxTtlAmt == null) {
            taxTtlAmt = new ArrayList<>();
        }
        return this.taxTtlAmt;
    }

    /**
     * Gets the value of the taxBsisTtlAmt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the taxBsisTtlAmt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTaxBsisTtlAmt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CurrencyAndAmount }
     * 
     * 
     * @return
     *     The value of the taxBsisTtlAmt property.
     */
    public List<CurrencyAndAmount> getTaxBsisTtlAmt() {
        if (taxBsisTtlAmt == null) {
            taxBsisTtlAmt = new ArrayList<>();
        }
        return this.taxBsisTtlAmt;
    }

    /**
     * Gets the value of the infAmt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the infAmt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInfAmt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CurrencyAndAmount }
     * 
     * 
     * @return
     *     The value of the infAmt property.
     */
    public List<CurrencyAndAmount> getInfAmt() {
        if (infAmt == null) {
            infAmt = new ArrayList<>();
        }
        return this.infAmt;
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
     * Adds a new item to the lineTtlAmt list.
     * @see #getLineTtlAmt()
     * 
     */
    public LineItemMonetarySummation1 addLineTtlAmt(CurrencyAndAmount lineTtlAmt) {
        getLineTtlAmt().add(lineTtlAmt);
        return this;
    }

    /**
     * Adds a new item to the allwncTtlAmt list.
     * @see #getAllwncTtlAmt()
     * 
     */
    public LineItemMonetarySummation1 addAllwncTtlAmt(CurrencyAndAmount allwncTtlAmt) {
        getAllwncTtlAmt().add(allwncTtlAmt);
        return this;
    }

    /**
     * Adds a new item to the chrgTtlAmt list.
     * @see #getChrgTtlAmt()
     * 
     */
    public LineItemMonetarySummation1 addChrgTtlAmt(CurrencyAndAmount chrgTtlAmt) {
        getChrgTtlAmt().add(chrgTtlAmt);
        return this;
    }

    /**
     * Adds a new item to the taxTtlAmt list.
     * @see #getTaxTtlAmt()
     * 
     */
    public LineItemMonetarySummation1 addTaxTtlAmt(CurrencyAndAmount taxTtlAmt) {
        getTaxTtlAmt().add(taxTtlAmt);
        return this;
    }

    /**
     * Adds a new item to the taxBsisTtlAmt list.
     * @see #getTaxBsisTtlAmt()
     * 
     */
    public LineItemMonetarySummation1 addTaxBsisTtlAmt(CurrencyAndAmount taxBsisTtlAmt) {
        getTaxBsisTtlAmt().add(taxBsisTtlAmt);
        return this;
    }

    /**
     * Adds a new item to the infAmt list.
     * @see #getInfAmt()
     * 
     */
    public LineItemMonetarySummation1 addInfAmt(CurrencyAndAmount infAmt) {
        getInfAmt().add(infAmt);
        return this;
    }

}
