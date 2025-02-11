
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
 * Choice between formats for the statement basis.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatementBasisCodeAndDSSCodeChoice", propOrder = {
    "stmtBsisAsCd",
    "stmtBsisAsDSS"
})
public class StatementBasisCodeAndDSSCodeChoice {

    @XmlElement(name = "StmtBsisAsCd")
    @XmlSchemaType(name = "string")
    protected StatementBasis1Code stmtBsisAsCd;
    @XmlElement(name = "StmtBsisAsDSS")
    protected GenericIdentification7 stmtBsisAsDSS;

    /**
     * Gets the value of the stmtBsisAsCd property.
     * 
     * @return
     *     possible object is
     *     {@link StatementBasis1Code }
     *     
     */
    public StatementBasis1Code getStmtBsisAsCd() {
        return stmtBsisAsCd;
    }

    /**
     * Sets the value of the stmtBsisAsCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatementBasis1Code }
     *     
     */
    public StatementBasisCodeAndDSSCodeChoice setStmtBsisAsCd(StatementBasis1Code value) {
        this.stmtBsisAsCd = value;
        return this;
    }

    /**
     * Gets the value of the stmtBsisAsDSS property.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification7 }
     *     
     */
    public GenericIdentification7 getStmtBsisAsDSS() {
        return stmtBsisAsDSS;
    }

    /**
     * Sets the value of the stmtBsisAsDSS property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification7 }
     *     
     */
    public StatementBasisCodeAndDSSCodeChoice setStmtBsisAsDSS(GenericIdentification7 value) {
        this.stmtBsisAsDSS = value;
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
