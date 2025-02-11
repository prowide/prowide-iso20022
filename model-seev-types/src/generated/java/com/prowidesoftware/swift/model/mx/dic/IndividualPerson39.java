
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
@XmlType(name = "IndividualPerson39", propOrder = {
    "prssgndPrxy",
    "emplngPty",
    "attndncCardDtls"
})
public class IndividualPerson39 {

    @XmlElement(name = "PrssgndPrxy")
    protected PartyIdentification223Choice prssgndPrxy;
    @XmlElement(name = "EmplngPty")
    protected PartyIdentification129Choice emplngPty;
    @XmlElement(name = "AttndncCardDtls", required = true)
    protected AttendanceCard2 attndncCardDtls;

    /**
     * Gets the value of the prssgndPrxy property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification223Choice }
     *     
     */
    public PartyIdentification223Choice getPrssgndPrxy() {
        return prssgndPrxy;
    }

    /**
     * Sets the value of the prssgndPrxy property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification223Choice }
     *     
     */
    public IndividualPerson39 setPrssgndPrxy(PartyIdentification223Choice value) {
        this.prssgndPrxy = value;
        return this;
    }

    /**
     * Gets the value of the emplngPty property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification129Choice }
     *     
     */
    public PartyIdentification129Choice getEmplngPty() {
        return emplngPty;
    }

    /**
     * Sets the value of the emplngPty property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification129Choice }
     *     
     */
    public IndividualPerson39 setEmplngPty(PartyIdentification129Choice value) {
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
    public IndividualPerson39 setAttndncCardDtls(AttendanceCard2 value) {
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
