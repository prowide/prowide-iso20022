
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
 * Class for caaa.012.001.03 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "accptrBtchTrfRspn"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:caaa.012.001.03")
public class MxCaaa01200103
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "AccptrBtchTrfRspn", required = true)
    protected AcceptorBatchTransferResponseV03 accptrBtchTrfRspn;
    public static final transient String BUSINESS_PROCESS = "caaa";
    public static final transient int FUNCTIONALITY = 12;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 3;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {AcceptorBatchTransferResponseV03 .class, Algorithm10Code.class, Algorithm4Code.class, Algorithm5Code.class, Algorithm6Code.class, Algorithm7Code.class, Algorithm8Code.class, Algorithm9Code.class, AlgorithmIdentification10 .class, AlgorithmIdentification4 .class, AlgorithmIdentification5 .class, AlgorithmIdentification6 .class, AlgorithmIdentification7 .class, AlgorithmIdentification8 .class, AlgorithmIdentification9 .class, AttributeType1Code.class, AuthenticatedData3 .class, CardPaymentBatchTransferResponse2 .class, CardPaymentDataSet8 .class, CardPaymentDataSet9 .class, CardPaymentEnvironment21 .class, CardPaymentTransactionAdviceResponse5 .class, CertificateIdentifier1 .class, CertificateIssuer1 .class, ContentInformationType7 .class, ContentInformationType9 .class, ContentType1Code.class, DataSetCategory1Code.class, DataSetIdentification1 .class, DigestedData3 .class, EncapsulatedContent2 .class, EncryptedContent2 .class, EnvelopedData3 .class, GenericIdentification32 .class, Header3 .class, IssuerAndSerialNumber1 .class, KEK3 .class, KEKIdentifier1 .class, KeyTransport3 .class, MxCaaa01200103 .class, Parameter1 .class, Parameter2 .class, Parameter3 .class, PartyType3Code.class, PartyType4Code.class, PlainCardData5 .class, Recipient3Choice.class, RelativeDistinguishedName1 .class, Response1Code.class, ResponseType1 .class, SignedData3 .class, Signer2 .class, TransactionIdentifier1 .class, TransactionTotals2 .class, TypeTransactionTotals2Code.class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:caaa.012.001.03";

    public MxCaaa01200103() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCaaa01200103(final String xml) {
        this();
        MxCaaa01200103 tmp = parse(xml);
        accptrBtchTrfRspn = tmp.getAccptrBtchTrfRspn();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCaaa01200103(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the accptrBtchTrfRspn property.
     * 
     * @return
     *     possible object is
     *     {@link AcceptorBatchTransferResponseV03 }
     *     
     */
    public AcceptorBatchTransferResponseV03 getAccptrBtchTrfRspn() {
        return accptrBtchTrfRspn;
    }

    /**
     * Sets the value of the accptrBtchTrfRspn property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcceptorBatchTransferResponseV03 }
     *     
     */
    public MxCaaa01200103 setAccptrBtchTrfRspn(AcceptorBatchTransferResponseV03 value) {
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
    public static MxCaaa01200103 parse(String xml) {
        return ((MxCaaa01200103) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCaaa01200103 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxCaaa01200103 parse(String xml, MxReadConfiguration conf) {
        return ((MxCaaa01200103) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCaaa01200103 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCaaa01200103 parse(String xml, MxRead parserImpl) {
        return ((MxCaaa01200103) parserImpl.read(MxCaaa01200103 .class, xml, _classes));
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
     * Creates an MxCaaa01200103 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCaaa01200103 message
     * @return
     *     a new instance of MxCaaa01200103
     */
    public static final MxCaaa01200103 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxCaaa01200103 .class);
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
