
package com.prowidesoftware.swift.model.mx.sys.dic;

import java.util.ArrayList;
import java.util.List;
import com.prowidesoftware.swift.model.mx.sys.dic.SwFileRequestHeader;
import com.prowidesoftware.swift.model.mx.sys.dic.SwIntRequestHeader;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Java class for DeliveryNotification complex type.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeliveryNotification", propOrder = {
    "snFRef",
    "origSnFRef",
    "thirdPartyDN",
    "recipientDN",
    "snFRefType",
    "inputChannel",
    "snFInputSeq",
    "acceptStatus",
    "deliveryTime",
    "ackSwiftTime",
    "ackDescription",
    "ackInfo",
    "fileRequestHeader",
    "requestHeader",
    "xtnsn"
})
public class DeliveryNotification {

    @XmlElement(name = "SnFRef", namespace = "urn:swift:snl:ns.Sw", required = true)
    protected String snFRef;
    @XmlElement(name = "OrigSnFRef", namespace = "urn:swift:snl:ns.Sw")
    protected String origSnFRef;
    @XmlElement(name = "ThirdPartyDN", namespace = "urn:swift:snl:ns.Sw")
    protected String thirdPartyDN;
    @XmlElement(name = "RecipientDN", namespace = "urn:swift:snl:ns.Sw")
    protected String recipientDN;
    @XmlElement(name = "SnFRefType", namespace = "urn:swift:snl:ns.Sw", required = true)
    protected String snFRefType;
    @XmlElement(name = "InputChannel", namespace = "urn:swift:snl:ns.Sw")
    protected String inputChannel;
    @XmlElement(name = "SnFInputSeq", namespace = "urn:swift:snl:ns.Sw")
    protected String snFInputSeq;
    @XmlElement(name = "AcceptStatus", namespace = "urn:swift:snl:ns.Sw", required = true)
    protected String acceptStatus;
    @XmlElement(name = "DeliveryTime", namespace = "urn:swift:snl:ns.Sw", required = true)
    protected String deliveryTime;
    @XmlElement(name = "AckSwiftTime", namespace = "urn:swift:snl:ns.Sw", required = true)
    protected String ackSwiftTime;
    @XmlElement(name = "AckDescription", namespace = "urn:swift:snl:ns.Sw")
    protected String ackDescription;
    @XmlElement(name = "AckInfo", namespace = "urn:swift:snl:ns.Sw")
    protected String ackInfo;
    @XmlElement(name = "FileRequestHeader", namespace = "urn:swift:snl:ns.Sw")
    protected SwFileRequestHeader fileRequestHeader;
    @XmlElement(name = "RequestHeader", namespace = "urn:swift:snl:ns.SwInt")
    protected SwIntRequestHeader requestHeader;
    @XmlElement(name = "Xtnsn")
    protected List<Extension> xtnsn;

    /**
     * StoreAndForwardReference
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSnFRef() {
        return snFRef;
    }

    /**
     * Sets the value of the snFRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public DeliveryNotification setSnFRef(String value) {
        this.snFRef = value;
        return this;
    }

    /**
     * OriginalStoreAndForwardReference
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrigSnFRef() {
        return origSnFRef;
    }

    /**
     * Sets the value of the origSnFRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public DeliveryNotification setOrigSnFRef(String value) {
        this.origSnFRef = value;
        return this;
    }

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
    public DeliveryNotification setThirdPartyDN(String value) {
        this.thirdPartyDN = value;
        return this;
    }

    /**
     * RecipientDN
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecipientDN() {
        return recipientDN;
    }

    /**
     * Sets the value of the recipientDN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public DeliveryNotification setRecipientDN(String value) {
        this.recipientDN = value;
        return this;
    }

    /**
     * StoreAndForwardReferenceType
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSnFRefType() {
        return snFRefType;
    }

    /**
     * Sets the value of the snFRefType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public DeliveryNotification setSnFRefType(String value) {
        this.snFRefType = value;
        return this;
    }

    /**
     * InputChannel
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInputChannel() {
        return inputChannel;
    }

    /**
     * Sets the value of the inputChannel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public DeliveryNotification setInputChannel(String value) {
        this.inputChannel = value;
        return this;
    }

    /**
     * StoreAndForwardInputSequence
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSnFInputSeq() {
        return snFInputSeq;
    }

    /**
     * Sets the value of the snFInputSeq property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public DeliveryNotification setSnFInputSeq(String value) {
        this.snFInputSeq = value;
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
    public DeliveryNotification setAcceptStatus(String value) {
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
    public DeliveryNotification setDeliveryTime(String value) {
        this.deliveryTime = value;
        return this;
    }

    /**
     * AcknowledgedSwiftTime
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
    public DeliveryNotification setAckSwiftTime(String value) {
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
    public DeliveryNotification setAckDescription(String value) {
        this.ackDescription = value;
        return this;
    }

    /**
     * AcknowldegementInformation
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
    public DeliveryNotification setAckInfo(String value) {
        this.ackInfo = value;
        return this;
    }

    /**
     * Gets the value of the fileRequestHeader property.
     * 
     * @return
     *     possible object is
     *     {@link SwFileRequestHeader }
     *     
     */
    public SwFileRequestHeader getFileRequestHeader() {
        return fileRequestHeader;
    }

    /**
     * Sets the value of the fileRequestHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwFileRequestHeader }
     *     
     */
    public DeliveryNotification setFileRequestHeader(SwFileRequestHeader value) {
        this.fileRequestHeader = value;
        return this;
    }

    /**
     * Gets the value of the requestHeader property.
     * 
     * @return
     *     possible object is
     *     {@link SwIntRequestHeader }
     *     
     */
    public SwIntRequestHeader getRequestHeader() {
        return requestHeader;
    }

    /**
     * Sets the value of the requestHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwIntRequestHeader }
     *     
     */
    public DeliveryNotification setRequestHeader(SwIntRequestHeader value) {
        this.requestHeader = value;
        return this;
    }

    /**
     * Gets the value of the xtnsn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the xtnsn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getXtnsn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Extension }
     * 
     * 
     * @return
     *     The value of the xtnsn property.
     */
    public List<Extension> getXtnsn() {
        if (xtnsn == null) {
            xtnsn = new ArrayList<>();
        }
        return this.xtnsn;
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
     * Adds a new item to the xtnsn list.
     * @see #getXtnsn()
     * 
     */
    public DeliveryNotification addXtnsn(Extension xtnsn) {
        getXtnsn().add(xtnsn);
        return this;
    }

}
