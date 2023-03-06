
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
 * Information about a price report.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PriceReport3", propOrder = {
    "pricValtnDtls"
})
public class PriceReport3 {

    @XmlElement(name = "PricValtnDtls", required = true)
    protected List<PriceValuation4> pricValtnDtls;

    /**
     * Gets the value of the pricValtnDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pricValtnDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPricValtnDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PriceValuation4 }
     * 
     * 
     */
    public List<PriceValuation4> getPricValtnDtls() {
        if (pricValtnDtls == null) {
            pricValtnDtls = new ArrayList<PriceValuation4>();
        }
        return this.pricValtnDtls;
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
     * Adds a new item to the pricValtnDtls list.
     * @see #getPricValtnDtls()
     * 
     */
    public PriceReport3 addPricValtnDtls(PriceValuation4 pricValtnDtls) {
        getPricValtnDtls().add(pricValtnDtls);
        return this;
    }

}
