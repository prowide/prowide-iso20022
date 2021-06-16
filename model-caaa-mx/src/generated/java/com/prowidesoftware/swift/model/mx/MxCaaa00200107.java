
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
 * Class for caaa.002.001.07 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "accptrAuthstnRspn"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:caaa.002.001.07")
public class MxCaaa00200107
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "AccptrAuthstnRspn", required = true)
    protected AcceptorAuthorisationResponseV07 accptrAuthstnRspn;
    public final static transient String BUSINESS_PROCESS = "caaa";
    public final static transient int FUNCTIONALITY = 2;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 7;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AcceptorAuthorisationResponse7 .class, AcceptorAuthorisationResponseV07 .class, Action8 .class, ActionMessage2 .class, ActionMessage5 .class, ActionType7Code.class, Algorithm16Code.class, Algorithm17Code.class, Algorithm18Code.class, Algorithm7Code.class, Algorithm8Code.class, AlgorithmIdentification18 .class, AlgorithmIdentification19 .class, AlgorithmIdentification22 .class, AlgorithmIdentification23 .class, AlgorithmIdentification24 .class, AmountAndDirection93 .class, AttributeType1Code.class, AuthenticatedData5 .class, AuthenticationEntity2Code.class, AuthenticationMethod6Code.class, AuthorisationResult10 .class, BytePadding1Code.class, CardAccountType3Code.class, CardPaymentEnvironment69 .class, CardPaymentToken4 .class, CardPaymentTransaction77 .class, CardPaymentTransaction84 .class, CardPaymentTransactionDetails28 .class, CardProductType1Code.class, CertificateIssuer1 .class, Commission18 .class, Commission19 .class, ContentInformationType16 .class, ContentInformationType17 .class, ContentType2Code.class, CurrencyConversion14 .class, CurrencyDetails2 .class, CurrencyDetails3 .class, DetailedAmount15 .class, DetailedAmount4 .class, EncapsulatedContent3 .class, EncryptedContent4 .class, EncryptionFormat2Code.class, EnvelopedData5 .class, GenericIdentification32 .class, GenericIdentification53 .class, GenericIdentification76 .class, GenericIdentification90 .class, GenericIdentification94 .class, Header35 .class, IssuerAndSerialNumber1 .class, KEK5 .class, KEKIdentifier2 .class, KeyTransport5 .class, MessageFunction14Code.class, MxCaaa00200107 .class, NetworkParameters4 .class, NetworkParameters5 .class, NetworkType1Code.class, OriginalAmountDetails1 .class, OriginatorInformation1 .class, OutputFormat1Code.class, Parameter10 .class, Parameter12 .class, Parameter7 .class, Parameter9 .class, PartyType14Code.class, PartyType3Code.class, PartyType4Code.class, PaymentCard28 .class, PaymentTokenIdentifiers1 .class, PlainCardData15 .class, Product4 .class, Product5 .class, Recipient5Choice.class, Recipient6Choice.class, RelativeDistinguishedName1 .class, Response4Code.class, ResponseType5 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, TMSContactLevel1Code.class, TMSTrigger1 .class, Traceability5 .class, TransactionIdentifier1 .class, TransactionVerificationResult4 .class, UnitOfMeasure6Code.class, UserInterface4Code.class, Verification1Code.class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:caaa.002.001.07";

    public MxCaaa00200107() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCaaa00200107(final String xml) {
        this();
        MxCaaa00200107 tmp = parse(xml);
        accptrAuthstnRspn = tmp.getAccptrAuthstnRspn();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCaaa00200107(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the accptrAuthstnRspn property.
     * 
     * @return
     *     possible object is
     *     {@link AcceptorAuthorisationResponseV07 }
     *     
     */
    public AcceptorAuthorisationResponseV07 getAccptrAuthstnRspn() {
        return accptrAuthstnRspn;
    }

    /**
     * Sets the value of the accptrAuthstnRspn property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcceptorAuthorisationResponseV07 }
     *     
     */
    public MxCaaa00200107 setAccptrAuthstnRspn(AcceptorAuthorisationResponseV07 value) {
        this.accptrAuthstnRspn = value;
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
    public static MxCaaa00200107 parse(String xml) {
        return ((MxCaaa00200107) MxReadImpl.parse(MxCaaa00200107 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCaaa00200107 parse(String xml, MxRead parserImpl) {
        return ((MxCaaa00200107) parserImpl.read(MxCaaa00200107 .class, xml, _classes));
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
     * Creates an MxCaaa00200107 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCaaa00200107 message
     * @return
     *     a new instance of MxCaaa00200107
     */
    public final static MxCaaa00200107 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxCaaa00200107 .class);
    }

}
