
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
 * Class for cain.002.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "acqrrAuthstnRspn"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:cain.002.001.01")
public class MxCain00200101
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "AcqrrAuthstnRspn", required = true)
    protected AcquirerAuthorisationResponse acqrrAuthstnRspn;
    public final static transient String BUSINESS_PROCESS = "cain";
    public final static transient int FUNCTIONALITY = 2;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AccountIdentification30Choice.class, AcquirerAuthorisationResponse.class, AcquirerAuthorisationResponse1 .class, Action4 .class, ActionMessage2 .class, ActionMessage3 .class, ActionType5Code.class, AddressType2Code.class, Algorithm11Code.class, Algorithm12Code.class, Algorithm13Code.class, Algorithm15Code.class, Algorithm7Code.class, Algorithm8Code.class, AlgorithmIdentification11 .class, AlgorithmIdentification12 .class, AlgorithmIdentification13 .class, AlgorithmIdentification14 .class, AlgorithmIdentification15 .class, AmountAndDirection41 .class, AttributeType1Code.class, AuthenticatedData4 .class, AuthenticationEntity2Code.class, AuthenticationMethod6Code.class, AuthorisationResult8 .class, BytePadding1Code.class, CardAccount2 .class, CardAccountType2Code.class, CardPaymentServiceType7Code.class, CardPaymentToken2 .class, CardProductType1Code.class, CardTransaction4 .class, CardTransactionAmount2 .class, CardTransactionCondition1 .class, CardTransactionContext3 .class, CardTransactionContext4 .class, CardTransactionDetail2 .class, CardTransactionEnvironment2 .class, CertificateIssuer1 .class, ContentInformationType10 .class, ContentInformationType15 .class, ContentType2Code.class, CurrencyAndAmount.class, DetailedAmount10 .class, DetailedAmount8 .class, DetailedAmount9 .class, EncapsulatedContent3 .class, EncryptedContent3 .class, EncryptionFormat1Code.class, EnvelopedData4 .class, GenericIdentification1 .class, GenericIdentification73 .class, GenericIdentification74 .class, GenericIdentification75 .class, Header17 .class, IssuerAndSerialNumber1 .class, KEK4 .class, KEKIdentifier2 .class, KeyTransport4 .class, MessageFunction6Code.class, MxCain00200101 .class, NameAndAddress3 .class, OutputFormat1Code.class, Parameter4 .class, Parameter5 .class, Parameter6 .class, Parameter7 .class, PartyIdentification72Choice.class, PartyType10Code.class, PartyType11Code.class, PartyType9Code.class, PaymentCard13 .class, PlainCardData9 .class, PostalAddress1 .class, PostalAddress18 .class, Recipient4Choice.class, Recipient5Choice.class, RelativeDistinguishedName1 .class, Response3Code.class, ResponseType2 .class, ResultDetail1Code.class, Traceability3 .class, TrackData1 .class, TransactionIdentifier2 .class, TransactionVerificationResult4 .class, TypeOfAmount5Code.class, TypeOfAmount6Code.class, UserInterface3Code.class, UserInterface4Code.class, Verification1Code.class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:cain.002.001.01";

    public MxCain00200101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCain00200101(final String xml) {
        this();
        MxCain00200101 tmp = parse(xml);
        acqrrAuthstnRspn = tmp.getAcqrrAuthstnRspn();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCain00200101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the acqrrAuthstnRspn property.
     * 
     * @return
     *     possible object is
     *     {@link AcquirerAuthorisationResponse }
     *     
     */
    public AcquirerAuthorisationResponse getAcqrrAuthstnRspn() {
        return acqrrAuthstnRspn;
    }

    /**
     * Sets the value of the acqrrAuthstnRspn property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcquirerAuthorisationResponse }
     *     
     */
    public MxCain00200101 setAcqrrAuthstnRspn(AcquirerAuthorisationResponse value) {
        this.acqrrAuthstnRspn = value;
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
    public static MxCain00200101 parse(String xml) {
        return ((MxCain00200101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCain00200101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxCain00200101 parse(String xml, MxReadConfiguration conf) {
        return ((MxCain00200101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCain00200101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCain00200101 parse(String xml, MxRead parserImpl) {
        return ((MxCain00200101) parserImpl.read(MxCain00200101 .class, xml, _classes));
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
     * Creates an MxCain00200101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCain00200101 message
     * @return
     *     a new instance of MxCain00200101
     */
    public final static MxCain00200101 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxCain00200101 .class);
    }

}
