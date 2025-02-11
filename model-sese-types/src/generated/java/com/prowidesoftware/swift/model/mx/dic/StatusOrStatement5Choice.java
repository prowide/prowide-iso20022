
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
 * Choice between the identification of a status or statement query.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatusOrStatement5Choice", propOrder = {
    "stsAdvc",
    "stmt"
})
public class StatusOrStatement5Choice {

    @XmlElement(name = "StsAdvc")
    protected DocumentNumber9 stsAdvc;
    @XmlElement(name = "Stmt")
    protected DocumentNumber1 stmt;

    /**
     * Gets the value of the stsAdvc property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentNumber9 }
     *     
     */
    public DocumentNumber9 getStsAdvc() {
        return stsAdvc;
    }

    /**
     * Sets the value of the stsAdvc property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentNumber9 }
     *     
     */
    public StatusOrStatement5Choice setStsAdvc(DocumentNumber9 value) {
        this.stsAdvc = value;
        return this;
    }

    /**
     * Gets the value of the stmt property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentNumber1 }
     *     
     */
    public DocumentNumber1 getStmt() {
        return stmt;
    }

    /**
     * Sets the value of the stmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentNumber1 }
     *     
     */
    public StatusOrStatement5Choice setStmt(DocumentNumber1 value) {
        this.stmt = value;
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
