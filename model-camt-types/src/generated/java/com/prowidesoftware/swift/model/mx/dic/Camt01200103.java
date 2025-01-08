
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Scope
 * The DeleteLimit message is sent by a member to the transaction administrator.
 * It is used to request the deletion of one particular limit set by the member and managed by the transaction administrator.
 * Each DeleteLimit message can only delete one type of current limit (risk or liquidity management limit).
 * Usage
 * There are two purposes in establishing limits: to help members to make more efficient use of their liquidity and to facilitate risk management.
 * When limits are reached, the transaction administrator stops posting transactions to the account and puts them in a queue. The transaction administrator will resume processing the transactions held in the queue when the account balance of the member becomes sufficient to allow for the transactions to be executed while remaining within the limits.
 * Limits set by members are expressed as a maximum net position, and are managed by the transaction administrator. At any time during the day, the transaction administrator can ensure that the net position resulting from all incoming and outgoing transactions for a given member will not go over the fixed limit.
 * Limits are set by a member of the system either with regard to another specific member (bilateral limit) or with regard to all other participants (multilateral limit). As a result, there can be a maximum of one multilateral limit and as many bilateral limits as members of the system.
 * Note that for a bilateral limit, a member always needs to identify the counterparty to which it applies.
 * At any time during the operating hours of the system, the member can request the transaction administrator to delete any of the limits it has set (current limits). For example, the reason may be to unlock the payments queue regarding a particular member, or following a risk management decision issued after an exceptional event has occurred.
 * The member will submit a DeleteLimit message identifying which limit it wants to delete (current limit risk/liquidity limit concepts have been merged) based on following criteria:
 * - type of limit(s) (current/default)
 * - value of the limit(s) (default and/or current limit(s))
 * - identification of the counterparty (bilateral limit)
 * Based on the criteria received within the DeleteLimit message, the transaction administrator will execute or reject the requested modifications.
 * The transaction administrator may send a Receipt message as a reply to the DeleteLimit request.
 * To verify the outcome of the request, the member may submit a GetLimit message with the appropriate search criteria.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "camt.012.001.03", propOrder = {
    "msgId",
    "curLmt"
})
public class Camt01200103 {

    @XmlElement(name = "MsgId", required = true)
    protected MessageIdentification msgId;
    @XmlElement(name = "CurLmt")
    protected List<LimitIdentificationDetails2> curLmt;

    /**
     * Gets the value of the msgId property.
     * 
     * @return
     *     possible object is
     *     {@link MessageIdentification }
     *     
     */
    public MessageIdentification getMsgId() {
        return msgId;
    }

    /**
     * Sets the value of the msgId property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageIdentification }
     *     
     */
    public Camt01200103 setMsgId(MessageIdentification value) {
        this.msgId = value;
        return this;
    }

    /**
     * Gets the value of the curLmt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the curLmt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCurLmt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LimitIdentificationDetails2 }
     * 
     * 
     * @return
     *     The value of the curLmt property.
     */
    public List<LimitIdentificationDetails2> getCurLmt() {
        if (curLmt == null) {
            curLmt = new ArrayList<>();
        }
        return this.curLmt;
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

    /**
     * Adds a new item to the curLmt list.
     * @see #getCurLmt()
     * 
     */
    public Camt01200103 addCurLmt(LimitIdentificationDetails2 curLmt) {
        getCurLmt().add(curLmt);
        return this;
    }

}
