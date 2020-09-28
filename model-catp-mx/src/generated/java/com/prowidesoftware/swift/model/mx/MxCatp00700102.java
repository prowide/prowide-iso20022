
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
 * Class for catp.007.001.02 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "atmNqryRspn"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:catp.007.001.02")
public class MxCatp00700102
    extends AbstractMX
{

    @XmlElement(name = "ATMNqryRspn", required = true)
    protected ATMInquiryResponseV02 atmNqryRspn;
    public final static transient String BUSINESS_PROCESS = "catp";
    public final static transient int FUNCTIONALITY = 7;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 2;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {ATMAccountStatement1 .class, ATMAccountStatement2 .class, ATMCommand4Code.class, ATMCommand7 .class, ATMCommandIdentification1 .class, ATMCommandParameters1Choice.class, ATMConfigurationParameter1 .class, ATMContext15 .class, ATMCustomer5 .class, ATMCustomerProfile2 .class, ATMCustomerProfile5 .class, ATMDevice1Code.class, ATMEnvironment12 .class, ATMInquiryResponse2 .class, ATMInquiryResponseV02 .class, ATMMediaMix2 .class, ATMMessageFunction2 .class, ATMService16 .class, ATMService17 .class, ATMService18 .class, ATMService19 .class, ATMServiceType3Code.class, ATMServiceType8Code.class, ATMStatus1Code.class, ATMTransaction21 .class, ATMTransaction8 .class, ATMTransactionAmounts6 .class, ATMTransactionAmounts7 .class, AccountIdentification31Choice.class, Acquirer7 .class, Acquirer8 .class, Action7 .class, ActionMessage4 .class, ActionMessage5 .class, ActionType6Code.class, Algorithm11Code.class, Algorithm12Code.class, Algorithm13Code.class, Algorithm15Code.class, Algorithm7Code.class, Algorithm8Code.class, AlgorithmIdentification11 .class, AlgorithmIdentification12 .class, AlgorithmIdentification13 .class, AlgorithmIdentification14 .class, AlgorithmIdentification15 .class, AmountAndDirection43 .class, AttributeType1Code.class, AuthenticatedData4 .class, AuthenticationEntity2Code.class, AuthenticationMethod7Code.class, AutomatedTellerMachine2 .class, BytePadding1Code.class, CardAccount12 .class, CardAccountType3Code.class, CertificateIssuer1 .class, Commission18 .class, Commission19 .class, ContentInformationType10 .class, ContentInformationType15 .class, ContentType2Code.class, CurrencyAndAmount.class, CurrencyConversion10 .class, CurrencyConversion5 .class, CurrencyConversion9 .class, CurrencyConversionResponse2Code.class, CurrencyDetails2 .class, DataSetCategory7Code.class, EncapsulatedContent3 .class, EncryptedContent3 .class, EncryptionFormat1Code.class, EnvelopedData4 .class, GenericIdentification1 .class, GenericIdentification77 .class, GeographicCoordinates1 .class, GeographicLocation1Choice.class, Header31 .class, IssuerAndSerialNumber1 .class, KEK4 .class, KEKIdentifier2 .class, KeyTransport4 .class, MessageFunction11Code.class, MessageFunction8Code.class, MxCatp00700102 .class, OutputFormat1Code.class, OutputFormat2Code.class, Parameter4 .class, Parameter5 .class, Parameter6 .class, Parameter7 .class, PartyIdentification72Choice.class, PartyType12Code.class, PlainCardData19 .class, PostalAddress17 .class, Recipient4Choice.class, Recipient5Choice.class, RelativeDistinguishedName1 .class, Response4Code.class, ResponseType7 .class, ResultDetail4Code.class, SimpleIdentificationInformation4 .class, TMSContactLevel2Code.class, TerminalHosting1 .class, Traceability4 .class, TransactionEnvironment3Code.class, TransactionIdentifier1 .class, TransactionVerificationResult5 .class, UTMCoordinates1 .class, Verification1Code.class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:catp.007.001.02";

    public MxCatp00700102() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCatp00700102(final String xml) {
        this();
        MxCatp00700102 tmp = parse(xml);
        atmNqryRspn = tmp.getATMNqryRspn();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCatp00700102(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the atmNqryRspn property.
     * 
     * @return
     *     possible object is
     *     {@link ATMInquiryResponseV02 }
     *     
     */
    public ATMInquiryResponseV02 getATMNqryRspn() {
        return atmNqryRspn;
    }

    /**
     * Sets the value of the atmNqryRspn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ATMInquiryResponseV02 }
     *     
     */
    public MxCatp00700102 setATMNqryRspn(ATMInquiryResponseV02 value) {
        this.atmNqryRspn = value;
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
    public static MxCatp00700102 parse(String xml) {
        return ((MxCatp00700102) MxReadImpl.parse(MxCatp00700102 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCatp00700102 parse(String xml, MxRead parserImpl) {
        return ((MxCatp00700102) parserImpl.read(MxCatp00700102 .class, xml, _classes));
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
     * Creates an MxCatp00700102 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCatp00700102 message
     * @return
     *     a new instance of MxCatp00700102
     */
    public final static MxCatp00700102 fromJson(String json) {
        return AbstractMX.fromJson(json, MxCatp00700102 .class);
    }

}
