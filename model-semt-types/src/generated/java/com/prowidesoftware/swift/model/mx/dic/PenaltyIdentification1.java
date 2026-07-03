
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
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
@XmlType(name = "PenaltyIdentification1", propOrder = {
    "mktInfrstrctrId",
    "id",
    "rallcnId"
})
public class PenaltyIdentification1 {

    @XmlElement(name = "MktInfrstrctrId", required = true)
    protected String mktInfrstrctrId;
    @XmlElement(name = "Id")
    protected String id;
    @XmlElement(name = "RallcnId")
    protected PenaltyIdentification2 rallcnId;

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
    public PenaltyIdentification1 setMktInfrstrctrId(String value) {
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
    public PenaltyIdentification1 setId(String value) {
        this.id = value;
        return this;
    }

    /**
     * Gets the value of the rallcnId property.
     * 
     * @return
     *     possible object is
     *     {@link PenaltyIdentification2 }
     *     
     */
    public PenaltyIdentification2 getRallcnId() {
        return rallcnId;
    }

    /**
     * Sets the value of the rallcnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link PenaltyIdentification2 }
     *     
     */
    public PenaltyIdentification1 setRallcnId(PenaltyIdentification2 value) {
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
