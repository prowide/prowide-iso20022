
package com.prowidesoftware.swift.model.mx;

import com.prowidesoftware.swift.model.mx.dic.*;
import com.prowidesoftware.swift.model.mx.AbstractMX;

import com.prowidesoftware.swift.model.MxSwiftMessage;
import com.prowidesoftware.swift.model.mx.MxRead;
import com.prowidesoftware.swift.model.mx.MxReadConfiguration;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Class for cbrf.002.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "ptcptToPtcptMsgsRcncltnRpt"
})
@XmlRootElement(name = "Document", namespace = "urn:cbrf:xsd:cbrf.002.001.01")
public class MxCbrf00200101
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "PtcptToPtcptMsgsRcncltnRpt", required = true)
    protected ParticipantToParticipantMessagesReconciliationReportV01 ptcptToPtcptMsgsRcncltnRpt;
    public static final transient String BUSINESS_PROCESS = "cbrf";
    public static final transient int FUNCTIONALITY = 2;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {CBRFReportEntry1 .class, ElectronicMessageDetails1 .class, GenericIdentification1 .class, MessageDetails1 .class, MessageHeader3 .class, MxCbrf00200101 .class, OriginalBusinessQuery1 .class, Pagination.class, ParticipantToParticipantMessagesReconciliationReportV01 .class, RequestType1Code.class, RequestType2Choice.class, RequestType2Code.class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class };
    public static final transient String NAMESPACE = "urn:cbrf:xsd:cbrf.002.001.01";

    public MxCbrf00200101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCbrf00200101(final String xml) {
        this();
        MxCbrf00200101 tmp = parse(xml);
        ptcptToPtcptMsgsRcncltnRpt = tmp.getPtcptToPtcptMsgsRcncltnRpt();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCbrf00200101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the ptcptToPtcptMsgsRcncltnRpt property.
     * 
     * @return
     *     possible object is
     *     {@link ParticipantToParticipantMessagesReconciliationReportV01 }
     *     
     */
    public ParticipantToParticipantMessagesReconciliationReportV01 getPtcptToPtcptMsgsRcncltnRpt() {
        return ptcptToPtcptMsgsRcncltnRpt;
    }

    /**
     * Sets the value of the ptcptToPtcptMsgsRcncltnRpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParticipantToParticipantMessagesReconciliationReportV01 }
     *     
     */
    public MxCbrf00200101 setPtcptToPtcptMsgsRcncltnRpt(ParticipantToParticipantMessagesReconciliationReportV01 value) {
        this.ptcptToPtcptMsgsRcncltnRpt = value;
        return this;
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
     * Creates the MX object parsing the raw content from the parameter XML, using default unmarshalling options
     * 
     */
    public static MxCbrf00200101 parse(String xml) {
        return ((MxCbrf00200101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCbrf00200101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxCbrf00200101 parse(String xml, MxReadConfiguration conf) {
        return ((MxCbrf00200101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCbrf00200101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCbrf00200101 parse(String xml, MxRead parserImpl) {
        return ((MxCbrf00200101) parserImpl.read(MxCbrf00200101 .class, xml, _classes));
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
     * Creates an MxCbrf00200101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCbrf00200101 message
     * @return
     *     a new instance of MxCbrf00200101
     */
    public static final MxCbrf00200101 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxCbrf00200101 .class);
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
