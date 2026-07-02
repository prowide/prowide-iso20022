
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * The SecuritiesSettlementInstructionQuery message is sent from an account owner/requestor to a settlement infrastructure.
 * The message is used to query information on the securities settlement instructions, that satisfy the defined selection criteria.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecuritiesSettlementTransactionQueryV01", propOrder = {
    "qryDef"
})
public class SecuritiesSettlementTransactionQueryV01 {

    @XmlElement(name = "QryDef", required = true)
    protected SettlementInstructionQueryDefinition31 qryDef;

    /**
     * Gets the value of the qryDef property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementInstructionQueryDefinition31 }
     *     
     */
    public SettlementInstructionQueryDefinition31 getQryDef() {
        return qryDef;
    }

    /**
     * Sets the value of the qryDef property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementInstructionQueryDefinition31 }
     *     
     */
    public SecuritiesSettlementTransactionQueryV01 setQryDef(SettlementInstructionQueryDefinition31 value) {
        this.qryDef = value;
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
