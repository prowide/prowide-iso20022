
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
import com.prowidesoftware.swift.model.mx.MxReadConfiguration;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Class for catm.007.001.04 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "certMgmtReq"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:catm.007.001.04")
public class MxCatm00700104
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "CertMgmtReq", required = true)
    protected CertificateManagementRequestV04 certMgmtReq;
    public final static transient String BUSINESS_PROCESS = "catm";
    public final static transient int FUNCTIONALITY = 7;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 4;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {Algorithm11Code.class, Algorithm16Code.class, Algorithm17Code.class, Algorithm24Code.class, Algorithm25Code.class, Algorithm7Code.class, Algorithm8Code.class, AlgorithmIdentification12 .class, AlgorithmIdentification18 .class, AlgorithmIdentification19 .class, AlgorithmIdentification21 .class, AlgorithmIdentification22 .class, AlgorithmIdentification29 .class, AlgorithmIdentification30 .class, AttributeType1Code.class, AttributeType2Code.class, AuthenticatedData7 .class, BytePadding1Code.class, CardPaymentServiceType10Code.class, CertificateIssuer1 .class, CertificateManagementRequest2 .class, CertificateManagementRequestV04 .class, CertificationRequest1 .class, CertificationRequest2 .class, ContentInformationType25 .class, ContentType2Code.class, EncapsulatedContent3 .class, EncryptionFormat2Code.class, GenericIdentification176 .class, GenericIdentification177 .class, GenericInformation1 .class, Geolocation1 .class, GeolocationGeographicCoordinates1 .class, GeolocationUTMCoordinates1 .class, IssuerAndSerialNumber2 .class, KEK7 .class, KEKIdentifier2 .class, KeyTransport7 .class, MxCatm00700104 .class, NetworkParameters7 .class, NetworkParameters9 .class, NetworkType1Code.class, Parameter10 .class, Parameter12 .class, Parameter15 .class, Parameter5 .class, Parameter7 .class, Parameter9 .class, PartyType33Code.class, PointOfInteraction6 .class, PublicRSAKey1 .class, PublicRSAKey2 .class, Recipient10Choice.class, Recipient9Choice.class, RelativeDistinguishedName1 .class, RelativeDistinguishedName2 .class, SignedData6 .class, Signer5 .class, TMSHeader1 .class, Traceability8 .class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:catm.007.001.04";

    public MxCatm00700104() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCatm00700104(final String xml) {
        this();
        MxCatm00700104 tmp = parse(xml);
        certMgmtReq = tmp.getCertMgmtReq();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCatm00700104(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the certMgmtReq property.
     * 
     * @return
     *     possible object is
     *     {@link CertificateManagementRequestV04 }
     *     
     */
    public CertificateManagementRequestV04 getCertMgmtReq() {
        return certMgmtReq;
    }

    /**
     * Sets the value of the certMgmtReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link CertificateManagementRequestV04 }
     *     
     */
    public MxCatm00700104 setCertMgmtReq(CertificateManagementRequestV04 value) {
        this.certMgmtReq = value;
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
    public static MxCatm00700104 parse(String xml) {
        return ((MxCatm00700104) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCatm00700104 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxCatm00700104 parse(String xml, MxReadConfiguration conf) {
        return ((MxCatm00700104) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCatm00700104 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCatm00700104 parse(String xml, MxRead parserImpl) {
        return ((MxCatm00700104) parserImpl.read(MxCatm00700104 .class, xml, _classes));
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
     * Creates an MxCatm00700104 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCatm00700104 message
     * @return
     *     a new instance of MxCatm00700104
     */
    public final static MxCatm00700104 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxCatm00700104 .class);
    }

}
