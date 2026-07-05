
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
 * Proprietary or domestic identification scheme that uniquely identifies a security.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AlternateSecurityIdentification3", propOrder = {
    "id",
    "dmstIdSrc",
    "prtryIdSrc"
})
public class AlternateSecurityIdentification3 {

    @XmlElement(name = "Id", required = true)
    protected String id;
    @XmlElement(name = "DmstIdSrc")
    protected String dmstIdSrc;
    @XmlElement(name = "PrtryIdSrc")
    protected String prtryIdSrc;

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
    public AlternateSecurityIdentification3 setId(String value) {
        this.id = value;
        return this;
    }

    /**
     * Gets the value of the dmstIdSrc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDmstIdSrc() {
        return dmstIdSrc;
    }

    /**
     * Sets the value of the dmstIdSrc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public AlternateSecurityIdentification3 setDmstIdSrc(String value) {
        this.dmstIdSrc = value;
        return this;
    }

    /**
     * Gets the value of the prtryIdSrc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrtryIdSrc() {
        return prtryIdSrc;
    }

    /**
     * Sets the value of the prtryIdSrc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public AlternateSecurityIdentification3 setPrtryIdSrc(String value) {
        this.prtryIdSrc = value;
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
