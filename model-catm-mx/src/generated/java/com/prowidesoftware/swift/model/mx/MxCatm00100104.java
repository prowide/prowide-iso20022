
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
 * Class for catm.001.001.04 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "stsRpt"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:catm.001.001.04")
public class MxCatm00100104
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "StsRpt", required = true)
    protected StatusReportV04 stsRpt;
    public final static transient String BUSINESS_PROCESS = "catm";
    public final static transient int FUNCTIONALITY = 1;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 4;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {Algorithm11Code.class, Algorithm12Code.class, Algorithm13Code.class, Algorithm14Code.class, Algorithm15Code.class, Algorithm7Code.class, Algorithm8Code.class, AlgorithmIdentification11 .class, AlgorithmIdentification12 .class, AlgorithmIdentification13 .class, AlgorithmIdentification14 .class, AlgorithmIdentification15 .class, AlgorithmIdentification16 .class, AlgorithmIdentification17 .class, AttendanceContext1Code.class, AttributeType1Code.class, AuthenticatedData4 .class, BytePadding1Code.class, CardDataReading1Code.class, CardholderVerificationCapability1Code.class, CertificateIssuer1 .class, CommunicationCharacteristics2 .class, ContentInformationType10 .class, ContentInformationType12 .class, ContentType2Code.class, CryptographicKey5 .class, CryptographicKeyType3Code.class, DataSetCategory4Code.class, DataSetIdentification4 .class, DigestedData4 .class, DisplayCapabilities2 .class, EncapsulatedContent3 .class, EncryptedContent3 .class, EncryptionFormat1Code.class, EnvelopedData4 .class, GenericIdentification48 .class, GenericIdentification71 .class, Header14 .class, IssuerAndSerialNumber1 .class, KEK4 .class, KEKIdentifier2 .class, KeyTransport4 .class, KeyUsage1Code.class, MemoryCharacteristics1 .class, MemoryUnit1Code.class, MxCatm00100104 .class, OnLineCapability1Code.class, POICommunicationType1Code.class, POIComponentAssessment1Code.class, POIComponentStatus1Code.class, POIComponentType3Code.class, Parameter4 .class, Parameter5 .class, Parameter6 .class, Parameter7 .class, Parameter8 .class, PartyType5Code.class, PartyType6Code.class, PartyType7Code.class, PointOfInteractionCapabilities3 .class, PointOfInteractionComponent5 .class, PointOfInteractionComponentAssessment1 .class, PointOfInteractionComponentCharacteristics2 .class, PointOfInteractionComponentIdentification1 .class, PointOfInteractionComponentStatus2 .class, Recipient4Choice.class, Recipient5Choice.class, RelativeDistinguishedName1 .class, SignedData4 .class, Signer3 .class, StatusReport4 .class, StatusReportContent4 .class, StatusReportV04 .class, TMSActionIdentification3 .class, TMSEvent3 .class, TerminalManagementAction1Code.class, TerminalManagementActionResult1Code.class, TerminalManagementDataSet12 .class, TerminalManagementDataSet13 .class, UserInterface2Code.class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:catm.001.001.04";

    public MxCatm00100104() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCatm00100104(final String xml) {
        this();
        MxCatm00100104 tmp = parse(xml);
        stsRpt = tmp.getStsRpt();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCatm00100104(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the stsRpt property.
     * 
     * @return
     *     possible object is
     *     {@link StatusReportV04 }
     *     
     */
    public StatusReportV04 getStsRpt() {
        return stsRpt;
    }

    /**
     * Sets the value of the stsRpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusReportV04 }
     *     
     */
    public MxCatm00100104 setStsRpt(StatusReportV04 value) {
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
    public static MxCatm00100104 parse(String xml) {
        return ((MxCatm00100104) MxReadImpl.parse(MxCatm00100104 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCatm00100104 parse(String xml, MxRead parserImpl) {
        return ((MxCatm00100104) parserImpl.read(MxCatm00100104 .class, xml, _classes));
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
     * Creates an MxCatm00100104 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCatm00100104 message
     * @return
     *     a new instance of MxCatm00100104
     */
    public final static MxCatm00100104 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxCatm00100104 .class);
    }

}
