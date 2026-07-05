
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
 * Alternate identification for a party using an id type, a country code and an text field.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AlternatePartyIdentification1", propOrder = {
    "tpOfId",
    "ctry",
    "altrnId"
})
public class AlternatePartyIdentification1 {

    @XmlElement(name = "TpOfId", required = true)
    protected IdentificationType2Choice tpOfId;
    @XmlElement(name = "Ctry", required = true)
    protected String ctry;
    @XmlElement(name = "AltrnId", required = true)
    protected String altrnId;

    /**
     * Gets the value of the tpOfId property.
     * 
     * @return
     *     possible object is
     *     {@link IdentificationType2Choice }
     *     
     */
    public IdentificationType2Choice getTpOfId() {
        return tpOfId;
    }

    /**
     * Sets the value of the tpOfId property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentificationType2Choice }
     *     
     */
    public AlternatePartyIdentification1 setTpOfId(IdentificationType2Choice value) {
        this.tpOfId = value;
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
    public AlternatePartyIdentification1 setCtry(String value) {
        this.ctry = value;
        return this;
    }

    /**
     * Gets the value of the altrnId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAltrnId() {
        return altrnId;
    }

    /**
     * Sets the value of the altrnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public AlternatePartyIdentification1 setAltrnId(String value) {
        this.altrnId = value;
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
