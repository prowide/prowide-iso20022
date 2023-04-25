
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
 * Class for admi.016.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "ptcptStsNtfctn"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:admi.016.001.01")
public class MxAdmi01600101
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "PtcptStsNtfctn", required = true)
    protected ParticipantStatusNotificationV01 ptcptStsNtfctn;
    public static final transient String BUSINESS_PROCESS = "admi";
    public static final transient int FUNCTIONALITY = 16;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {ContactDetails2 .class, FinancialInstitutionIdentification13 .class, MxAdmi01600101 .class, NamePrefix1Code.class, ParticipantAndStatus1 .class, ParticipantStatusNotificationV01 .class, ServiceAvailability1 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, SystemEventType3Choice.class };
    public static final transient String NAMESPACE = "urn:swift:xsd:admi.016.001.01";

    public MxAdmi01600101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxAdmi01600101(final String xml) {
        this();
        MxAdmi01600101 tmp = parse(xml);
        ptcptStsNtfctn = tmp.getPtcptStsNtfctn();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxAdmi01600101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the ptcptStsNtfctn property.
     * 
     * @return
     *     possible object is
     *     {@link ParticipantStatusNotificationV01 }
     *     
     */
    public ParticipantStatusNotificationV01 getPtcptStsNtfctn() {
        return ptcptStsNtfctn;
    }

    /**
     * Sets the value of the ptcptStsNtfctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParticipantStatusNotificationV01 }
     *     
     */
    public MxAdmi01600101 setPtcptStsNtfctn(ParticipantStatusNotificationV01 value) {
        this.ptcptStsNtfctn = value;
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
    public static MxAdmi01600101 parse(String xml) {
        return ((MxAdmi01600101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxAdmi01600101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxAdmi01600101 parse(String xml, MxReadConfiguration conf) {
        return ((MxAdmi01600101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxAdmi01600101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxAdmi01600101 parse(String xml, MxRead parserImpl) {
        return ((MxAdmi01600101) parserImpl.read(MxAdmi01600101 .class, xml, _classes));
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
     * Creates an MxAdmi01600101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxAdmi01600101 message
     * @return
     *     a new instance of MxAdmi01600101
     */
    public static final MxAdmi01600101 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxAdmi01600101 .class);
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
