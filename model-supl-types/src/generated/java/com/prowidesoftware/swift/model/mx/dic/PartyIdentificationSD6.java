
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
 * Provides additional information regarding the existing agent component.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartyIdentificationSD6", propOrder = {
    "plcAndNm",
    "agtId",
    "agtTelNb",
    "ctctInf",
    "agtEmailAdr",
    "agtAdr"
})
public class PartyIdentificationSD6 {

    @XmlElement(name = "PlcAndNm")
    protected String plcAndNm;
    @XmlElement(name = "AgtId")
    protected String agtId;
    @XmlElement(name = "AgtTelNb")
    protected String agtTelNb;
    @XmlElement(name = "CtctInf")
    protected PartyIdentificationSD4 ctctInf;
    @XmlElement(name = "AgtEmailAdr")
    protected String agtEmailAdr;
    @XmlElement(name = "AgtAdr")
    protected PostalAddress1 agtAdr;

    /**
     * Gets the value of the plcAndNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlcAndNm() {
        return plcAndNm;
    }

    /**
     * Sets the value of the plcAndNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PartyIdentificationSD6 setPlcAndNm(String value) {
        this.plcAndNm = value;
        return this;
    }

    /**
     * Gets the value of the agtId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgtId() {
        return agtId;
    }

    /**
     * Sets the value of the agtId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PartyIdentificationSD6 setAgtId(String value) {
        this.agtId = value;
        return this;
    }

    /**
     * Gets the value of the agtTelNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgtTelNb() {
        return agtTelNb;
    }

    /**
     * Sets the value of the agtTelNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PartyIdentificationSD6 setAgtTelNb(String value) {
        this.agtTelNb = value;
        return this;
    }

    /**
     * Gets the value of the ctctInf property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentificationSD4 }
     *     
     */
    public PartyIdentificationSD4 getCtctInf() {
        return ctctInf;
    }

    /**
     * Sets the value of the ctctInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentificationSD4 }
     *     
     */
    public PartyIdentificationSD6 setCtctInf(PartyIdentificationSD4 value) {
        this.ctctInf = value;
        return this;
    }

    /**
     * Gets the value of the agtEmailAdr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgtEmailAdr() {
        return agtEmailAdr;
    }

    /**
     * Sets the value of the agtEmailAdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PartyIdentificationSD6 setAgtEmailAdr(String value) {
        this.agtEmailAdr = value;
        return this;
    }

    /**
     * Gets the value of the agtAdr property.
     * 
     * @return
     *     possible object is
     *     {@link PostalAddress1 }
     *     
     */
    public PostalAddress1 getAgtAdr() {
        return agtAdr;
    }

    /**
     * Sets the value of the agtAdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PostalAddress1 }
     *     
     */
    public PartyIdentificationSD6 setAgtAdr(PostalAddress1 value) {
        this.agtAdr = value;
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
