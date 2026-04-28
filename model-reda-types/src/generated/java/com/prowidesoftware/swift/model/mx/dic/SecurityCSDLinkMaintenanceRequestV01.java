
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
 * SCOPE
 * An instructing party sends a SecurityCSDLinkMaintenanceRequest message to an executing/servicing party to request the maintenance of the link between a financial instrument and a CSD in their system.
 * 
 * The instructing party - executing/servicing party relationship may be:
 * - Central Securities Depositories (CSD) who would like to publish security CSD Link static data, or 
 * - a Corporate, or
 * - a Bank, or
 * - a Market Infrastructure, or 
 * - a Market Data Provider.
 * 
 * USAGE
 * The request is sent when the instructing party identified a gap in the security CSD Link coverage of the executing/servicing party. The instructing party needs this security to be maintained at the executing /servicing party to perform its activities.
 * 
 * Initiator: instructing party.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecurityCSDLinkMaintenanceRequestV01", propOrder = {
    "msgHdr",
    "sctyCSDLkId",
    "upd",
    "splmtryData"
})
public class SecurityCSDLinkMaintenanceRequestV01 {

    @XmlElement(name = "MsgHdr")
    protected MessageHeader1 msgHdr;
    @XmlElement(name = "SctyCSDLkId", required = true)
    protected SecurityCSDLink9 sctyCSDLkId;
    @XmlElement(name = "Upd", required = true)
    protected SecurityCSDLinkUpdate3 upd;
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
    public SecurityCSDLinkMaintenanceRequestV01 setMsgHdr(MessageHeader1 value) {
        this.msgHdr = value;
        return this;
    }

    /**
     * Gets the value of the sctyCSDLkId property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityCSDLink9 }
     *     
     */
    public SecurityCSDLink9 getSctyCSDLkId() {
        return sctyCSDLkId;
    }

    /**
     * Sets the value of the sctyCSDLkId property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityCSDLink9 }
     *     
     */
    public SecurityCSDLinkMaintenanceRequestV01 setSctyCSDLkId(SecurityCSDLink9 value) {
        this.sctyCSDLkId = value;
        return this;
    }

    /**
     * Gets the value of the upd property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityCSDLinkUpdate3 }
     *     
     */
    public SecurityCSDLinkUpdate3 getUpd() {
        return upd;
    }

    /**
     * Sets the value of the upd property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityCSDLinkUpdate3 }
     *     
     */
    public SecurityCSDLinkMaintenanceRequestV01 setUpd(SecurityCSDLinkUpdate3 value) {
        this.upd = value;
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
    public SecurityCSDLinkMaintenanceRequestV01 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
