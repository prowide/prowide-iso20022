
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
 * Identification of a party.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartyIdentification262", propOrder = {
    "id",
    "assgnr",
    "ctry",
    "shrtNm",
    "addtlId",
    "frgnMrchnt",
    "lclData"
})
public class PartyIdentification262 {

    @XmlElement(name = "Id", required = true)
    protected String id;
    @XmlElement(name = "Assgnr")
    protected String assgnr;
    @XmlElement(name = "Ctry")
    protected String ctry;
    @XmlElement(name = "ShrtNm")
    protected String shrtNm;
    @XmlElement(name = "AddtlId")
    protected String addtlId;
    @XmlElement(name = "FrgnMrchnt")
    protected Boolean frgnMrchnt;
    @XmlElement(name = "LclData")
    protected LocalData1 lclData;

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
    public PartyIdentification262 setId(String value) {
        this.id = value;
        return this;
    }

    /**
     * Gets the value of the assgnr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssgnr() {
        return assgnr;
    }

    /**
     * Sets the value of the assgnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PartyIdentification262 setAssgnr(String value) {
        this.assgnr = value;
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
    public PartyIdentification262 setCtry(String value) {
        this.ctry = value;
        return this;
    }

    /**
     * Gets the value of the shrtNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShrtNm() {
        return shrtNm;
    }

    /**
     * Sets the value of the shrtNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PartyIdentification262 setShrtNm(String value) {
        this.shrtNm = value;
        return this;
    }

    /**
     * Gets the value of the addtlId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddtlId() {
        return addtlId;
    }

    /**
     * Sets the value of the addtlId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PartyIdentification262 setAddtlId(String value) {
        this.addtlId = value;
        return this;
    }

    /**
     * Gets the value of the frgnMrchnt property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFrgnMrchnt() {
        return frgnMrchnt;
    }

    /**
     * Sets the value of the frgnMrchnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public PartyIdentification262 setFrgnMrchnt(Boolean value) {
        this.frgnMrchnt = value;
        return this;
    }

    /**
     * Gets the value of the lclData property.
     * 
     * @return
     *     possible object is
     *     {@link LocalData1 }
     *     
     */
    public LocalData1 getLclData() {
        return lclData;
    }

    /**
     * Sets the value of the lclData property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocalData1 }
     *     
     */
    public PartyIdentification262 setLclData(LocalData1 value) {
        this.lclData = value;
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
