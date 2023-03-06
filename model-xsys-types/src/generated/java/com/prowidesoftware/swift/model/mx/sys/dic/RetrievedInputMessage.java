
package com.prowidesoftware.swift.model.mx.sys.dic;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Java class for RetrievedInputMessage complex type.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RetrievedInputMessage", propOrder = {
    "snFRef",
    "inputChannel",
    "snFInputSeq",
    "snFInputTime",
    "overdueTime",
    "code",
    "fileRequestHeader",
    "requestHeader",
    "dlvrSmmry"
})
public class RetrievedInputMessage {

    @XmlElement(name = "SnFRef", namespace = "urn:swift:snl:ns.Sw", required = true)
    protected String snFRef;
    @XmlElement(name = "InputChannel", namespace = "urn:swift:snl:ns.Sw")
    protected String inputChannel;
    @XmlElement(name = "SnFInputSeq", namespace = "urn:swift:snl:ns.Sw")
    protected String snFInputSeq;
    @XmlElement(name = "SnFInputTime", namespace = "urn:swift:snl:ns.Sw")
    protected String snFInputTime;
    @XmlElement(name = "OverdueTime", namespace = "urn:swift:snl:ns.Sw")
    protected String overdueTime;
    @XmlElement(name = "Code", namespace = "urn:swift:snl:ns.SwGbl")
    protected String code;
    @XmlElement(name = "FileRequestHeader", namespace = "urn:swift:snl:ns.Sw")
    protected SwFileRequestHeader fileRequestHeader;
    @XmlElement(name = "RequestHeader", namespace = "urn:swift:snl:ns.Sw")
    protected SwIntRequestHeader requestHeader;
    @XmlElement(name = "DlvrSmmry")
    protected DeliverySummary dlvrSmmry;

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
    public RetrievedInputMessage setSnFRef(String value) {
        this.snFRef = value;
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
    public RetrievedInputMessage setInputChannel(String value) {
        this.inputChannel = value;
        return this;
    }

    /**
     * InputSequenceNumber
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
    public RetrievedInputMessage setSnFInputSeq(String value) {
        this.snFInputSeq = value;
        return this;
    }

    /**
     * SnFInputTime
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
    public RetrievedInputMessage setSnFInputTime(String value) {
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
    public RetrievedInputMessage setOverdueTime(String value) {
        this.overdueTime = value;
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
    public RetrievedInputMessage setCode(String value) {
        this.code = value;
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
    public RetrievedInputMessage setFileRequestHeader(SwFileRequestHeader value) {
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
    public RetrievedInputMessage setRequestHeader(SwIntRequestHeader value) {
        this.requestHeader = value;
        return this;
    }

    /**
     * Gets the value of the dlvrSmmry property.
     * 
     * @return
     *     possible object is
     *     {@link DeliverySummary }
     *     
     */
    public DeliverySummary getDlvrSmmry() {
        return dlvrSmmry;
    }

    /**
     * Sets the value of the dlvrSmmry property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeliverySummary }
     *     
     */
    public RetrievedInputMessage setDlvrSmmry(DeliverySummary value) {
        this.dlvrSmmry = value;
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
