
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
 * Class for caaa.012.001.07 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "accptrBtchTrfRspn"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:caaa.012.001.07")
public class MxCaaa01200107
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "AccptrBtchTrfRspn", required = true)
    protected AcceptorBatchTransferResponseV07 accptrBtchTrfRspn;
    public static final transient String BUSINESS_PROCESS = "caaa";
    public static final transient int FUNCTIONALITY = 12;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 7;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {AcceptorBatchTransferResponseV07 .class, Algorithm16Code.class, Algorithm17Code.class, Algorithm18Code.class, Algorithm7Code.class, Algorithm8Code.class, AlgorithmIdentification18 .class, AlgorithmIdentification19 .class, AlgorithmIdentification22 .class, AlgorithmIdentification23 .class, AlgorithmIdentification24 .class, AttributeType1Code.class, AuthenticatedData5 .class, BytePadding1Code.class, CardPaymentBatchTransferResponse6 .class, CardPaymentDataSet20 .class, CardPaymentDataSet21 .class, CardPaymentEnvironment69 .class, CardPaymentToken4 .class, CardPaymentTransactionAdviceResponse5 .class, CardProductType1Code.class, CertificateIssuer1 .class, ContentInformationType16 .class, ContentInformationType17 .class, ContentType2Code.class, DataSetCategory8Code.class, DataSetIdentification5 .class, EncapsulatedContent3 .class, EncryptedContent4 .class, EncryptionFormat2Code.class, EnvelopedData5 .class, GenericIdentification32 .class, GenericIdentification53 .class, GenericIdentification94 .class, Header25 .class, IssuerAndSerialNumber1 .class, KEK5 .class, KEKIdentifier2 .class, KeyTransport5 .class, MxCaaa01200107 .class, NetworkParameters4 .class, NetworkParameters5 .class, NetworkType1Code.class, OriginatorInformation1 .class, Parameter10 .class, Parameter12 .class, Parameter7 .class, Parameter9 .class, PartyType3Code.class, PartyType4Code.class, PaymentCard28 .class, PaymentTokenIdentifiers1 .class, PlainCardData15 .class, Recipient5Choice.class, Recipient6Choice.class, RelativeDistinguishedName1 .class, Response1Code.class, Response4Code.class, ResponseType1 .class, ResponseType5 .class, TransactionIdentifier1 .class, TransactionTotals7 .class, TypeTransactionTotals2Code.class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:caaa.012.001.07";

    public MxCaaa01200107() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCaaa01200107(final String xml) {
        this();
        MxCaaa01200107 tmp = parse(xml);
        accptrBtchTrfRspn = tmp.getAccptrBtchTrfRspn();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCaaa01200107(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the accptrBtchTrfRspn property.
     * 
     * @return
     *     possible object is
     *     {@link AcceptorBatchTransferResponseV07 }
     *     
     */
    public AcceptorBatchTransferResponseV07 getAccptrBtchTrfRspn() {
        return accptrBtchTrfRspn;
    }

    /**
     * Sets the value of the accptrBtchTrfRspn property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcceptorBatchTransferResponseV07 }
     *     
     */
    public MxCaaa01200107 setAccptrBtchTrfRspn(AcceptorBatchTransferResponseV07 value) {
        this.accptrBtchTrfRspn = value;
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
    public static MxCaaa01200107 parse(String xml) {
        return ((MxCaaa01200107) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCaaa01200107 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxCaaa01200107 parse(String xml, MxReadConfiguration conf) {
        return ((MxCaaa01200107) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCaaa01200107 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCaaa01200107 parse(String xml, MxRead parserImpl) {
        return ((MxCaaa01200107) parserImpl.read(MxCaaa01200107 .class, xml, _classes));
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
     * Creates an MxCaaa01200107 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCaaa01200107 message
     * @return
     *     a new instance of MxCaaa01200107
     */
    public static final MxCaaa01200107 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxCaaa01200107 .class);
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
