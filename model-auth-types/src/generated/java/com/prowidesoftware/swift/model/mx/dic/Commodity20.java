
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Data specific to commodities and related fields used as a collateral.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Commodity20", propOrder = {
    "clssfctn",
    "qty",
    "unitPric",
    "mktVal"
})
public class Commodity20 {

    @XmlElement(name = "Clssfctn")
    protected AssetClassCommodity5Choice clssfctn;
    @XmlElement(name = "Qty")
    protected Quantity17 qty;
    @XmlElement(name = "UnitPric")
    protected SecuritiesTransactionPrice11Choice unitPric;
    @XmlElement(name = "MktVal")
    protected ActiveOrHistoricCurrencyAndAmount mktVal;

    /**
     * Gets the value of the clssfctn property.
     * 
     * @return
     *     possible object is
     *     {@link AssetClassCommodity5Choice }
     *     
     */
    public AssetClassCommodity5Choice getClssfctn() {
        return clssfctn;
    }

    /**
     * Sets the value of the clssfctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssetClassCommodity5Choice }
     *     
     */
    public Commodity20 setClssfctn(AssetClassCommodity5Choice value) {
        this.clssfctn = value;
        return this;
    }

    /**
     * Gets the value of the qty property.
     * 
     * @return
     *     possible object is
     *     {@link Quantity17 }
     *     
     */
    public Quantity17 getQty() {
        return qty;
    }

    /**
     * Sets the value of the qty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Quantity17 }
     *     
     */
    public Commodity20 setQty(Quantity17 value) {
        this.qty = value;
        return this;
    }

    /**
     * Gets the value of the unitPric property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesTransactionPrice11Choice }
     *     
     */
    public SecuritiesTransactionPrice11Choice getUnitPric() {
        return unitPric;
    }

    /**
     * Sets the value of the unitPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesTransactionPrice11Choice }
     *     
     */
    public Commodity20 setUnitPric(SecuritiesTransactionPrice11Choice value) {
        this.unitPric = value;
        return this;
    }

    /**
     * Gets the value of the mktVal property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public ActiveOrHistoricCurrencyAndAmount getMktVal() {
        return mktVal;
    }

    /**
     * Sets the value of the mktVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public Commodity20 setMktVal(ActiveOrHistoricCurrencyAndAmount value) {
        this.mktVal = value;
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

}
