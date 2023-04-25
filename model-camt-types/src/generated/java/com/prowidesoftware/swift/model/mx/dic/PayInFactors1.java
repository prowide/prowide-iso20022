
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
 * Factors used in the calculation of the pay in schedule.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PayInFactors1", propOrder = {
    "aggtShrtPosLmt",
    "ccyFctrs"
})
public class PayInFactors1 {

    @XmlElement(name = "AggtShrtPosLmt", required = true)
    protected ActiveCurrencyAndAmount aggtShrtPosLmt;
    @XmlElement(name = "CcyFctrs", required = true)
    protected List<CurrencyFactors1> ccyFctrs;

    /**
     * Gets the value of the aggtShrtPosLmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getAggtShrtPosLmt() {
        return aggtShrtPosLmt;
    }

    /**
     * Sets the value of the aggtShrtPosLmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public PayInFactors1 setAggtShrtPosLmt(ActiveCurrencyAndAmount value) {
        this.aggtShrtPosLmt = value;
        return this;
    }

    /**
     * Gets the value of the ccyFctrs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the ccyFctrs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCcyFctrs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CurrencyFactors1 }
     * 
     * 
     * @return
     *     The value of the ccyFctrs property.
     */
    public List<CurrencyFactors1> getCcyFctrs() {
        if (ccyFctrs == null) {
            ccyFctrs = new ArrayList<>();
        }
        return this.ccyFctrs;
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
     * Adds a new item to the ccyFctrs list.
     * @see #getCcyFctrs()
     * 
     */
    public PayInFactors1 addCcyFctrs(CurrencyFactors1 ccyFctrs) {
        getCcyFctrs().add(ccyFctrs);
        return this;
    }

}
