
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
 * Class for catp.007.001.03 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "atmNqryRspn"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:catp.007.001.03")
public class MxCatp00700103
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "ATMNqryRspn", required = true)
    protected ATMInquiryResponseV03 atmNqryRspn;
    public static final transient String BUSINESS_PROCESS = "catp";
    public static final transient int FUNCTIONALITY = 7;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 3;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {ATMAccountStatement2 .class, ATMAccountStatement3 .class, ATMAccountUsage1Code.class, ATMCommand4Code.class, ATMCommand7 .class, ATMCommandIdentification1 .class, ATMCommandParameters1Choice.class, ATMConfigurationParameter1 .class, ATMContext27 .class, ATMCustomer9 .class, ATMCustomerProfile2 .class, ATMCustomerProfile7 .class, ATMDevice1Code.class, ATMEnvironment21 .class, ATMExchangeRateComponent1 .class, ATMFeeComponent1 .class, ATMInquiryResponse3 .class, ATMInquiryResponseV03 .class, ATMMediaMix2 .class, ATMMessageFunction2 .class, ATMService18 .class, ATMService26 .class, ATMService28 .class, ATMService29 .class, ATMServiceType12Code.class, ATMServiceType13Code.class, ATMStatus1Code.class, ATMTransaction48 .class, ATMTransaction8 .class, ATMTransactionAmounts6 .class, ATMTransactionAmounts7 .class, AccountIdentification80Choice.class, Acquirer7 .class, Acquirer8 .class, Action7 .class, ActionMessage4 .class, ActionMessage5 .class, ActionType6Code.class, Algorithm11Code.class, Algorithm12Code.class, Algorithm13Code.class, Algorithm15Code.class, Algorithm7Code.class, Algorithm8Code.class, AlgorithmIdentification11 .class, AlgorithmIdentification12 .class, AlgorithmIdentification13 .class, AlgorithmIdentification14 .class, AlgorithmIdentification15 .class, AmountAndDirection111 .class, AttributeType1Code.class, AuthenticatedData4 .class, AuthenticationEntity2Code.class, AuthenticationMethod7Code.class, AuthorisationResult20 .class, AutomatedTellerMachine2 .class, BytePadding1Code.class, CardAccount18 .class, CardAccountType3Code.class, CertificateIssuer1 .class, Commission18 .class, Commission19 .class, ContentInformationType10 .class, ContentInformationType15 .class, ContentType2Code.class, CurrencyAndAmount.class, CurrencyConversion32 .class, CurrencyConversion33 .class, CurrencyConversion5 .class, CurrencyConversionResponse2Code.class, CurrencyDetails2 .class, DataSetCategory7Code.class, EncapsulatedContent3 .class, EncryptedContent3 .class, EncryptionFormat1Code.class, EnvelopedData4 .class, GenericIdentification1 .class, GenericIdentification77 .class, GeographicCoordinates1 .class, GeographicLocation1Choice.class, Header31 .class, IssuerAndSerialNumber1 .class, KEK4 .class, KEKIdentifier2 .class, KeyTransport4 .class, MessageFunction11Code.class, MessageFunction8Code.class, MxCatp00700103 .class, OutputFormat1Code.class, OutputFormat2Code.class, Parameter4 .class, Parameter5 .class, Parameter6 .class, Parameter7 .class, PartyIdentification177Choice.class, PartyType12Code.class, PartyType16Code.class, PlainCardData24 .class, PostalAddress17 .class, Recipient4Choice.class, Recipient5Choice.class, RelativeDistinguishedName1 .class, Response12Code.class, ResponseType12 .class, ResponseType8 .class, ResultDetail5Code.class, SimpleIdentificationInformation4 .class, TMSContactLevel2Code.class, TerminalHosting1 .class, Traceability4 .class, TransactionEnvironment3Code.class, TransactionIdentifier3 .class, TransactionVerificationResult5 .class, UTMCoordinates1 .class, Verification1Code.class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:catp.007.001.03";

    public MxCatp00700103() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCatp00700103(final String xml) {
        this();
        MxCatp00700103 tmp = parse(xml);
        atmNqryRspn = tmp.getATMNqryRspn();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCatp00700103(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the atmNqryRspn property.
     * 
     * @return
     *     possible object is
     *     {@link ATMInquiryResponseV03 }
     *     
     */
    public ATMInquiryResponseV03 getATMNqryRspn() {
        return atmNqryRspn;
    }

    /**
     * Sets the value of the atmNqryRspn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ATMInquiryResponseV03 }
     *     
     */
    public MxCatp00700103 setATMNqryRspn(ATMInquiryResponseV03 value) {
        this.atmNqryRspn = value;
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
    public static MxCatp00700103 parse(String xml) {
        return ((MxCatp00700103) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCatp00700103 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxCatp00700103 parse(String xml, MxReadConfiguration conf) {
        return ((MxCatp00700103) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCatp00700103 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCatp00700103 parse(String xml, MxRead parserImpl) {
        return ((MxCatp00700103) parserImpl.read(MxCatp00700103 .class, xml, _classes));
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
     * Creates an MxCatp00700103 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCatp00700103 message
     * @return
     *     a new instance of MxCatp00700103
     */
    public static final MxCatp00700103 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxCatp00700103 .class);
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
