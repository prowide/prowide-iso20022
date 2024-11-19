
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
 * Specifies the derogation related data of settlement fails instructions.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SettlementFailsDerogation1", propOrder = {
    "elgbltyInd",
    "justfn"
})
public class SettlementFailsDerogation1 {

    @XmlElement(name = "ElgbltyInd")
    protected boolean elgbltyInd;
    @XmlElement(name = "Justfn")
    protected SettlementFailsJustification1 justfn;

    /**
     * Gets the value of the elgbltyInd property.
     * 
     */
    public boolean isElgbltyInd() {
        return elgbltyInd;
    }

    /**
     * Sets the value of the elgbltyInd property.
     * 
     */
    public SettlementFailsDerogation1 setElgbltyInd(boolean value) {
        this.elgbltyInd = value;
        return this;
    }

    /**
     * Gets the value of the justfn property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementFailsJustification1 }
     *     
     */
    public SettlementFailsJustification1 getJustfn() {
        return justfn;
    }

    /**
     * Sets the value of the justfn property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementFailsJustification1 }
     *     
     */
    public SettlementFailsDerogation1 setJustfn(SettlementFailsJustification1 value) {
        this.justfn = value;
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
