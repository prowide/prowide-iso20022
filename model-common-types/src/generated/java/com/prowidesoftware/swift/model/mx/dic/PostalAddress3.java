
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Information that locates and identifies a specific address, as defined by postal services.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PostalAddress3", propOrder = {
    "adrTp",
    "mlngInd",
    "regnAdrInd",
    "nmAndAdr"
})
public class PostalAddress3 {

    @XmlElement(name = "AdrTp", required = true)
    @XmlSchemaType(name = "string")
    protected AddressType1Code adrTp;
    @XmlElement(name = "MlngInd")
    protected boolean mlngInd;
    @XmlElement(name = "RegnAdrInd")
    protected boolean regnAdrInd;
    @XmlElement(name = "NmAndAdr", required = true)
    protected NameAndAddress4 nmAndAdr;

    /**
     * Gets the value of the adrTp property.
     * 
     * @return
     *     possible object is
     *     {@link AddressType1Code }
     *     
     */
    public AddressType1Code getAdrTp() {
        return adrTp;
    }

    /**
     * Sets the value of the adrTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressType1Code }
     *     
     */
    public PostalAddress3 setAdrTp(AddressType1Code value) {
        this.adrTp = value;
        return this;
    }

    /**
     * Gets the value of the mlngInd property.
     * 
     */
    public boolean isMlngInd() {
        return mlngInd;
    }

    /**
     * Sets the value of the mlngInd property.
     * 
     */
    public PostalAddress3 setMlngInd(boolean value) {
        this.mlngInd = value;
        return this;
    }

    /**
     * Gets the value of the regnAdrInd property.
     * 
     */
    public boolean isRegnAdrInd() {
        return regnAdrInd;
    }

    /**
     * Sets the value of the regnAdrInd property.
     * 
     */
    public PostalAddress3 setRegnAdrInd(boolean value) {
        this.regnAdrInd = value;
        return this;
    }

    /**
     * Gets the value of the nmAndAdr property.
     * 
     * @return
     *     possible object is
     *     {@link NameAndAddress4 }
     *     
     */
    public NameAndAddress4 getNmAndAdr() {
        return nmAndAdr;
    }

    /**
     * Sets the value of the nmAndAdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link NameAndAddress4 }
     *     
     */
    public PostalAddress3 setNmAndAdr(NameAndAddress4 value) {
        this.nmAndAdr = value;
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
