
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
 * Identification of the entity issuing the command.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ATMCommandIdentification1", propOrder = {
    "orgn",
    "ref",
    "prcr"
})
public class ATMCommandIdentification1 {

    @XmlElement(name = "Orgn")
    protected String orgn;
    @XmlElement(name = "Ref")
    protected String ref;
    @XmlElement(name = "Prcr")
    protected String prcr;

    /**
     * Gets the value of the orgn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgn() {
        return orgn;
    }

    /**
     * Sets the value of the orgn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ATMCommandIdentification1 setOrgn(String value) {
        this.orgn = value;
        return this;
    }

    /**
     * Gets the value of the ref property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRef() {
        return ref;
    }

    /**
     * Sets the value of the ref property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ATMCommandIdentification1 setRef(String value) {
        this.ref = value;
        return this;
    }

    /**
     * Gets the value of the prcr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrcr() {
        return prcr;
    }

    /**
     * Sets the value of the prcr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ATMCommandIdentification1 setPrcr(String value) {
        this.prcr = value;
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
