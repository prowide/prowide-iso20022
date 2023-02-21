
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
 * Provides the list of countries where the fund is registered for distribution or the reason why no registered distribution country may be reported for the money market fund.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RegisteredDistributionCountry1Choice", propOrder = {
    "noRegdDstrbtnCtry",
    "ctry"
})
public class RegisteredDistributionCountry1Choice {

    @XmlElement(name = "NoRegdDstrbtnCtry")
    protected String noRegdDstrbtnCtry;
    @XmlElement(name = "Ctry")
    protected List<String> ctry;

    /**
     * Gets the value of the noRegdDstrbtnCtry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoRegdDstrbtnCtry() {
        return noRegdDstrbtnCtry;
    }

    /**
     * Sets the value of the noRegdDstrbtnCtry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public RegisteredDistributionCountry1Choice setNoRegdDstrbtnCtry(String value) {
        this.noRegdDstrbtnCtry = value;
        return this;
    }

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
    public RegisteredDistributionCountry1Choice addCtry(String ctry) {
        getCtry().add(ctry);
        return this;
    }

}
