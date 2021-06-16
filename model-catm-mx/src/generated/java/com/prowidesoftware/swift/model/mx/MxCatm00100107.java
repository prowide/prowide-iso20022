
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
 * Class for catm.001.001.07 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "stsRpt"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:catm.001.001.07")
public class MxCatm00100107
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "StsRpt", required = true)
    protected StatusReportV07 stsRpt;
    public final static transient String BUSINESS_PROCESS = "catm";
    public final static transient int FUNCTIONALITY = 1;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 7;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {Algorithm11Code.class, Algorithm16Code.class, Algorithm17Code.class, Algorithm18Code.class, Algorithm19Code.class, Algorithm7Code.class, Algorithm8Code.class, AlgorithmIdentification12 .class, AlgorithmIdentification18 .class, AlgorithmIdentification19 .class, AlgorithmIdentification20 .class, AlgorithmIdentification21 .class, AlgorithmIdentification22 .class, AlgorithmIdentification23 .class, AlgorithmIdentification24 .class, AttendanceContext1Code.class, AttributeType1Code.class, AuthenticatedData5 .class, BytePadding1Code.class, CardDataReading5Code.class, CardholderVerificationCapability4Code.class, CertificateIssuer1 .class, CommunicationCharacteristics3 .class, ContentInformationType18 .class, ContentInformationType19 .class, ContentType2Code.class, CryptographicKey13 .class, CryptographicKeyType3Code.class, DataSetCategory12Code.class, DataSetIdentification7 .class, DigestedData5 .class, DisplayCapabilities4 .class, EncapsulatedContent3 .class, EncryptedContent4 .class, EncryptionFormat2Code.class, EnvelopedData5 .class, ExchangePolicy1Code.class, GenericIdentification48 .class, GenericIdentification71 .class, GenericIdentification92 .class, GenericInformation1 .class, Header27 .class, IssuerAndSerialNumber1 .class, KEK5 .class, KEKIdentifier2 .class, KeyTransport5 .class, KeyUsage1Code.class, MemoryCharacteristics1 .class, MemoryUnit1Code.class, MxCatm00100107 .class, NetworkParameters4 .class, NetworkParameters5 .class, NetworkType1Code.class, OnLineCapability1Code.class, OriginatorInformation1 .class, OutputFormat1Code.class, POICommunicationType2Code.class, POIComponentAssessment1Code.class, POIComponentStatus1Code.class, POIComponentType5Code.class, Parameter10 .class, Parameter11 .class, Parameter12 .class, Parameter5 .class, Parameter7 .class, Parameter9 .class, PartyType5Code.class, PartyType6Code.class, PartyType7Code.class, PointOfInteractionCapabilities6 .class, PointOfInteractionComponent8 .class, PointOfInteractionComponentAssessment1 .class, PointOfInteractionComponentCharacteristics4 .class, PointOfInteractionComponentIdentification1 .class, PointOfInteractionComponentStatus3 .class, Recipient5Choice.class, Recipient6Choice.class, RelativeDistinguishedName1 .class, SignedData5 .class, Signer4 .class, StatusReport7 .class, StatusReportContent7 .class, StatusReportV07 .class, TMSActionIdentification5 .class, TMSEvent6 .class, TerminalManagementAction4Code.class, TerminalManagementActionResult4Code.class, TerminalManagementDataSet25 .class, TerminalManagementDataSet26 .class, TriggerInformation1 .class, UserInterface4Code.class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:catm.001.001.07";

    public MxCatm00100107() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCatm00100107(final String xml) {
        this();
        MxCatm00100107 tmp = parse(xml);
        stsRpt = tmp.getStsRpt();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCatm00100107(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the stsRpt property.
     * 
     * @return
     *     possible object is
     *     {@link StatusReportV07 }
     *     
     */
    public StatusReportV07 getStsRpt() {
        return stsRpt;
    }

    /**
     * Sets the value of the stsRpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusReportV07 }
     *     
     */
    public MxCatm00100107 setStsRpt(StatusReportV07 value) {
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
    public static MxCatm00100107 parse(String xml) {
        return ((MxCatm00100107) MxReadImpl.parse(MxCatm00100107 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCatm00100107 parse(String xml, MxRead parserImpl) {
        return ((MxCatm00100107) parserImpl.read(MxCatm00100107 .class, xml, _classes));
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
     * Creates an MxCatm00100107 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCatm00100107 message
     * @return
     *     a new instance of MxCatm00100107
     */
    public final static MxCatm00100107 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxCatm00100107 .class);
    }

}
