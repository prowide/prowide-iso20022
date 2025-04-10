
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
 * Identification of check as payment instrument.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Check1", propOrder = {
    "bkId",
    "acctNb",
    "chckNb",
    "chckCardNb",
    "chckTrckData2",
    "chckTp",
    "ctry"
})
public class Check1 {

    @XmlElement(name = "BkId")
    protected String bkId;
    @XmlElement(name = "AcctNb")
    protected String acctNb;
    @XmlElement(name = "ChckNb")
    protected String chckNb;
    @XmlElement(name = "ChckCardNb")
    protected String chckCardNb;
    @XmlElement(name = "ChckTrckData2")
    protected TrackData2 chckTrckData2;
    @XmlElement(name = "ChckTp")
    @XmlSchemaType(name = "string")
    protected CheckType1Code chckTp;
    @XmlElement(name = "Ctry")
    protected String ctry;

    /**
     * Gets the value of the bkId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBkId() {
        return bkId;
    }

    /**
     * Sets the value of the bkId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Check1 setBkId(String value) {
        this.bkId = value;
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
    public Check1 setAcctNb(String value) {
        this.acctNb = value;
        return this;
    }

    /**
     * Gets the value of the chckNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChckNb() {
        return chckNb;
    }

    /**
     * Sets the value of the chckNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Check1 setChckNb(String value) {
        this.chckNb = value;
        return this;
    }

    /**
     * Gets the value of the chckCardNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChckCardNb() {
        return chckCardNb;
    }

    /**
     * Sets the value of the chckCardNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Check1 setChckCardNb(String value) {
        this.chckCardNb = value;
        return this;
    }

    /**
     * Gets the value of the chckTrckData2 property.
     * 
     * @return
     *     possible object is
     *     {@link TrackData2 }
     *     
     */
    public TrackData2 getChckTrckData2() {
        return chckTrckData2;
    }

    /**
     * Sets the value of the chckTrckData2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrackData2 }
     *     
     */
    public Check1 setChckTrckData2(TrackData2 value) {
        this.chckTrckData2 = value;
        return this;
    }

    /**
     * Gets the value of the chckTp property.
     * 
     * @return
     *     possible object is
     *     {@link CheckType1Code }
     *     
     */
    public CheckType1Code getChckTp() {
        return chckTp;
    }

    /**
     * Sets the value of the chckTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CheckType1Code }
     *     
     */
    public Check1 setChckTp(CheckType1Code value) {
        this.chckTp = value;
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
    public Check1 setCtry(String value) {
        this.ctry = value;
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
