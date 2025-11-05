
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
 * Class for caam.016.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "atmRcncltnRspn"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:caam.016.001.01")
public class MxCaam01600101
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "ATMRcncltnRspn", required = true)
    protected ATMReconciliationResponseV01 atmRcncltnRspn;
    public static final transient String BUSINESS_PROCESS = "caam";
    public static final transient int FUNCTIONALITY = 16;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {ATMCassette3 .class, ATMCassetteCounters5 .class, ATMCassetteCounters6 .class, ATMCassetteStatus1Code.class, ATMCassetteType1Code.class, ATMCounterType3Code.class, ATMEnvironment7 .class, ATMMediaType3Code.class, ATMMediaType4Code.class, ATMMessageFunction2 .class, ATMNoteType1Code.class, ATMOperation2Code.class, ATMReconciliationRequestComponent1 .class, ATMReconciliationResponseV01 .class, ATMTransaction30 .class, Acquirer7 .class, Acquirer8 .class, Algorithm11Code.class, Algorithm12Code.class, Algorithm13Code.class, Algorithm15Code.class, Algorithm7Code.class, Algorithm8Code.class, AlgorithmIdentification11 .class, AlgorithmIdentification12 .class, AlgorithmIdentification13 .class, AlgorithmIdentification14 .class, AlgorithmIdentification15 .class, AttributeType1Code.class, AuthenticatedData4 .class, AutomatedTellerMachine3 .class, BytePadding1Code.class, CertificateIssuer1 .class, ContentInformationType10 .class, ContentInformationType15 .class, ContentType2Code.class, EncapsulatedContent3 .class, EncryptedContent3 .class, EncryptionFormat1Code.class, EnvelopedData4 .class, GenericIdentification77 .class, GeographicCoordinates1 .class, GeographicLocation1Choice.class, Header31 .class, IssuerAndSerialNumber1 .class, KEK4 .class, KEKIdentifier2 .class, KeyTransport4 .class, MessageFunction11Code.class, MxCaam01600101 .class, Parameter4 .class, Parameter5 .class, Parameter6 .class, Parameter7 .class, PartyType12Code.class, PostalAddress17 .class, Recipient4Choice.class, Recipient5Choice.class, RelativeDistinguishedName1 .class, TerminalHosting1 .class, Traceability4 .class, TransactionEnvironment3Code.class, TransactionIdentifier3 .class, UTMCoordinates1 .class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:caam.016.001.01";

    public MxCaam01600101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCaam01600101(final String xml) {
        this();
        MxCaam01600101 tmp = parse(xml);
        atmRcncltnRspn = tmp.getATMRcncltnRspn();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCaam01600101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the atmRcncltnRspn property.
     * 
     * @return
     *     possible object is
     *     {@link ATMReconciliationResponseV01 }
     *     
     */
    public ATMReconciliationResponseV01 getATMRcncltnRspn() {
        return atmRcncltnRspn;
    }

    /**
     * Sets the value of the atmRcncltnRspn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ATMReconciliationResponseV01 }
     *     
     */
    public MxCaam01600101 setATMRcncltnRspn(ATMReconciliationResponseV01 value) {
        this.atmRcncltnRspn = value;
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
    public static MxCaam01600101 parse(String xml) {
        return ((MxCaam01600101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCaam01600101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxCaam01600101 parse(String xml, MxReadConfiguration conf) {
        return ((MxCaam01600101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCaam01600101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCaam01600101 parse(String xml, MxRead parserImpl) {
        return ((MxCaam01600101) parserImpl.read(MxCaam01600101 .class, xml, _classes));
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
     * Creates an MxCaam01600101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCaam01600101 message
     * @return
     *     a new instance of MxCaam01600101
     */
    public static final MxCaam01600101 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxCaam01600101 .class);
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
