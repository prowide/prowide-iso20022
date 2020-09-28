
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
 * Provides additional information regarding the party, for example, the contact unit or person responsible for the transaction identified in the message.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartyTextInformation2", propOrder = {
    "dclrtnDtls",
    "ptyCtctDtls"
})
public class PartyTextInformation2 {

    @XmlElement(name = "DclrtnDtls")
    protected String dclrtnDtls;
    @XmlElement(name = "PtyCtctDtls")
    protected String ptyCtctDtls;

    /**
     * Gets the value of the dclrtnDtls property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDclrtnDtls() {
        return dclrtnDtls;
    }

    /**
     * Sets the value of the dclrtnDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PartyTextInformation2 setDclrtnDtls(String value) {
        this.dclrtnDtls = value;
        return this;
    }

    /**
     * Gets the value of the ptyCtctDtls property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPtyCtctDtls() {
        return ptyCtctDtls;
    }

    /**
     * Sets the value of the ptyCtctDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PartyTextInformation2 setPtyCtctDtls(String value) {
        this.ptyCtctDtls = value;
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
