
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Type of movement preliminary advice document.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorporateActionPreliminaryAdviceType2", propOrder = {
    "tp",
    "elgbltyInd"
})
public class CorporateActionPreliminaryAdviceType2 {

    @XmlElement(name = "Tp", required = true)
    @XmlSchemaType(name = "string")
    protected CorporateActionPreliminaryAdviceType1Code tp;
    @XmlElement(name = "ElgbltyInd")
    protected Boolean elgbltyInd;

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionPreliminaryAdviceType1Code }
     *     
     */
    public CorporateActionPreliminaryAdviceType1Code getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionPreliminaryAdviceType1Code }
     *     
     */
    public CorporateActionPreliminaryAdviceType2 setTp(CorporateActionPreliminaryAdviceType1Code value) {
        this.tp = value;
        return this;
    }

    /**
     * Gets the value of the elgbltyInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isElgbltyInd() {
        return elgbltyInd;
    }

    /**
     * Sets the value of the elgbltyInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public CorporateActionPreliminaryAdviceType2 setElgbltyInd(Boolean value) {
        this.elgbltyInd = value;
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
