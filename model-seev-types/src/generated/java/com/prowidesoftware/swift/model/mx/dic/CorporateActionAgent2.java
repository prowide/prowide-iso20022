
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
 * Detailed information about agents involved into a corporate action event.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorporateActionAgent2", propOrder = {
    "issrAgt",
    "pngAgt",
    "regar",
    "rmktgAgt",
    "slctnAgt",
    "infAgt",
    "issr",
    "trfAgt",
    "redAgt"
})
public class CorporateActionAgent2 {

    @XmlElement(name = "IssrAgt")
    protected PartyIdentification289 issrAgt;
    @XmlElement(name = "PngAgt")
    protected PartyIdentification289 pngAgt;
    @XmlElement(name = "Regar")
    protected PartyIdentification289 regar;
    @XmlElement(name = "RmktgAgt")
    protected PartyIdentification289 rmktgAgt;
    @XmlElement(name = "SlctnAgt")
    protected PartyIdentification289 slctnAgt;
    @XmlElement(name = "InfAgt")
    protected PartyIdentification289 infAgt;
    @XmlElement(name = "Issr")
    protected PartyIdentification289 issr;
    @XmlElement(name = "TrfAgt")
    protected PartyIdentification289 trfAgt;
    @XmlElement(name = "RedAgt")
    protected PartyIdentification289 redAgt;

    /**
     * Gets the value of the issrAgt property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification289 }
     *     
     */
    public PartyIdentification289 getIssrAgt() {
        return issrAgt;
    }

    /**
     * Sets the value of the issrAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification289 }
     *     
     */
    public CorporateActionAgent2 setIssrAgt(PartyIdentification289 value) {
        this.issrAgt = value;
        return this;
    }

    /**
     * Gets the value of the pngAgt property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification289 }
     *     
     */
    public PartyIdentification289 getPngAgt() {
        return pngAgt;
    }

    /**
     * Sets the value of the pngAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification289 }
     *     
     */
    public CorporateActionAgent2 setPngAgt(PartyIdentification289 value) {
        this.pngAgt = value;
        return this;
    }

    /**
     * Gets the value of the regar property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification289 }
     *     
     */
    public PartyIdentification289 getRegar() {
        return regar;
    }

    /**
     * Sets the value of the regar property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification289 }
     *     
     */
    public CorporateActionAgent2 setRegar(PartyIdentification289 value) {
        this.regar = value;
        return this;
    }

    /**
     * Gets the value of the rmktgAgt property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification289 }
     *     
     */
    public PartyIdentification289 getRmktgAgt() {
        return rmktgAgt;
    }

    /**
     * Sets the value of the rmktgAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification289 }
     *     
     */
    public CorporateActionAgent2 setRmktgAgt(PartyIdentification289 value) {
        this.rmktgAgt = value;
        return this;
    }

    /**
     * Gets the value of the slctnAgt property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification289 }
     *     
     */
    public PartyIdentification289 getSlctnAgt() {
        return slctnAgt;
    }

    /**
     * Sets the value of the slctnAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification289 }
     *     
     */
    public CorporateActionAgent2 setSlctnAgt(PartyIdentification289 value) {
        this.slctnAgt = value;
        return this;
    }

    /**
     * Gets the value of the infAgt property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification289 }
     *     
     */
    public PartyIdentification289 getInfAgt() {
        return infAgt;
    }

    /**
     * Sets the value of the infAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification289 }
     *     
     */
    public CorporateActionAgent2 setInfAgt(PartyIdentification289 value) {
        this.infAgt = value;
        return this;
    }

    /**
     * Gets the value of the issr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification289 }
     *     
     */
    public PartyIdentification289 getIssr() {
        return issr;
    }

    /**
     * Sets the value of the issr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification289 }
     *     
     */
    public CorporateActionAgent2 setIssr(PartyIdentification289 value) {
        this.issr = value;
        return this;
    }

    /**
     * Gets the value of the trfAgt property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification289 }
     *     
     */
    public PartyIdentification289 getTrfAgt() {
        return trfAgt;
    }

    /**
     * Sets the value of the trfAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification289 }
     *     
     */
    public CorporateActionAgent2 setTrfAgt(PartyIdentification289 value) {
        this.trfAgt = value;
        return this;
    }

    /**
     * Gets the value of the redAgt property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification289 }
     *     
     */
    public PartyIdentification289 getRedAgt() {
        return redAgt;
    }

    /**
     * Sets the value of the redAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification289 }
     *     
     */
    public CorporateActionAgent2 setRedAgt(PartyIdentification289 value) {
        this.redAgt = value;
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
