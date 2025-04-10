
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
 * Specifies the type of change to statement frequency and form.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatementFrequencyAndFormModification1", propOrder = {
    "modCd",
    "stmtFrqcyAndForm"
})
public class StatementFrequencyAndFormModification1 {

    @XmlElement(name = "ModCd")
    @XmlSchemaType(name = "string")
    protected Modification1Code modCd;
    @XmlElement(name = "StmtFrqcyAndForm", required = true)
    protected StatementFrequencyAndForm1 stmtFrqcyAndForm;

    /**
     * Gets the value of the modCd property.
     * 
     * @return
     *     possible object is
     *     {@link Modification1Code }
     *     
     */
    public Modification1Code getModCd() {
        return modCd;
    }

    /**
     * Sets the value of the modCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Modification1Code }
     *     
     */
    public StatementFrequencyAndFormModification1 setModCd(Modification1Code value) {
        this.modCd = value;
        return this;
    }

    /**
     * Gets the value of the stmtFrqcyAndForm property.
     * 
     * @return
     *     possible object is
     *     {@link StatementFrequencyAndForm1 }
     *     
     */
    public StatementFrequencyAndForm1 getStmtFrqcyAndForm() {
        return stmtFrqcyAndForm;
    }

    /**
     * Sets the value of the stmtFrqcyAndForm property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatementFrequencyAndForm1 }
     *     
     */
    public StatementFrequencyAndFormModification1 setStmtFrqcyAndForm(StatementFrequencyAndForm1 value) {
        this.stmtFrqcyAndForm = value;
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
