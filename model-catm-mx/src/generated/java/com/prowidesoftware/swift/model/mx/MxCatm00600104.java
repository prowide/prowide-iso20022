
package com.prowidesoftware.swift.model.mx;

import com.prowidesoftware.swift.model.mx.dic.*;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import com.prowidesoftware.swift.model.MxSwiftMessage;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Class for catm.006.001.04 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "mntncDlgtnRspn"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:catm.006.001.04")
public class MxCatm00600104
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "MntncDlgtnRspn", required = true)
    protected MaintenanceDelegationResponseV04 mntncDlgtnRspn;
    public final static transient String BUSINESS_PROCESS = "catm";
    public final static transient int FUNCTIONALITY = 6;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 4;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {Algorithm11Code.class, Algorithm16Code.class, Algorithm17Code.class, Algorithm19Code.class, Algorithm24Code.class, Algorithm7Code.class, Algorithm8Code.class, AlgorithmIdentification12 .class, AlgorithmIdentification18 .class, AlgorithmIdentification19 .class, AlgorithmIdentification20 .class, AlgorithmIdentification21 .class, AlgorithmIdentification22 .class, AlgorithmIdentification29 .class, AttributeType1Code.class, AuthenticatedData6 .class, BytePadding1Code.class, CertificateIssuer1 .class, ContentInformationType21 .class, ContentInformationType23 .class, ContentType2Code.class, DataSetCategory11Code.class, DigestedData5 .class, EncapsulatedContent3 .class, EncryptedContent6 .class, EncryptionFormat2Code.class, EnvelopedData7 .class, GenericIdentification176 .class, GenericIdentification177 .class, GenericInformation1 .class, Geolocation1 .class, GeolocationGeographicCoordinates1 .class, GeolocationUTMCoordinates1 .class, IssuerAndSerialNumber1 .class, KEK7 .class, KEKIdentifier2 .class, KeyTransport5 .class, MaintenanceDelegation9 .class, MaintenanceDelegationResponse4 .class, MaintenanceDelegationResponseV04 .class, MaintenanceIdentificationAssociation1 .class, MxCatm00600104 .class, NetworkParameters7 .class, NetworkParameters9 .class, NetworkType1Code.class, OriginatorInformation1 .class, Parameter10 .class, Parameter11 .class, Parameter12 .class, Parameter5 .class, Parameter7 .class, Parameter9 .class, PartyType33Code.class, Recipient5Choice.class, Recipient8Choice.class, RelativeDistinguishedName1 .class, Response2Code.class, SignedData5 .class, Signer4 .class, TMSHeader1 .class, TerminalManagementAction3Code.class, Traceability8 .class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:catm.006.001.04";

    public MxCatm00600104() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCatm00600104(final String xml) {
        this();
        MxCatm00600104 tmp = parse(xml);
        mntncDlgtnRspn = tmp.getMntncDlgtnRspn();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCatm00600104(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the mntncDlgtnRspn property.
     * 
     * @return
     *     possible object is
     *     {@link MaintenanceDelegationResponseV04 }
     *     
     */
    public MaintenanceDelegationResponseV04 getMntncDlgtnRspn() {
        return mntncDlgtnRspn;
    }

    /**
     * Sets the value of the mntncDlgtnRspn property.
     * 
     * @param value
     *     allowed object is
     *     {@link MaintenanceDelegationResponseV04 }
     *     
     */
    public MxCatm00600104 setMntncDlgtnRspn(MaintenanceDelegationResponseV04 value) {
        this.mntncDlgtnRspn = value;
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
     * Creates the MX object parsing the raw content from the parameter XML, using default unmarshalling options
     * 
     */
    public static MxCatm00600104 parse(String xml) {
        return ((MxCatm00600104) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCatm00600104 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxCatm00600104 parse(String xml, MxReadConfiguration conf) {
        return ((MxCatm00600104) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCatm00600104 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCatm00600104 parse(String xml, MxRead parserImpl) {
        return ((MxCatm00600104) parserImpl.read(MxCatm00600104 .class, xml, _classes));
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
     * Creates an MxCatm00600104 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCatm00600104 message
     * @return
     *     a new instance of MxCatm00600104
     */
    public final static MxCatm00600104 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxCatm00600104 .class);
    }

}
