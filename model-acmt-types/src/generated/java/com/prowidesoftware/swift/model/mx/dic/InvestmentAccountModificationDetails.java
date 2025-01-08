
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
 * Provide information about the reason for the modification and about the application request which triggered this modification.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvestmentAccountModificationDetails", propOrder = {
    "modRsn",
    "acctApplId"
})
public class InvestmentAccountModificationDetails {

    @XmlElement(name = "ModRsn")
    protected String modRsn;
    @XmlElement(name = "AcctApplId")
    protected String acctApplId;

    /**
     * Gets the value of the modRsn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModRsn() {
        return modRsn;
    }

    /**
     * Sets the value of the modRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public InvestmentAccountModificationDetails setModRsn(String value) {
        this.modRsn = value;
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
    public InvestmentAccountModificationDetails setAcctApplId(String value) {
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
