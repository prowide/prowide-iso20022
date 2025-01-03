
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
 * Class for cain.004.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "acqrrFinRspn"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:cain.004.001.01")
public class MxCain00400101
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "AcqrrFinRspn", required = true)
    protected AcquirerFinancialResponse acqrrFinRspn;
    public static final transient String BUSINESS_PROCESS = "cain";
    public static final transient int FUNCTIONALITY = 4;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {AccountIdentification30Choice.class, AcquirerFinancialResponse.class, AcquirerFinancialResponse1 .class, Action4 .class, ActionMessage2 .class, ActionMessage3 .class, ActionType5Code.class, AddressType2Code.class, Algorithm11Code.class, Algorithm12Code.class, Algorithm13Code.class, Algorithm15Code.class, Algorithm7Code.class, Algorithm8Code.class, AlgorithmIdentification11 .class, AlgorithmIdentification12 .class, AlgorithmIdentification13 .class, AlgorithmIdentification14 .class, AlgorithmIdentification15 .class, AmountAndDirection41 .class, AttributeType1Code.class, AuthenticatedData4 .class, AuthenticationEntity2Code.class, AuthenticationMethod6Code.class, AuthorisationResult8 .class, BytePadding1Code.class, CardAccount2 .class, CardAccountType2Code.class, CardPaymentServiceType7Code.class, CardPaymentToken2 .class, CardProductType1Code.class, CardTransaction6 .class, CardTransactionAmount4 .class, CardTransactionCondition1 .class, CardTransactionContext3 .class, CardTransactionContext4 .class, CardTransactionDetail4 .class, CardTransactionEnvironment2 .class, CertificateIssuer1 .class, ContentInformationType10 .class, ContentInformationType15 .class, ContentType2Code.class, CurrencyAndAmount.class, DetailedAmount10 .class, DetailedAmount11 .class, DetailedAmount8 .class, DetailedAmount9 .class, EncapsulatedContent3 .class, EncryptedContent3 .class, EncryptionFormat1Code.class, EnvelopedData4 .class, GenericIdentification1 .class, GenericIdentification73 .class, GenericIdentification74 .class, GenericIdentification75 .class, Header17 .class, IssuerAndSerialNumber1 .class, KEK4 .class, KEKIdentifier2 .class, KeyTransport4 .class, MessageFunction6Code.class, MxCain00400101 .class, NameAndAddress3 .class, OutputFormat1Code.class, Parameter4 .class, Parameter5 .class, Parameter6 .class, Parameter7 .class, PartyIdentification72Choice.class, PartyType10Code.class, PartyType11Code.class, PartyType9Code.class, PaymentCard13 .class, PlainCardData9 .class, PostalAddress1 .class, PostalAddress18 .class, Recipient4Choice.class, Recipient5Choice.class, RelativeDistinguishedName1 .class, Response3Code.class, ResponseType2 .class, ResultDetail1Code.class, Traceability3 .class, TrackData1 .class, TransactionIdentifier2 .class, TransactionVerificationResult4 .class, TypeOfAmount5Code.class, TypeOfAmount6Code.class, TypeOfAmount7Code.class, UserInterface3Code.class, UserInterface4Code.class, Verification1Code.class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:cain.004.001.01";

    public MxCain00400101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCain00400101(final String xml) {
        this();
        MxCain00400101 tmp = parse(xml);
        acqrrFinRspn = tmp.getAcqrrFinRspn();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCain00400101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the acqrrFinRspn property.
     * 
     * @return
     *     possible object is
     *     {@link AcquirerFinancialResponse }
     *     
     */
    public AcquirerFinancialResponse getAcqrrFinRspn() {
        return acqrrFinRspn;
    }

    /**
     * Sets the value of the acqrrFinRspn property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcquirerFinancialResponse }
     *     
     */
    public MxCain00400101 setAcqrrFinRspn(AcquirerFinancialResponse value) {
        this.acqrrFinRspn = value;
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
    public static MxCain00400101 parse(String xml) {
        return ((MxCain00400101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCain00400101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxCain00400101 parse(String xml, MxReadConfiguration conf) {
        return ((MxCain00400101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCain00400101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCain00400101 parse(String xml, MxRead parserImpl) {
        return ((MxCain00400101) parserImpl.read(MxCain00400101 .class, xml, _classes));
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
     * Creates an MxCain00400101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCain00400101 message
     * @return
     *     a new instance of MxCain00400101
     */
    public static final MxCain00400101 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxCain00400101 .class);
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
