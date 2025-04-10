
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
 * Indicates the ordering in which the resulting transaction reports should be returned.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchOutputOrder1", propOrder = {
    "critOrdr"
})
public class SearchOutputOrder1 {

    @XmlElement(name = "CritOrdr", required = true)
    protected List<CriteriaOrder1> critOrdr;

    /**
     * Gets the value of the critOrdr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the critOrdr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCritOrdr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CriteriaOrder1 }
     * 
     * 
     * @return
     *     The value of the critOrdr property.
     */
    public List<CriteriaOrder1> getCritOrdr() {
        if (critOrdr == null) {
            critOrdr = new ArrayList<>();
        }
        return this.critOrdr;
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
     * Adds a new item to the critOrdr list.
     * @see #getCritOrdr()
     * 
     */
    public SearchOutputOrder1 addCritOrdr(CriteriaOrder1 critOrdr) {
        getCritOrdr().add(critOrdr);
        return this;
    }

}
