
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
 * Unique and unambiguous identification of a penalty.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PenaltyIdentification1__1", propOrder = {
    "mktInfrstrctrId",
    "id",
    "rallcnId"
})
public class PenaltyIdentification11 {

    @XmlElement(name = "MktInfrstrctrId", required = true)
    protected String mktInfrstrctrId;
    @XmlElement(name = "Id", required = true)
    protected String id;
    @XmlElement(name = "RallcnId")
    protected PenaltyIdentification21 rallcnId;

    /**
     * Gets the value of the mktInfrstrctrId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMktInfrstrctrId() {
        return mktInfrstrctrId;
    }

    /**
     * Sets the value of the mktInfrstrctrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PenaltyIdentification11 setMktInfrstrctrId(String value) {
        this.mktInfrstrctrId = value;
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
    public PenaltyIdentification11 setId(String value) {
        this.id = value;
        return this;
    }

    /**
     * Gets the value of the rallcnId property.
     * 
     * @return
     *     possible object is
     *     {@link PenaltyIdentification21 }
     *     
     */
    public PenaltyIdentification21 getRallcnId() {
        return rallcnId;
    }

    /**
     * Sets the value of the rallcnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link PenaltyIdentification21 }
     *     
     */
    public PenaltyIdentification11 setRallcnId(PenaltyIdentification21 value) {
        this.rallcnId = value;
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
