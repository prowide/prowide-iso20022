
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
 * Set of elements used to report information about securities account reference data.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecuritiesAccountReport3", propOrder = {
    "sctiesAcctId",
    "sctiesAcctOrErr"
})
public class SecuritiesAccountReport3 {

    @XmlElement(name = "SctiesAcctId", required = true)
    protected SecuritiesAccount19 sctiesAcctId;
    @XmlElement(name = "SctiesAcctOrErr", required = true)
    protected SecuritiesAccountOrBusinessError3Choice sctiesAcctOrErr;

    /**
     * Gets the value of the sctiesAcctId property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesAccount19 }
     *     
     */
    public SecuritiesAccount19 getSctiesAcctId() {
        return sctiesAcctId;
    }

    /**
     * Sets the value of the sctiesAcctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesAccount19 }
     *     
     */
    public SecuritiesAccountReport3 setSctiesAcctId(SecuritiesAccount19 value) {
        this.sctiesAcctId = value;
        return this;
    }

    /**
     * Gets the value of the sctiesAcctOrErr property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesAccountOrBusinessError3Choice }
     *     
     */
    public SecuritiesAccountOrBusinessError3Choice getSctiesAcctOrErr() {
        return sctiesAcctOrErr;
    }

    /**
     * Sets the value of the sctiesAcctOrErr property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesAccountOrBusinessError3Choice }
     *     
     */
    public SecuritiesAccountReport3 setSctiesAcctOrErr(SecuritiesAccountOrBusinessError3Choice value) {
        this.sctiesAcctOrErr = value;
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
