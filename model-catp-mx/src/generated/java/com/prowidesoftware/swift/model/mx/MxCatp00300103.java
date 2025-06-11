
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
 * Class for catp.003.001.03 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "atmWdrwlCmpltnAdvc"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:catp.003.001.03")
public class MxCatp00300103
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "ATMWdrwlCmpltnAdvc", required = true)
    protected ATMWithdrawalCompletionAdviceV03 atmWdrwlCmpltnAdvc;
    public final static transient String BUSINESS_PROCESS = "catp";
    public final static transient int FUNCTIONALITY = 3;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 3;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {ATMCassette3 .class, ATMCassetteCounters5 .class, ATMCassetteCounters6 .class, ATMCassetteStatus1Code.class, ATMCassetteType1Code.class, ATMConfigurationParameter1 .class, ATMContext9 .class, ATMCounterType3Code.class, ATMCustomer7 .class, ATMCustomerProfile1Code.class, ATMCustomerProfile6 .class, ATMDevice1Code.class, ATMEnvironment19 .class, ATMEquipment1 .class, ATMExchangeRateComponent1 .class, ATMFeeComponent1 .class, ATMMediaType1Code.class, ATMMediaType3Code.class, ATMMediaType4Code.class, ATMMessageFunction2 .class, ATMNoteType1Code.class, ATMService10 .class, ATMServiceType1Code.class, ATMTotals4 .class, ATMTransaction53 .class, ATMTransactionAmounts6 .class, ATMTransactionAmounts7 .class, ATMTransactionStatus1Code.class, ATMTransactionStatus2Code.class, ATMWithdrawalCompletionAdvice3 .class, ATMWithdrawalCompletionAdviceV03 .class, AccountChoiceMethod1Code.class, AccountIdentification80Choice.class, Acquirer7 .class, Action7 .class, ActionMessage4 .class, ActionMessage5 .class, ActionType6Code.class, Algorithm11Code.class, Algorithm12Code.class, Algorithm13Code.class, Algorithm15Code.class, Algorithm7Code.class, Algorithm8Code.class, AlgorithmIdentification11 .class, AlgorithmIdentification12 .class, AlgorithmIdentification13 .class, AlgorithmIdentification14 .class, AlgorithmIdentification15 .class, AmountAndCurrency1 .class, AttributeType1Code.class, AuthenticatedData4 .class, AuthenticationEntity2Code.class, AuthenticationMethod7Code.class, AuthorisationResult20 .class, AutomatedTellerMachine12 .class, BytePadding1Code.class, CardAccount17 .class, CardAccountType3Code.class, CardDataReading1Code.class, CardDataReading4Code.class, CardholderVerificationCapability3Code.class, CertificateIssuer1 .class, Commission18 .class, Commission19 .class, ContentInformationType10 .class, ContentInformationType15 .class, ContentType2Code.class, CurrencyAndAmount.class, CurrencyConversion32 .class, CurrencyDetails2 .class, DataSetCategory7Code.class, DetailedAmount12 .class, DetailedAmount13 .class, DisplayCapabilities5 .class, EncapsulatedContent3 .class, EncryptedContent3 .class, EncryptionFormat1Code.class, EnvelopedData4 .class, FailureReason9Code.class, GenericIdentification1 .class, GenericIdentification77 .class, GeographicCoordinates1 .class, GeographicLocation1Choice.class, Header32 .class, IssuerAndSerialNumber1 .class, KEK4 .class, KEKIdentifier2 .class, KeyTransport4 .class, MessageFunction11Code.class, MxCatp00300103 .class, OutputFormat1Code.class, OutputFormat2Code.class, Parameter4 .class, Parameter5 .class, Parameter6 .class, Parameter7 .class, PartyIdentification177Choice.class, PartyType12Code.class, PartyType16Code.class, PaymentCard37 .class, PlainCardData24 .class, PointOfInteractionCapabilities10 .class, PostalAddress17 .class, Recipient4Choice.class, Recipient5Choice.class, RelativeDistinguishedName1 .class, Response12Code.class, ResponseType12 .class, ResponseType8 .class, ResultDetail5Code.class, SimpleIdentificationInformation4 .class, TerminalHosting1 .class, Traceability4 .class, TransactionEnvironment2Code.class, TransactionEnvironment3Code.class, TransactionIdentifier3 .class, TransactionVerificationResult5 .class, UTMCoordinates1 .class, UserInterface5Code.class, Verification1Code.class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:catp.003.001.03";

    public MxCatp00300103() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCatp00300103(final String xml) {
        this();
        MxCatp00300103 tmp = parse(xml);
        atmWdrwlCmpltnAdvc = tmp.getATMWdrwlCmpltnAdvc();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCatp00300103(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the atmWdrwlCmpltnAdvc property.
     * 
     * @return
     *     possible object is
     *     {@link ATMWithdrawalCompletionAdviceV03 }
     *     
     */
    public ATMWithdrawalCompletionAdviceV03 getATMWdrwlCmpltnAdvc() {
        return atmWdrwlCmpltnAdvc;
    }

    /**
     * Sets the value of the atmWdrwlCmpltnAdvc property.
     * 
     * @param value
     *     allowed object is
     *     {@link ATMWithdrawalCompletionAdviceV03 }
     *     
     */
    public MxCatp00300103 setATMWdrwlCmpltnAdvc(ATMWithdrawalCompletionAdviceV03 value) {
        this.atmWdrwlCmpltnAdvc = value;
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
    public static MxCatp00300103 parse(String xml) {
        return ((MxCatp00300103) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCatp00300103 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxCatp00300103 parse(String xml, MxReadConfiguration conf) {
        return ((MxCatp00300103) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCatp00300103 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCatp00300103 parse(String xml, MxRead parserImpl) {
        return ((MxCatp00300103) parserImpl.read(MxCatp00300103 .class, xml, _classes));
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
     * Creates an MxCatp00300103 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCatp00300103 message
     * @return
     *     a new instance of MxCatp00300103
     */
    public final static MxCatp00300103 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxCatp00300103 .class);
    }

}
