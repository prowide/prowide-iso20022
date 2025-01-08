
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
 * Contains company related information for Temporary Services.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TemporaryServicesCompany2", propOrder = {
    "nm",
    "dept",
    "id",
    "sprvsr"
})
public class TemporaryServicesCompany2 {

    @XmlElement(name = "Nm")
    protected String nm;
    @XmlElement(name = "Dept")
    protected String dept;
    @XmlElement(name = "Id")
    protected PartyIdentification258 id;
    @XmlElement(name = "Sprvsr")
    protected String sprvsr;

    /**
     * Gets the value of the nm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNm() {
        return nm;
    }

    /**
     * Sets the value of the nm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TemporaryServicesCompany2 setNm(String value) {
        this.nm = value;
        return this;
    }

    /**
     * Gets the value of the dept property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDept() {
        return dept;
    }

    /**
     * Sets the value of the dept property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TemporaryServicesCompany2 setDept(String value) {
        this.dept = value;
        return this;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification258 }
     *     
     */
    public PartyIdentification258 getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification258 }
     *     
     */
    public TemporaryServicesCompany2 setId(PartyIdentification258 value) {
        this.id = value;
        return this;
    }

    /**
     * Gets the value of the sprvsr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSprvsr() {
        return sprvsr;
    }

    /**
     * Sets the value of the sprvsr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TemporaryServicesCompany2 setSprvsr(String value) {
        this.sprvsr = value;
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
