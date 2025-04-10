
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Identifies a person via its first name and surname.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PersonName3", propOrder = {
    "nmPrfx",
    "frstNm",
    "srnm",
    "adr"
})
public class PersonName3 {

    @XmlElement(name = "NmPrfx")
    @XmlSchemaType(name = "string")
    protected NamePrefix2Code nmPrfx;
    @XmlElement(name = "FrstNm", required = true)
    protected String frstNm;
    @XmlElement(name = "Srnm", required = true)
    protected String srnm;
    @XmlElement(name = "Adr")
    protected PostalAddress26 adr;

    /**
     * Gets the value of the nmPrfx property.
     * 
     * @return
     *     possible object is
     *     {@link NamePrefix2Code }
     *     
     */
    public NamePrefix2Code getNmPrfx() {
        return nmPrfx;
    }

    /**
     * Sets the value of the nmPrfx property.
     * 
     * @param value
     *     allowed object is
     *     {@link NamePrefix2Code }
     *     
     */
    public PersonName3 setNmPrfx(NamePrefix2Code value) {
        this.nmPrfx = value;
        return this;
    }

    /**
     * Gets the value of the frstNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFrstNm() {
        return frstNm;
    }

    /**
     * Sets the value of the frstNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PersonName3 setFrstNm(String value) {
        this.frstNm = value;
        return this;
    }

    /**
     * Gets the value of the srnm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSrnm() {
        return srnm;
    }

    /**
     * Sets the value of the srnm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PersonName3 setSrnm(String value) {
        this.srnm = value;
        return this;
    }

    /**
     * Gets the value of the adr property.
     * 
     * @return
     *     possible object is
     *     {@link PostalAddress26 }
     *     
     */
    public PostalAddress26 getAdr() {
        return adr;
    }

    /**
     * Sets the value of the adr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PostalAddress26 }
     *     
     */
    public PersonName3 setAdr(PostalAddress26 value) {
        this.adr = value;
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
