
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
 * Choice of format for the securities RTGS information.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecuritiesRTGS1Choice", propOrder = {
    "ind",
    "prtry"
})
public class SecuritiesRTGS1Choice {

    @XmlElement(name = "Ind")
    protected Boolean ind;
    @XmlElement(name = "Prtry")
    protected GenericIdentification20 prtry;

    /**
     * Gets the value of the ind property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInd() {
        return ind;
    }

    /**
     * Sets the value of the ind property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public SecuritiesRTGS1Choice setInd(Boolean value) {
        this.ind = value;
        return this;
    }

    /**
     * Gets the value of the prtry property.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification20 }
     *     
     */
    public GenericIdentification20 getPrtry() {
        return prtry;
    }

    /**
     * Sets the value of the prtry property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification20 }
     *     
     */
    public SecuritiesRTGS1Choice setPrtry(GenericIdentification20 value) {
        this.prtry = value;
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
