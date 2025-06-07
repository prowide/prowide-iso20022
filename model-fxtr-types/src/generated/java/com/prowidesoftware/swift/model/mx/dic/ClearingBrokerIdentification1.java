
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
 * Specifies the reference number assigned by the clearing broker. A distinction can be made between the reference for the Central Counterparty (CCP) leg and the reference for the client leg of the transaction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClearingBrokerIdentification1", propOrder = {
    "sdInd",
    "clrBrkrId"
})
public class ClearingBrokerIdentification1 {

    @XmlElement(name = "SdInd", required = true)
    @XmlSchemaType(name = "string")
    protected SideIndicator1Code sdInd;
    @XmlElement(name = "ClrBrkrId", required = true)
    protected String clrBrkrId;

    /**
     * Gets the value of the sdInd property.
     * 
     * @return
     *     possible object is
     *     {@link SideIndicator1Code }
     *     
     */
    public SideIndicator1Code getSdInd() {
        return sdInd;
    }

    /**
     * Sets the value of the sdInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link SideIndicator1Code }
     *     
     */
    public ClearingBrokerIdentification1 setSdInd(SideIndicator1Code value) {
        this.sdInd = value;
        return this;
    }

    /**
     * Gets the value of the clrBrkrId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClrBrkrId() {
        return clrBrkrId;
    }

    /**
     * Sets the value of the clrBrkrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ClearingBrokerIdentification1 setClrBrkrId(String value) {
        this.clrBrkrId = value;
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
