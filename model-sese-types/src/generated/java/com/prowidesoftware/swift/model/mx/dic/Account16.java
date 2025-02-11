
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
 * Account between an investor(s) and a fund manager or a fund. The account can contain holdings in any investment fund or investment fund class managed (or distributed) by the fund manager, within the same fund family.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Account16", propOrder = {
    "id",
    "dsgnt",
    "svcr"
})
public class Account16 {

    @XmlElement(name = "Id", required = true)
    protected String id;
    @XmlElement(name = "Dsgnt")
    protected String dsgnt;
    @XmlElement(name = "Svcr")
    protected PartyIdentification2Choice svcr;

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
    public Account16 setId(String value) {
        this.id = value;
        return this;
    }

    /**
     * Gets the value of the dsgnt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDsgnt() {
        return dsgnt;
    }

    /**
     * Sets the value of the dsgnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Account16 setDsgnt(String value) {
        this.dsgnt = value;
        return this;
    }

    /**
     * Gets the value of the svcr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification2Choice }
     *     
     */
    public PartyIdentification2Choice getSvcr() {
        return svcr;
    }

    /**
     * Sets the value of the svcr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification2Choice }
     *     
     */
    public Account16 setSvcr(PartyIdentification2Choice value) {
        this.svcr = value;
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
