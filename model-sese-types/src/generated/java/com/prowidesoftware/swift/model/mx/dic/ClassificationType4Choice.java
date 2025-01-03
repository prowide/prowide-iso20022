
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
 * Choice of format for the classification.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClassificationType4Choice", propOrder = {
    "clssfctnFinInstrm",
    "altrnClssfctn"
})
public class ClassificationType4Choice {

    @XmlElement(name = "ClssfctnFinInstrm")
    protected String clssfctnFinInstrm;
    @XmlElement(name = "AltrnClssfctn")
    protected GenericIdentification18 altrnClssfctn;

    /**
     * Gets the value of the clssfctnFinInstrm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClssfctnFinInstrm() {
        return clssfctnFinInstrm;
    }

    /**
     * Sets the value of the clssfctnFinInstrm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ClassificationType4Choice setClssfctnFinInstrm(String value) {
        this.clssfctnFinInstrm = value;
        return this;
    }

    /**
     * Gets the value of the altrnClssfctn property.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification18 }
     *     
     */
    public GenericIdentification18 getAltrnClssfctn() {
        return altrnClssfctn;
    }

    /**
     * Sets the value of the altrnClssfctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification18 }
     *     
     */
    public ClassificationType4Choice setAltrnClssfctn(GenericIdentification18 value) {
        this.altrnClssfctn = value;
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
