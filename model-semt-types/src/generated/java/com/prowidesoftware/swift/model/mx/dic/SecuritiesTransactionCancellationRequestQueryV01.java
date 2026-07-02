
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
 * The SecuritiesTransactionCancellationRequestQuery message is sent from an account owner/requestor to a settlement infrastructure to query for the status of settlement or intra-position movement cancellation instruction(s) based on a set of search criteria or business attributes.
 * The message may also be used to: 
 * - re-send a message sent by the account owner to the account servicer (the sub-function of the message is "Duplicate") 
 * - provide a third party with a copy of a message being sent by the account owner for information (the sub-function of the message is "Copy") 
 * - re-send to a third party a copy of a message being sent by the account owner for information (the sub-function of the message is "Copy Duplicate").
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecuritiesTransactionCancellationRequestQueryV01", propOrder = {
    "qryDef"
})
public class SecuritiesTransactionCancellationRequestQueryV01 {

    @XmlElement(name = "QryDef", required = true)
    protected IntraPositionQueryDefinition51 qryDef;

    /**
     * Gets the value of the qryDef property.
     * 
     * @return
     *     possible object is
     *     {@link IntraPositionQueryDefinition51 }
     *     
     */
    public IntraPositionQueryDefinition51 getQryDef() {
        return qryDef;
    }

    /**
     * Sets the value of the qryDef property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntraPositionQueryDefinition51 }
     *     
     */
    public SecuritiesTransactionCancellationRequestQueryV01 setQryDef(IntraPositionQueryDefinition51 value) {
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
