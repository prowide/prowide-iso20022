
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
 * Provides details about the margin requirements for the variation margin and optionally the segregated independent amount.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Requirement1", propOrder = {
    "vartnMrgnRqrmnt",
    "sgrtdIndpdntAmtRqrmnt"
})
public class Requirement1 {

    @XmlElement(name = "VartnMrgnRqrmnt", required = true)
    protected MarginRequirement1 vartnMrgnRqrmnt;
    @XmlElement(name = "SgrtdIndpdntAmtRqrmnt")
    protected MarginRequirement1 sgrtdIndpdntAmtRqrmnt;

    /**
     * Gets the value of the vartnMrgnRqrmnt property.
     * 
     * @return
     *     possible object is
     *     {@link MarginRequirement1 }
     *     
     */
    public MarginRequirement1 getVartnMrgnRqrmnt() {
        return vartnMrgnRqrmnt;
    }

    /**
     * Sets the value of the vartnMrgnRqrmnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link MarginRequirement1 }
     *     
     */
    public Requirement1 setVartnMrgnRqrmnt(MarginRequirement1 value) {
        this.vartnMrgnRqrmnt = value;
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
    public Requirement1 setSgrtdIndpdntAmtRqrmnt(MarginRequirement1 value) {
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
