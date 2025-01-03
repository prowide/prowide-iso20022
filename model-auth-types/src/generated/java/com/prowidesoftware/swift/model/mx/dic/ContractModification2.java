
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
 * Information related to the action type.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContractModification2", propOrder = {
    "actnTp",
    "lvl"
})
public class ContractModification2 {

    @XmlElement(name = "ActnTp", required = true)
    @XmlSchemaType(name = "string")
    protected TransactionOperationType5Code actnTp;
    @XmlElement(name = "Lvl")
    @XmlSchemaType(name = "string")
    protected ModificationLevel1Code lvl;

    /**
     * Gets the value of the actnTp property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionOperationType5Code }
     *     
     */
    public TransactionOperationType5Code getActnTp() {
        return actnTp;
    }

    /**
     * Sets the value of the actnTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionOperationType5Code }
     *     
     */
    public ContractModification2 setActnTp(TransactionOperationType5Code value) {
        this.actnTp = value;
        return this;
    }

    /**
     * Gets the value of the lvl property.
     * 
     * @return
     *     possible object is
     *     {@link ModificationLevel1Code }
     *     
     */
    public ModificationLevel1Code getLvl() {
        return lvl;
    }

    /**
     * Sets the value of the lvl property.
     * 
     * @param value
     *     allowed object is
     *     {@link ModificationLevel1Code }
     *     
     */
    public ContractModification2 setLvl(ModificationLevel1Code value) {
        this.lvl = value;
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
