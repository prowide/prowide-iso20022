
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
 * Class for catm.007.001.07 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "certMgmtReq"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:catm.007.001.07")
public class MxCatm00700107
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "CertMgmtReq", required = true)
    protected CertificateManagementRequestV07 certMgmtReq;
    public final static transient String BUSINESS_PROCESS = "catm";
    public final static transient int FUNCTIONALITY = 7;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 7;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {Algorithm26Code.class, Algorithm27Code.class, Algorithm28Code.class, Algorithm29Code.class, Algorithm7Code.class, Algorithm8Code.class, AlgorithmIdentification31 .class, AlgorithmIdentification32 .class, AlgorithmIdentification33 .class, AlgorithmIdentification34 .class, AlgorithmIdentification35 .class, AlgorithmIdentification36 .class, AttributeType1Code.class, AttributeType2Code.class, AuthenticatedData10 .class, BytePadding1Code.class, CardPaymentServiceType10Code.class, CertificateIssuer1 .class, CertificateManagementRequest3 .class, CertificateManagementRequestV07 .class, CertificationRequest1 .class, CertificationRequest2 .class, ContentInformationType38 .class, ContentType2Code.class, EncapsulatedContent3 .class, EncryptionFormat2Code.class, GenericIdentification176 .class, GenericIdentification177 .class, GenericInformation1 .class, Geolocation1 .class, GeolocationGeographicCoordinates1 .class, GeolocationUTMCoordinates1 .class, IssuerAndSerialNumber2 .class, KEK9 .class, KEKIdentifier7 .class, KeyTransport10 .class, KeyUsage1Code.class, MxCatm00700107 .class, NetworkParameters7 .class, NetworkParameters9 .class, NetworkType1Code.class, Parameter12 .class, Parameter16 .class, Parameter17 .class, Parameter18 .class, Parameter7 .class, PartyType33Code.class, PointOfInteraction6 .class, PublicRSAKey1 .class, PublicRSAKey2 .class, Recipient13Choice.class, Recipient15Choice.class, RelativeDistinguishedName1 .class, RelativeDistinguishedName2 .class, SignedData9 .class, Signer8 .class, TMSHeader1 .class, Traceability8 .class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:catm.007.001.07";

    public MxCatm00700107() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCatm00700107(final String xml) {
        this();
        MxCatm00700107 tmp = parse(xml);
        certMgmtReq = tmp.getCertMgmtReq();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCatm00700107(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the certMgmtReq property.
     * 
     * @return
     *     possible object is
     *     {@link CertificateManagementRequestV07 }
     *     
     */
    public CertificateManagementRequestV07 getCertMgmtReq() {
        return certMgmtReq;
    }

    /**
     * Sets the value of the certMgmtReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link CertificateManagementRequestV07 }
     *     
     */
    public MxCatm00700107 setCertMgmtReq(CertificateManagementRequestV07 value) {
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
    public static MxCatm00700107 parse(String xml) {
        return ((MxCatm00700107) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCatm00700107 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxCatm00700107 parse(String xml, MxReadConfiguration conf) {
        return ((MxCatm00700107) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCatm00700107 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCatm00700107 parse(String xml, MxRead parserImpl) {
        return ((MxCatm00700107) parserImpl.read(MxCatm00700107 .class, xml, _classes));
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
     * Creates an MxCatm00700107 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCatm00700107 message
     * @return
     *     a new instance of MxCatm00700107
     */
    public final static MxCatm00700107 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxCatm00700107 .class);
    }

}
