
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
 * Specifies the owner type and mandate type.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OwnerType1", propOrder = {
    "tp",
    "mndtTp",
    "prtry"
})
public class OwnerType1 {

    @XmlElement(name = "Tp", required = true)
    @XmlSchemaType(name = "string")
    protected AccountOwnerType1Code tp;
    @XmlElement(name = "MndtTp")
    @XmlSchemaType(name = "string")
    protected AccountPermissionType1Code mndtTp;
    @XmlElement(name = "Prtry")
    protected GenericIdentification1 prtry;

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link AccountOwnerType1Code }
     *     
     */
    public AccountOwnerType1Code getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountOwnerType1Code }
     *     
     */
    public OwnerType1 setTp(AccountOwnerType1Code value) {
        this.tp = value;
        return this;
    }

    /**
     * Gets the value of the mndtTp property.
     * 
     * @return
     *     possible object is
     *     {@link AccountPermissionType1Code }
     *     
     */
    public AccountPermissionType1Code getMndtTp() {
        return mndtTp;
    }

    /**
     * Sets the value of the mndtTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountPermissionType1Code }
     *     
     */
    public OwnerType1 setMndtTp(AccountPermissionType1Code value) {
        this.mndtTp = value;
        return this;
    }

    /**
     * Gets the value of the prtry property.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification1 }
     *     
     */
    public GenericIdentification1 getPrtry() {
        return prtry;
    }

    /**
     * Sets the value of the prtry property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification1 }
     *     
     */
    public OwnerType1 setPrtry(GenericIdentification1 value) {
        this.prtry = value;
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
