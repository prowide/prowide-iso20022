
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
 * Class for catm.006.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "mntncDlgtnRspn"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:catm.006.001.01")
public class MxCatm00600101
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "MntncDlgtnRspn", required = true)
    protected MaintenanceDelegationResponseV01 mntncDlgtnRspn;
    public final static transient String BUSINESS_PROCESS = "catm";
    public final static transient int FUNCTIONALITY = 6;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {Algorithm11Code.class, Algorithm12Code.class, Algorithm13Code.class, Algorithm14Code.class, Algorithm15Code.class, Algorithm7Code.class, Algorithm8Code.class, AlgorithmIdentification11 .class, AlgorithmIdentification12 .class, AlgorithmIdentification13 .class, AlgorithmIdentification14 .class, AlgorithmIdentification15 .class, AlgorithmIdentification16 .class, AlgorithmIdentification17 .class, AttributeType1Code.class, AuthenticatedData4 .class, BytePadding1Code.class, CertificateIssuer1 .class, ContentInformationType12 .class, ContentType2Code.class, DataSetCategory6Code.class, DigestedData4 .class, EncapsulatedContent3 .class, EncryptedContent3 .class, EncryptionFormat1Code.class, EnvelopedData4 .class, GenericIdentification72 .class, Header16 .class, IssuerAndSerialNumber1 .class, KEK4 .class, KEKIdentifier2 .class, KeyTransport4 .class, MaintenanceDelegation2 .class, MaintenanceDelegationResponse1 .class, MaintenanceDelegationResponseV01 .class, MaintenanceIdentificationAssociation1 .class, MxCatm00600101 .class, Parameter4 .class, Parameter5 .class, Parameter6 .class, Parameter7 .class, Parameter8 .class, PartyType6Code.class, Recipient4Choice.class, Recipient5Choice.class, RelativeDistinguishedName1 .class, Response2Code.class, SignedData4 .class, Signer3 .class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:catm.006.001.01";

    public MxCatm00600101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCatm00600101(final String xml) {
        this();
        MxCatm00600101 tmp = parse(xml);
        mntncDlgtnRspn = tmp.getMntncDlgtnRspn();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCatm00600101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the mntncDlgtnRspn property.
     * 
     * @return
     *     possible object is
     *     {@link MaintenanceDelegationResponseV01 }
     *     
     */
    public MaintenanceDelegationResponseV01 getMntncDlgtnRspn() {
        return mntncDlgtnRspn;
    }

    /**
     * Sets the value of the mntncDlgtnRspn property.
     * 
     * @param value
     *     allowed object is
     *     {@link MaintenanceDelegationResponseV01 }
     *     
     */
    public MxCatm00600101 setMntncDlgtnRspn(MaintenanceDelegationResponseV01 value) {
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
     * Creates the MX object parsing the raw content from the parameter XML
     * 
     */
    public static MxCatm00600101 parse(String xml) {
        return ((MxCatm00600101) MxReadImpl.parse(MxCatm00600101 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCatm00600101 parse(String xml, MxRead parserImpl) {
        return ((MxCatm00600101) parserImpl.read(MxCatm00600101 .class, xml, _classes));
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
     * Creates an MxCatm00600101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCatm00600101 message
     * @return
     *     a new instance of MxCatm00600101
     */
    public final static MxCatm00600101 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxCatm00600101 .class);
    }

}
