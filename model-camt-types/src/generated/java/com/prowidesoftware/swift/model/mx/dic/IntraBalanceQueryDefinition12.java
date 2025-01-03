
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
 * Defines the information that is searched through specific criteria.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IntraBalanceQueryDefinition12", propOrder = {
    "qryTp",
    "schCrit"
})
public class IntraBalanceQueryDefinition12 {

    @XmlElement(name = "QryTp", required = true)
    @XmlSchemaType(name = "string")
    protected MovementResponseType1Code qryTp;
    @XmlElement(name = "SchCrit", required = true)
    protected IntraBalanceQueryCriteria12 schCrit;

    /**
     * Gets the value of the qryTp property.
     * 
     * @return
     *     possible object is
     *     {@link MovementResponseType1Code }
     *     
     */
    public MovementResponseType1Code getQryTp() {
        return qryTp;
    }

    /**
     * Sets the value of the qryTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link MovementResponseType1Code }
     *     
     */
    public IntraBalanceQueryDefinition12 setQryTp(MovementResponseType1Code value) {
        this.qryTp = value;
        return this;
    }

    /**
     * Gets the value of the schCrit property.
     * 
     * @return
     *     possible object is
     *     {@link IntraBalanceQueryCriteria12 }
     *     
     */
    public IntraBalanceQueryCriteria12 getSchCrit() {
        return schCrit;
    }

    /**
     * Sets the value of the schCrit property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntraBalanceQueryCriteria12 }
     *     
     */
    public IntraBalanceQueryDefinition12 setSchCrit(IntraBalanceQueryCriteria12 value) {
        this.schCrit = value;
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
