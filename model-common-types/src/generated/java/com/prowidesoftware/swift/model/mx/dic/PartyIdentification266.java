
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
 * Identification of a party. The party can be identified by providing the party's name and optionally, the BIC, account number, address, clearing system identification or LEI can also be provided.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartyIdentification266", propOrder = {
    "ptyNm",
    "anyBIC",
    "acctNb",
    "adr",
    "clrSysId",
    "lglNttyIdr"
})
public class PartyIdentification266 {

    @XmlElement(name = "PtyNm")
    protected String ptyNm;
    @XmlElement(name = "AnyBIC")
    protected PartyIdentification265 anyBIC;
    @XmlElement(name = "AcctNb")
    protected String acctNb;
    @XmlElement(name = "Adr")
    protected String adr;
    @XmlElement(name = "ClrSysId")
    protected ClearingSystemIdentification2Choice clrSysId;
    @XmlElement(name = "LglNttyIdr")
    protected String lglNttyIdr;

    /**
     * Gets the value of the ptyNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPtyNm() {
        return ptyNm;
    }

    /**
     * Sets the value of the ptyNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PartyIdentification266 setPtyNm(String value) {
        this.ptyNm = value;
        return this;
    }

    /**
     * Gets the value of the anyBIC property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification265 }
     *     
     */
    public PartyIdentification265 getAnyBIC() {
        return anyBIC;
    }

    /**
     * Sets the value of the anyBIC property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification265 }
     *     
     */
    public PartyIdentification266 setAnyBIC(PartyIdentification265 value) {
        this.anyBIC = value;
        return this;
    }

    /**
     * Gets the value of the acctNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctNb() {
        return acctNb;
    }

    /**
     * Sets the value of the acctNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PartyIdentification266 setAcctNb(String value) {
        this.acctNb = value;
        return this;
    }

    /**
     * Gets the value of the adr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdr() {
        return adr;
    }

    /**
     * Sets the value of the adr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PartyIdentification266 setAdr(String value) {
        this.adr = value;
        return this;
    }

    /**
     * Gets the value of the clrSysId property.
     * 
     * @return
     *     possible object is
     *     {@link ClearingSystemIdentification2Choice }
     *     
     */
    public ClearingSystemIdentification2Choice getClrSysId() {
        return clrSysId;
    }

    /**
     * Sets the value of the clrSysId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClearingSystemIdentification2Choice }
     *     
     */
    public PartyIdentification266 setClrSysId(ClearingSystemIdentification2Choice value) {
        this.clrSysId = value;
        return this;
    }

    /**
     * Gets the value of the lglNttyIdr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLglNttyIdr() {
        return lglNttyIdr;
    }

    /**
     * Sets the value of the lglNttyIdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PartyIdentification266 setLglNttyIdr(String value) {
        this.lglNttyIdr = value;
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
