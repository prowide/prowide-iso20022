
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
 * The SecuritiesSettlementConditionsModificationRequestQuery message is sent from an account owner/requestor to a settlement infrastructure to query for the status of settlement or intra-position movement modification instruction(s) based on a set of search criteria or business attributes.
 * The message may also be used to: 
 * - re-send a message sent by the account owner to the account servicer (the sub-function of the message is "Duplicate") 
 * - provide a third party with a copy of a message being sent by the account owner for information (the sub-function of the message is "Copy") 
 * - re-send to a third party a copy of a message being sent by the account owner for information (the sub-function of the message is "Copy Duplicate").
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecuritiesSettlementConditionsModificationRequestQueryV01", propOrder = {
    "qryDef"
})
public class SecuritiesSettlementConditionsModificationRequestQueryV01 {

    @XmlElement(name = "QryDef", required = true)
    protected IntraPositionQueryDefinition41 qryDef;

    /**
     * Gets the value of the qryDef property.
     * 
     * @return
     *     possible object is
     *     {@link IntraPositionQueryDefinition41 }
     *     
     */
    public IntraPositionQueryDefinition41 getQryDef() {
        return qryDef;
    }

    /**
     * Sets the value of the qryDef property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntraPositionQueryDefinition41 }
     *     
     */
    public SecuritiesSettlementConditionsModificationRequestQueryV01 setQryDef(IntraPositionQueryDefinition41 value) {
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
