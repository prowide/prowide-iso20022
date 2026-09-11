
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Provides details of the eligible securities as defined in the collateral reference data.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EligibleSecurity5", propOrder = {
    "sctyId",
    "collstnCcy",
    "elgbltySetPrfl",
    "ptyId"
})
public class EligibleSecurity5 {

    @XmlElement(name = "SctyId", required = true)
    protected List<SecurityIdentification19> sctyId;
    @XmlElement(name = "CollstnCcy")
    protected String collstnCcy;
    @XmlElement(name = "ElgbltySetPrfl")
    protected GenericIdentification1 elgbltySetPrfl;
    @XmlElement(name = "PtyId", required = true)
    protected SystemPartyIdentification2Choice ptyId;

    /**
     * Gets the value of the sctyId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the sctyId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSctyId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SecurityIdentification19 }
     * 
     * 
     * @return
     *     The value of the sctyId property.
     */
    public List<SecurityIdentification19> getSctyId() {
        if (sctyId == null) {
            sctyId = new ArrayList<>();
        }
        return this.sctyId;
    }

    /**
     * Gets the value of the collstnCcy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCollstnCcy() {
        return collstnCcy;
    }

    /**
     * Sets the value of the collstnCcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public EligibleSecurity5 setCollstnCcy(String value) {
        this.collstnCcy = value;
        return this;
    }

    /**
     * Gets the value of the elgbltySetPrfl property.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification1 }
     *     
     */
    public GenericIdentification1 getElgbltySetPrfl() {
        return elgbltySetPrfl;
    }

    /**
     * Sets the value of the elgbltySetPrfl property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification1 }
     *     
     */
    public EligibleSecurity5 setElgbltySetPrfl(GenericIdentification1 value) {
        this.elgbltySetPrfl = value;
        return this;
    }

    /**
     * Gets the value of the ptyId property.
     * 
     * @return
     *     possible object is
     *     {@link SystemPartyIdentification2Choice }
     *     
     */
    public SystemPartyIdentification2Choice getPtyId() {
        return ptyId;
    }

    /**
     * Sets the value of the ptyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link SystemPartyIdentification2Choice }
     *     
     */
    public EligibleSecurity5 setPtyId(SystemPartyIdentification2Choice value) {
        this.ptyId = value;
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

    /**
     * Adds a new item to the sctyId list.
     * @see #getSctyId()
     * 
     */
    public EligibleSecurity5 addSctyId(SecurityIdentification19 sctyId) {
        getSctyId().add(sctyId);
        return this;
    }

}
