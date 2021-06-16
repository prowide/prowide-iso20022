
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
 * Class for caaa.002.001.06 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "accptrAuthstnRspn"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:caaa.002.001.06")
public class MxCaaa00200106
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "AccptrAuthstnRspn", required = true)
    protected AcceptorAuthorisationResponseV06 accptrAuthstnRspn;
    public final static transient String BUSINESS_PROCESS = "caaa";
    public final static transient int FUNCTIONALITY = 2;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 6;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AcceptorAuthorisationResponse6 .class, AcceptorAuthorisationResponseV06 .class, Action8 .class, ActionMessage2 .class, ActionMessage5 .class, ActionType7Code.class, Algorithm11Code.class, Algorithm12Code.class, Algorithm13Code.class, Algorithm15Code.class, Algorithm7Code.class, Algorithm8Code.class, AlgorithmIdentification11 .class, AlgorithmIdentification12 .class, AlgorithmIdentification13 .class, AlgorithmIdentification14 .class, AlgorithmIdentification15 .class, AmountAndDirection41 .class, AttributeType1Code.class, AuthenticatedData4 .class, AuthenticationEntity2Code.class, AuthenticationMethod6Code.class, AuthorisationResult10 .class, BytePadding1Code.class, CardAccountType3Code.class, CardPaymentEnvironment65 .class, CardPaymentToken2 .class, CardPaymentTransaction67 .class, CardPaymentTransaction77 .class, CardPaymentTransactionDetails28 .class, CardProductType1Code.class, CertificateIssuer1 .class, Commission18 .class, Commission19 .class, ContentInformationType10 .class, ContentInformationType15 .class, ContentType2Code.class, CurrencyAndAmount.class, CurrencyConversion12 .class, CurrencyDetails1 .class, DetailedAmount15 .class, DetailedAmount4 .class, EncapsulatedContent3 .class, EncryptedContent3 .class, EncryptionFormat1Code.class, EnvelopedData4 .class, GenericIdentification32 .class, GenericIdentification53 .class, GenericIdentification76 .class, GenericIdentification90 .class, GenericIdentification94 .class, Header30 .class, IssuerAndSerialNumber1 .class, KEK4 .class, KEKIdentifier2 .class, KeyTransport4 .class, MessageFunction10Code.class, MxCaaa00200106 .class, NetworkParameters4 .class, NetworkParameters5 .class, NetworkType1Code.class, OriginalAmountDetails1 .class, OutputFormat1Code.class, Parameter4 .class, Parameter5 .class, Parameter6 .class, Parameter7 .class, PartyType14Code.class, PartyType3Code.class, PartyType4Code.class, PaymentCard27 .class, PlainCardData8 .class, Product4 .class, Product5 .class, Recipient4Choice.class, Recipient5Choice.class, RelativeDistinguishedName1 .class, Response4Code.class, ResponseType5 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, TMSContactLevel1Code.class, TMSTrigger1 .class, Traceability5 .class, TransactionIdentifier1 .class, TransactionVerificationResult4 .class, UnitOfMeasure6Code.class, UserInterface4Code.class, Verification1Code.class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:caaa.002.001.06";

    public MxCaaa00200106() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCaaa00200106(final String xml) {
        this();
        MxCaaa00200106 tmp = parse(xml);
        accptrAuthstnRspn = tmp.getAccptrAuthstnRspn();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCaaa00200106(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the accptrAuthstnRspn property.
     * 
     * @return
     *     possible object is
     *     {@link AcceptorAuthorisationResponseV06 }
     *     
     */
    public AcceptorAuthorisationResponseV06 getAccptrAuthstnRspn() {
        return accptrAuthstnRspn;
    }

    /**
     * Sets the value of the accptrAuthstnRspn property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcceptorAuthorisationResponseV06 }
     *     
     */
    public MxCaaa00200106 setAccptrAuthstnRspn(AcceptorAuthorisationResponseV06 value) {
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
    public static MxCaaa00200106 parse(String xml) {
        return ((MxCaaa00200106) MxReadImpl.parse(MxCaaa00200106 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCaaa00200106 parse(String xml, MxRead parserImpl) {
        return ((MxCaaa00200106) parserImpl.read(MxCaaa00200106 .class, xml, _classes));
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
     * Creates an MxCaaa00200106 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCaaa00200106 message
     * @return
     *     a new instance of MxCaaa00200106
     */
    public final static MxCaaa00200106 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxCaaa00200106 .class);
    }

}
