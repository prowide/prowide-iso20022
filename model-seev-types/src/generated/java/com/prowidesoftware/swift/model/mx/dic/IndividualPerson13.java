
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
 * Human entity, as distinguished from a corporate entity (which is sometimes referred to as an 'artificial person').
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IndividualPerson13", propOrder = {
    "birthNm",
    "gvnNm",
    "id",
    "adr",
    "emplngPty",
    "attndncCardDtls"
})
public class IndividualPerson13 {

    @XmlElement(name = "BirthNm", required = true)
    protected String birthNm;
    @XmlElement(name = "GvnNm")
    protected String gvnNm;
    @XmlElement(name = "Id")
    protected PersonIdentification2 id;
    @XmlElement(name = "Adr")
    protected LongPostalAddress2Choice adr;
    @XmlElement(name = "EmplngPty")
    protected PartyIdentification9Choice emplngPty;
    @XmlElement(name = "AttndncCardDtls", required = true)
    protected AttendanceCard1 attndncCardDtls;

    /**
     * Gets the value of the birthNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBirthNm() {
        return birthNm;
    }

    /**
     * Sets the value of the birthNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public IndividualPerson13 setBirthNm(String value) {
        this.birthNm = value;
        return this;
    }

    /**
     * Gets the value of the gvnNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGvnNm() {
        return gvnNm;
    }

    /**
     * Sets the value of the gvnNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public IndividualPerson13 setGvnNm(String value) {
        this.gvnNm = value;
        return this;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link PersonIdentification2 }
     *     
     */
    public PersonIdentification2 getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonIdentification2 }
     *     
     */
    public IndividualPerson13 setId(PersonIdentification2 value) {
        this.id = value;
        return this;
    }

    /**
     * Gets the value of the adr property.
     * 
     * @return
     *     possible object is
     *     {@link LongPostalAddress2Choice }
     *     
     */
    public LongPostalAddress2Choice getAdr() {
        return adr;
    }

    /**
     * Sets the value of the adr property.
     * 
     * @param value
     *     allowed object is
     *     {@link LongPostalAddress2Choice }
     *     
     */
    public IndividualPerson13 setAdr(LongPostalAddress2Choice value) {
        this.adr = value;
        return this;
    }

    /**
     * Gets the value of the emplngPty property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification9Choice }
     *     
     */
    public PartyIdentification9Choice getEmplngPty() {
        return emplngPty;
    }

    /**
     * Sets the value of the emplngPty property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification9Choice }
     *     
     */
    public IndividualPerson13 setEmplngPty(PartyIdentification9Choice value) {
        this.emplngPty = value;
        return this;
    }

    /**
     * Gets the value of the attndncCardDtls property.
     * 
     * @return
     *     possible object is
     *     {@link AttendanceCard1 }
     *     
     */
    public AttendanceCard1 getAttndncCardDtls() {
        return attndncCardDtls;
    }

    /**
     * Sets the value of the attndncCardDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link AttendanceCard1 }
     *     
     */
    public IndividualPerson13 setAttndncCardDtls(AttendanceCard1 value) {
        this.attndncCardDtls = value;
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
