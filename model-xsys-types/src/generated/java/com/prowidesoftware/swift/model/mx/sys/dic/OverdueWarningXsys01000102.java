
package com.prowidesoftware.swift.model.mx.sys.dic;

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
 * Java class for OverdueWarning complex type.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OverdueWarning", propOrder = {
    "snFRef",
    "snFRefType",
    "inputChannel",
    "snFInputSeq",
    "snFInputTime",
    "overdueTime",
    "fileRequestHeader",
    "requestHeader",
    "recipientDN",
    "code",
    "swiftTime"
})
public class OverdueWarningXsys01000102 {

    @XmlElement(name = "SnFRef", namespace = "urn:swift:snl:ns.Sw", required = true)
    protected String snFRef;
    @XmlElement(name = "SnFRefType", namespace = "urn:swift:snl:ns.Sw", required = true)
    protected String snFRefType;
    @XmlElement(name = "InputChannel", namespace = "urn:swift:snl:ns.Sw")
    protected String inputChannel;
    @XmlElement(name = "SnFInputSeq", namespace = "urn:swift:snl:ns.Sw")
    protected String snFInputSeq;
    @XmlElement(name = "SnFInputTime", namespace = "urn:swift:snl:ns.Sw", required = true)
    protected String snFInputTime;
    @XmlElement(name = "OverdueTime", namespace = "urn:swift:snl:ns.Sw", required = true)
    protected String overdueTime;
    @XmlElement(name = "FileRequestHeader", namespace = "urn:swift:snl:ns.Sw")
    protected SwFileRequestHeader fileRequestHeader;
    @XmlElement(name = "RequestHeader", namespace = "urn:swift:snl:ns.SwInt")
    protected SwIntRequestHeader requestHeader;
    @XmlElement(name = "RecipientDN", namespace = "urn:swift:snl:ns.Sw")
    protected String recipientDN;
    @XmlElement(name = "Code", namespace = "urn:swift:snl:ns.SwGbl")
    protected String code;
    @XmlElement(name = "SwiftTime", namespace = "urn:swift:snl:ns.Sw")
    protected String swiftTime;

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
    public OverdueWarningXsys01000102 setSnFRef(String value) {
        this.snFRef = value;
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
    public OverdueWarningXsys01000102 setSnFRefType(String value) {
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
    public OverdueWarningXsys01000102 setInputChannel(String value) {
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
    public OverdueWarningXsys01000102 setSnFInputSeq(String value) {
        this.snFInputSeq = value;
        return this;
    }

    /**
     * StoreAndForwardInputTime
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSnFInputTime() {
        return snFInputTime;
    }

    /**
     * Sets the value of the snFInputTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public OverdueWarningXsys01000102 setSnFInputTime(String value) {
        this.snFInputTime = value;
        return this;
    }

    /**
     * OverdueTime
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOverdueTime() {
        return overdueTime;
    }

    /**
     * Sets the value of the overdueTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public OverdueWarningXsys01000102 setOverdueTime(String value) {
        this.overdueTime = value;
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
    public OverdueWarningXsys01000102 setFileRequestHeader(SwFileRequestHeader value) {
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
    public OverdueWarningXsys01000102 setRequestHeader(SwIntRequestHeader value) {
        this.requestHeader = value;
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
    public OverdueWarningXsys01000102 setRecipientDN(String value) {
        this.recipientDN = value;
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
    public OverdueWarningXsys01000102 setCode(String value) {
        this.code = value;
        return this;
    }

    /**
     * SwiftTime
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSwiftTime() {
        return swiftTime;
    }

    /**
     * Sets the value of the swiftTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public OverdueWarningXsys01000102 setSwiftTime(String value) {
        this.swiftTime = value;
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
