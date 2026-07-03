
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
 * Provides the details for the tax calculation method B.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BillingMethod2", propOrder = {
    "svcChrgHstAmt",
    "svcTax",
    "taxId"
})
public class BillingMethod2 {

    @XmlElement(name = "SvcChrgHstAmt", required = true)
    protected AmountAndDirection34 svcChrgHstAmt;
    @XmlElement(name = "SvcTax", required = true)
    protected BillingServicesAmount1 svcTax;
    @XmlElement(name = "TaxId", required = true)
    protected List<BillingServicesTax1> taxId;

    /**
     * Gets the value of the svcChrgHstAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection34 }
     *     
     */
    public AmountAndDirection34 getSvcChrgHstAmt() {
        return svcChrgHstAmt;
    }

    /**
     * Sets the value of the svcChrgHstAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection34 }
     *     
     */
    public BillingMethod2 setSvcChrgHstAmt(AmountAndDirection34 value) {
        this.svcChrgHstAmt = value;
        return this;
    }

    /**
     * Gets the value of the svcTax property.
     * 
     * @return
     *     possible object is
     *     {@link BillingServicesAmount1 }
     *     
     */
    public BillingServicesAmount1 getSvcTax() {
        return svcTax;
    }

    /**
     * Sets the value of the svcTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link BillingServicesAmount1 }
     *     
     */
    public BillingMethod2 setSvcTax(BillingServicesAmount1 value) {
        this.svcTax = value;
        return this;
    }

    /**
     * Gets the value of the taxId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the taxId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTaxId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BillingServicesTax1 }
     * 
     * 
     */
    public List<BillingServicesTax1> getTaxId() {
        if (taxId == null) {
            taxId = new ArrayList<BillingServicesTax1>();
        }
        return this.taxId;
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
     * Adds a new item to the taxId list.
     * @see #getTaxId()
     * 
     */
    public BillingMethod2 addTaxId(BillingServicesTax1 taxId) {
        getTaxId().add(taxId);
        return this;
    }

}
