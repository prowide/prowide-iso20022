
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
 * Human entity, as distinguished from a corporate entity (which is sometimes referred to as an 'artificial person').
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IndividualPerson41", propOrder = {
    "id",
    "prtcptnMtd",
    "emplngPty",
    "attndncCardDtls"
})
public class IndividualPerson41 {

    @XmlElement(name = "Id")
    protected PartyIdentification232Choice id;
    @XmlElement(name = "PrtcptnMtd")
    @XmlSchemaType(name = "string")
    protected VotingParticipationMethod2Code prtcptnMtd;
    @XmlElement(name = "EmplngPty")
    protected PartyIdentification129Choice emplngPty;
    @XmlElement(name = "AttndncCardDtls", required = true)
    protected AttendanceCard3 attndncCardDtls;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification232Choice }
     *     
     */
    public PartyIdentification232Choice getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification232Choice }
     *     
     */
    public IndividualPerson41 setId(PartyIdentification232Choice value) {
        this.id = value;
        return this;
    }

    /**
     * Gets the value of the prtcptnMtd property.
     * 
     * @return
     *     possible object is
     *     {@link VotingParticipationMethod2Code }
     *     
     */
    public VotingParticipationMethod2Code getPrtcptnMtd() {
        return prtcptnMtd;
    }

    /**
     * Sets the value of the prtcptnMtd property.
     * 
     * @param value
     *     allowed object is
     *     {@link VotingParticipationMethod2Code }
     *     
     */
    public IndividualPerson41 setPrtcptnMtd(VotingParticipationMethod2Code value) {
        this.prtcptnMtd = value;
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
    public IndividualPerson41 setEmplngPty(PartyIdentification129Choice value) {
        this.emplngPty = value;
        return this;
    }

    /**
     * Gets the value of the attndncCardDtls property.
     * 
     * @return
     *     possible object is
     *     {@link AttendanceCard3 }
     *     
     */
    public AttendanceCard3 getAttndncCardDtls() {
        return attndncCardDtls;
    }

    /**
     * Sets the value of the attndncCardDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link AttendanceCard3 }
     *     
     */
    public IndividualPerson41 setAttndncCardDtls(AttendanceCard3 value) {
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
