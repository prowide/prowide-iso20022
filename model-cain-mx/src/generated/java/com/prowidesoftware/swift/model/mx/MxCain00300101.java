
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
 * Class for cain.003.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "acqrrFinInitn"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:cain.003.001.01")
public class MxCain00300101
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "AcqrrFinInitn", required = true)
    protected AcquirerFinancialInitiation acqrrFinInitn;
    public static final transient String BUSINESS_PROCESS = "cain";
    public static final transient int FUNCTIONALITY = 3;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {AccountChoiceMethod1Code.class, AccountIdentification30Choice.class, Acquirer6 .class, AcquirerFinancialInitiation.class, AcquirerFinancialInitiation1 .class, ActionMessage3 .class, ActionType4Code.class, AddressType2Code.class, AddressVerification1 .class, Algorithm11Code.class, Algorithm12Code.class, Algorithm13Code.class, Algorithm15Code.class, Algorithm7Code.class, Algorithm8Code.class, AlgorithmIdentification11 .class, AlgorithmIdentification12 .class, AlgorithmIdentification13 .class, AlgorithmIdentification14 .class, AlgorithmIdentification15 .class, AmountAndDirection41 .class, AntiMoneyLaundering1 .class, AttendanceContext1Code.class, AttributeType1Code.class, AuthenticatedData4 .class, AuthenticationEntity2Code.class, AuthenticationMethod5Code.class, AuthenticationMethod6Code.class, AuthorisationResult7 .class, BytePadding1Code.class, CardAcceptorTerminal1 .class, CardAccount1 .class, CardAccountType2Code.class, CardDataReading2Code.class, CardDataReading3Code.class, CardFallback1Code.class, CardPaymentServiceType3Code.class, CardPaymentServiceType7Code.class, CardPaymentServiceType8Code.class, CardPaymentToken4 .class, CardTransaction3 .class, CardTransaction5 .class, CardTransactionAmount3 .class, CardTransactionCondition1 .class, CardTransactionContext1 .class, CardTransactionContext2 .class, CardTransactionDetail3 .class, CardTransactionEnvironment1 .class, CardTransactionRiskIndicator1 .class, CardTransactionRiskReason1Code.class, Cardholder9 .class, CardholderAuthentication7 .class, CardholderVerificationCapability2Code.class, CertificateIssuer1 .class, CommunicationAddress5 .class, ContentInformationType10 .class, ContentInformationType15 .class, ContentType2Code.class, CurrencyAndAmount.class, CustomerDevice1 .class, DateAndPlaceOfBirth.class, DetailedAmount10 .class, DetailedAmount11 .class, DetailedAmount8 .class, DetailedAmount9 .class, DisplayCapabilities3 .class, EncapsulatedContent3 .class, EncryptedContent3 .class, EncryptionFormat1Code.class, EnvelopedData4 .class, Frequency3Code.class, GenericIdentification1 .class, GenericIdentification32 .class, GenericIdentification4 .class, GenericIdentification73 .class, GenericIdentification74 .class, GenericIdentification75 .class, Header17 .class, InstalmentPlan1Code.class, IssuerAndSerialNumber1 .class, KEK4 .class, KEKIdentifier2 .class, KeyTransport4 .class, LocationCategory2Code.class, MessageFunction6Code.class, MessageReason1Code.class, MxCain00300101 .class, NameAndAddress3 .class, OnLineCapability1Code.class, OnLinePIN4 .class, Organisation18 .class, OutputFormat1Code.class, PINFormat3Code.class, Parameter4 .class, Parameter5 .class, Parameter6 .class, Parameter7 .class, PartyIdentification72Choice.class, PartyType10Code.class, PartyType11Code.class, PartyType3Code.class, PartyType4Code.class, PartyType9Code.class, PaymentCard12 .class, PaymentTokenIdentifiers1 .class, PersonIdentification7 .class, PlainCardData10 .class, PointOfInteractionCapabilities4 .class, PostalAddress1 .class, PostalAddress18 .class, Recipient4Choice.class, Recipient5Choice.class, RecurringTransaction2 .class, RelativeDistinguishedName1 .class, Response3Code.class, ResponseType2 .class, ResultDetail1Code.class, SaleContext1 .class, SupportedPaymentOption1Code.class, Traceability3 .class, TrackData1 .class, TransactionChannel3Code.class, TransactionEnvironment2Code.class, TransactionEnvironment3Code.class, TransactionIdentifier2 .class, TransactionVerificationResult4 .class, TypeOfAmount1Code.class, TypeOfAmount5Code.class, TypeOfAmount6Code.class, TypeOfAmount7Code.class, UserInterface1Code.class, UserInterface3Code.class, Verification1Code.class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:cain.003.001.01";

    public MxCain00300101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCain00300101(final String xml) {
        this();
        MxCain00300101 tmp = parse(xml);
        acqrrFinInitn = tmp.getAcqrrFinInitn();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCain00300101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the acqrrFinInitn property.
     * 
     * @return
     *     possible object is
     *     {@link AcquirerFinancialInitiation }
     *     
     */
    public AcquirerFinancialInitiation getAcqrrFinInitn() {
        return acqrrFinInitn;
    }

    /**
     * Sets the value of the acqrrFinInitn property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcquirerFinancialInitiation }
     *     
     */
    public MxCain00300101 setAcqrrFinInitn(AcquirerFinancialInitiation value) {
        this.acqrrFinInitn = value;
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
    public static MxCain00300101 parse(String xml) {
        return ((MxCain00300101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCain00300101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxCain00300101 parse(String xml, MxReadConfiguration conf) {
        return ((MxCain00300101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCain00300101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCain00300101 parse(String xml, MxRead parserImpl) {
        return ((MxCain00300101) parserImpl.read(MxCain00300101 .class, xml, _classes));
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
     * Creates an MxCain00300101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCain00300101 message
     * @return
     *     a new instance of MxCain00300101
     */
    public static final MxCain00300101 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxCain00300101 .class);
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
