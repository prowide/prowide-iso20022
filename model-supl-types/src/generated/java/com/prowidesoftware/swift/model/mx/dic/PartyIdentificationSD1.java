
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Provides additional information regarding the new agent component. 
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartyIdentificationSD1", propOrder = {
    "plcAndNm",
    "agtTp",
    "agtId",
    "agtNmAndAdr",
    "agtTelNb",
    "agtEmailAdr",
    "ctctInf"
})
public class PartyIdentificationSD1 {

    @XmlElement(name = "PlcAndNm", required = true)
    protected String plcAndNm;
    @XmlElement(name = "AgtTp", required = true)
    @XmlSchemaType(name = "string")
    protected AgentType1Code agtTp;
    @XmlElement(name = "AgtId")
    protected String agtId;
    @XmlElement(name = "AgtNmAndAdr", required = true)
    protected NameAndAddress5 agtNmAndAdr;
    @XmlElement(name = "AgtTelNb")
    protected String agtTelNb;
    @XmlElement(name = "AgtEmailAdr")
    protected String agtEmailAdr;
    @XmlElement(name = "CtctInf")
    protected PartyIdentificationSD4 ctctInf;

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
    public PartyIdentificationSD1 setPlcAndNm(String value) {
        this.plcAndNm = value;
        return this;
    }

    /**
     * Gets the value of the agtTp property.
     * 
     * @return
     *     possible object is
     *     {@link AgentType1Code }
     *     
     */
    public AgentType1Code getAgtTp() {
        return agtTp;
    }

    /**
     * Sets the value of the agtTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgentType1Code }
     *     
     */
    public PartyIdentificationSD1 setAgtTp(AgentType1Code value) {
        this.agtTp = value;
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
    public PartyIdentificationSD1 setAgtId(String value) {
        this.agtId = value;
        return this;
    }

    /**
     * Gets the value of the agtNmAndAdr property.
     * 
     * @return
     *     possible object is
     *     {@link NameAndAddress5 }
     *     
     */
    public NameAndAddress5 getAgtNmAndAdr() {
        return agtNmAndAdr;
    }

    /**
     * Sets the value of the agtNmAndAdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link NameAndAddress5 }
     *     
     */
    public PartyIdentificationSD1 setAgtNmAndAdr(NameAndAddress5 value) {
        this.agtNmAndAdr = value;
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
    public PartyIdentificationSD1 setAgtTelNb(String value) {
        this.agtTelNb = value;
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
    public PartyIdentificationSD1 setAgtEmailAdr(String value) {
        this.agtEmailAdr = value;
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
    public PartyIdentificationSD1 setCtctInf(PartyIdentificationSD4 value) {
        this.ctctInf = value;
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
