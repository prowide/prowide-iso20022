
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
 * Class for catp.001.001.02 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "atmWdrwlReq"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:catp.001.001.02")
public class MxCatp00100102
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "ATMWdrwlReq", required = true)
    protected ATMWithdrawalRequestV02 atmWdrwlReq;
    public final static transient String BUSINESS_PROCESS = "catp";
    public final static transient int FUNCTIONALITY = 1;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 2;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {ATMConfigurationParameter1 .class, ATMContext8 .class, ATMCustomer4 .class, ATMCustomerProfile1Code.class, ATMCustomerProfile4 .class, ATMEnvironment11 .class, ATMEquipment1 .class, ATMMediaMix1 .class, ATMMediaType1Code.class, ATMMediaType2Code.class, ATMMessageFunction2 .class, ATMService9 .class, ATMServiceType1Code.class, ATMTransaction13 .class, ATMWithdrawalRequest2 .class, ATMWithdrawalRequestV02 .class, AccountChoiceMethod1Code.class, AccountIdentification31Choice.class, Acquirer7 .class, ActionMessage5 .class, AddressType2Code.class, Algorithm11Code.class, Algorithm12Code.class, Algorithm13Code.class, Algorithm15Code.class, Algorithm7Code.class, Algorithm8Code.class, AlgorithmIdentification11 .class, AlgorithmIdentification12 .class, AlgorithmIdentification13 .class, AlgorithmIdentification14 .class, AlgorithmIdentification15 .class, AmountAndCurrency1 .class, AttributeType1Code.class, AuthenticatedData4 .class, AuthenticationEntity2Code.class, AuthenticationMethod7Code.class, AutomatedTellerMachine9 .class, BytePadding1Code.class, CardAccount7 .class, CardAccountType3Code.class, CardDataReading1Code.class, CardDataReading4Code.class, CardFallback1Code.class, CardholderAuthentication8 .class, CardholderVerificationCapability3Code.class, CertificateIssuer1 .class, Commission18 .class, Commission19 .class, ContentInformationType10 .class, ContentInformationType15 .class, ContentType2Code.class, CurrencyConversion9 .class, CurrencyDetails2 .class, DataSetCategory7Code.class, DetailedAmount12 .class, DetailedAmount13 .class, DisplayCapabilities5 .class, EncapsulatedContent3 .class, EncryptedContent3 .class, EncryptionFormat1Code.class, EnvelopedData4 .class, GenericIdentification1 .class, GenericIdentification77 .class, GeographicCoordinates1 .class, GeographicLocation1Choice.class, Header31 .class, IssuerAndSerialNumber1 .class, KEK4 .class, KEKIdentifier2 .class, KeyTransport4 .class, MessageFunction11Code.class, MxCatp00100102 .class, NameAndAddress3 .class, OnLinePIN5 .class, OutputFormat1Code.class, PINFormat4Code.class, Parameter4 .class, Parameter5 .class, Parameter6 .class, Parameter7 .class, PartyIdentification72Choice.class, PartyType12Code.class, PaymentCard22 .class, PlainCardData18 .class, PointOfInteractionCapabilities7 .class, PostalAddress1 .class, PostalAddress17 .class, Recipient4Choice.class, Recipient5Choice.class, RelativeDistinguishedName1 .class, SimpleIdentificationInformation4 .class, TerminalHosting1 .class, Traceability4 .class, TransactionEnvironment2Code.class, TransactionEnvironment3Code.class, TransactionIdentifier1 .class, TransactionVerificationResult5 .class, UTMCoordinates1 .class, UserInterface5Code.class, Verification1Code.class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:catp.001.001.02";

    public MxCatp00100102() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCatp00100102(final String xml) {
        this();
        MxCatp00100102 tmp = parse(xml);
        atmWdrwlReq = tmp.getATMWdrwlReq();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCatp00100102(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the atmWdrwlReq property.
     * 
     * @return
     *     possible object is
     *     {@link ATMWithdrawalRequestV02 }
     *     
     */
    public ATMWithdrawalRequestV02 getATMWdrwlReq() {
        return atmWdrwlReq;
    }

    /**
     * Sets the value of the atmWdrwlReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link ATMWithdrawalRequestV02 }
     *     
     */
    public MxCatp00100102 setATMWdrwlReq(ATMWithdrawalRequestV02 value) {
        this.atmWdrwlReq = value;
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
    public static MxCatp00100102 parse(String xml) {
        return ((MxCatp00100102) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCatp00100102 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxCatp00100102 parse(String xml, MxReadConfiguration conf) {
        return ((MxCatp00100102) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCatp00100102 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCatp00100102 parse(String xml, MxRead parserImpl) {
        return ((MxCatp00100102) parserImpl.read(MxCatp00100102 .class, xml, _classes));
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
     * Creates an MxCatp00100102 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCatp00100102 message
     * @return
     *     a new instance of MxCatp00100102
     */
    public final static MxCatp00100102 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxCatp00100102 .class);
    }

}
