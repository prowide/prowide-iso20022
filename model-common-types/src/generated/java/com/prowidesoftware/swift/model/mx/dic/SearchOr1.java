
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
 * List of criteria following the OR logic.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchOr1", propOrder = {
    "schAnd"
})
public class SearchOr1 {

    @XmlElement(name = "SchAnd", required = true)
    protected List<SearchAnd1> schAnd;

    /**
     * Gets the value of the schAnd property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the schAnd property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSchAnd().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchAnd1 }
     * 
     * 
     * @return
     *     The value of the schAnd property.
     */
    public List<SearchAnd1> getSchAnd() {
        if (schAnd == null) {
            schAnd = new ArrayList<>();
        }
        return this.schAnd;
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
     * Adds a new item to the schAnd list.
     * @see #getSchAnd()
     * 
     */
    public SearchOr1 addSchAnd(SearchAnd1 schAnd) {
        getSchAnd().add(schAnd);
        return this;
    }

}
