
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
 * Reason why the service is taxed.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaxReason1", propOrder = {
    "cd",
    "expltn"
})
public class TaxReason1 {

    @XmlElement(name = "Cd", required = true)
    protected String cd;
    @XmlElement(name = "Expltn", required = true)
    protected String expltn;

    /**
     * Gets the value of the cd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCd() {
        return cd;
    }

    /**
     * Sets the value of the cd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TaxReason1 setCd(String value) {
        this.cd = value;
        return this;
    }

    /**
     * Gets the value of the expltn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpltn() {
        return expltn;
    }

    /**
     * Sets the value of the expltn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TaxReason1 setExpltn(String value) {
        this.expltn = value;
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
