
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
 * Low level communication of the hardware or software component toward another component or an external entity.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommunicationCharacteristics1", propOrder = {
    "comTp",
    "rmotPty",
    "actv"
})
public class CommunicationCharacteristics1 {

    @XmlElement(name = "ComTp", required = true)
    @XmlSchemaType(name = "string")
    protected POICommunicationType1Code comTp;
    @XmlElement(name = "RmotPty", required = true)
    @XmlSchemaType(name = "string")
    protected PartyType7Code rmotPty;
    @XmlElement(name = "Actv")
    protected boolean actv;

    /**
     * Gets the value of the comTp property.
     * 
     * @return
     *     possible object is
     *     {@link POICommunicationType1Code }
     *     
     */
    public POICommunicationType1Code getComTp() {
        return comTp;
    }

    /**
     * Sets the value of the comTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link POICommunicationType1Code }
     *     
     */
    public CommunicationCharacteristics1 setComTp(POICommunicationType1Code value) {
        this.comTp = value;
        return this;
    }

    /**
     * Gets the value of the rmotPty property.
     * 
     * @return
     *     possible object is
     *     {@link PartyType7Code }
     *     
     */
    public PartyType7Code getRmotPty() {
        return rmotPty;
    }

    /**
     * Sets the value of the rmotPty property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyType7Code }
     *     
     */
    public CommunicationCharacteristics1 setRmotPty(PartyType7Code value) {
        this.rmotPty = value;
        return this;
    }

    /**
     * Gets the value of the actv property.
     * 
     */
    public boolean isActv() {
        return actv;
    }

    /**
     * Sets the value of the actv property.
     * 
     */
    public CommunicationCharacteristics1 setActv(boolean value) {
        this.actv = value;
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
