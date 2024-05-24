
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
 * Provides the details for the tax calculation method C.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BillingMethod4", propOrder = {
    "svcDtl",
    "taxClctn"
})
public class BillingMethod4 {

    @XmlElement(name = "SvcDtl", required = true)
    protected List<BillingServiceParameters2> svcDtl;
    @XmlElement(name = "TaxClctn", required = true)
    protected TaxCalculation1 taxClctn;

    /**
     * Gets the value of the svcDtl property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the svcDtl property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSvcDtl().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BillingServiceParameters2 }
     * 
     * 
     * @return
     *     The value of the svcDtl property.
     */
    public List<BillingServiceParameters2> getSvcDtl() {
        if (svcDtl == null) {
            svcDtl = new ArrayList<>();
        }
        return this.svcDtl;
    }

    /**
     * Gets the value of the taxClctn property.
     * 
     * @return
     *     possible object is
     *     {@link TaxCalculation1 }
     *     
     */
    public TaxCalculation1 getTaxClctn() {
        return taxClctn;
    }

    /**
     * Sets the value of the taxClctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxCalculation1 }
     *     
     */
    public BillingMethod4 setTaxClctn(TaxCalculation1 value) {
        this.taxClctn = value;
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
     * Adds a new item to the svcDtl list.
     * @see #getSvcDtl()
     * 
     */
    public BillingMethod4 addSvcDtl(BillingServiceParameters2 svcDtl) {
        getSvcDtl().add(svcDtl);
        return this;
    }

}
