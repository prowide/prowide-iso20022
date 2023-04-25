
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
 * Name and address details.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EnglishNameLocalNameAndAddress1", propOrder = {
    "enNm",
    "nmAndAdr",
    "lngAdrLine"
})
public class EnglishNameLocalNameAndAddress1 {

    @XmlElement(name = "EnNm")
    protected String enNm;
    @XmlElement(name = "NmAndAdr", required = true)
    protected PartyIdentification77 nmAndAdr;
    @XmlElement(name = "LngAdrLine")
    protected List<String> lngAdrLine;

    /**
     * Gets the value of the enNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnNm() {
        return enNm;
    }

    /**
     * Sets the value of the enNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public EnglishNameLocalNameAndAddress1 setEnNm(String value) {
        this.enNm = value;
        return this;
    }

    /**
     * Gets the value of the nmAndAdr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification77 }
     *     
     */
    public PartyIdentification77 getNmAndAdr() {
        return nmAndAdr;
    }

    /**
     * Sets the value of the nmAndAdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification77 }
     *     
     */
    public EnglishNameLocalNameAndAddress1 setNmAndAdr(PartyIdentification77 value) {
        this.nmAndAdr = value;
        return this;
    }

    /**
     * Gets the value of the lngAdrLine property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the lngAdrLine property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLngAdrLine().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     * @return
     *     The value of the lngAdrLine property.
     */
    public List<String> getLngAdrLine() {
        if (lngAdrLine == null) {
            lngAdrLine = new ArrayList<>();
        }
        return this.lngAdrLine;
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
     * Adds a new item to the lngAdrLine list.
     * @see #getLngAdrLine()
     * 
     */
    public EnglishNameLocalNameAndAddress1 addLngAdrLine(String lngAdrLine) {
        getLngAdrLine().add(lngAdrLine);
        return this;
    }

}
