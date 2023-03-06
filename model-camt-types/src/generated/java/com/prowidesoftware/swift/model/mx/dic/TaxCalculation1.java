
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
 * Specifies the details for the tax calculation.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaxCalculation1", propOrder = {
    "hstCcy",
    "taxblSvcChrgConvs",
    "ttlTaxblSvcChrgHstAmt",
    "taxId",
    "ttlTax"
})
public class TaxCalculation1 {

    @XmlElement(name = "HstCcy", required = true)
    protected String hstCcy;
    @XmlElement(name = "TaxblSvcChrgConvs", required = true)
    protected List<BillingServicesAmount3> taxblSvcChrgConvs;
    @XmlElement(name = "TtlTaxblSvcChrgHstAmt", required = true)
    protected AmountAndDirection34 ttlTaxblSvcChrgHstAmt;
    @XmlElement(name = "TaxId", required = true)
    protected List<BillingServicesTax3> taxId;
    @XmlElement(name = "TtlTax", required = true)
    protected AmountAndDirection34 ttlTax;

    /**
     * Gets the value of the hstCcy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHstCcy() {
        return hstCcy;
    }

    /**
     * Sets the value of the hstCcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TaxCalculation1 setHstCcy(String value) {
        this.hstCcy = value;
        return this;
    }

    /**
     * Gets the value of the taxblSvcChrgConvs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the taxblSvcChrgConvs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTaxblSvcChrgConvs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BillingServicesAmount3 }
     * 
     * 
     */
    public List<BillingServicesAmount3> getTaxblSvcChrgConvs() {
        if (taxblSvcChrgConvs == null) {
            taxblSvcChrgConvs = new ArrayList<BillingServicesAmount3>();
        }
        return this.taxblSvcChrgConvs;
    }

    /**
     * Gets the value of the ttlTaxblSvcChrgHstAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection34 }
     *     
     */
    public AmountAndDirection34 getTtlTaxblSvcChrgHstAmt() {
        return ttlTaxblSvcChrgHstAmt;
    }

    /**
     * Sets the value of the ttlTaxblSvcChrgHstAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection34 }
     *     
     */
    public TaxCalculation1 setTtlTaxblSvcChrgHstAmt(AmountAndDirection34 value) {
        this.ttlTaxblSvcChrgHstAmt = value;
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
     * {@link BillingServicesTax3 }
     * 
     * 
     */
    public List<BillingServicesTax3> getTaxId() {
        if (taxId == null) {
            taxId = new ArrayList<BillingServicesTax3>();
        }
        return this.taxId;
    }

    /**
     * Gets the value of the ttlTax property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection34 }
     *     
     */
    public AmountAndDirection34 getTtlTax() {
        return ttlTax;
    }

    /**
     * Sets the value of the ttlTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection34 }
     *     
     */
    public TaxCalculation1 setTtlTax(AmountAndDirection34 value) {
        this.ttlTax = value;
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
     * Adds a new item to the taxblSvcChrgConvs list.
     * @see #getTaxblSvcChrgConvs()
     * 
     */
    public TaxCalculation1 addTaxblSvcChrgConvs(BillingServicesAmount3 taxblSvcChrgConvs) {
        getTaxblSvcChrgConvs().add(taxblSvcChrgConvs);
        return this;
    }

    /**
     * Adds a new item to the taxId list.
     * @see #getTaxId()
     * 
     */
    public TaxCalculation1 addTaxId(BillingServicesTax3 taxId) {
        getTaxId().add(taxId);
        return this;
    }

}
