
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
@XmlType(name = "CorporateActionDate55", propOrder = {
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
public class CorporateActionDate55 {

    @XmlElement(name = "EarlyRspnDdln")
    protected DateFormat34Choice earlyRspnDdln;
    @XmlElement(name = "CoverXprtnDt")
    protected DateFormat34Choice coverXprtnDt;
    @XmlElement(name = "PrtctDt")
    protected DateFormat34Choice prtctDt;
    @XmlElement(name = "MktDdln")
    protected DateFormat34Choice mktDdln;
    @XmlElement(name = "RspnDdln")
    protected DateFormat38Choice rspnDdln;
    @XmlElement(name = "XpryDt")
    protected DateFormat34Choice xpryDt;
    @XmlElement(name = "SbcptCostDbtDt")
    protected DateFormat34Choice sbcptCostDbtDt;
    @XmlElement(name = "DpstryCoverXprtnDt")
    protected DateFormat34Choice dpstryCoverXprtnDt;
    @XmlElement(name = "StockLndgDdln")
    protected DateFormat34Choice stockLndgDdln;
    @XmlElement(name = "BrrwrStockLndgDdln")
    protected List<BorrowerLendingDeadline2> brrwrStockLndgDdln;

    /**
     * Gets the value of the earlyRspnDdln property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat34Choice }
     *     
     */
    public DateFormat34Choice getEarlyRspnDdln() {
        return earlyRspnDdln;
    }

    /**
     * Sets the value of the earlyRspnDdln property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat34Choice }
     *     
     */
    public CorporateActionDate55 setEarlyRspnDdln(DateFormat34Choice value) {
        this.earlyRspnDdln = value;
        return this;
    }

    /**
     * Gets the value of the coverXprtnDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat34Choice }
     *     
     */
    public DateFormat34Choice getCoverXprtnDt() {
        return coverXprtnDt;
    }

    /**
     * Sets the value of the coverXprtnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat34Choice }
     *     
     */
    public CorporateActionDate55 setCoverXprtnDt(DateFormat34Choice value) {
        this.coverXprtnDt = value;
        return this;
    }

    /**
     * Gets the value of the prtctDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat34Choice }
     *     
     */
    public DateFormat34Choice getPrtctDt() {
        return prtctDt;
    }

    /**
     * Sets the value of the prtctDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat34Choice }
     *     
     */
    public CorporateActionDate55 setPrtctDt(DateFormat34Choice value) {
        this.prtctDt = value;
        return this;
    }

    /**
     * Gets the value of the mktDdln property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat34Choice }
     *     
     */
    public DateFormat34Choice getMktDdln() {
        return mktDdln;
    }

    /**
     * Sets the value of the mktDdln property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat34Choice }
     *     
     */
    public CorporateActionDate55 setMktDdln(DateFormat34Choice value) {
        this.mktDdln = value;
        return this;
    }

    /**
     * Gets the value of the rspnDdln property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat38Choice }
     *     
     */
    public DateFormat38Choice getRspnDdln() {
        return rspnDdln;
    }

    /**
     * Sets the value of the rspnDdln property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat38Choice }
     *     
     */
    public CorporateActionDate55 setRspnDdln(DateFormat38Choice value) {
        this.rspnDdln = value;
        return this;
    }

    /**
     * Gets the value of the xpryDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat34Choice }
     *     
     */
    public DateFormat34Choice getXpryDt() {
        return xpryDt;
    }

    /**
     * Sets the value of the xpryDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat34Choice }
     *     
     */
    public CorporateActionDate55 setXpryDt(DateFormat34Choice value) {
        this.xpryDt = value;
        return this;
    }

    /**
     * Gets the value of the sbcptCostDbtDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat34Choice }
     *     
     */
    public DateFormat34Choice getSbcptCostDbtDt() {
        return sbcptCostDbtDt;
    }

    /**
     * Sets the value of the sbcptCostDbtDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat34Choice }
     *     
     */
    public CorporateActionDate55 setSbcptCostDbtDt(DateFormat34Choice value) {
        this.sbcptCostDbtDt = value;
        return this;
    }

    /**
     * Gets the value of the dpstryCoverXprtnDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat34Choice }
     *     
     */
    public DateFormat34Choice getDpstryCoverXprtnDt() {
        return dpstryCoverXprtnDt;
    }

    /**
     * Sets the value of the dpstryCoverXprtnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat34Choice }
     *     
     */
    public CorporateActionDate55 setDpstryCoverXprtnDt(DateFormat34Choice value) {
        this.dpstryCoverXprtnDt = value;
        return this;
    }

    /**
     * Gets the value of the stockLndgDdln property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat34Choice }
     *     
     */
    public DateFormat34Choice getStockLndgDdln() {
        return stockLndgDdln;
    }

    /**
     * Sets the value of the stockLndgDdln property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat34Choice }
     *     
     */
    public CorporateActionDate55 setStockLndgDdln(DateFormat34Choice value) {
        this.stockLndgDdln = value;
        return this;
    }

    /**
     * Gets the value of the brrwrStockLndgDdln property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the brrwrStockLndgDdln property.
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
     * {@link BorrowerLendingDeadline2 }
     * 
     * 
     * @return
     *     The value of the brrwrStockLndgDdln property.
     */
    public List<BorrowerLendingDeadline2> getBrrwrStockLndgDdln() {
        if (brrwrStockLndgDdln == null) {
            brrwrStockLndgDdln = new ArrayList<>();
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
    public CorporateActionDate55 addBrrwrStockLndgDdln(BorrowerLendingDeadline2 brrwrStockLndgDdln) {
        getBrrwrStockLndgDdln().add(brrwrStockLndgDdln);
        return this;
    }

}
