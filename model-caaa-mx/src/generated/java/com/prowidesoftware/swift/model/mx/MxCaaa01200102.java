
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
 * Class for caaa.012.001.02 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "accptrBtchTrfRspn"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:caaa.012.001.02")
public class MxCaaa01200102
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "AccptrBtchTrfRspn", required = true)
    protected AcceptorBatchTransferResponseV02 accptrBtchTrfRspn;
    public static final transient String BUSINESS_PROCESS = "caaa";
    public static final transient int FUNCTIONALITY = 12;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 2;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {AcceptorBatchTransferResponseV02 .class, Algorithm2Code.class, Algorithm3Code.class, Algorithm4Code.class, Algorithm5Code.class, Algorithm6Code.class, Algorithm7Code.class, Algorithm8Code.class, AlgorithmIdentification2 .class, AlgorithmIdentification3 .class, AlgorithmIdentification4 .class, AlgorithmIdentification5 .class, AlgorithmIdentification6 .class, AlgorithmIdentification7 .class, AlgorithmIdentification8 .class, AttributeType1Code.class, AuthenticatedData2 .class, CardPaymentBatchTransferResponse1 .class, CardPaymentDataSet5 .class, CardPaymentDataSet6 .class, CardPaymentEnvironment11 .class, CardPaymentTransactionAdviceResponse1 .class, CertificateIdentifier1 .class, CertificateIssuer1 .class, ContentInformationType4 .class, ContentInformationType5 .class, ContentType1Code.class, DataSetCategory1Code.class, DataSetIdentification1 .class, DigestedData2 .class, EncapsulatedContent1 .class, EncryptedContent2 .class, EnvelopedData2 .class, GenericIdentification32 .class, Header3 .class, IssuerAndSerialNumber1 .class, KEK2 .class, KEKIdentifier1 .class, KeyTransport2 .class, MxCaaa01200102 .class, NamedKeyEncryptedData2 .class, Parameter1 .class, Parameter2 .class, Parameter3 .class, PartyType3Code.class, PartyType4Code.class, PlainCardData3 .class, Recipient2Choice.class, RelativeDistinguishedName1 .class, Response1Code.class, ResponseType1 .class, SignedData2 .class, Signer2 .class, TransactionIdentifier1 .class, TransactionTotals2 .class, TypeTransactionTotals2Code.class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:caaa.012.001.02";

    public MxCaaa01200102() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCaaa01200102(final String xml) {
        this();
        MxCaaa01200102 tmp = parse(xml);
        accptrBtchTrfRspn = tmp.getAccptrBtchTrfRspn();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCaaa01200102(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the accptrBtchTrfRspn property.
     * 
     * @return
     *     possible object is
     *     {@link AcceptorBatchTransferResponseV02 }
     *     
     */
    public AcceptorBatchTransferResponseV02 getAccptrBtchTrfRspn() {
        return accptrBtchTrfRspn;
    }

    /**
     * Sets the value of the accptrBtchTrfRspn property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcceptorBatchTransferResponseV02 }
     *     
     */
    public MxCaaa01200102 setAccptrBtchTrfRspn(AcceptorBatchTransferResponseV02 value) {
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
    public static MxCaaa01200102 parse(String xml) {
        return ((MxCaaa01200102) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCaaa01200102 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxCaaa01200102 parse(String xml, MxReadConfiguration conf) {
        return ((MxCaaa01200102) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCaaa01200102 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCaaa01200102 parse(String xml, MxRead parserImpl) {
        return ((MxCaaa01200102) parserImpl.read(MxCaaa01200102 .class, xml, _classes));
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
     * Creates an MxCaaa01200102 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCaaa01200102 message
     * @return
     *     a new instance of MxCaaa01200102
     */
    public static final MxCaaa01200102 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxCaaa01200102 .class);
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
