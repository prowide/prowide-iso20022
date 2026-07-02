
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
 * Processing information specific to a local market.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LocalMarketAnnex", propOrder = {
    "ctry",
    "lclOrdrDsk"
})
public class LocalMarketAnnex {

    @XmlElement(name = "Ctry", required = true)
    protected List<String> ctry;
    @XmlElement(name = "LclOrdrDsk", required = true)
    protected OrderDeskContactDetails lclOrdrDsk;

    /**
     * Gets the value of the ctry property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ctry property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCtry().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getCtry() {
        if (ctry == null) {
            ctry = new ArrayList<String>();
        }
        return this.ctry;
    }

    /**
     * Gets the value of the lclOrdrDsk property.
     * 
     * @return
     *     possible object is
     *     {@link OrderDeskContactDetails }
     *     
     */
    public OrderDeskContactDetails getLclOrdrDsk() {
        return lclOrdrDsk;
    }

    /**
     * Sets the value of the lclOrdrDsk property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderDeskContactDetails }
     *     
     */
    public LocalMarketAnnex setLclOrdrDsk(OrderDeskContactDetails value) {
        this.lclOrdrDsk = value;
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
     * Adds a new item to the ctry list.
     * @see #getCtry()
     * 
     */
    public LocalMarketAnnex addCtry(String ctry) {
        getCtry().add(ctry);
        return this;
    }

}
