
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
 * Specifies further details of the party.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartyDetail1", propOrder = {
    "fullNm",
    "ctry",
    "ptyTp",
    "sprvsgAuthrty",
    "pstlAdr",
    "ctct",
    "cmnt"
})
public class PartyDetail1 {

    @XmlElement(name = "FullNm")
    protected String fullNm;
    @XmlElement(name = "Ctry")
    protected String ctry;
    @XmlElement(name = "PtyTp", required = true)
    protected String ptyTp;
    @XmlElement(name = "SprvsgAuthrty", required = true)
    protected SupervisingAuthorityIdentification1Choice sprvsgAuthrty;
    @XmlElement(name = "PstlAdr")
    protected PostalAddress6 pstlAdr;
    @XmlElement(name = "Ctct")
    protected CommunicationAddress7 ctct;
    @XmlElement(name = "Cmnt")
    protected String cmnt;

    /**
     * Gets the value of the fullNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFullNm() {
        return fullNm;
    }

    /**
     * Sets the value of the fullNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PartyDetail1 setFullNm(String value) {
        this.fullNm = value;
        return this;
    }

    /**
     * Gets the value of the ctry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCtry() {
        return ctry;
    }

    /**
     * Sets the value of the ctry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PartyDetail1 setCtry(String value) {
        this.ctry = value;
        return this;
    }

    /**
     * Gets the value of the ptyTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPtyTp() {
        return ptyTp;
    }

    /**
     * Sets the value of the ptyTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PartyDetail1 setPtyTp(String value) {
        this.ptyTp = value;
        return this;
    }

    /**
     * Gets the value of the sprvsgAuthrty property.
     * 
     * @return
     *     possible object is
     *     {@link SupervisingAuthorityIdentification1Choice }
     *     
     */
    public SupervisingAuthorityIdentification1Choice getSprvsgAuthrty() {
        return sprvsgAuthrty;
    }

    /**
     * Sets the value of the sprvsgAuthrty property.
     * 
     * @param value
     *     allowed object is
     *     {@link SupervisingAuthorityIdentification1Choice }
     *     
     */
    public PartyDetail1 setSprvsgAuthrty(SupervisingAuthorityIdentification1Choice value) {
        this.sprvsgAuthrty = value;
        return this;
    }

    /**
     * Gets the value of the pstlAdr property.
     * 
     * @return
     *     possible object is
     *     {@link PostalAddress6 }
     *     
     */
    public PostalAddress6 getPstlAdr() {
        return pstlAdr;
    }

    /**
     * Sets the value of the pstlAdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PostalAddress6 }
     *     
     */
    public PartyDetail1 setPstlAdr(PostalAddress6 value) {
        this.pstlAdr = value;
        return this;
    }

    /**
     * Gets the value of the ctct property.
     * 
     * @return
     *     possible object is
     *     {@link CommunicationAddress7 }
     *     
     */
    public CommunicationAddress7 getCtct() {
        return ctct;
    }

    /**
     * Sets the value of the ctct property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommunicationAddress7 }
     *     
     */
    public PartyDetail1 setCtct(CommunicationAddress7 value) {
        this.ctct = value;
        return this;
    }

    /**
     * Gets the value of the cmnt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCmnt() {
        return cmnt;
    }

    /**
     * Sets the value of the cmnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PartyDetail1 setCmnt(String value) {
        this.cmnt = value;
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
