
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
 * Specifies corporate action dates.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorporateActionDate82", propOrder = {
    "earlyRspnDdln",
    "coverXprtnDdln",
    "prtctDdln",
    "mktDdln",
    "rspnDdln",
    "xpryDt",
    "sbcptCostDbtDt",
    "dpstryCoverXprtnDt",
    "stockLndgDdln",
    "brrwrStockLndgDdln",
    "endOfSctiesBlckgPrd"
})
public class CorporateActionDate82 {

    @XmlElement(name = "EarlyRspnDdln")
    protected DateFormat49Choice earlyRspnDdln;
    @XmlElement(name = "CoverXprtnDdln")
    protected DateFormat43Choice coverXprtnDdln;
    @XmlElement(name = "PrtctDdln")
    protected DateFormat43Choice prtctDdln;
    @XmlElement(name = "MktDdln")
    protected DateFormat49Choice mktDdln;
    @XmlElement(name = "RspnDdln")
    protected DateFormat54Choice rspnDdln;
    @XmlElement(name = "XpryDt")
    protected DateFormat49Choice xpryDt;
    @XmlElement(name = "SbcptCostDbtDt")
    protected DateFormat49Choice sbcptCostDbtDt;
    @XmlElement(name = "DpstryCoverXprtnDt")
    protected DateFormat49Choice dpstryCoverXprtnDt;
    @XmlElement(name = "StockLndgDdln")
    protected DateFormat49Choice stockLndgDdln;
    @XmlElement(name = "BrrwrStockLndgDdln")
    protected List<BorrowerLendingDeadline6> brrwrStockLndgDdln;
    @XmlElement(name = "EndOfSctiesBlckgPrd")
    protected DateFormat59Choice endOfSctiesBlckgPrd;

    /**
     * Gets the value of the earlyRspnDdln property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat49Choice }
     *     
     */
    public DateFormat49Choice getEarlyRspnDdln() {
        return earlyRspnDdln;
    }

    /**
     * Sets the value of the earlyRspnDdln property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat49Choice }
     *     
     */
    public CorporateActionDate82 setEarlyRspnDdln(DateFormat49Choice value) {
        this.earlyRspnDdln = value;
        return this;
    }

    /**
     * Gets the value of the coverXprtnDdln property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat43Choice }
     *     
     */
    public DateFormat43Choice getCoverXprtnDdln() {
        return coverXprtnDdln;
    }

    /**
     * Sets the value of the coverXprtnDdln property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat43Choice }
     *     
     */
    public CorporateActionDate82 setCoverXprtnDdln(DateFormat43Choice value) {
        this.coverXprtnDdln = value;
        return this;
    }

    /**
     * Gets the value of the prtctDdln property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat43Choice }
     *     
     */
    public DateFormat43Choice getPrtctDdln() {
        return prtctDdln;
    }

    /**
     * Sets the value of the prtctDdln property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat43Choice }
     *     
     */
    public CorporateActionDate82 setPrtctDdln(DateFormat43Choice value) {
        this.prtctDdln = value;
        return this;
    }

    /**
     * Gets the value of the mktDdln property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat49Choice }
     *     
     */
    public DateFormat49Choice getMktDdln() {
        return mktDdln;
    }

    /**
     * Sets the value of the mktDdln property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat49Choice }
     *     
     */
    public CorporateActionDate82 setMktDdln(DateFormat49Choice value) {
        this.mktDdln = value;
        return this;
    }

    /**
     * Gets the value of the rspnDdln property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat54Choice }
     *     
     */
    public DateFormat54Choice getRspnDdln() {
        return rspnDdln;
    }

    /**
     * Sets the value of the rspnDdln property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat54Choice }
     *     
     */
    public CorporateActionDate82 setRspnDdln(DateFormat54Choice value) {
        this.rspnDdln = value;
        return this;
    }

    /**
     * Gets the value of the xpryDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat49Choice }
     *     
     */
    public DateFormat49Choice getXpryDt() {
        return xpryDt;
    }

    /**
     * Sets the value of the xpryDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat49Choice }
     *     
     */
    public CorporateActionDate82 setXpryDt(DateFormat49Choice value) {
        this.xpryDt = value;
        return this;
    }

    /**
     * Gets the value of the sbcptCostDbtDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat49Choice }
     *     
     */
    public DateFormat49Choice getSbcptCostDbtDt() {
        return sbcptCostDbtDt;
    }

    /**
     * Sets the value of the sbcptCostDbtDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat49Choice }
     *     
     */
    public CorporateActionDate82 setSbcptCostDbtDt(DateFormat49Choice value) {
        this.sbcptCostDbtDt = value;
        return this;
    }

    /**
     * Gets the value of the dpstryCoverXprtnDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat49Choice }
     *     
     */
    public DateFormat49Choice getDpstryCoverXprtnDt() {
        return dpstryCoverXprtnDt;
    }

    /**
     * Sets the value of the dpstryCoverXprtnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat49Choice }
     *     
     */
    public CorporateActionDate82 setDpstryCoverXprtnDt(DateFormat49Choice value) {
        this.dpstryCoverXprtnDt = value;
        return this;
    }

    /**
     * Gets the value of the stockLndgDdln property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat49Choice }
     *     
     */
    public DateFormat49Choice getStockLndgDdln() {
        return stockLndgDdln;
    }

    /**
     * Sets the value of the stockLndgDdln property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat49Choice }
     *     
     */
    public CorporateActionDate82 setStockLndgDdln(DateFormat49Choice value) {
        this.stockLndgDdln = value;
        return this;
    }

    /**
     * Gets the value of the brrwrStockLndgDdln property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the brrwrStockLndgDdln property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBrrwrStockLndgDdln().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BorrowerLendingDeadline6 }
     * 
     * 
     */
    public List<BorrowerLendingDeadline6> getBrrwrStockLndgDdln() {
        if (brrwrStockLndgDdln == null) {
            brrwrStockLndgDdln = new ArrayList<BorrowerLendingDeadline6>();
        }
        return this.brrwrStockLndgDdln;
    }

    /**
     * Gets the value of the endOfSctiesBlckgPrd property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat59Choice }
     *     
     */
    public DateFormat59Choice getEndOfSctiesBlckgPrd() {
        return endOfSctiesBlckgPrd;
    }

    /**
     * Sets the value of the endOfSctiesBlckgPrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat59Choice }
     *     
     */
    public CorporateActionDate82 setEndOfSctiesBlckgPrd(DateFormat59Choice value) {
        this.endOfSctiesBlckgPrd = value;
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
     * Adds a new item to the brrwrStockLndgDdln list.
     * @see #getBrrwrStockLndgDdln()
     * 
     */
    public CorporateActionDate82 addBrrwrStockLndgDdln(BorrowerLendingDeadline6 brrwrStockLndgDdln) {
        getBrrwrStockLndgDdln().add(brrwrStockLndgDdln);
        return this;
    }

}
