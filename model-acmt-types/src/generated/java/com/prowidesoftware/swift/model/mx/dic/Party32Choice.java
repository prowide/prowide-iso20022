
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Choice of formats for the specification of the party.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Party32Choice", propOrder = {
    "org",
    "indvPrsn"
})
public class Party32Choice {

    @XmlElement(name = "Org")
    protected Organisation30 org;
    @XmlElement(name = "IndvPrsn")
    protected IndividualPerson34 indvPrsn;

    /**
     * Gets the value of the org property.
     * 
     * @return
     *     possible object is
     *     {@link Organisation30 }
     *     
     */
    public Organisation30 getOrg() {
        return org;
    }

    /**
     * Sets the value of the org property.
     * 
     * @param value
     *     allowed object is
     *     {@link Organisation30 }
     *     
     */
    public Party32Choice setOrg(Organisation30 value) {
        this.org = value;
        return this;
    }

    /**
     * Gets the value of the indvPrsn property.
     * 
     * @return
     *     possible object is
     *     {@link IndividualPerson34 }
     *     
     */
    public IndividualPerson34 getIndvPrsn() {
        return indvPrsn;
    }

    /**
     * Sets the value of the indvPrsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndividualPerson34 }
     *     
     */
    public Party32Choice setIndvPrsn(IndividualPerson34 value) {
        this.indvPrsn = value;
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

}
