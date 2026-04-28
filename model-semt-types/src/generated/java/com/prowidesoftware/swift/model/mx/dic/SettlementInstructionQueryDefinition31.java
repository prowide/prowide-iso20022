
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
 * Defines the information that is searched through the definition of specific criteria.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SettlementInstructionQueryDefinition3__1", propOrder = {
    "qryTp",
    "schCrit"
})
public class SettlementInstructionQueryDefinition31 {

    @XmlElement(name = "QryTp", required = true)
    @XmlSchemaType(name = "string")
    protected SettlementQueryType1Code qryTp;
    @XmlElement(name = "SchCrit", required = true)
    protected SettlementInstructionQueryCriteria31 schCrit;

    /**
     * Gets the value of the qryTp property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementQueryType1Code }
     *     
     */
    public SettlementQueryType1Code getQryTp() {
        return qryTp;
    }

    /**
     * Sets the value of the qryTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementQueryType1Code }
     *     
     */
    public SettlementInstructionQueryDefinition31 setQryTp(SettlementQueryType1Code value) {
        this.qryTp = value;
        return this;
    }

    /**
     * Gets the value of the schCrit property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementInstructionQueryCriteria31 }
     *     
     */
    public SettlementInstructionQueryCriteria31 getSchCrit() {
        return schCrit;
    }

    /**
     * Sets the value of the schCrit property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementInstructionQueryCriteria31 }
     *     
     */
    public SettlementInstructionQueryDefinition31 setSchCrit(SettlementInstructionQueryCriteria31 value) {
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
