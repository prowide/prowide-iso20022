
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
 * Choice of proprietary or domestic identification scheme that uniquely identifies a security.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IdentificationSource1Choice", propOrder = {
    "dmst",
    "prtry"
})
public class IdentificationSource1Choice {

    @XmlElement(name = "Dmst")
    protected String dmst;
    @XmlElement(name = "Prtry")
    protected String prtry;

    /**
     * Gets the value of the dmst property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDmst() {
        return dmst;
    }

    /**
     * Sets the value of the dmst property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public IdentificationSource1Choice setDmst(String value) {
        this.dmst = value;
        return this;
    }

    /**
     * Gets the value of the prtry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrtry() {
        return prtry;
    }

    /**
     * Sets the value of the prtry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public IdentificationSource1Choice setPrtry(String value) {
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
