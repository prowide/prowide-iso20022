
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
@XmlType(name = "IndividualPerson26", propOrder = {
    "birthNm",
    "gvnNm",
    "id",
    "adr",
    "emplngPty",
    "attndncCardDtls"
})
public class IndividualPerson26 {

    @XmlElement(name = "BirthNm", required = true)
    protected String birthNm;
    @XmlElement(name = "GvnNm")
    protected String gvnNm;
    @XmlElement(name = "Id")
    protected PersonIdentification6 id;
    @XmlElement(name = "Adr")
    protected LongPostalAddress2Choice adr;
    @XmlElement(name = "EmplngPty")
    protected PartyIdentification40Choice emplngPty;
    @XmlElement(name = "AttndncCardDtls", required = true)
    protected AttendanceCard2 attndncCardDtls;

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
    public IndividualPerson26 setBirthNm(String value) {
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
    public IndividualPerson26 setGvnNm(String value) {
        this.gvnNm = value;
        return this;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link PersonIdentification6 }
     *     
     */
    public PersonIdentification6 getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonIdentification6 }
     *     
     */
    public IndividualPerson26 setId(PersonIdentification6 value) {
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
    public IndividualPerson26 setAdr(LongPostalAddress2Choice value) {
        this.adr = value;
        return this;
    }

    /**
     * Gets the value of the emplngPty property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification40Choice }
     *     
     */
    public PartyIdentification40Choice getEmplngPty() {
        return emplngPty;
    }

    /**
     * Sets the value of the emplngPty property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification40Choice }
     *     
     */
    public IndividualPerson26 setEmplngPty(PartyIdentification40Choice value) {
        this.emplngPty = value;
        return this;
    }

    /**
     * Gets the value of the attndncCardDtls property.
     * 
     * @return
     *     possible object is
     *     {@link AttendanceCard2 }
     *     
     */
    public AttendanceCard2 getAttndncCardDtls() {
        return attndncCardDtls;
    }

    /**
     * Sets the value of the attndncCardDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link AttendanceCard2 }
     *     
     */
    public IndividualPerson26 setAttndncCardDtls(AttendanceCard2 value) {
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
