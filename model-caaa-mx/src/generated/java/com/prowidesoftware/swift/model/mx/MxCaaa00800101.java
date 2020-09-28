
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
 * Class for caaa.008.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "accptrCxlAdvcRspn"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:caaa.008.001.01")
public class MxCaaa00800101
    extends AbstractMX
{

    @XmlElement(name = "AccptrCxlAdvcRspn", required = true)
    protected AcceptorCancellationAdviceResponseV01 accptrCxlAdvcRspn;
    public final static transient String BUSINESS_PROCESS = "caaa";
    public final static transient int FUNCTIONALITY = 8;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AcceptorCancellationAdviceResponse1 .class, AcceptorCancellationAdviceResponseV01 .class, Acquirer1 .class, Algorithm1Code.class, AlgorithmIdentification1 .class, AttributeType1Code.class, AuthenticatedData1 .class, CardPaymentEnvironment3 .class, CardPaymentTransactionAdviceResponse2 .class, CertificateIdentifier1 .class, CertificateIssuer1 .class, ContentInformationType1 .class, ContentInformationType3 .class, ContentType1Code.class, DigestedData1 .class, EncapsulatedContent1 .class, EncryptedContent1 .class, EnvelopedData1 .class, GenericIdentification31 .class, GenericIdentification32 .class, Header2 .class, IssuerAndSerialNumber1 .class, KEK1 .class, KEKIdentifier1 .class, KeyTransport1 .class, MessageFunction1Code.class, MxCaaa00800101 .class, NamedKeyEncryptedData1 .class, Parameter1 .class, PartyType3Code.class, PartyType4Code.class, PlainCardData3 .class, Recipient1Choice.class, RelativeDistinguishedName1 .class, SignedData1 .class, Signer1 .class, TMSContactLevel1Code.class, TMSTrigger1 .class, Traceability1 .class, TransactionIdentifier1 .class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:caaa.008.001.01";

    public MxCaaa00800101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCaaa00800101(final String xml) {
        this();
        MxCaaa00800101 tmp = parse(xml);
        accptrCxlAdvcRspn = tmp.getAccptrCxlAdvcRspn();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCaaa00800101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the accptrCxlAdvcRspn property.
     * 
     * @return
     *     possible object is
     *     {@link AcceptorCancellationAdviceResponseV01 }
     *     
     */
    public AcceptorCancellationAdviceResponseV01 getAccptrCxlAdvcRspn() {
        return accptrCxlAdvcRspn;
    }

    /**
     * Sets the value of the accptrCxlAdvcRspn property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcceptorCancellationAdviceResponseV01 }
     *     
     */
    public MxCaaa00800101 setAccptrCxlAdvcRspn(AcceptorCancellationAdviceResponseV01 value) {
        this.accptrCxlAdvcRspn = value;
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
    public static MxCaaa00800101 parse(String xml) {
        return ((MxCaaa00800101) MxReadImpl.parse(MxCaaa00800101 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCaaa00800101 parse(String xml, MxRead parserImpl) {
        return ((MxCaaa00800101) parserImpl.read(MxCaaa00800101 .class, xml, _classes));
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
     * Creates an MxCaaa00800101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCaaa00800101 message
     * @return
     *     a new instance of MxCaaa00800101
     */
    public final static MxCaaa00800101 fromJson(String json) {
        return AbstractMX.fromJson(json, MxCaaa00800101 .class);
    }

}
