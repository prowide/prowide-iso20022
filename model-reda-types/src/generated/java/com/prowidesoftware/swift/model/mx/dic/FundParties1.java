
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
 * Parties related to an investment fund.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FundParties1", propOrder = {
    "guarntr",
    "audtr",
    "trstee",
    "othrPty"
})
public class FundParties1 {

    @XmlElement(name = "Guarntr")
    protected ContactAttributes5 guarntr;
    @XmlElement(name = "Audtr")
    protected ContactAttributes5 audtr;
    @XmlElement(name = "Trstee")
    protected ContactAttributes5 trstee;
    @XmlElement(name = "OthrPty")
    protected List<ExtendedParty13> othrPty;

    /**
     * Gets the value of the guarntr property.
     * 
     * @return
     *     possible object is
     *     {@link ContactAttributes5 }
     *     
     */
    public ContactAttributes5 getGuarntr() {
        return guarntr;
    }

    /**
     * Sets the value of the guarntr property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactAttributes5 }
     *     
     */
    public FundParties1 setGuarntr(ContactAttributes5 value) {
        this.guarntr = value;
        return this;
    }

    /**
     * Gets the value of the audtr property.
     * 
     * @return
     *     possible object is
     *     {@link ContactAttributes5 }
     *     
     */
    public ContactAttributes5 getAudtr() {
        return audtr;
    }

    /**
     * Sets the value of the audtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactAttributes5 }
     *     
     */
    public FundParties1 setAudtr(ContactAttributes5 value) {
        this.audtr = value;
        return this;
    }

    /**
     * Gets the value of the trstee property.
     * 
     * @return
     *     possible object is
     *     {@link ContactAttributes5 }
     *     
     */
    public ContactAttributes5 getTrstee() {
        return trstee;
    }

    /**
     * Sets the value of the trstee property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactAttributes5 }
     *     
     */
    public FundParties1 setTrstee(ContactAttributes5 value) {
        this.trstee = value;
        return this;
    }

    /**
     * Gets the value of the othrPty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the othrPty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOthrPty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExtendedParty13 }
     * 
     * 
     */
    public List<ExtendedParty13> getOthrPty() {
        if (othrPty == null) {
            othrPty = new ArrayList<ExtendedParty13>();
        }
        return this.othrPty;
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
     * Adds a new item to the othrPty list.
     * @see #getOthrPty()
     * 
     */
    public FundParties1 addOthrPty(ExtendedParty13 othrPty) {
        getOthrPty().add(othrPty);
        return this;
    }

}
