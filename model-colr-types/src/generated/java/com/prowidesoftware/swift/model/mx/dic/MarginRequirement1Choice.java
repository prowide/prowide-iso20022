
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Provides the margin requirements for the variation margin and the segregated independent amount, or the segregated independent amount only.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MarginRequirement1Choice", propOrder = {
    "mrgnRqrmnt",
    "sgrtdIndpdntAmtRqrmnt"
})
public class MarginRequirement1Choice {

    @XmlElement(name = "MrgnRqrmnt")
    protected Requirement1 mrgnRqrmnt;
    @XmlElement(name = "SgrtdIndpdntAmtRqrmnt")
    protected MarginRequirement1 sgrtdIndpdntAmtRqrmnt;

    /**
     * Gets the value of the mrgnRqrmnt property.
     * 
     * @return
     *     possible object is
     *     {@link Requirement1 }
     *     
     */
    public Requirement1 getMrgnRqrmnt() {
        return mrgnRqrmnt;
    }

    /**
     * Sets the value of the mrgnRqrmnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Requirement1 }
     *     
     */
    public MarginRequirement1Choice setMrgnRqrmnt(Requirement1 value) {
        this.mrgnRqrmnt = value;
        return this;
    }

    /**
     * Gets the value of the sgrtdIndpdntAmtRqrmnt property.
     * 
     * @return
     *     possible object is
     *     {@link MarginRequirement1 }
     *     
     */
    public MarginRequirement1 getSgrtdIndpdntAmtRqrmnt() {
        return sgrtdIndpdntAmtRqrmnt;
    }

    /**
     * Sets the value of the sgrtdIndpdntAmtRqrmnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link MarginRequirement1 }
     *     
     */
    public MarginRequirement1Choice setSgrtdIndpdntAmtRqrmnt(MarginRequirement1 value) {
        this.sgrtdIndpdntAmtRqrmnt = value;
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
