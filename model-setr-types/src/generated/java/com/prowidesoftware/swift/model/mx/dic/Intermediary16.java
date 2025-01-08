
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
 * Party that provides services to investors relating to financial products.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Intermediary16", propOrder = {
    "id",
    "roleTp",
    "acct",
    "comInf"
})
public class Intermediary16 {

    @XmlElement(name = "Id", required = true)
    protected PartyIdentification2Choice id;
    @XmlElement(name = "RoleTp")
    protected IntermediaryRoleChoice1 roleTp;
    @XmlElement(name = "Acct")
    protected Account7 acct;
    @XmlElement(name = "ComInf")
    protected ContactInformation1 comInf;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification2Choice }
     *     
     */
    public PartyIdentification2Choice getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification2Choice }
     *     
     */
    public Intermediary16 setId(PartyIdentification2Choice value) {
        this.id = value;
        return this;
    }

    /**
     * Gets the value of the roleTp property.
     * 
     * @return
     *     possible object is
     *     {@link IntermediaryRoleChoice1 }
     *     
     */
    public IntermediaryRoleChoice1 getRoleTp() {
        return roleTp;
    }

    /**
     * Sets the value of the roleTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntermediaryRoleChoice1 }
     *     
     */
    public Intermediary16 setRoleTp(IntermediaryRoleChoice1 value) {
        this.roleTp = value;
        return this;
    }

    /**
     * Gets the value of the acct property.
     * 
     * @return
     *     possible object is
     *     {@link Account7 }
     *     
     */
    public Account7 getAcct() {
        return acct;
    }

    /**
     * Sets the value of the acct property.
     * 
     * @param value
     *     allowed object is
     *     {@link Account7 }
     *     
     */
    public Intermediary16 setAcct(Account7 value) {
        this.acct = value;
        return this;
    }

    /**
     * Gets the value of the comInf property.
     * 
     * @return
     *     possible object is
     *     {@link ContactInformation1 }
     *     
     */
    public ContactInformation1 getComInf() {
        return comInf;
    }

    /**
     * Sets the value of the comInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactInformation1 }
     *     
     */
    public Intermediary16 setComInf(ContactInformation1 value) {
        this.comInf = value;
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
