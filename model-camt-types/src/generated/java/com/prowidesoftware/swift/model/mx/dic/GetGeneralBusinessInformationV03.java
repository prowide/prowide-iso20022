
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
 * The GetGeneralBusinessInformation message is sent by a member to the transaction administrator.
 * It is used to request information on a broadcast-type message previously sent by the transaction administrator to all or some of the members, giving information related to the processing business.
 * Usage
 * The transaction administrator can send general business information messages to the members, which may request further action from them. General business information can contain either static data announcing foreseen events affecting the system operations, or dynamic data warning or notifying about unexpected events.
 * This type of information can be transmitted in either of the two following ways:
 * - non-solicited reports are pushed by the transaction administrator to the (selected) members together with a reference, a qualifier and a subject line
 * - upon request from the members (pull mode), the transaction administrator delivers the full text/content of the message back to the user
 * The Get General Business Information message is used in this second context. At any time during the operating hours of the system, the member can query the transaction administrator to get information about a report of general business information previously sent.
 * The member can request information based on the following elements:
 * - reference of the report previously delivered
 * - subject of the report previously delivered, detailing the purpose and content of the message
 * - priority of the report previously sent, and indication of its format. (Note that if the format is indicated, the subject refers to a set of pre-agreed texts. This enumeration has to be agreed upon by the transaction administrator and the members of the system.)
 * - details of the previously sent message
 * This message will be replied to by a ReturnGeneralBusinessInformation message.
 * Additional information on the generic design of the Get/Return messages can be found in the section How to Use the Cash Management Messages.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetGeneralBusinessInformationV03", propOrder = {
    "msgHdr",
    "gnlBizInfQryDef",
    "splmtryData"
})
public class GetGeneralBusinessInformationV03 {

    @XmlElement(name = "MsgHdr", required = true)
    protected MessageHeader1 msgHdr;
    @XmlElement(name = "GnlBizInfQryDef")
    protected BusinessInformationQueryDefinition3 gnlBizInfQryDef;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the msgHdr property.
     * 
     * @return
     *     possible object is
     *     {@link MessageHeader1 }
     *     
     */
    public MessageHeader1 getMsgHdr() {
        return msgHdr;
    }

    /**
     * Sets the value of the msgHdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageHeader1 }
     *     
     */
    public GetGeneralBusinessInformationV03 setMsgHdr(MessageHeader1 value) {
        this.msgHdr = value;
        return this;
    }

    /**
     * Gets the value of the gnlBizInfQryDef property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessInformationQueryDefinition3 }
     *     
     */
    public BusinessInformationQueryDefinition3 getGnlBizInfQryDef() {
        return gnlBizInfQryDef;
    }

    /**
     * Sets the value of the gnlBizInfQryDef property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessInformationQueryDefinition3 }
     *     
     */
    public GetGeneralBusinessInformationV03 setGnlBizInfQryDef(BusinessInformationQueryDefinition3 value) {
        this.gnlBizInfQryDef = value;
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
    public GetGeneralBusinessInformationV03 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
