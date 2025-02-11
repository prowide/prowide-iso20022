
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
 * Parties used for acting parties that apply either to the whole message or to individual sides.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Intermediary14", propOrder = {
    "id",
    "role",
    "sfkpgDtls",
    "cshDtls"
})
public class Intermediary14 {

    @XmlElement(name = "Id", required = true)
    protected PartyIdentification23 id;
    @XmlElement(name = "Role", required = true)
    protected PartyRole1Choice role;
    @XmlElement(name = "SfkpgDtls")
    protected SecuritiesAccount2 sfkpgDtls;
    @XmlElement(name = "CshDtls")
    protected AccountIdentification3Choice cshDtls;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification23 }
     *     
     */
    public PartyIdentification23 getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification23 }
     *     
     */
    public Intermediary14 setId(PartyIdentification23 value) {
        this.id = value;
        return this;
    }

    /**
     * Gets the value of the role property.
     * 
     * @return
     *     possible object is
     *     {@link PartyRole1Choice }
     *     
     */
    public PartyRole1Choice getRole() {
        return role;
    }

    /**
     * Sets the value of the role property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyRole1Choice }
     *     
     */
    public Intermediary14 setRole(PartyRole1Choice value) {
        this.role = value;
        return this;
    }

    /**
     * Gets the value of the sfkpgDtls property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesAccount2 }
     *     
     */
    public SecuritiesAccount2 getSfkpgDtls() {
        return sfkpgDtls;
    }

    /**
     * Sets the value of the sfkpgDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesAccount2 }
     *     
     */
    public Intermediary14 setSfkpgDtls(SecuritiesAccount2 value) {
        this.sfkpgDtls = value;
        return this;
    }

    /**
     * Gets the value of the cshDtls property.
     * 
     * @return
     *     possible object is
     *     {@link AccountIdentification3Choice }
     *     
     */
    public AccountIdentification3Choice getCshDtls() {
        return cshDtls;
    }

    /**
     * Sets the value of the cshDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountIdentification3Choice }
     *     
     */
    public Intermediary14 setCshDtls(AccountIdentification3Choice value) {
        this.cshDtls = value;
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
