
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Payment transaction invoiced to customer.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentTransaction141", propOrder = {
    "purchsTp",
    "summryCmmdtyId",
    "dscntTtl",
    "taxTtl",
    "ttlAmt"
})
public class PaymentTransaction141 {

    @XmlElement(name = "PurchsTp")
    @XmlSchemaType(name = "string")
    protected FleetPurchaseType1Code purchsTp;
    @XmlElement(name = "SummryCmmdtyId")
    protected String summryCmmdtyId;
    @XmlElement(name = "DscntTtl")
    protected FleetDiscountTotals1 dscntTtl;
    @XmlElement(name = "TaxTtl")
    protected List<Tax39> taxTtl;
    @XmlElement(name = "TtlAmt")
    protected BigDecimal ttlAmt;

    /**
     * Gets the value of the purchsTp property.
     * 
     * @return
     *     possible object is
     *     {@link FleetPurchaseType1Code }
     *     
     */
    public FleetPurchaseType1Code getPurchsTp() {
        return purchsTp;
    }

    /**
     * Sets the value of the purchsTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link FleetPurchaseType1Code }
     *     
     */
    public PaymentTransaction141 setPurchsTp(FleetPurchaseType1Code value) {
        this.purchsTp = value;
        return this;
    }

    /**
     * Gets the value of the summryCmmdtyId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSummryCmmdtyId() {
        return summryCmmdtyId;
    }

    /**
     * Sets the value of the summryCmmdtyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PaymentTransaction141 setSummryCmmdtyId(String value) {
        this.summryCmmdtyId = value;
        return this;
    }

    /**
     * Gets the value of the dscntTtl property.
     * 
     * @return
     *     possible object is
     *     {@link FleetDiscountTotals1 }
     *     
     */
    public FleetDiscountTotals1 getDscntTtl() {
        return dscntTtl;
    }

    /**
     * Sets the value of the dscntTtl property.
     * 
     * @param value
     *     allowed object is
     *     {@link FleetDiscountTotals1 }
     *     
     */
    public PaymentTransaction141 setDscntTtl(FleetDiscountTotals1 value) {
        this.dscntTtl = value;
        return this;
    }

    /**
     * Gets the value of the taxTtl property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the taxTtl property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTaxTtl().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Tax39 }
     * 
     * 
     */
    public List<Tax39> getTaxTtl() {
        if (taxTtl == null) {
            taxTtl = new ArrayList<Tax39>();
        }
        return this.taxTtl;
    }

    /**
     * Gets the value of the ttlAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTtlAmt() {
        return ttlAmt;
    }

    /**
     * Sets the value of the ttlAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public PaymentTransaction141 setTtlAmt(BigDecimal value) {
        this.ttlAmt = value;
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
     * Adds a new item to the taxTtl list.
     * @see #getTaxTtl()
     * 
     */
    public PaymentTransaction141 addTaxTtl(Tax39 taxTtl) {
        getTaxTtl().add(taxTtl);
        return this;
    }

}
