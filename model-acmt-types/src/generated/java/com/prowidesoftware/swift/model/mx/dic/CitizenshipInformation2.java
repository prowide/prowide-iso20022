
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
 * Information about an individual person.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CitizenshipInformation2", propOrder = {
    "ntlty",
    "mnrInd"
})
public class CitizenshipInformation2 {

    @XmlElement(name = "Ntlty", required = true)
    protected String ntlty;
    @XmlElement(name = "MnrInd")
    protected boolean mnrInd;

    /**
     * Gets the value of the ntlty property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNtlty() {
        return ntlty;
    }

    /**
     * Sets the value of the ntlty property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CitizenshipInformation2 setNtlty(String value) {
        this.ntlty = value;
        return this;
    }

    /**
     * Gets the value of the mnrInd property.
     * 
     */
    public boolean isMnrInd() {
        return mnrInd;
    }

    /**
     * Sets the value of the mnrInd property.
     * 
     */
    public CitizenshipInformation2 setMnrInd(boolean value) {
        this.mnrInd = value;
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
