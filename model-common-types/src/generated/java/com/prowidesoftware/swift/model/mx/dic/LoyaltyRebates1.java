
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
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
 * Rebate form to an award.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LoyaltyRebates1", propOrder = {
    "ttlRbt",
    "rbtLabl",
    "saleItmRbt"
})
public class LoyaltyRebates1 {

    @XmlElement(name = "TtlRbt")
    protected BigDecimal ttlRbt;
    @XmlElement(name = "RbtLabl")
    protected String rbtLabl;
    @XmlElement(name = "SaleItmRbt")
    protected List<SaleItemRebate1> saleItmRbt;

    /**
     * Gets the value of the ttlRbt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTtlRbt() {
        return ttlRbt;
    }

    /**
     * Sets the value of the ttlRbt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public LoyaltyRebates1 setTtlRbt(BigDecimal value) {
        this.ttlRbt = value;
        return this;
    }

    /**
     * Gets the value of the rbtLabl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRbtLabl() {
        return rbtLabl;
    }

    /**
     * Sets the value of the rbtLabl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public LoyaltyRebates1 setRbtLabl(String value) {
        this.rbtLabl = value;
        return this;
    }

    /**
     * Gets the value of the saleItmRbt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the saleItmRbt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSaleItmRbt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SaleItemRebate1 }
     * 
     * 
     */
    public List<SaleItemRebate1> getSaleItmRbt() {
        if (saleItmRbt == null) {
            saleItmRbt = new ArrayList<SaleItemRebate1>();
        }
        return this.saleItmRbt;
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
     * Adds a new item to the saleItmRbt list.
     * @see #getSaleItmRbt()
     * 
     */
    public LoyaltyRebates1 addSaleItmRbt(SaleItemRebate1 saleItmRbt) {
        getSaleItmRbt().add(saleItmRbt);
        return this;
    }

}
