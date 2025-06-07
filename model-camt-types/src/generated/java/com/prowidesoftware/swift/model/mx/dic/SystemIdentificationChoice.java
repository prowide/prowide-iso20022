
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
 * Information used to identify a cash clearing system.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SystemIdentificationChoice", propOrder = {
    "clrSysId",
    "ctry"
})
public class SystemIdentificationChoice {

    @XmlElement(name = "ClrSysId")
    @XmlSchemaType(name = "string")
    protected CashClearingSystem1Code clrSysId;
    @XmlElement(name = "Ctry")
    protected String ctry;

    /**
     * Gets the value of the clrSysId property.
     * 
     * @return
     *     possible object is
     *     {@link CashClearingSystem1Code }
     *     
     */
    public CashClearingSystem1Code getClrSysId() {
        return clrSysId;
    }

    /**
     * Sets the value of the clrSysId property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashClearingSystem1Code }
     *     
     */
    public SystemIdentificationChoice setClrSysId(CashClearingSystem1Code value) {
        this.clrSysId = value;
        return this;
    }

    /**
     * Gets the value of the ctry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCtry() {
        return ctry;
    }

    /**
     * Sets the value of the ctry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SystemIdentificationChoice setCtry(String value) {
        this.ctry = value;
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
