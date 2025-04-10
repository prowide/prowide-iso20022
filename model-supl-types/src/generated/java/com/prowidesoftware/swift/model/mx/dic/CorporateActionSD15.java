
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Contains details about called certificates.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorporateActionSD15", propOrder = {
    "certNb",
    "certClldAmt"
})
public class CorporateActionSD15 {

    @XmlElement(name = "CertNb", required = true)
    protected String certNb;
    @XmlElement(name = "CertClldAmt", required = true)
    protected BigDecimal certClldAmt;

    /**
     * Gets the value of the certNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCertNb() {
        return certNb;
    }

    /**
     * Sets the value of the certNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CorporateActionSD15 setCertNb(String value) {
        this.certNb = value;
        return this;
    }

    /**
     * Gets the value of the certClldAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCertClldAmt() {
        return certClldAmt;
    }

    /**
     * Sets the value of the certClldAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public CorporateActionSD15 setCertClldAmt(BigDecimal value) {
        this.certClldAmt = value;
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
