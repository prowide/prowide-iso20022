
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
 * Total amount of commissions related to a specific order.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TotalCommissions2", propOrder = {
    "ttlAmtOfComssns",
    "comssnDtls"
})
public class TotalCommissions2 {

    @XmlElement(name = "TtlAmtOfComssns")
    protected ActiveCurrencyAnd13DecimalAmount ttlAmtOfComssns;
    @XmlElement(name = "ComssnDtls", required = true)
    protected List<Commission6> comssnDtls;

    /**
     * Gets the value of the ttlAmtOfComssns property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAnd13DecimalAmount }
     *     
     */
    public ActiveCurrencyAnd13DecimalAmount getTtlAmtOfComssns() {
        return ttlAmtOfComssns;
    }

    /**
     * Sets the value of the ttlAmtOfComssns property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAnd13DecimalAmount }
     *     
     */
    public TotalCommissions2 setTtlAmtOfComssns(ActiveCurrencyAnd13DecimalAmount value) {
        this.ttlAmtOfComssns = value;
        return this;
    }

    /**
     * Gets the value of the comssnDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the comssnDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getComssnDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Commission6 }
     * 
     * 
     */
    public List<Commission6> getComssnDtls() {
        if (comssnDtls == null) {
            comssnDtls = new ArrayList<Commission6>();
        }
        return this.comssnDtls;
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
     * Adds a new item to the comssnDtls list.
     * @see #getComssnDtls()
     * 
     */
    public TotalCommissions2 addComssnDtls(Commission6 comssnDtls) {
        getComssnDtls().add(comssnDtls);
        return this;
    }

}
