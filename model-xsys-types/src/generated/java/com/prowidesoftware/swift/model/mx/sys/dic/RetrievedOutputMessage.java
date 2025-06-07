
package com.prowidesoftware.swift.model.mx.sys.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.prowidesoftware.swift.model.mx.sys.dic.SwFileRequestHeader;
import com.prowidesoftware.swift.model.mx.sys.dic.SwIntRequestHeader;
import com.prowidesoftware.swift.model.mx.sys.dic.SwSnFOutputInfo;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Java class for RetrievedOutputMessage complex type.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RetrievedOutputMessage", propOrder = {
    "snFRef",
    "origSnFRef",
    "snFOutputSeq",
    "snFOutputInfo",
    "code",
    "text",
    "fileRequestHeader",
    "requestHeader",
    "thirdPartyDN",
    "recipientDN",
    "acceptStatus",
    "ackSwiftTime",
    "ackDescription",
    "ackInfo"
})
public class RetrievedOutputMessage {

    @XmlElement(name = "SnFRef", namespace = "urn:swift:snl:ns.Sw", required = true)
    protected String snFRef;
    @XmlElement(name = "OrigSnFRef", namespace = "urn:swift:snl:ns.Sw")
    protected String origSnFRef;
    @XmlElement(name = "SnFOutputSeq", namespace = "urn:swift:snl:ns.Sw")
    protected String snFOutputSeq;
    @XmlElement(name = "SnFOutputInfo", namespace = "urn:swift:snl:ns.Sw")
    protected SwSnFOutputInfo snFOutputInfo;
    @XmlElement(name = "Code", namespace = "urn:swift:snl:ns.SwGbl")
    protected String code;
    @XmlElement(name = "Text", namespace = "urn:swift:snl:ns.SwGbl")
    protected String text;
    @XmlElement(name = "FileRequestHeader", namespace = "urn:swift:snl:ns.Sw")
    protected SwFileRequestHeader fileRequestHeader;
    @XmlElement(name = "RequestHeader", namespace = "urn:swift:snl:ns.Sw")
    protected SwIntRequestHeader requestHeader;
    @XmlElement(name = "ThirdPartyDN", namespace = "urn:swift:snl:ns.Sw")
    protected String thirdPartyDN;
    @XmlElement(name = "RecipientDN", namespace = "urn:swift:snl:ns.Sw")
    protected String recipientDN;
    @XmlElement(name = "AcceptStatus", namespace = "urn:swift:snl:ns.Sw")
    protected String acceptStatus;
    @XmlElement(name = "AckSwiftTime", namespace = "urn:swift:snl:ns.Sw")
    protected String ackSwiftTime;
    @XmlElement(name = "AckDescription", namespace = "urn:swift:snl:ns.Sw")
    protected String ackDescription;
    @XmlElement(name = "AckInfo", namespace = "urn:swift:snl:ns.Sw")
    protected String ackInfo;

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
    public RetrievedOutputMessage setSnFRef(String value) {
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
    public RetrievedOutputMessage setOrigSnFRef(String value) {
        this.origSnFRef = value;
        return this;
    }

    /**
     * SnFOutputSeq
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSnFOutputSeq() {
        return snFOutputSeq;
    }

    /**
     * Sets the value of the snFOutputSeq property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public RetrievedOutputMessage setSnFOutputSeq(String value) {
        this.snFOutputSeq = value;
        return this;
    }

    /**
     * SnFOutputInfo
     * 
     * @return
     *     possible object is
     *     {@link SwSnFOutputInfo }
     *     
     */
    public SwSnFOutputInfo getSnFOutputInfo() {
        return snFOutputInfo;
    }

    /**
     * Sets the value of the snFOutputInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwSnFOutputInfo }
     *     
     */
    public RetrievedOutputMessage setSnFOutputInfo(SwSnFOutputInfo value) {
        this.snFOutputInfo = value;
        return this;
    }

    /**
     * Code
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public RetrievedOutputMessage setCode(String value) {
        this.code = value;
        return this;
    }

    /**
     * Text
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getText() {
        return text;
    }

    /**
     * Sets the value of the text property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public RetrievedOutputMessage setText(String value) {
        this.text = value;
        return this;
    }

    /**
     * FileRequestHeader
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
    public RetrievedOutputMessage setFileRequestHeader(SwFileRequestHeader value) {
        this.fileRequestHeader = value;
        return this;
    }

    /**
     * RequestHeader
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
    public RetrievedOutputMessage setRequestHeader(SwIntRequestHeader value) {
        this.requestHeader = value;
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
    public RetrievedOutputMessage setThirdPartyDN(String value) {
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
    public RetrievedOutputMessage setRecipientDN(String value) {
        this.recipientDN = value;
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
    public RetrievedOutputMessage setAcceptStatus(String value) {
        this.acceptStatus = value;
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
    public RetrievedOutputMessage setAckSwiftTime(String value) {
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
    public RetrievedOutputMessage setAckDescription(String value) {
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
    public RetrievedOutputMessage setAckInfo(String value) {
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
