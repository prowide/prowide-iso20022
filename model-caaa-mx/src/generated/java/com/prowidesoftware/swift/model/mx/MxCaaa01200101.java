
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
 * Class for caaa.012.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "accptrBtchTrfRspn"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:caaa.012.001.01")
public class MxCaaa01200101
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "AccptrBtchTrfRspn", required = true)
    protected AcceptorBatchTransferResponseV01 accptrBtchTrfRspn;
    public final static transient String BUSINESS_PROCESS = "caaa";
    public final static transient int FUNCTIONALITY = 12;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AcceptorBatchTransferResponseV01 .class, Acquirer1 .class, Algorithm1Code.class, AlgorithmIdentification1 .class, AttributeType1Code.class, AuthenticatedData1 .class, CardPaymentDataSet2 .class, CardPaymentDataSet3 .class, CardPaymentEnvironment3 .class, CardPaymentTransactionAdviceResponse1 .class, CertificateIdentifier1 .class, CertificateIssuer1 .class, ContentInformationType1 .class, ContentType1Code.class, DataSetCategory1Code.class, DataSetIdentification1 .class, DigestedData1 .class, EncapsulatedContent1 .class, EncryptedContent1 .class, EnvelopedData1 .class, GenericIdentification32 .class, Header3 .class, IssuerAndSerialNumber1 .class, KEK1 .class, KEKIdentifier1 .class, KeyTransport1 .class, MxCaaa01200101 .class, NamedKeyEncryptedData1 .class, Parameter1 .class, PartyType3Code.class, PartyType4Code.class, PlainCardData3 .class, Recipient1Choice.class, RelativeDistinguishedName1 .class, Response1Code.class, ResponseType1 .class, SignedData1 .class, Signer1 .class, TransactionIdentifier1 .class, TransactionTotals1 .class, TypeTransactionTotals1Code.class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:caaa.012.001.01";

    public MxCaaa01200101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCaaa01200101(final String xml) {
        this();
        MxCaaa01200101 tmp = parse(xml);
        accptrBtchTrfRspn = tmp.getAccptrBtchTrfRspn();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCaaa01200101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the accptrBtchTrfRspn property.
     * 
     * @return
     *     possible object is
     *     {@link AcceptorBatchTransferResponseV01 }
     *     
     */
    public AcceptorBatchTransferResponseV01 getAccptrBtchTrfRspn() {
        return accptrBtchTrfRspn;
    }

    /**
     * Sets the value of the accptrBtchTrfRspn property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcceptorBatchTransferResponseV01 }
     *     
     */
    public MxCaaa01200101 setAccptrBtchTrfRspn(AcceptorBatchTransferResponseV01 value) {
        this.accptrBtchTrfRspn = value;
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
    public static MxCaaa01200101 parse(String xml) {
        return ((MxCaaa01200101) MxReadImpl.parse(MxCaaa01200101 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCaaa01200101 parse(String xml, MxRead parserImpl) {
        return ((MxCaaa01200101) parserImpl.read(MxCaaa01200101 .class, xml, _classes));
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
     * Creates an MxCaaa01200101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCaaa01200101 message
     * @return
     *     a new instance of MxCaaa01200101
     */
    public final static MxCaaa01200101 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxCaaa01200101 .class);
    }

}
