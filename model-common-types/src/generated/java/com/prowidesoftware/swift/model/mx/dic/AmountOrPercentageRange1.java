
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Provides constrains on a range of business values.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AmountOrPercentageRange1", propOrder = {
    "opr",
    "term"
})
public class AmountOrPercentageRange1 {

    @XmlElement(name = "Opr")
    @XmlSchemaType(name = "string")
    protected Operation1Code opr;
    @XmlElement(name = "Term")
    protected List<Term1> term;

    /**
     * Gets the value of the opr property.
     * 
     * @return
     *     possible object is
     *     {@link Operation1Code }
     *     
     */
    public Operation1Code getOpr() {
        return opr;
    }

    /**
     * Sets the value of the opr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Operation1Code }
     *     
     */
    public AmountOrPercentageRange1 setOpr(Operation1Code value) {
        this.opr = value;
        return this;
    }

    /**
     * Gets the value of the term property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the term property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTerm().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Term1 }
     * 
     * 
     */
    public List<Term1> getTerm() {
        if (term == null) {
            term = new ArrayList<Term1>();
        }
        return this.term;
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
     * Adds a new item to the term list.
     * @see #getTerm()
     * 
     */
    public AmountOrPercentageRange1 addTerm(Term1 term) {
        getTerm().add(term);
        return this;
    }

}
