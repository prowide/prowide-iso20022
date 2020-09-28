
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
 * Specifies the identification of the issuer of a security.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecurityIssuer1", propOrder = {
    "lei",
    "jursdctnCtry"
})
public class SecurityIssuer1 {

    @XmlElement(name = "LEI", required = true)
    protected String lei;
    @XmlElement(name = "JursdctnCtry", required = true)
    protected String jursdctnCtry;

    /**
     * Gets the value of the lei property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLEI() {
        return lei;
    }

    /**
     * Sets the value of the lei property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SecurityIssuer1 setLEI(String value) {
        this.lei = value;
        return this;
    }

    /**
     * Gets the value of the jursdctnCtry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJursdctnCtry() {
        return jursdctnCtry;
    }

    /**
     * Sets the value of the jursdctnCtry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SecurityIssuer1 setJursdctnCtry(String value) {
        this.jursdctnCtry = value;
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
