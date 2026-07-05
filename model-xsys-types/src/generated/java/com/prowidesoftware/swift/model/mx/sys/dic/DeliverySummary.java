
package com.prowidesoftware.swift.model.mx.sys.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Java class for DeliverySummary complex type.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeliverySummary", propOrder = {
    "thirdPartyDN",
    "pdmLst",
    "acceptStatus",
    "deliveryTime",
    "ackSwiftTime",
    "ackDescription",
    "ackInfo"
})
public class DeliverySummary {

    @XmlElement(name = "ThirdPartyDN", namespace = "urn:swift:snl:ns.Sw")
    protected String thirdPartyDN;
    @XmlElement(name = "PDMLst")
    protected PossibleDuplicateMessageList pdmLst;
    @XmlElement(name = "AcceptStatus", namespace = "urn:swift:snl:ns.Sw")
    protected String acceptStatus;
    @XmlElement(name = "DeliveryTime", namespace = "urn:swift:snl:ns.Sw")
    protected String deliveryTime;
    @XmlElement(name = "AckSwiftTime", namespace = "urn:swift:snl:ns.Sw")
    protected String ackSwiftTime;
    @XmlElement(name = "AckDescription", namespace = "urn:swift:snl:ns.Sw")
    protected String ackDescription;
    @XmlElement(name = "AckInfo", namespace = "urn:swift:snl:ns.Sw")
    protected String ackInfo;

    /**
     * ThirdPartyDN
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThirdPartyDN() {
        return thirdPartyDN;
    }

    /**
     * Sets the value of the thirdPartyDN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public DeliverySummary setThirdPartyDN(String value) {
        this.thirdPartyDN = value;
        return this;
    }

    /**
     * Gets the value of the pdmLst property.
     * 
     * @return
     *     possible object is
     *     {@link PossibleDuplicateMessageList }
     *     
     */
    public PossibleDuplicateMessageList getPDMLst() {
        return pdmLst;
    }

    /**
     * Sets the value of the pdmLst property.
     * 
     * @param value
     *     allowed object is
     *     {@link PossibleDuplicateMessageList }
     *     
     */
    public DeliverySummary setPDMLst(PossibleDuplicateMessageList value) {
        this.pdmLst = value;
        return this;
    }

    /**
     * AcceptanceStatus
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcceptStatus() {
        return acceptStatus;
    }

    /**
     * Sets the value of the acceptStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public DeliverySummary setAcceptStatus(String value) {
        this.acceptStatus = value;
        return this;
    }

    /**
     * DeliveryTime
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeliveryTime() {
        return deliveryTime;
    }

    /**
     * Sets the value of the deliveryTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public DeliverySummary setDeliveryTime(String value) {
        this.deliveryTime = value;
        return this;
    }

    /**
     * AcknowledgementSwiftTime
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAckSwiftTime() {
        return ackSwiftTime;
    }

    /**
     * Sets the value of the ackSwiftTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public DeliverySummary setAckSwiftTime(String value) {
        this.ackSwiftTime = value;
        return this;
    }

    /**
     * AcknowledgementDescription
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAckDescription() {
        return ackDescription;
    }

    /**
     * Sets the value of the ackDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public DeliverySummary setAckDescription(String value) {
        this.ackDescription = value;
        return this;
    }

    /**
     * AcknowledgementInformation
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAckInfo() {
        return ackInfo;
    }

    /**
     * Sets the value of the ackInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public DeliverySummary setAckInfo(String value) {
        this.ackInfo = value;
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
