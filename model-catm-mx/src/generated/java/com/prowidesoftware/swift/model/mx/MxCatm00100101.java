
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
 * Class for catm.001.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "stsRpt"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:catm.001.001.01")
public class MxCatm00100101
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "StsRpt", required = true)
    protected StatusReportV01 stsRpt;
    public final static transient String BUSINESS_PROCESS = "catm";
    public final static transient int FUNCTIONALITY = 1;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {Algorithm1Code.class, AlgorithmIdentification1 .class, AttendanceContext1Code.class, AttributeType1Code.class, AuthenticatedData1 .class, CardDataReading1Code.class, CardholderVerificationCapability1Code.class, CertificateIdentifier1 .class, CertificateIssuer1 .class, ContentInformationType1 .class, ContentType1Code.class, DataSetCategory2Code.class, DataSetIdentification2 .class, DigestedData1 .class, DisplayCapabilities1 .class, EncapsulatedContent1 .class, EncryptedContent1 .class, EnvelopedData1 .class, GenericIdentification35 .class, Header4 .class, IssuerAndSerialNumber1 .class, KEK1 .class, KEKIdentifier1 .class, KeyTransport1 .class, MxCatm00100101 .class, NamedKeyEncryptedData1 .class, OnLineCapability1Code.class, POIComponentType2Code.class, Parameter1 .class, PartyType5Code.class, PartyType6Code.class, PointOfInteractionCapabilities1 .class, PointOfInteractionComponent2 .class, Recipient1Choice.class, RelativeDistinguishedName1 .class, SignedData1 .class, Signer1 .class, StatusReport1 .class, StatusReportContent1 .class, StatusReportV01 .class, TMSActionIdentification1 .class, TMSEvent1 .class, TerminalManagementAction1Code.class, TerminalManagementActionResult1Code.class, TerminalManagementDataSet1 .class, UserInterface2Code.class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:catm.001.001.01";

    public MxCatm00100101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCatm00100101(final String xml) {
        this();
        MxCatm00100101 tmp = parse(xml);
        stsRpt = tmp.getStsRpt();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCatm00100101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the stsRpt property.
     * 
     * @return
     *     possible object is
     *     {@link StatusReportV01 }
     *     
     */
    public StatusReportV01 getStsRpt() {
        return stsRpt;
    }

    /**
     * Sets the value of the stsRpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusReportV01 }
     *     
     */
    public MxCatm00100101 setStsRpt(StatusReportV01 value) {
        this.stsRpt = value;
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
    public static MxCatm00100101 parse(String xml) {
        return ((MxCatm00100101) MxReadImpl.parse(MxCatm00100101 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCatm00100101 parse(String xml, MxRead parserImpl) {
        return ((MxCatm00100101) parserImpl.read(MxCatm00100101 .class, xml, _classes));
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
     * Creates an MxCatm00100101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCatm00100101 message
     * @return
     *     a new instance of MxCatm00100101
     */
    public final static MxCatm00100101 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxCatm00100101 .class);
    }

}
