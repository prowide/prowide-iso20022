
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateAdapter;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Details an individual country including its name and country code.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecuritiesCountryIdentification2", propOrder = {
    "ctry",
    "eeaCtry",
    "mod",
    "vldtyPrd",
    "lastUpdtd"
})
public class SecuritiesCountryIdentification2 {

    @XmlElement(name = "Ctry", required = true)
    protected CountryCodeAndName3 ctry;
    @XmlElement(name = "EEACtry")
    protected boolean eeaCtry;
    @XmlElement(name = "Mod")
    @XmlSchemaType(name = "string")
    protected Modification1Code mod;
    @XmlElement(name = "VldtyPrd", required = true)
    protected Period4Choice vldtyPrd;
    @XmlElement(name = "LastUpdtd", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar lastUpdtd;

    /**
     * Gets the value of the ctry property.
     * 
     * @return
     *     possible object is
     *     {@link CountryCodeAndName3 }
     *     
     */
    public CountryCodeAndName3 getCtry() {
        return ctry;
    }

    /**
     * Sets the value of the ctry property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryCodeAndName3 }
     *     
     */
    public SecuritiesCountryIdentification2 setCtry(CountryCodeAndName3 value) {
        this.ctry = value;
        return this;
    }

    /**
     * Gets the value of the eeaCtry property.
     * 
     */
    public boolean isEEACtry() {
        return eeaCtry;
    }

    /**
     * Sets the value of the eeaCtry property.
     * 
     */
    public SecuritiesCountryIdentification2 setEEACtry(boolean value) {
        this.eeaCtry = value;
        return this;
    }

    /**
     * Gets the value of the mod property.
     * 
     * @return
     *     possible object is
     *     {@link Modification1Code }
     *     
     */
    public Modification1Code getMod() {
        return mod;
    }

    /**
     * Sets the value of the mod property.
     * 
     * @param value
     *     allowed object is
     *     {@link Modification1Code }
     *     
     */
    public SecuritiesCountryIdentification2 setMod(Modification1Code value) {
        this.mod = value;
        return this;
    }

    /**
     * Gets the value of the vldtyPrd property.
     * 
     * @return
     *     possible object is
     *     {@link Period4Choice }
     *     
     */
    public Period4Choice getVldtyPrd() {
        return vldtyPrd;
    }

    /**
     * Sets the value of the vldtyPrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Period4Choice }
     *     
     */
    public SecuritiesCountryIdentification2 setVldtyPrd(Period4Choice value) {
        this.vldtyPrd = value;
        return this;
    }

    /**
     * Gets the value of the lastUpdtd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public XMLGregorianCalendar getLastUpdtd() {
        return lastUpdtd;
    }

    /**
     * Sets the value of the lastUpdtd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SecuritiesCountryIdentification2 setLastUpdtd(XMLGregorianCalendar value) {
        this.lastUpdtd = value;
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
