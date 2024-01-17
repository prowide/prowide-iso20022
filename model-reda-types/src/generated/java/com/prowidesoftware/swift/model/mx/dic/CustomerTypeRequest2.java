
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
 * Specifies the type of customer identification requested.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerTypeRequest2", propOrder = {
    "reqd",
    "orgTp",
    "prvtTp"
})
public class CustomerTypeRequest2 {

    @XmlElement(name = "Reqd")
    protected boolean reqd;
    @XmlElement(name = "OrgTp")
    protected OrganisationType2 orgTp;
    @XmlElement(name = "PrvtTp")
    protected PersonType2 prvtTp;

    /**
     * Gets the value of the reqd property.
     * 
     */
    public boolean isReqd() {
        return reqd;
    }

    /**
     * Sets the value of the reqd property.
     * 
     */
    public CustomerTypeRequest2 setReqd(boolean value) {
        this.reqd = value;
        return this;
    }

    /**
     * Gets the value of the orgTp property.
     * 
     * @return
     *     possible object is
     *     {@link OrganisationType2 }
     *     
     */
    public OrganisationType2 getOrgTp() {
        return orgTp;
    }

    /**
     * Sets the value of the orgTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganisationType2 }
     *     
     */
    public CustomerTypeRequest2 setOrgTp(OrganisationType2 value) {
        this.orgTp = value;
        return this;
    }

    /**
     * Gets the value of the prvtTp property.
     * 
     * @return
     *     possible object is
     *     {@link PersonType2 }
     *     
     */
    public PersonType2 getPrvtTp() {
        return prvtTp;
    }

    /**
     * Sets the value of the prvtTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonType2 }
     *     
     */
    public CustomerTypeRequest2 setPrvtTp(PersonType2 value) {
        this.prvtTp = value;
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
