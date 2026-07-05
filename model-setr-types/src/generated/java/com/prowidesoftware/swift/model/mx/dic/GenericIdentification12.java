
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
 * Information related to an identification, eg, party identification or account identification.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GenericIdentification12", propOrder = {
    "id",
    "issr",
    "othrIdTp"
})
public class GenericIdentification12 {

    @XmlElement(name = "Id", required = true)
    protected String id;
    @XmlElement(name = "Issr")
    protected String issr;
    @XmlElement(name = "OthrIdTp")
    protected IdentificationType1Choice othrIdTp;

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
    public GenericIdentification12 setId(String value) {
        this.id = value;
        return this;
    }

    /**
     * Gets the value of the issr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssr() {
        return issr;
    }

    /**
     * Sets the value of the issr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public GenericIdentification12 setIssr(String value) {
        this.issr = value;
        return this;
    }

    /**
     * Gets the value of the othrIdTp property.
     * 
     * @return
     *     possible object is
     *     {@link IdentificationType1Choice }
     *     
     */
    public IdentificationType1Choice getOthrIdTp() {
        return othrIdTp;
    }

    /**
     * Sets the value of the othrIdTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentificationType1Choice }
     *     
     */
    public GenericIdentification12 setOthrIdTp(IdentificationType1Choice value) {
        this.othrIdTp = value;
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
