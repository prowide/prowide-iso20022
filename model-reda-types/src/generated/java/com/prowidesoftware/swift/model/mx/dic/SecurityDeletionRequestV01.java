
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
 * SCOPE
 * An instructing party sends a SecurityDeletionRequest message to an executing/servicing party to advice the complete removal of a financial instrument entry from their system.
 * 
 * The instructing party - executing/servicing party relationship may be:
 * - Central Securities Depositories (CSD) who would like to publish security static data, or 
 * - a Corporate, or
 * - a Bank, or
 * - a Market Infrastructure, or 
 * - a Market Data Provider.
 * 
 * USAGE
 * The request is sent when the instructing party identified that a security is wrongly created in the securities coverage of the executing/servicing party. The instructing party needs this security to be removed from the executing /servicing party database. 
 * This message can be used when a security identification code was issued too quickly or if a security identification code needs to be reused (for example, in case of money market instrument). The result of this message is a complete removal of the security identification from the executing/servicing party's database.
 * 
 * Initiator: instructing party.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecurityDeletionRequestV01", propOrder = {
    "msgHdr",
    "finInstrmId",
    "splmtryData"
})
public class SecurityDeletionRequestV01 {

    @XmlElement(name = "MsgHdr")
    protected MessageHeader1 msgHdr;
    @XmlElement(name = "FinInstrmId", required = true)
    protected SecurityIdentification39 finInstrmId;
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
    public SecurityDeletionRequestV01 setMsgHdr(MessageHeader1 value) {
        this.msgHdr = value;
        return this;
    }

    /**
     * Gets the value of the finInstrmId property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityIdentification39 }
     *     
     */
    public SecurityIdentification39 getFinInstrmId() {
        return finInstrmId;
    }

    /**
     * Sets the value of the finInstrmId property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityIdentification39 }
     *     
     */
    public SecurityDeletionRequestV01 setFinInstrmId(SecurityIdentification39 value) {
        this.finInstrmId = value;
        return this;
    }

    /**
     * Gets the value of the splmtryData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the splmtryData property.
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
     * @return
     *     The value of the splmtryData property.
     */
    public List<SupplementaryData1> getSplmtryData() {
        if (splmtryData == null) {
            splmtryData = new ArrayList<>();
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
    public SecurityDeletionRequestV01 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
