
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
 * Indicates the schedule or frequency of the derivative transactions.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QuantityOrTerm1Choice", propOrder = {
    "schdlPrd",
    "term"
})
public class QuantityOrTerm1Choice {

    @XmlElement(name = "SchdlPrd")
    protected List<Schedule10> schdlPrd;
    @XmlElement(name = "Term")
    protected QuantityTerm1 term;

    /**
     * Gets the value of the schdlPrd property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the schdlPrd property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSchdlPrd().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Schedule10 }
     * 
     * 
     */
    public List<Schedule10> getSchdlPrd() {
        if (schdlPrd == null) {
            schdlPrd = new ArrayList<Schedule10>();
        }
        return this.schdlPrd;
    }

    /**
     * Gets the value of the term property.
     * 
     * @return
     *     possible object is
     *     {@link QuantityTerm1 }
     *     
     */
    public QuantityTerm1 getTerm() {
        return term;
    }

    /**
     * Sets the value of the term property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantityTerm1 }
     *     
     */
    public QuantityOrTerm1Choice setTerm(QuantityTerm1 value) {
        this.term = value;
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
     * Adds a new item to the schdlPrd list.
     * @see #getSchdlPrd()
     * 
     */
    public QuantityOrTerm1Choice addSchdlPrd(Schedule10 schdlPrd) {
        getSchdlPrd().add(schdlPrd);
        return this;
    }

}
