
package com.prowidesoftware.swift.model.mx;

import com.prowidesoftware.swift.model.mx.dic.*;
import com.prowidesoftware.swift.model.mx.AbstractMX;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.prowidesoftware.swift.model.MxSwiftMessage;
import com.prowidesoftware.swift.model.mx.AbstractMX;
import com.prowidesoftware.swift.model.mx.MxRead;
import com.prowidesoftware.swift.model.mx.MxReadImpl;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Class for catp.002.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "atmWdrwlRspn"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:catp.002.001.01")
public class MxCatp00200101
    extends AbstractMX
{

    @XmlElement(name = "ATMWdrwlRspn", required = true)
    protected ATMWithdrawalResponseV01 atmWdrwlRspn;
    public final static transient String BUSINESS_PROCESS = "catp";
    public final static transient int FUNCTIONALITY = 2;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {ATMCommand1 .class, ATMCommand1Code.class, ATMCommandIdentification1 .class, ATMCommandParameters1Choice.class, ATMConfigurationParameter1 .class, ATMContext2 .class, ATMCustomer2 .class, ATMCustomerProfile2 .class, ATMDevice1Code.class, ATMEnvironment2 .class, ATMMediaMix1 .class, ATMMessageFunction1 .class, ATMService2 .class, ATMServiceType1Code.class, ATMStatus1Code.class, ATMTransaction2 .class, ATMTransactionAmounts2 .class, ATMWithdrawalResponse1 .class, ATMWithdrawalResponseV01 .class, AccountChoiceMethod1Code.class, AccountIdentification31Choice.class, Acquirer7 .class, Acquirer8 .class, Action5 .class, ActionMessage4 .class, ActionType6Code.class, AddressType2Code.class, Algorithm11Code.class, Algorithm12Code.class, Algorithm13Code.class, Algorithm15Code.class, Algorithm7Code.class, Algorithm8Code.class, AlgorithmIdentification11 .class, AlgorithmIdentification12 .class, AlgorithmIdentification13 .class, AlgorithmIdentification14 .class, AlgorithmIdentification15 .class, AmountAndCurrency1 .class, AmountAndDirection43 .class, AttributeType1Code.class, AuthenticatedData4 .class, AuthenticationEntity2Code.class, AuthenticationMethod7Code.class, AuthorisationResult9 .class, AutomatedTellerMachine2 .class, BytePadding1Code.class, CardAccount4 .class, CardAccountType2Code.class, CertificateIssuer1 .class, Commission18 .class, Commission19 .class, ContentInformationType10 .class, ContentInformationType15 .class, ContentType2Code.class, CurrencyAndAmount.class, CurrencyConversion4 .class, CurrencyDetails2 .class, DataSetCategory7Code.class, DetailedAmount12 .class, DetailedAmount13 .class, DetailedAmount4 .class, EncapsulatedContent3 .class, EncryptedContent3 .class, EncryptionFormat1Code.class, EnvelopedData4 .class, GenericIdentification1 .class, GenericIdentification77 .class, GeographicCoordinates1 .class, GeographicLocation1Choice.class, Header20 .class, IssuerAndSerialNumber1 .class, KEK4 .class, KEKIdentifier2 .class, KeyTransport4 .class, MessageFunction7Code.class, MessageFunction8Code.class, MxCatp00200101 .class, NameAndAddress3 .class, OutputFormat2Code.class, Parameter4 .class, Parameter5 .class, Parameter6 .class, Parameter7 .class, PartyIdentification72Choice.class, PartyType12Code.class, PartyType13Code.class, PlainCardData14 .class, PostalAddress1 .class, PostalAddress17 .class, Recipient4Choice.class, Recipient5Choice.class, RelativeDistinguishedName1 .class, Response4Code.class, ResponseType3 .class, ResponseType4 .class, ResultDetail2Code.class, SimpleIdentificationInformation4 .class, TMSContactLevel2Code.class, TerminalHosting1 .class, Traceability4 .class, TransactionEnvironment3Code.class, TransactionIdentifier1 .class, TransactionVerificationResult5 .class, UTMCoordinates1 .class, Verification1Code.class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:catp.002.001.01";

    public MxCatp00200101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCatp00200101(final String xml) {
        this();
        MxCatp00200101 tmp = parse(xml);
        atmWdrwlRspn = tmp.getATMWdrwlRspn();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCatp00200101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the atmWdrwlRspn property.
     * 
     * @return
     *     possible object is
     *     {@link ATMWithdrawalResponseV01 }
     *     
     */
    public ATMWithdrawalResponseV01 getATMWdrwlRspn() {
        return atmWdrwlRspn;
    }

    /**
     * Sets the value of the atmWdrwlRspn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ATMWithdrawalResponseV01 }
     *     
     */
    public MxCatp00200101 setATMWdrwlRspn(ATMWithdrawalResponseV01 value) {
        this.atmWdrwlRspn = value;
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
    public static MxCatp00200101 parse(String xml) {
        return ((MxCatp00200101) MxReadImpl.parse(MxCatp00200101 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCatp00200101 parse(String xml, MxRead parserImpl) {
        return ((MxCatp00200101) parserImpl.read(MxCatp00200101 .class, xml, _classes));
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
     * Creates an MxCatp00200101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCatp00200101 message
     * @return
     *     a new instance of MxCatp00200101
     */
    public final static MxCatp00200101 fromJson(String json) {
        return AbstractMX.fromJson(json, MxCatp00200101 .class);
    }

}
