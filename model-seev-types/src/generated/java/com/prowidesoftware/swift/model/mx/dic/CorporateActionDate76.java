
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
 * Specifies corporate action dates.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorporateActionDate76", propOrder = {
    "earlyRspnDdln",
    "coverXprtnDt",
    "prtctDt",
    "mktDdln",
    "rspnDdln",
    "xpryDt",
    "sbcptCostDbtDt",
    "dpstryCoverXprtnDt",
    "stockLndgDdln",
    "brrwrStockLndgDdln"
})
public class CorporateActionDate76 {

    @XmlElement(name = "EarlyRspnDdln")
    protected DateFormat49Choice earlyRspnDdln;
    @XmlElement(name = "CoverXprtnDt")
    protected DateFormat49Choice coverXprtnDt;
    @XmlElement(name = "PrtctDt")
    protected DateFormat49Choice prtctDt;
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
    public CorporateActionDate76 setEarlyRspnDdln(DateFormat49Choice value) {
        this.earlyRspnDdln = value;
        return this;
    }

    /**
     * Gets the value of the coverXprtnDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat49Choice }
     *     
     */
    public DateFormat49Choice getCoverXprtnDt() {
        return coverXprtnDt;
    }

    /**
     * Sets the value of the coverXprtnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat49Choice }
     *     
     */
    public CorporateActionDate76 setCoverXprtnDt(DateFormat49Choice value) {
        this.coverXprtnDt = value;
        return this;
    }

    /**
     * Gets the value of the prtctDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat49Choice }
     *     
     */
    public DateFormat49Choice getPrtctDt() {
        return prtctDt;
    }

    /**
     * Sets the value of the prtctDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat49Choice }
     *     
     */
    public CorporateActionDate76 setPrtctDt(DateFormat49Choice value) {
        this.prtctDt = value;
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
    public CorporateActionDate76 setMktDdln(DateFormat49Choice value) {
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
    public CorporateActionDate76 setRspnDdln(DateFormat54Choice value) {
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
    public CorporateActionDate76 setXpryDt(DateFormat49Choice value) {
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
    public CorporateActionDate76 setSbcptCostDbtDt(DateFormat49Choice value) {
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
    public CorporateActionDate76 setDpstryCoverXprtnDt(DateFormat49Choice value) {
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
    public CorporateActionDate76 setStockLndgDdln(DateFormat49Choice value) {
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
    public CorporateActionDate76 addBrrwrStockLndgDdln(BorrowerLendingDeadline6 brrwrStockLndgDdln) {
        getBrrwrStockLndgDdln().add(brrwrStockLndgDdln);
        return this;
    }

}
