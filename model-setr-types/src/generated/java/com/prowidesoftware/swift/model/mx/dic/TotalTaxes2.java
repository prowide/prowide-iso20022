
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
 * Information regarding the total amount of taxes.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TotalTaxes2", propOrder = {
    "ttlAmtOfTaxs",
    "taxDtls"
})
public class TotalTaxes2 {

    @XmlElement(name = "TtlAmtOfTaxs")
    protected ActiveCurrencyAnd13DecimalAmount ttlAmtOfTaxs;
    @XmlElement(name = "TaxDtls", required = true)
    protected List<Tax7> taxDtls;

    /**
     * Gets the value of the ttlAmtOfTaxs property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAnd13DecimalAmount }
     *     
     */
    public ActiveCurrencyAnd13DecimalAmount getTtlAmtOfTaxs() {
        return ttlAmtOfTaxs;
    }

    /**
     * Sets the value of the ttlAmtOfTaxs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAnd13DecimalAmount }
     *     
     */
    public TotalTaxes2 setTtlAmtOfTaxs(ActiveCurrencyAnd13DecimalAmount value) {
        this.ttlAmtOfTaxs = value;
        return this;
    }

    /**
     * Gets the value of the taxDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the taxDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTaxDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Tax7 }
     * 
     * 
     */
    public List<Tax7> getTaxDtls() {
        if (taxDtls == null) {
            taxDtls = new ArrayList<Tax7>();
        }
        return this.taxDtls;
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
     * Adds a new item to the taxDtls list.
     * @see #getTaxDtls()
     * 
     */
    public TotalTaxes2 addTaxDtls(Tax7 taxDtls) {
        getTaxDtls().add(taxDtls);
        return this;
    }

}
