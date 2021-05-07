
package com.prowidesoftware.swift.model.mx;

import com.prowidesoftware.swift.model.mx.dic.*;
import com.prowidesoftware.swift.model.mx.AbstractMX;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.prowidesoftware.swift.model.MxSwiftMessage;
import com.prowidesoftware.swift.model.mx.MxRead;
import com.prowidesoftware.swift.model.mx.MxReadImpl;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Class for cbrf.007.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "schdlChngNtfctn"
})
@XmlRootElement(name = "Document", namespace = "urn:cbrf:xsd:cbrf.007.001.01")
public class MxCbrf00700101
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "SchdlChngNtfctn", required = true)
    protected ScheduleChangeNotificationV01 schdlChngNtfctn;
    public final static transient String BUSINESS_PROCESS = "cbrf";
    public final static transient int FUNCTIONALITY = 7;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {GenericIdentification1 .class, MessageHeader3 .class, MxCbrf00700101 .class, OriginalBusinessQuery1 .class, RequestType1Code.class, RequestType2Choice.class, RequestType2Code.class, ScheduleChangeDetails1 .class, ScheduleChangeEntry1 .class, ScheduleChangeNotificationV01 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, SystemEventType2Choice.class, SystemEventType2Code.class };
    public final static transient String NAMESPACE = "urn:cbrf:xsd:cbrf.007.001.01";

    public MxCbrf00700101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCbrf00700101(final String xml) {
        this();
        MxCbrf00700101 tmp = parse(xml);
        schdlChngNtfctn = tmp.getSchdlChngNtfctn();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCbrf00700101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the schdlChngNtfctn property.
     * 
     * @return
     *     possible object is
     *     {@link ScheduleChangeNotificationV01 }
     *     
     */
    public ScheduleChangeNotificationV01 getSchdlChngNtfctn() {
        return schdlChngNtfctn;
    }

    /**
     * Sets the value of the schdlChngNtfctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScheduleChangeNotificationV01 }
     *     
     */
    public MxCbrf00700101 setSchdlChngNtfctn(ScheduleChangeNotificationV01 value) {
        this.schdlChngNtfctn = value;
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

    @Override
    public String getBusinessProcess() {
        return BUSINESS_PROCESS;
    }

    @Override
    public int getFunctionality() {
        return FUNCTIONALITY;
    }

    @Override
    public int getVariant() {
        return VARIANT;
    }

    @Override
    public int getVersion() {
        return VERSION;
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML
     * 
     */
    public static MxCbrf00700101 parse(String xml) {
        return ((MxCbrf00700101) MxReadImpl.parse(MxCbrf00700101 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCbrf00700101 parse(String xml, MxRead parserImpl) {
        return ((MxCbrf00700101) parserImpl.read(MxCbrf00700101 .class, xml, _classes));
    }

    @Override
    public String getNamespace() {
        return NAMESPACE;
    }

    @Override
    @SuppressWarnings("rawtypes")
    public Class[] getClasses() {
        return _classes;
    }

    /**
     * Creates an MxCbrf00700101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCbrf00700101 message
     * @return
     *     a new instance of MxCbrf00700101
     */
    public final static MxCbrf00700101 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxCbrf00700101 .class);
    }

}
