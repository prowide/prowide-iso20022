
package com.prowidesoftware.swift.model.mx.sys.dic;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Java class for VldtyPrd complex type.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VldtyPrd", namespace = "urn:swift:snl:ns.Doc", propOrder = {
    "frDt",
    "toDt"
})
public class DocVldtyPrd {

    @XmlElement(name = "FrDt")
    protected String frDt;
    @XmlElement(name = "ToDt")
    protected String toDt;

    /**
     * Gets the value of the frDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFrDt() {
        return frDt;
    }

    /**
     * Sets the value of the frDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public DocVldtyPrd setFrDt(String value) {
        this.frDt = value;
        return this;
    }

    /**
     * Gets the value of the toDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToDt() {
        return toDt;
    }

    /**
     * Sets the value of the toDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public DocVldtyPrd setToDt(String value) {
        this.toDt = value;
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
