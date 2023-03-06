
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
 * Class for catp.008.001.02 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "atmCmpltnAdvc"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:catp.008.001.02")
public class MxCatp00800102
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "ATMCmpltnAdvc", required = true)
    protected ATMCompletionAdviceV02 atmCmpltnAdvc;
    public final static transient String BUSINESS_PROCESS = "catp";
    public final static transient int FUNCTIONALITY = 8;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 2;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {ATMCompletionAdvice2 .class, ATMCompletionAdviceV02 .class, ATMConfigurationParameter1 .class, ATMContext13 .class, ATMCustomer6 .class, ATMCustomerProfile1Code.class, ATMCustomerProfile4 .class, ATMDevice1Code.class, ATMEnvironment13 .class, ATMEquipment1 .class, ATMMediaType1Code.class, ATMMediaType2Code.class, ATMMessageFunction2 .class, ATMService14 .class, ATMServiceType7Code.class, ATMTransaction20 .class, ATMTransactionStatus1Code.class, Acquirer7 .class, Action7 .class, ActionMessage4 .class, ActionType6Code.class, Algorithm11Code.class, Algorithm12Code.class, Algorithm13Code.class, Algorithm15Code.class, Algorithm7Code.class, Algorithm8Code.class, AlgorithmIdentification11 .class, AlgorithmIdentification12 .class, AlgorithmIdentification13 .class, AlgorithmIdentification14 .class, AlgorithmIdentification15 .class, AttributeType1Code.class, AuthenticatedData4 .class, AuthenticationEntity2Code.class, AuthenticationMethod7Code.class, AuthorisationResult13 .class, AutomatedTellerMachine9 .class, BytePadding1Code.class, CardDataReading1Code.class, CardDataReading4Code.class, CardFallback1Code.class, CardholderVerificationCapability3Code.class, CertificateIssuer1 .class, ContentInformationType10 .class, ContentInformationType15 .class, ContentType2Code.class, CurrencyAndAmount.class, DataSetCategory7Code.class, DisplayCapabilities5 .class, EncapsulatedContent3 .class, EncryptedContent3 .class, EncryptionFormat1Code.class, EnvelopedData4 .class, FailureReason7Code.class, GenericIdentification77 .class, GeographicCoordinates1 .class, GeographicLocation1Choice.class, Header32 .class, IssuerAndSerialNumber1 .class, KEK4 .class, KEKIdentifier2 .class, KeyTransport4 .class, MessageFunction11Code.class, MxCatp00800102 .class, OutputFormat1Code.class, OutputFormat2Code.class, Parameter4 .class, Parameter5 .class, Parameter6 .class, Parameter7 .class, PartyType12Code.class, PartyType16Code.class, PaymentCard23 .class, PlainCardData19 .class, PointOfInteractionCapabilities7 .class, PostalAddress17 .class, Recipient4Choice.class, Recipient5Choice.class, RelativeDistinguishedName1 .class, Response4Code.class, ResponseType7 .class, ResponseType8 .class, ResultDetail4Code.class, TerminalHosting1 .class, Traceability4 .class, TransactionEnvironment2Code.class, TransactionEnvironment3Code.class, TransactionIdentifier1 .class, TransactionVerificationResult5 .class, UTMCoordinates1 .class, UserInterface5Code.class, Verification1Code.class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:catp.008.001.02";

    public MxCatp00800102() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCatp00800102(final String xml) {
        this();
        MxCatp00800102 tmp = parse(xml);
        atmCmpltnAdvc = tmp.getATMCmpltnAdvc();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCatp00800102(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the atmCmpltnAdvc property.
     * 
     * @return
     *     possible object is
     *     {@link ATMCompletionAdviceV02 }
     *     
     */
    public ATMCompletionAdviceV02 getATMCmpltnAdvc() {
        return atmCmpltnAdvc;
    }

    /**
     * Sets the value of the atmCmpltnAdvc property.
     * 
     * @param value
     *     allowed object is
     *     {@link ATMCompletionAdviceV02 }
     *     
     */
    public MxCatp00800102 setATMCmpltnAdvc(ATMCompletionAdviceV02 value) {
        this.atmCmpltnAdvc = value;
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
    public static MxCatp00800102 parse(String xml) {
        return ((MxCatp00800102) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCatp00800102 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxCatp00800102 parse(String xml, MxReadConfiguration conf) {
        return ((MxCatp00800102) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCatp00800102 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCatp00800102 parse(String xml, MxRead parserImpl) {
        return ((MxCatp00800102) parserImpl.read(MxCatp00800102 .class, xml, _classes));
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
     * Creates an MxCatp00800102 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCatp00800102 message
     * @return
     *     a new instance of MxCatp00800102
     */
    public final static MxCatp00800102 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxCatp00800102 .class);
    }

}
