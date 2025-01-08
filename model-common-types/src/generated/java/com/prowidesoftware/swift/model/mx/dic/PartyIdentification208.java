
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
 * Identification of a party.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartyIdentification208", propOrder = {
    "tp",
    "othrTp",
    "id",
    "assgnr"
})
public class PartyIdentification208 {

    @XmlElement(name = "Tp", required = true)
    protected String tp;
    @XmlElement(name = "OthrTp")
    protected String othrTp;
    @XmlElement(name = "Id", required = true)
    protected String id;
    @XmlElement(name = "Assgnr")
    protected String assgnr;

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PartyIdentification208 setTp(String value) {
        this.tp = value;
        return this;
    }

    /**
     * Gets the value of the othrTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOthrTp() {
        return othrTp;
    }

    /**
     * Sets the value of the othrTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PartyIdentification208 setOthrTp(String value) {
        this.othrTp = value;
        return this;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PartyIdentification208 setId(String value) {
        this.id = value;
        return this;
    }

    /**
     * Gets the value of the assgnr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssgnr() {
        return assgnr;
    }

    /**
     * Sets the value of the assgnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PartyIdentification208 setAssgnr(String value) {
        this.assgnr = value;
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
