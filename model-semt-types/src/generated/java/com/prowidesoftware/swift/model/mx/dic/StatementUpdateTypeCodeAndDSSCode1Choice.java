
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
 * Choice between formats for the update type.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatementUpdateTypeCodeAndDSSCode1Choice", propOrder = {
    "stmtUpdTpAsCd",
    "stmtUpdTpAsDSS"
})
public class StatementUpdateTypeCodeAndDSSCode1Choice {

    @XmlElement(name = "StmtUpdTpAsCd")
    @XmlSchemaType(name = "string")
    protected StatementUpdateType1Code stmtUpdTpAsCd;
    @XmlElement(name = "StmtUpdTpAsDSS")
    protected GenericIdentification7 stmtUpdTpAsDSS;

    /**
     * Gets the value of the stmtUpdTpAsCd property.
     * 
     * @return
     *     possible object is
     *     {@link StatementUpdateType1Code }
     *     
     */
    public StatementUpdateType1Code getStmtUpdTpAsCd() {
        return stmtUpdTpAsCd;
    }

    /**
     * Sets the value of the stmtUpdTpAsCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatementUpdateType1Code }
     *     
     */
    public StatementUpdateTypeCodeAndDSSCode1Choice setStmtUpdTpAsCd(StatementUpdateType1Code value) {
        this.stmtUpdTpAsCd = value;
        return this;
    }

    /**
     * Gets the value of the stmtUpdTpAsDSS property.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification7 }
     *     
     */
    public GenericIdentification7 getStmtUpdTpAsDSS() {
        return stmtUpdTpAsDSS;
    }

    /**
     * Sets the value of the stmtUpdTpAsDSS property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification7 }
     *     
     */
    public StatementUpdateTypeCodeAndDSSCode1Choice setStmtUpdTpAsDSS(GenericIdentification7 value) {
        this.stmtUpdTpAsDSS = value;
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
