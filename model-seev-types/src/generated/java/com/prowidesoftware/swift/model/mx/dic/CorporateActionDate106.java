
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
@XmlType(name = "CorporateActionDate106", propOrder = {
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
    "dcmnttnDdln"
})
public class CorporateActionDate106 {

    @XmlElement(name = "EarlyRspnDdln")
    protected DateFormat43Choice earlyRspnDdln;
    @XmlElement(name = "CoverXprtnDdln")
    protected DateFormat43Choice coverXprtnDdln;
    @XmlElement(name = "PrtctDdln")
    protected DateFormat43Choice prtctDdln;
    @XmlElement(name = "MktDdln")
    protected DateFormat43Choice mktDdln;
    @XmlElement(name = "RspnDdln")
    protected DateFormat44Choice rspnDdln;
    @XmlElement(name = "XpryDt")
    protected DateFormat43Choice xpryDt;
    @XmlElement(name = "SbcptCostDbtDt")
    protected DateFormat43Choice sbcptCostDbtDt;
    @XmlElement(name = "DpstryCoverXprtnDt")
    protected DateFormat43Choice dpstryCoverXprtnDt;
    @XmlElement(name = "StockLndgDdln")
    protected DateFormat43Choice stockLndgDdln;
    @XmlElement(name = "BrrwrStockLndgDdln")
    protected List<BorrowerLendingDeadline5> brrwrStockLndgDdln;
    @XmlElement(name = "DcmnttnDdln")
    protected DateFormat43Choice dcmnttnDdln;

    /**
     * Gets the value of the earlyRspnDdln property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat43Choice }
     *     
     */
    public DateFormat43Choice getEarlyRspnDdln() {
        return earlyRspnDdln;
    }

    /**
     * Sets the value of the earlyRspnDdln property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat43Choice }
     *     
     */
    public CorporateActionDate106 setEarlyRspnDdln(DateFormat43Choice value) {
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
    public CorporateActionDate106 setCoverXprtnDdln(DateFormat43Choice value) {
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
    public CorporateActionDate106 setPrtctDdln(DateFormat43Choice value) {
        this.prtctDdln = value;
        return this;
    }

    /**
     * Gets the value of the mktDdln property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat43Choice }
     *     
     */
    public DateFormat43Choice getMktDdln() {
        return mktDdln;
    }

    /**
     * Sets the value of the mktDdln property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat43Choice }
     *     
     */
    public CorporateActionDate106 setMktDdln(DateFormat43Choice value) {
        this.mktDdln = value;
        return this;
    }

    /**
     * Gets the value of the rspnDdln property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat44Choice }
     *     
     */
    public DateFormat44Choice getRspnDdln() {
        return rspnDdln;
    }

    /**
     * Sets the value of the rspnDdln property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat44Choice }
     *     
     */
    public CorporateActionDate106 setRspnDdln(DateFormat44Choice value) {
        this.rspnDdln = value;
        return this;
    }

    /**
     * Gets the value of the xpryDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat43Choice }
     *     
     */
    public DateFormat43Choice getXpryDt() {
        return xpryDt;
    }

    /**
     * Sets the value of the xpryDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat43Choice }
     *     
     */
    public CorporateActionDate106 setXpryDt(DateFormat43Choice value) {
        this.xpryDt = value;
        return this;
    }

    /**
     * Gets the value of the sbcptCostDbtDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat43Choice }
     *     
     */
    public DateFormat43Choice getSbcptCostDbtDt() {
        return sbcptCostDbtDt;
    }

    /**
     * Sets the value of the sbcptCostDbtDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat43Choice }
     *     
     */
    public CorporateActionDate106 setSbcptCostDbtDt(DateFormat43Choice value) {
        this.sbcptCostDbtDt = value;
        return this;
    }

    /**
     * Gets the value of the dpstryCoverXprtnDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat43Choice }
     *     
     */
    public DateFormat43Choice getDpstryCoverXprtnDt() {
        return dpstryCoverXprtnDt;
    }

    /**
     * Sets the value of the dpstryCoverXprtnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat43Choice }
     *     
     */
    public CorporateActionDate106 setDpstryCoverXprtnDt(DateFormat43Choice value) {
        this.dpstryCoverXprtnDt = value;
        return this;
    }

    /**
     * Gets the value of the stockLndgDdln property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat43Choice }
     *     
     */
    public DateFormat43Choice getStockLndgDdln() {
        return stockLndgDdln;
    }

    /**
     * Sets the value of the stockLndgDdln property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat43Choice }
     *     
     */
    public CorporateActionDate106 setStockLndgDdln(DateFormat43Choice value) {
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
     * {@link BorrowerLendingDeadline5 }
     * 
     * 
     * @return
     *     The value of the brrwrStockLndgDdln property.
     */
    public List<BorrowerLendingDeadline5> getBrrwrStockLndgDdln() {
        if (brrwrStockLndgDdln == null) {
            brrwrStockLndgDdln = new ArrayList<>();
        }
        return this.brrwrStockLndgDdln;
    }

    /**
     * Gets the value of the dcmnttnDdln property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat43Choice }
     *     
     */
    public DateFormat43Choice getDcmnttnDdln() {
        return dcmnttnDdln;
    }

    /**
     * Sets the value of the dcmnttnDdln property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat43Choice }
     *     
     */
    public CorporateActionDate106 setDcmnttnDdln(DateFormat43Choice value) {
        this.dcmnttnDdln = value;
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
    public CorporateActionDate106 addBrrwrStockLndgDdln(BorrowerLendingDeadline5 brrwrStockLndgDdln) {
        getBrrwrStockLndgDdln().add(brrwrStockLndgDdln);
        return this;
    }

}
