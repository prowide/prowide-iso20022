
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Scope
 * The ReturnStandingOrder message is sent by a transaction administrator to a member.
 * It is used to provide information on the details of one or more standing orders, based on specific request and return criteria.
 * in response to a request a on information on standing and predefined orders.
 * Usage
 * The ReturnStandingOrder message lists the standing order based on the following possible return criteria: 
 * - Generic standing order details,
 * - Details of a specific predefined or standing liquidity transfer orders,
 * - Details on the set to which the standing order belongs to,
 * - List of all predefined and standing liquidity transfer standing orders and/or per set,
 * - Total amount of predefined and standing liquidity transfer orders defined in the system.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReturnStandingOrderV04", propOrder = {
    "msgHdr",
    "rptOrErr",
    "splmtryData"
})
public class ReturnStandingOrderV04 {

    @XmlElement(name = "MsgHdr", required = true)
    protected MessageHeader6 msgHdr;
    @XmlElement(name = "RptOrErr", required = true)
    protected StandingOrderOrError5Choice rptOrErr;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the msgHdr property.
     * 
     * @return
     *     possible object is
     *     {@link MessageHeader6 }
     *     
     */
    public MessageHeader6 getMsgHdr() {
        return msgHdr;
    }

    /**
     * Sets the value of the msgHdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageHeader6 }
     *     
     */
    public ReturnStandingOrderV04 setMsgHdr(MessageHeader6 value) {
        this.msgHdr = value;
        return this;
    }

    /**
     * Gets the value of the rptOrErr property.
     * 
     * @return
     *     possible object is
     *     {@link StandingOrderOrError5Choice }
     *     
     */
    public StandingOrderOrError5Choice getRptOrErr() {
        return rptOrErr;
    }

    /**
     * Sets the value of the rptOrErr property.
     * 
     * @param value
     *     allowed object is
     *     {@link StandingOrderOrError5Choice }
     *     
     */
    public ReturnStandingOrderV04 setRptOrErr(StandingOrderOrError5Choice value) {
        this.rptOrErr = value;
        return this;
    }

    /**
     * Gets the value of the splmtryData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the splmtryData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSplmtryData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SupplementaryData1 }
     * 
     * 
     */
    public List<SupplementaryData1> getSplmtryData() {
        if (splmtryData == null) {
            splmtryData = new ArrayList<SupplementaryData1>();
        }
        return this.splmtryData;
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
     * Adds a new item to the splmtryData list.
     * @see #getSplmtryData()
     * 
     */
    public ReturnStandingOrderV04 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
