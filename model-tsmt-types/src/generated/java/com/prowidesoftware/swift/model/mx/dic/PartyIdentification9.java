
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
 * Entity involved in an activity.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartyIdentification9", propOrder = {
    "nm",
    "bei",
    "othrSchme",
    "pstlAdr"
})
public class PartyIdentification9 {

    @XmlElement(name = "Nm")
    protected String nm;
    @XmlElement(name = "BEI")
    protected String bei;
    @XmlElement(name = "OthrSchme")
    protected String othrSchme;
    @XmlElement(name = "PstlAdr", required = true)
    protected PostalAddress2 pstlAdr;

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
    public PartyIdentification9 setNm(String value) {
        this.nm = value;
        return this;
    }

    /**
     * Gets the value of the bei property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBEI() {
        return bei;
    }

    /**
     * Sets the value of the bei property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PartyIdentification9 setBEI(String value) {
        this.bei = value;
        return this;
    }

    /**
     * Gets the value of the othrSchme property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOthrSchme() {
        return othrSchme;
    }

    /**
     * Sets the value of the othrSchme property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PartyIdentification9 setOthrSchme(String value) {
        this.othrSchme = value;
        return this;
    }

    /**
     * Gets the value of the pstlAdr property.
     * 
     * @return
     *     possible object is
     *     {@link PostalAddress2 }
     *     
     */
    public PostalAddress2 getPstlAdr() {
        return pstlAdr;
    }

    /**
     * Sets the value of the pstlAdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PostalAddress2 }
     *     
     */
    public PartyIdentification9 setPstlAdr(PostalAddress2 value) {
        this.pstlAdr = value;
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
