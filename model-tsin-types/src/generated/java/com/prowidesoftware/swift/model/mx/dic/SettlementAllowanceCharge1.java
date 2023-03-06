
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
 * Specifies a pricing component, such as a service, promotion, allowance or charge, for this trade settlement.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SettlementAllowanceCharge1", propOrder = {
    "allwncChrgInd",
    "actlAmt",
    "rsn"
})
public class SettlementAllowanceCharge1 {

    @XmlElement(name = "AllwncChrgInd")
    protected Boolean allwncChrgInd;
    @XmlElement(name = "ActlAmt")
    protected List<CurrencyAndAmount> actlAmt;
    @XmlElement(name = "Rsn")
    protected DiscountOrChargeType1Choice rsn;

    /**
     * Gets the value of the allwncChrgInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllwncChrgInd() {
        return allwncChrgInd;
    }

    /**
     * Sets the value of the allwncChrgInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public SettlementAllowanceCharge1 setAllwncChrgInd(Boolean value) {
        this.allwncChrgInd = value;
        return this;
    }

    /**
     * Gets the value of the actlAmt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the actlAmt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getActlAmt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CurrencyAndAmount }
     * 
     * 
     */
    public List<CurrencyAndAmount> getActlAmt() {
        if (actlAmt == null) {
            actlAmt = new ArrayList<CurrencyAndAmount>();
        }
        return this.actlAmt;
    }

    /**
     * Gets the value of the rsn property.
     * 
     * @return
     *     possible object is
     *     {@link DiscountOrChargeType1Choice }
     *     
     */
    public DiscountOrChargeType1Choice getRsn() {
        return rsn;
    }

    /**
     * Sets the value of the rsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link DiscountOrChargeType1Choice }
     *     
     */
    public SettlementAllowanceCharge1 setRsn(DiscountOrChargeType1Choice value) {
        this.rsn = value;
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
     * Adds a new item to the actlAmt list.
     * @see #getActlAmt()
     * 
     */
    public SettlementAllowanceCharge1 addActlAmt(CurrencyAndAmount actlAmt) {
        getActlAmt().add(actlAmt);
        return this;
    }

}
