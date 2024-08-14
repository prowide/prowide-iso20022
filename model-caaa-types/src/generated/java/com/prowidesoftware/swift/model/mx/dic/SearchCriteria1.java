
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
 * Eligibility parameters for a transaction to be part of transaction report.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchCriteria1", propOrder = {
    "schOr"
})
public class SearchCriteria1 {

    @XmlElement(name = "SchOr", required = true)
    protected List<SearchOr1> schOr;

    /**
     * Gets the value of the schOr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the schOr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSchOr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchOr1 }
     * 
     * 
     * @return
     *     The value of the schOr property.
     */
    public List<SearchOr1> getSchOr() {
        if (schOr == null) {
            schOr = new ArrayList<>();
        }
        return this.schOr;
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
     * Adds a new item to the schOr list.
     * @see #getSchOr()
     * 
     */
    public SearchCriteria1 addSchOr(SearchOr1 schOr) {
        getSchOr().add(schOr);
        return this;
    }

}
