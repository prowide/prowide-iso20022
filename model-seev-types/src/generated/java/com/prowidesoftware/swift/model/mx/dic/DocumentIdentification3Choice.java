
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
 * Choice between a document identification provided either by the account owner or by the account servicer.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocumentIdentification3Choice", propOrder = {
    "acctSvcrDocId",
    "acctOwnrDocId"
})
public class DocumentIdentification3Choice {

    @XmlElement(name = "AcctSvcrDocId")
    protected String acctSvcrDocId;
    @XmlElement(name = "AcctOwnrDocId")
    protected String acctOwnrDocId;

    /**
     * Gets the value of the acctSvcrDocId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctSvcrDocId() {
        return acctSvcrDocId;
    }

    /**
     * Sets the value of the acctSvcrDocId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public DocumentIdentification3Choice setAcctSvcrDocId(String value) {
        this.acctSvcrDocId = value;
        return this;
    }

    /**
     * Gets the value of the acctOwnrDocId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctOwnrDocId() {
        return acctOwnrDocId;
    }

    /**
     * Sets the value of the acctOwnrDocId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public DocumentIdentification3Choice setAcctOwnrDocId(String value) {
        this.acctOwnrDocId = value;
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
