
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Provide information about the type of opening instruction and identification of the application request.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvestmentAccountOpeningDetails", propOrder = {
    "opngTp",
    "acctApplId"
})
public class InvestmentAccountOpeningDetails {

    @XmlElement(name = "OpngTp", required = true)
    @XmlSchemaType(name = "string")
    protected AccountOpeningType1Code opngTp;
    @XmlElement(name = "AcctApplId")
    protected String acctApplId;

    /**
     * Gets the value of the opngTp property.
     * 
     * @return
     *     possible object is
     *     {@link AccountOpeningType1Code }
     *     
     */
    public AccountOpeningType1Code getOpngTp() {
        return opngTp;
    }

    /**
     * Sets the value of the opngTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountOpeningType1Code }
     *     
     */
    public InvestmentAccountOpeningDetails setOpngTp(AccountOpeningType1Code value) {
        this.opngTp = value;
        return this;
    }

    /**
     * Gets the value of the acctApplId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctApplId() {
        return acctApplId;
    }

    /**
     * Sets the value of the acctApplId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public InvestmentAccountOpeningDetails setAcctApplId(String value) {
        this.acctApplId = value;
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
