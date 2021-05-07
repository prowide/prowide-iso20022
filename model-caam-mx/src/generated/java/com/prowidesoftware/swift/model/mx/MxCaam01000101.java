
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
 * Class for caam.010.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "atmRcncltnAck"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:caam.010.001.01")
public class MxCaam01000101
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "ATMRcncltnAck", required = true)
    protected ATMReconciliationAcknowledgementV01 atmRcncltnAck;
    public final static transient String BUSINESS_PROCESS = "caam";
    public final static transient int FUNCTIONALITY = 10;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {ATMCommand1 .class, ATMCommand1Code.class, ATMCommandIdentification1 .class, ATMCommandParameters1Choice.class, ATMConfigurationParameter1 .class, ATMMessageFunction1 .class, ATMOperation1Code.class, ATMReconciliationAcknowledgement1 .class, ATMReconciliationAcknowledgementV01 .class, ATMStatus1Code.class, ATMTransaction12 .class, Algorithm11Code.class, Algorithm12Code.class, Algorithm13Code.class, Algorithm15Code.class, Algorithm7Code.class, Algorithm8Code.class, AlgorithmIdentification11 .class, AlgorithmIdentification12 .class, AlgorithmIdentification13 .class, AlgorithmIdentification14 .class, AlgorithmIdentification15 .class, AttributeType1Code.class, AuthenticatedData4 .class, AutomatedTellerMachine3 .class, BytePadding1Code.class, CertificateIssuer1 .class, ContentInformationType10 .class, ContentInformationType15 .class, ContentType2Code.class, DataSetCategory7Code.class, EncapsulatedContent3 .class, EncryptedContent3 .class, EncryptionFormat1Code.class, EnvelopedData4 .class, GenericIdentification77 .class, GeographicCoordinates1 .class, GeographicLocation1Choice.class, Header21 .class, IssuerAndSerialNumber1 .class, KEK4 .class, KEKIdentifier2 .class, KeyTransport4 .class, MessageFunction7Code.class, MessageFunction8Code.class, MxCaam01000101 .class, Parameter4 .class, Parameter5 .class, Parameter6 .class, Parameter7 .class, PartyType12Code.class, PostalAddress17 .class, Recipient4Choice.class, Recipient5Choice.class, RelativeDistinguishedName1 .class, Response4Code.class, ResponseType3 .class, ResultDetail2Code.class, TMSContactLevel2Code.class, Traceability4 .class, TransactionIdentifier1 .class, UTMCoordinates1 .class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:caam.010.001.01";

    public MxCaam01000101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCaam01000101(final String xml) {
        this();
        MxCaam01000101 tmp = parse(xml);
        atmRcncltnAck = tmp.getATMRcncltnAck();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCaam01000101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the atmRcncltnAck property.
     * 
     * @return
     *     possible object is
     *     {@link ATMReconciliationAcknowledgementV01 }
     *     
     */
    public ATMReconciliationAcknowledgementV01 getATMRcncltnAck() {
        return atmRcncltnAck;
    }

    /**
     * Sets the value of the atmRcncltnAck property.
     * 
     * @param value
     *     allowed object is
     *     {@link ATMReconciliationAcknowledgementV01 }
     *     
     */
    public MxCaam01000101 setATMRcncltnAck(ATMReconciliationAcknowledgementV01 value) {
        this.atmRcncltnAck = value;
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
    public static MxCaam01000101 parse(String xml) {
        return ((MxCaam01000101) MxReadImpl.parse(MxCaam01000101 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCaam01000101 parse(String xml, MxRead parserImpl) {
        return ((MxCaam01000101) parserImpl.read(MxCaam01000101 .class, xml, _classes));
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
     * Creates an MxCaam01000101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCaam01000101 message
     * @return
     *     a new instance of MxCaam01000101
     */
    public final static MxCaam01000101 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxCaam01000101 .class);
    }

}
