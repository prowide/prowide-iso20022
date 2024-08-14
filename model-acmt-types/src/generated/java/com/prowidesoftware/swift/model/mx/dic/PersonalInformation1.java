
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
 * Information related to the identification of a person.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PersonalInformation1", propOrder = {
    "nmOfFthr",
    "mdnNmOfMthr",
    "nmOfPrtnr"
})
public class PersonalInformation1 {

    @XmlElement(name = "NmOfFthr")
    protected String nmOfFthr;
    @XmlElement(name = "MdnNmOfMthr")
    protected String mdnNmOfMthr;
    @XmlElement(name = "NmOfPrtnr")
    protected String nmOfPrtnr;

    /**
     * Gets the value of the nmOfFthr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNmOfFthr() {
        return nmOfFthr;
    }

    /**
     * Sets the value of the nmOfFthr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PersonalInformation1 setNmOfFthr(String value) {
        this.nmOfFthr = value;
        return this;
    }

    /**
     * Gets the value of the mdnNmOfMthr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMdnNmOfMthr() {
        return mdnNmOfMthr;
    }

    /**
     * Sets the value of the mdnNmOfMthr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PersonalInformation1 setMdnNmOfMthr(String value) {
        this.mdnNmOfMthr = value;
        return this;
    }

    /**
     * Gets the value of the nmOfPrtnr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNmOfPrtnr() {
        return nmOfPrtnr;
    }

    /**
     * Sets the value of the nmOfPrtnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PersonalInformation1 setNmOfPrtnr(String value) {
        this.nmOfPrtnr = value;
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
