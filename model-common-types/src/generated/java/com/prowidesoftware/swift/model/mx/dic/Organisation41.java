
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
 * Merchant performing the transaction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Organisation41", propOrder = {
    "id",
    "cmonNm",
    "lctnCtgy",
    "lctnAndCtct",
    "schmeData"
})
public class Organisation41 {

    @XmlElement(name = "Id")
    protected GenericIdentification32 id;
    @XmlElement(name = "CmonNm")
    protected String cmonNm;
    @XmlElement(name = "LctnCtgy")
    @XmlSchemaType(name = "string")
    protected LocationCategory4Code lctnCtgy;
    @XmlElement(name = "LctnAndCtct")
    protected CommunicationAddress9 lctnAndCtct;
    @XmlElement(name = "SchmeData")
    protected String schmeData;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification32 }
     *     
     */
    public GenericIdentification32 getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification32 }
     *     
     */
    public Organisation41 setId(GenericIdentification32 value) {
        this.id = value;
        return this;
    }

    /**
     * Gets the value of the cmonNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCmonNm() {
        return cmonNm;
    }

    /**
     * Sets the value of the cmonNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Organisation41 setCmonNm(String value) {
        this.cmonNm = value;
        return this;
    }

    /**
     * Gets the value of the lctnCtgy property.
     * 
     * @return
     *     possible object is
     *     {@link LocationCategory4Code }
     *     
     */
    public LocationCategory4Code getLctnCtgy() {
        return lctnCtgy;
    }

    /**
     * Sets the value of the lctnCtgy property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationCategory4Code }
     *     
     */
    public Organisation41 setLctnCtgy(LocationCategory4Code value) {
        this.lctnCtgy = value;
        return this;
    }

    /**
     * Gets the value of the lctnAndCtct property.
     * 
     * @return
     *     possible object is
     *     {@link CommunicationAddress9 }
     *     
     */
    public CommunicationAddress9 getLctnAndCtct() {
        return lctnAndCtct;
    }

    /**
     * Sets the value of the lctnAndCtct property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommunicationAddress9 }
     *     
     */
    public Organisation41 setLctnAndCtct(CommunicationAddress9 value) {
        this.lctnAndCtct = value;
        return this;
    }

    /**
     * Gets the value of the schmeData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchmeData() {
        return schmeData;
    }

    /**
     * Sets the value of the schmeData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Organisation41 setSchmeData(String value) {
        this.schmeData = value;
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
