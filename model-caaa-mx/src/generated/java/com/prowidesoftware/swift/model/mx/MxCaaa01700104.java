
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
 * Class for caaa.017.001.04 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "accptrCcyConvsRspn"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:caaa.017.001.04")
public class MxCaaa01700104
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "AccptrCcyConvsRspn", required = true)
    protected AcceptorCurrencyConversionResponseV04 accptrCcyConvsRspn;
    public final static transient String BUSINESS_PROCESS = "caaa";
    public final static transient int FUNCTIONALITY = 17;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 4;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AcceptorCurrencyConversionResponse4 .class, AcceptorCurrencyConversionResponseV04 .class, ActionMessage5 .class, Algorithm11Code.class, Algorithm12Code.class, Algorithm13Code.class, Algorithm15Code.class, Algorithm7Code.class, Algorithm8Code.class, AlgorithmIdentification11 .class, AlgorithmIdentification12 .class, AlgorithmIdentification13 .class, AlgorithmIdentification14 .class, AlgorithmIdentification15 .class, AttributeType1Code.class, AuthenticatedData4 .class, BytePadding1Code.class, CardAccountType3Code.class, CardPaymentEnvironment65 .class, CardPaymentToken2 .class, CardPaymentTransaction77 .class, CardPaymentTransactionDetails28 .class, CardProductType1Code.class, CertificateIssuer1 .class, Commission18 .class, Commission19 .class, ContentInformationType10 .class, ContentInformationType15 .class, ContentType2Code.class, CurrencyConversion11 .class, CurrencyConversion12 .class, CurrencyConversionResponse3Code.class, CurrencyDetails1 .class, DetailedAmount15 .class, DetailedAmount4 .class, EncapsulatedContent3 .class, EncryptedContent3 .class, EncryptionFormat1Code.class, EnvelopedData4 .class, GenericIdentification32 .class, GenericIdentification53 .class, GenericIdentification76 .class, GenericIdentification94 .class, Header30 .class, IssuerAndSerialNumber1 .class, KEK4 .class, KEKIdentifier2 .class, KeyTransport4 .class, MessageFunction10Code.class, MxCaaa01700104 .class, NetworkParameters4 .class, NetworkParameters5 .class, NetworkType1Code.class, OriginalAmountDetails1 .class, OutputFormat1Code.class, Parameter4 .class, Parameter5 .class, Parameter6 .class, Parameter7 .class, PartyType3Code.class, PartyType4Code.class, PaymentCard27 .class, PlainCardData8 .class, Recipient4Choice.class, Recipient5Choice.class, RelativeDistinguishedName1 .class, Traceability5 .class, TransactionIdentifier1 .class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:caaa.017.001.04";

    public MxCaaa01700104() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCaaa01700104(final String xml) {
        this();
        MxCaaa01700104 tmp = parse(xml);
        accptrCcyConvsRspn = tmp.getAccptrCcyConvsRspn();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCaaa01700104(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the accptrCcyConvsRspn property.
     * 
     * @return
     *     possible object is
     *     {@link AcceptorCurrencyConversionResponseV04 }
     *     
     */
    public AcceptorCurrencyConversionResponseV04 getAccptrCcyConvsRspn() {
        return accptrCcyConvsRspn;
    }

    /**
     * Sets the value of the accptrCcyConvsRspn property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcceptorCurrencyConversionResponseV04 }
     *     
     */
    public MxCaaa01700104 setAccptrCcyConvsRspn(AcceptorCurrencyConversionResponseV04 value) {
        this.accptrCcyConvsRspn = value;
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
    public static MxCaaa01700104 parse(String xml) {
        return ((MxCaaa01700104) MxReadImpl.parse(MxCaaa01700104 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCaaa01700104 parse(String xml, MxRead parserImpl) {
        return ((MxCaaa01700104) parserImpl.read(MxCaaa01700104 .class, xml, _classes));
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
     * Creates an MxCaaa01700104 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCaaa01700104 message
     * @return
     *     a new instance of MxCaaa01700104
     */
    public final static MxCaaa01700104 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxCaaa01700104 .class);
    }

}
