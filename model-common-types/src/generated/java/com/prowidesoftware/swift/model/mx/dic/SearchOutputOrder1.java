
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
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the critOrdr property.
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
     */
    public List<CriteriaOrder1> getCritOrdr() {
        if (critOrdr == null) {
            critOrdr = new ArrayList<CriteriaOrder1>();
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
