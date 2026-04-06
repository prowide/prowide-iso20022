
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
 * The IntraPositionMovementQuery message is sent from an account owner/requestor to a settlement infrastructure to query intra-position movement instructions, along with their current status, based on a set of search criteria.
 * The message may also be used to: 
 * - re-send a message sent by the account owner to the account servicer (the sub-function of the message is "Duplicate") 
 * - provide a third party with a copy of a message being sent by the account owner for information (the sub-function of the message is "Copy") 
 * - re-send to a third party a copy of a message being sent by the account owner for information (the sub-function of the message is "Copy Duplicate").
 * 
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IntraPositionMovementQueryV01", propOrder = {
    "qryDef"
})
public class IntraPositionMovementQueryV01 {

    @XmlElement(name = "QryDef", required = true)
    protected IntraPositionQueryDefinition71 qryDef;

    /**
     * Gets the value of the qryDef property.
     * 
     * @return
     *     possible object is
     *     {@link IntraPositionQueryDefinition71 }
     *     
     */
    public IntraPositionQueryDefinition71 getQryDef() {
        return qryDef;
    }

    /**
     * Sets the value of the qryDef property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntraPositionQueryDefinition71 }
     *     
     */
    public IntraPositionMovementQueryV01 setQryDef(IntraPositionQueryDefinition71 value) {
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
