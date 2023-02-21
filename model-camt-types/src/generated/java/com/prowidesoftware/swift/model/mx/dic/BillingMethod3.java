
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
 * Provides the details for the tax calculation method D.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BillingMethod3", propOrder = {
    "svcTaxPricAmt",
    "taxId"
})
public class BillingMethod3 {

    @XmlElement(name = "SvcTaxPricAmt", required = true)
    protected AmountAndDirection34 svcTaxPricAmt;
    @XmlElement(name = "TaxId", required = true)
    protected List<BillingServicesTax2> taxId;

    /**
     * Gets the value of the svcTaxPricAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection34 }
     *     
     */
    public AmountAndDirection34 getSvcTaxPricAmt() {
        return svcTaxPricAmt;
    }

    /**
     * Sets the value of the svcTaxPricAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection34 }
     *     
     */
    public BillingMethod3 setSvcTaxPricAmt(AmountAndDirection34 value) {
        this.svcTaxPricAmt = value;
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
     * {@link BillingServicesTax2 }
     * 
     * 
     */
    public List<BillingServicesTax2> getTaxId() {
        if (taxId == null) {
            taxId = new ArrayList<BillingServicesTax2>();
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
    public BillingMethod3 addTaxId(BillingServicesTax2 taxId) {
        getTaxId().add(taxId);
        return this;
    }

}
