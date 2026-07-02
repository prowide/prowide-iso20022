
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
 * Identification of a party
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartyIdentification209", propOrder = {
    "nm",
    "id",
    "adr",
    "ctct",
    "instrs"
})
public class PartyIdentification209 {

    @XmlElement(name = "Nm")
    protected String nm;
    @XmlElement(name = "Id")
    protected PartyIdentification197 id;
    @XmlElement(name = "Adr")
    protected Address1 adr;
    @XmlElement(name = "Ctct")
    protected Contact6 ctct;
    @XmlElement(name = "Instrs")
    protected String instrs;

    /**
     * Gets the value of the nm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNm() {
        return nm;
    }

    /**
     * Sets the value of the nm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PartyIdentification209 setNm(String value) {
        this.nm = value;
        return this;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification197 }
     *     
     */
    public PartyIdentification197 getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification197 }
     *     
     */
    public PartyIdentification209 setId(PartyIdentification197 value) {
        this.id = value;
        return this;
    }

    /**
     * Gets the value of the adr property.
     * 
     * @return
     *     possible object is
     *     {@link Address1 }
     *     
     */
    public Address1 getAdr() {
        return adr;
    }

    /**
     * Sets the value of the adr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Address1 }
     *     
     */
    public PartyIdentification209 setAdr(Address1 value) {
        this.adr = value;
        return this;
    }

    /**
     * Gets the value of the ctct property.
     * 
     * @return
     *     possible object is
     *     {@link Contact6 }
     *     
     */
    public Contact6 getCtct() {
        return ctct;
    }

    /**
     * Sets the value of the ctct property.
     * 
     * @param value
     *     allowed object is
     *     {@link Contact6 }
     *     
     */
    public PartyIdentification209 setCtct(Contact6 value) {
        this.ctct = value;
        return this;
    }

    /**
     * Gets the value of the instrs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstrs() {
        return instrs;
    }

    /**
     * Sets the value of the instrs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PartyIdentification209 setInstrs(String value) {
        this.instrs = value;
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
