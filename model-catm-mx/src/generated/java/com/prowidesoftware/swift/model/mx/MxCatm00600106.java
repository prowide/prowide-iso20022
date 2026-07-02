
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
 * Class for catm.006.001.06 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "mntncDlgtnRspn"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:catm.006.001.06")
public class MxCatm00600106
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "MntncDlgtnRspn", required = true)
    protected MaintenanceDelegationResponseV06 mntncDlgtnRspn;
    public final static transient String BUSINESS_PROCESS = "catm";
    public final static transient int FUNCTIONALITY = 6;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 6;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {Algorithm11Code.class, Algorithm16Code.class, Algorithm17Code.class, Algorithm24Code.class, Algorithm25Code.class, Algorithm7Code.class, Algorithm8Code.class, AlgorithmIdentification12 .class, AlgorithmIdentification18 .class, AlgorithmIdentification19 .class, AlgorithmIdentification21 .class, AlgorithmIdentification22 .class, AlgorithmIdentification29 .class, AlgorithmIdentification30 .class, AttributeType1Code.class, AuthenticatedData8 .class, BytePadding1Code.class, CertificateIssuer1 .class, ContentInformationType29 .class, ContentInformationType30 .class, ContentType2Code.class, DataSetCategory16Code.class, DigestedData5 .class, EncapsulatedContent3 .class, EncryptedContent6 .class, EncryptionFormat2Code.class, EnvelopedData9 .class, GenericIdentification176 .class, GenericIdentification177 .class, GenericInformation1 .class, Geolocation1 .class, GeolocationGeographicCoordinates1 .class, GeolocationUTMCoordinates1 .class, IssuerAndSerialNumber2 .class, KEK8 .class, KEKIdentifier7 .class, KeyTransport8 .class, MaintenanceDelegation14 .class, MaintenanceDelegationResponse6 .class, MaintenanceDelegationResponseV06 .class, MaintenanceIdentificationAssociation1 .class, MxCatm00600106 .class, NetworkParameters7 .class, NetworkParameters9 .class, NetworkType1Code.class, OriginatorInformation1 .class, Parameter10 .class, Parameter12 .class, Parameter15 .class, Parameter5 .class, Parameter7 .class, Parameter9 .class, PartyType33Code.class, Recipient11Choice.class, Recipient12Choice.class, RelativeDistinguishedName1 .class, Response2Code.class, SignedData7 .class, Signer6 .class, TMSHeader1 .class, TerminalManagementAction3Code.class, Traceability8 .class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:catm.006.001.06";

    public MxCatm00600106() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCatm00600106(final String xml) {
        this();
        MxCatm00600106 tmp = parse(xml);
        mntncDlgtnRspn = tmp.getMntncDlgtnRspn();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCatm00600106(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the mntncDlgtnRspn property.
     * 
     * @return
     *     possible object is
     *     {@link MaintenanceDelegationResponseV06 }
     *     
     */
    public MaintenanceDelegationResponseV06 getMntncDlgtnRspn() {
        return mntncDlgtnRspn;
    }

    /**
     * Sets the value of the mntncDlgtnRspn property.
     * 
     * @param value
     *     allowed object is
     *     {@link MaintenanceDelegationResponseV06 }
     *     
     */
    public MxCatm00600106 setMntncDlgtnRspn(MaintenanceDelegationResponseV06 value) {
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
    public static MxCatm00600106 parse(String xml) {
        return ((MxCatm00600106) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCatm00600106 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxCatm00600106 parse(String xml, MxReadConfiguration conf) {
        return ((MxCatm00600106) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCatm00600106 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCatm00600106 parse(String xml, MxRead parserImpl) {
        return ((MxCatm00600106) parserImpl.read(MxCatm00600106 .class, xml, _classes));
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
     * Creates an MxCatm00600106 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCatm00600106 message
     * @return
     *     a new instance of MxCatm00600106
     */
    public final static MxCatm00600106 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxCatm00600106 .class);
    }

}
