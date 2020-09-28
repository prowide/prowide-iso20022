
package com.prowidesoftware.swift.model.mx;

import com.prowidesoftware.swift.model.mx.dic.*;
import com.prowidesoftware.swift.model.mx.AbstractMX;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.prowidesoftware.swift.model.MxSwiftMessage;
import com.prowidesoftware.swift.model.mx.AbstractMX;
import com.prowidesoftware.swift.model.mx.MxRead;
import com.prowidesoftware.swift.model.mx.MxReadImpl;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Class for catm.007.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "certMgmtReq"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:catm.007.001.01")
public class MxCatm00700101
    extends AbstractMX
{

    @XmlElement(name = "CertMgmtReq", required = true)
    protected CertificateManagementRequestV01 certMgmtReq;
    public final static transient String BUSINESS_PROCESS = "catm";
    public final static transient int FUNCTIONALITY = 7;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {Algorithm11Code.class, Algorithm12Code.class, Algorithm13Code.class, Algorithm14Code.class, Algorithm7Code.class, Algorithm8Code.class, AlgorithmIdentification11 .class, AlgorithmIdentification12 .class, AlgorithmIdentification13 .class, AlgorithmIdentification15 .class, AlgorithmIdentification16 .class, AlgorithmIdentification17 .class, AttributeType1Code.class, AttributeType2Code.class, AuthenticatedData4 .class, BytePadding1Code.class, CardPaymentServiceType10Code.class, CertificateIssuer1 .class, CertificateManagementRequest1 .class, CertificateManagementRequestV01 .class, CertificationRequest1 .class, CertificationRequest2 .class, ContentInformationType13 .class, ContentType2Code.class, EncapsulatedContent3 .class, EncryptionFormat1Code.class, GenericIdentification72 .class, GenericIdentification93 .class, Header29 .class, IssuerAndSerialNumber1 .class, KEK4 .class, KEKIdentifier2 .class, KeyTransport4 .class, MxCatm00700101 .class, NetworkParameters4 .class, NetworkParameters5 .class, NetworkType1Code.class, Parameter4 .class, Parameter5 .class, Parameter6 .class, Parameter7 .class, Parameter8 .class, PartyType6Code.class, PointOfInteraction6 .class, PublicRSAKey1 .class, PublicRSAKey2 .class, Recipient4Choice.class, Recipient5Choice.class, RelativeDistinguishedName1 .class, RelativeDistinguishedName2 .class, SignedData4 .class, Signer3 .class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:catm.007.001.01";

    public MxCatm00700101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCatm00700101(final String xml) {
        this();
        MxCatm00700101 tmp = parse(xml);
        certMgmtReq = tmp.getCertMgmtReq();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCatm00700101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the certMgmtReq property.
     * 
     * @return
     *     possible object is
     *     {@link CertificateManagementRequestV01 }
     *     
     */
    public CertificateManagementRequestV01 getCertMgmtReq() {
        return certMgmtReq;
    }

    /**
     * Sets the value of the certMgmtReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link CertificateManagementRequestV01 }
     *     
     */
    public MxCatm00700101 setCertMgmtReq(CertificateManagementRequestV01 value) {
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
     * Creates the MX object parsing the raw content from the parameter XML
     * 
     */
    public static MxCatm00700101 parse(String xml) {
        return ((MxCatm00700101) MxReadImpl.parse(MxCatm00700101 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCatm00700101 parse(String xml, MxRead parserImpl) {
        return ((MxCatm00700101) parserImpl.read(MxCatm00700101 .class, xml, _classes));
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
     * Creates an MxCatm00700101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCatm00700101 message
     * @return
     *     a new instance of MxCatm00700101
     */
    public final static MxCatm00700101 fromJson(String json) {
        return AbstractMX.fromJson(json, MxCatm00700101 .class);
    }

}
