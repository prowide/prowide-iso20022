
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
 * Choice between a short document number, a long document number or a proprietary document number.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocumentNumber2Choice", propOrder = {
    "shrtNb",
    "lngNb",
    "prtryNb"
})
public class DocumentNumber2Choice {

    @XmlElement(name = "ShrtNb")
    protected String shrtNb;
    @XmlElement(name = "LngNb")
    protected String lngNb;
    @XmlElement(name = "PrtryNb")
    protected GenericIdentification23 prtryNb;

    /**
     * Gets the value of the shrtNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShrtNb() {
        return shrtNb;
    }

    /**
     * Sets the value of the shrtNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public DocumentNumber2Choice setShrtNb(String value) {
        this.shrtNb = value;
        return this;
    }

    /**
     * Gets the value of the lngNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLngNb() {
        return lngNb;
    }

    /**
     * Sets the value of the lngNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public DocumentNumber2Choice setLngNb(String value) {
        this.lngNb = value;
        return this;
    }

    /**
     * Gets the value of the prtryNb property.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification23 }
     *     
     */
    public GenericIdentification23 getPrtryNb() {
        return prtryNb;
    }

    /**
     * Sets the value of the prtryNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification23 }
     *     
     */
    public DocumentNumber2Choice setPrtryNb(GenericIdentification23 value) {
        this.prtryNb = value;
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
