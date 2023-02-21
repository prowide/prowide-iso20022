
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
 * Specifies a collection of monetary totals for this settlement.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SettlementMonetarySummation1", propOrder = {
    "lineTtlAmt",
    "allwncTtlAmt",
    "ttlDscntAmt",
    "chrgTtlAmt",
    "ttlPrepdAmt",
    "taxTtlAmt",
    "taxBsisAmt",
    "rndgAmt",
    "grdTtlAmt",
    "infAmt"
})
public class SettlementMonetarySummation1 {

    @XmlElement(name = "LineTtlAmt")
    protected List<CurrencyAndAmount> lineTtlAmt;
    @XmlElement(name = "AllwncTtlAmt")
    protected List<CurrencyAndAmount> allwncTtlAmt;
    @XmlElement(name = "TtlDscntAmt")
    protected List<CurrencyAndAmount> ttlDscntAmt;
    @XmlElement(name = "ChrgTtlAmt")
    protected List<CurrencyAndAmount> chrgTtlAmt;
    @XmlElement(name = "TtlPrepdAmt")
    protected List<CurrencyAndAmount> ttlPrepdAmt;
    @XmlElement(name = "TaxTtlAmt")
    protected List<CurrencyAndAmount> taxTtlAmt;
    @XmlElement(name = "TaxBsisAmt")
    protected List<CurrencyAndAmount> taxBsisAmt;
    @XmlElement(name = "RndgAmt")
    protected List<CurrencyAndAmount> rndgAmt;
    @XmlElement(name = "GrdTtlAmt")
    protected List<CurrencyAndAmount> grdTtlAmt;
    @XmlElement(name = "InfAmt")
    protected List<CurrencyAndAmount> infAmt;

    /**
     * Gets the value of the lineTtlAmt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lineTtlAmt property.
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
     */
    public List<CurrencyAndAmount> getLineTtlAmt() {
        if (lineTtlAmt == null) {
            lineTtlAmt = new ArrayList<CurrencyAndAmount>();
        }
        return this.lineTtlAmt;
    }

    /**
     * Gets the value of the allwncTtlAmt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the allwncTtlAmt property.
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
     */
    public List<CurrencyAndAmount> getAllwncTtlAmt() {
        if (allwncTtlAmt == null) {
            allwncTtlAmt = new ArrayList<CurrencyAndAmount>();
        }
        return this.allwncTtlAmt;
    }

    /**
     * Gets the value of the ttlDscntAmt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ttlDscntAmt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTtlDscntAmt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CurrencyAndAmount }
     * 
     * 
     */
    public List<CurrencyAndAmount> getTtlDscntAmt() {
        if (ttlDscntAmt == null) {
            ttlDscntAmt = new ArrayList<CurrencyAndAmount>();
        }
        return this.ttlDscntAmt;
    }

    /**
     * Gets the value of the chrgTtlAmt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the chrgTtlAmt property.
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
     */
    public List<CurrencyAndAmount> getChrgTtlAmt() {
        if (chrgTtlAmt == null) {
            chrgTtlAmt = new ArrayList<CurrencyAndAmount>();
        }
        return this.chrgTtlAmt;
    }

    /**
     * Gets the value of the ttlPrepdAmt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ttlPrepdAmt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTtlPrepdAmt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CurrencyAndAmount }
     * 
     * 
     */
    public List<CurrencyAndAmount> getTtlPrepdAmt() {
        if (ttlPrepdAmt == null) {
            ttlPrepdAmt = new ArrayList<CurrencyAndAmount>();
        }
        return this.ttlPrepdAmt;
    }

    /**
     * Gets the value of the taxTtlAmt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the taxTtlAmt property.
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
     */
    public List<CurrencyAndAmount> getTaxTtlAmt() {
        if (taxTtlAmt == null) {
            taxTtlAmt = new ArrayList<CurrencyAndAmount>();
        }
        return this.taxTtlAmt;
    }

    /**
     * Gets the value of the taxBsisAmt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the taxBsisAmt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTaxBsisAmt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CurrencyAndAmount }
     * 
     * 
     */
    public List<CurrencyAndAmount> getTaxBsisAmt() {
        if (taxBsisAmt == null) {
            taxBsisAmt = new ArrayList<CurrencyAndAmount>();
        }
        return this.taxBsisAmt;
    }

    /**
     * Gets the value of the rndgAmt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rndgAmt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRndgAmt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CurrencyAndAmount }
     * 
     * 
     */
    public List<CurrencyAndAmount> getRndgAmt() {
        if (rndgAmt == null) {
            rndgAmt = new ArrayList<CurrencyAndAmount>();
        }
        return this.rndgAmt;
    }

    /**
     * Gets the value of the grdTtlAmt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the grdTtlAmt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGrdTtlAmt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CurrencyAndAmount }
     * 
     * 
     */
    public List<CurrencyAndAmount> getGrdTtlAmt() {
        if (grdTtlAmt == null) {
            grdTtlAmt = new ArrayList<CurrencyAndAmount>();
        }
        return this.grdTtlAmt;
    }

    /**
     * Gets the value of the infAmt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the infAmt property.
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
     */
    public List<CurrencyAndAmount> getInfAmt() {
        if (infAmt == null) {
            infAmt = new ArrayList<CurrencyAndAmount>();
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
    public SettlementMonetarySummation1 addLineTtlAmt(CurrencyAndAmount lineTtlAmt) {
        getLineTtlAmt().add(lineTtlAmt);
        return this;
    }

    /**
     * Adds a new item to the allwncTtlAmt list.
     * @see #getAllwncTtlAmt()
     * 
     */
    public SettlementMonetarySummation1 addAllwncTtlAmt(CurrencyAndAmount allwncTtlAmt) {
        getAllwncTtlAmt().add(allwncTtlAmt);
        return this;
    }

    /**
     * Adds a new item to the ttlDscntAmt list.
     * @see #getTtlDscntAmt()
     * 
     */
    public SettlementMonetarySummation1 addTtlDscntAmt(CurrencyAndAmount ttlDscntAmt) {
        getTtlDscntAmt().add(ttlDscntAmt);
        return this;
    }

    /**
     * Adds a new item to the chrgTtlAmt list.
     * @see #getChrgTtlAmt()
     * 
     */
    public SettlementMonetarySummation1 addChrgTtlAmt(CurrencyAndAmount chrgTtlAmt) {
        getChrgTtlAmt().add(chrgTtlAmt);
        return this;
    }

    /**
     * Adds a new item to the ttlPrepdAmt list.
     * @see #getTtlPrepdAmt()
     * 
     */
    public SettlementMonetarySummation1 addTtlPrepdAmt(CurrencyAndAmount ttlPrepdAmt) {
        getTtlPrepdAmt().add(ttlPrepdAmt);
        return this;
    }

    /**
     * Adds a new item to the taxTtlAmt list.
     * @see #getTaxTtlAmt()
     * 
     */
    public SettlementMonetarySummation1 addTaxTtlAmt(CurrencyAndAmount taxTtlAmt) {
        getTaxTtlAmt().add(taxTtlAmt);
        return this;
    }

    /**
     * Adds a new item to the taxBsisAmt list.
     * @see #getTaxBsisAmt()
     * 
     */
    public SettlementMonetarySummation1 addTaxBsisAmt(CurrencyAndAmount taxBsisAmt) {
        getTaxBsisAmt().add(taxBsisAmt);
        return this;
    }

    /**
     * Adds a new item to the rndgAmt list.
     * @see #getRndgAmt()
     * 
     */
    public SettlementMonetarySummation1 addRndgAmt(CurrencyAndAmount rndgAmt) {
        getRndgAmt().add(rndgAmt);
        return this;
    }

    /**
     * Adds a new item to the grdTtlAmt list.
     * @see #getGrdTtlAmt()
     * 
     */
    public SettlementMonetarySummation1 addGrdTtlAmt(CurrencyAndAmount grdTtlAmt) {
        getGrdTtlAmt().add(grdTtlAmt);
        return this;
    }

    /**
     * Adds a new item to the infAmt list.
     * @see #getInfAmt()
     * 
     */
    public SettlementMonetarySummation1 addInfAmt(CurrencyAndAmount infAmt) {
        getInfAmt().add(infAmt);
        return this;
    }

}
