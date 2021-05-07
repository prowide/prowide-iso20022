
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
 * Class for caam.005.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "atmDgnstcReq"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:caam.005.001.01")
public class MxCaam00500101
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "ATMDgnstcReq", required = true)
    protected ATMDiagnosticRequestV01 atmDgnstcReq;
    public final static transient String BUSINESS_PROCESS = "caam";
    public final static transient int FUNCTIONALITY = 5;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {ATMDiagnosticRequest1 .class, ATMDiagnosticRequestV01 .class, ATMEnvironment9 .class, ATMMessageFunction1 .class, Acquirer7 .class, Algorithm11Code.class, Algorithm12Code.class, Algorithm13Code.class, Algorithm15Code.class, Algorithm7Code.class, Algorithm8Code.class, AlgorithmIdentification11 .class, AlgorithmIdentification12 .class, AlgorithmIdentification13 .class, AlgorithmIdentification14 .class, AlgorithmIdentification15 .class, AttributeType1Code.class, AuthenticatedData4 .class, AutomatedTellerMachine7 .class, BytePadding1Code.class, CertificateIssuer1 .class, ContentInformationType10 .class, ContentInformationType15 .class, ContentType2Code.class, EncapsulatedContent3 .class, EncryptedContent3 .class, EncryptionFormat1Code.class, EnvelopedData4 .class, GenericIdentification77 .class, Header20 .class, IssuerAndSerialNumber1 .class, KEK4 .class, KEKIdentifier2 .class, KeyTransport4 .class, MessageFunction7Code.class, MxCaam00500101 .class, Parameter4 .class, Parameter5 .class, Parameter6 .class, Parameter7 .class, PartyType12Code.class, Recipient4Choice.class, Recipient5Choice.class, RelativeDistinguishedName1 .class, Traceability4 .class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:caam.005.001.01";

    public MxCaam00500101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCaam00500101(final String xml) {
        this();
        MxCaam00500101 tmp = parse(xml);
        atmDgnstcReq = tmp.getATMDgnstcReq();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCaam00500101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the atmDgnstcReq property.
     * 
     * @return
     *     possible object is
     *     {@link ATMDiagnosticRequestV01 }
     *     
     */
    public ATMDiagnosticRequestV01 getATMDgnstcReq() {
        return atmDgnstcReq;
    }

    /**
     * Sets the value of the atmDgnstcReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link ATMDiagnosticRequestV01 }
     *     
     */
    public MxCaam00500101 setATMDgnstcReq(ATMDiagnosticRequestV01 value) {
        this.atmDgnstcReq = value;
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
    public static MxCaam00500101 parse(String xml) {
        return ((MxCaam00500101) MxReadImpl.parse(MxCaam00500101 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCaam00500101 parse(String xml, MxRead parserImpl) {
        return ((MxCaam00500101) parserImpl.read(MxCaam00500101 .class, xml, _classes));
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
     * Creates an MxCaam00500101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCaam00500101 message
     * @return
     *     a new instance of MxCaam00500101
     */
    public final static MxCaam00500101 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxCaam00500101 .class);
    }

}
