
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
 * Reports either on currency exchange information or on a business error.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExchangeRateReportOrError4Choice", propOrder = {
    "bizErr",
    "ccyXchg"
})
public class ExchangeRateReportOrError4Choice {

    @XmlElement(name = "BizErr")
    protected List<ErrorHandling3> bizErr;
    @XmlElement(name = "CcyXchg")
    protected CurrencyExchange20 ccyXchg;

    /**
     * Gets the value of the bizErr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the bizErr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBizErr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ErrorHandling3 }
     * 
     * 
     * @return
     *     The value of the bizErr property.
     */
    public List<ErrorHandling3> getBizErr() {
        if (bizErr == null) {
            bizErr = new ArrayList<>();
        }
        return this.bizErr;
    }

    /**
     * Gets the value of the ccyXchg property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyExchange20 }
     *     
     */
    public CurrencyExchange20 getCcyXchg() {
        return ccyXchg;
    }

    /**
     * Sets the value of the ccyXchg property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyExchange20 }
     *     
     */
    public ExchangeRateReportOrError4Choice setCcyXchg(CurrencyExchange20 value) {
        this.ccyXchg = value;
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
     * Adds a new item to the bizErr list.
     * @see #getBizErr()
     * 
     */
    public ExchangeRateReportOrError4Choice addBizErr(ErrorHandling3 bizErr) {
        getBizErr().add(bizErr);
        return this;
    }

}
