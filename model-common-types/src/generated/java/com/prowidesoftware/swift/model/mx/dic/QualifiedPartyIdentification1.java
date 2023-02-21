
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlID;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Defines and associates identifications for a party as a list of other global or qualified relative identifiers.
 * It is assumed that customers of a party can be referenced by an identifier local to the party. The party together with the local identifier can be used to reference the customer.
 * Multiple references can be given to identify the same party.
 * A short identification can be used for display purposes.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QualifiedPartyIdentification1", propOrder = {
    "id",
    "pty",
    "shrtId",
    "role",
    "roleDesc"
})
public class QualifiedPartyIdentification1 {

    @XmlElement(name = "Id", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlElement(name = "Pty", required = true)
    protected List<SingleQualifiedPartyIdentification1> pty;
    @XmlElement(name = "ShrtId")
    protected PartyIdentification2Choice shrtId;
    @XmlElement(name = "Role")
    protected GenericIdentification1 role;
    @XmlElement(name = "RoleDesc")
    protected String roleDesc;

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
    public QualifiedPartyIdentification1 setId(String value) {
        this.id = value;
        return this;
    }

    /**
     * Gets the value of the pty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SingleQualifiedPartyIdentification1 }
     * 
     * 
     */
    public List<SingleQualifiedPartyIdentification1> getPty() {
        if (pty == null) {
            pty = new ArrayList<SingleQualifiedPartyIdentification1>();
        }
        return this.pty;
    }

    /**
     * Gets the value of the shrtId property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification2Choice }
     *     
     */
    public PartyIdentification2Choice getShrtId() {
        return shrtId;
    }

    /**
     * Sets the value of the shrtId property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification2Choice }
     *     
     */
    public QualifiedPartyIdentification1 setShrtId(PartyIdentification2Choice value) {
        this.shrtId = value;
        return this;
    }

    /**
     * Gets the value of the role property.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification1 }
     *     
     */
    public GenericIdentification1 getRole() {
        return role;
    }

    /**
     * Sets the value of the role property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification1 }
     *     
     */
    public QualifiedPartyIdentification1 setRole(GenericIdentification1 value) {
        this.role = value;
        return this;
    }

    /**
     * Gets the value of the roleDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoleDesc() {
        return roleDesc;
    }

    /**
     * Sets the value of the roleDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public QualifiedPartyIdentification1 setRoleDesc(String value) {
        this.roleDesc = value;
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

    /**
     * Adds a new item to the pty list.
     * @see #getPty()
     * 
     */
    public QualifiedPartyIdentification1 addPty(SingleQualifiedPartyIdentification1 pty) {
        getPty().add(pty);
        return this;
    }

}
