
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
 * Party and account details.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartyIdentificationAndAccount31", propOrder = {
    "id",
    "altrnId",
    "addtlInf",
    "clrAcct"
})
public class PartyIdentificationAndAccount31 {

    @XmlElement(name = "Id", required = true)
    protected PartyIdentification33Choice id;
    @XmlElement(name = "AltrnId")
    protected AlternatePartyIdentification4 altrnId;
    @XmlElement(name = "AddtlInf")
    protected PartyTextInformation1 addtlInf;
    @XmlElement(name = "ClrAcct")
    protected SecuritiesAccount18 clrAcct;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification33Choice }
     *     
     */
    public PartyIdentification33Choice getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification33Choice }
     *     
     */
    public PartyIdentificationAndAccount31 setId(PartyIdentification33Choice value) {
        this.id = value;
        return this;
    }

    /**
     * Gets the value of the altrnId property.
     * 
     * @return
     *     possible object is
     *     {@link AlternatePartyIdentification4 }
     *     
     */
    public AlternatePartyIdentification4 getAltrnId() {
        return altrnId;
    }

    /**
     * Sets the value of the altrnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlternatePartyIdentification4 }
     *     
     */
    public PartyIdentificationAndAccount31 setAltrnId(AlternatePartyIdentification4 value) {
        this.altrnId = value;
        return this;
    }

    /**
     * Gets the value of the addtlInf property.
     * 
     * @return
     *     possible object is
     *     {@link PartyTextInformation1 }
     *     
     */
    public PartyTextInformation1 getAddtlInf() {
        return addtlInf;
    }

    /**
     * Sets the value of the addtlInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyTextInformation1 }
     *     
     */
    public PartyIdentificationAndAccount31 setAddtlInf(PartyTextInformation1 value) {
        this.addtlInf = value;
        return this;
    }

    /**
     * Gets the value of the clrAcct property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesAccount18 }
     *     
     */
    public SecuritiesAccount18 getClrAcct() {
        return clrAcct;
    }

    /**
     * Sets the value of the clrAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesAccount18 }
     *     
     */
    public PartyIdentificationAndAccount31 setClrAcct(SecuritiesAccount18 value) {
        this.clrAcct = value;
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
