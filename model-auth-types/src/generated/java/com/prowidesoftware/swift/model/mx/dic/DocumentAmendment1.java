
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Indicates whether the supporting document is amending an original document or not, and the reference of the original supporting document, when applicable.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocumentAmendment1", propOrder = {
    "crrctnId",
    "orgnlDocId"
})
public class DocumentAmendment1 {

    @XmlElement(name = "CrrctnId", required = true)
    protected BigDecimal crrctnId;
    @XmlElement(name = "OrgnlDocId")
    protected String orgnlDocId;

    /**
     * Gets the value of the crrctnId property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCrrctnId() {
        return crrctnId;
    }

    /**
     * Sets the value of the crrctnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public DocumentAmendment1 setCrrctnId(BigDecimal value) {
        this.crrctnId = value;
        return this;
    }

    /**
     * Gets the value of the orgnlDocId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgnlDocId() {
        return orgnlDocId;
    }

    /**
     * Sets the value of the orgnlDocId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public DocumentAmendment1 setOrgnlDocId(String value) {
        this.orgnlDocId = value;
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
