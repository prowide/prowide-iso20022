
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
 * Class for caaa.004.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "accptrCmpltnAdvcRspn"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:caaa.004.001.01")
public class MxCaaa00400101
    extends AbstractMX
{

    @XmlElement(name = "AccptrCmpltnAdvcRspn", required = true)
    protected AcceptorCompletionAdviceResponseV01 accptrCmpltnAdvcRspn;
    public final static transient String BUSINESS_PROCESS = "caaa";
    public final static transient int FUNCTIONALITY = 4;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AcceptorCompletionAdviceResponse1 .class, AcceptorCompletionAdviceResponseV01 .class, Acquirer1 .class, Algorithm1Code.class, AlgorithmIdentification1 .class, AttributeType1Code.class, AuthenticatedData1 .class, CardPaymentEnvironment3 .class, CardPaymentTransactionAdviceResponse1 .class, CertificateIdentifier1 .class, CertificateIssuer1 .class, ContentInformationType1 .class, ContentInformationType3 .class, ContentType1Code.class, DigestedData1 .class, EncapsulatedContent1 .class, EncryptedContent1 .class, EnvelopedData1 .class, GenericIdentification31 .class, GenericIdentification32 .class, Header2 .class, IssuerAndSerialNumber1 .class, KEK1 .class, KEKIdentifier1 .class, KeyTransport1 .class, MessageFunction1Code.class, MxCaaa00400101 .class, NamedKeyEncryptedData1 .class, Parameter1 .class, PartyType3Code.class, PartyType4Code.class, PlainCardData3 .class, Recipient1Choice.class, RelativeDistinguishedName1 .class, Response1Code.class, SignedData1 .class, Signer1 .class, TMSContactLevel1Code.class, TMSTrigger1 .class, Traceability1 .class, TransactionIdentifier1 .class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:caaa.004.001.01";

    public MxCaaa00400101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCaaa00400101(final String xml) {
        this();
        MxCaaa00400101 tmp = parse(xml);
        accptrCmpltnAdvcRspn = tmp.getAccptrCmpltnAdvcRspn();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCaaa00400101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the accptrCmpltnAdvcRspn property.
     * 
     * @return
     *     possible object is
     *     {@link AcceptorCompletionAdviceResponseV01 }
     *     
     */
    public AcceptorCompletionAdviceResponseV01 getAccptrCmpltnAdvcRspn() {
        return accptrCmpltnAdvcRspn;
    }

    /**
     * Sets the value of the accptrCmpltnAdvcRspn property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcceptorCompletionAdviceResponseV01 }
     *     
     */
    public MxCaaa00400101 setAccptrCmpltnAdvcRspn(AcceptorCompletionAdviceResponseV01 value) {
        this.accptrCmpltnAdvcRspn = value;
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
    public static MxCaaa00400101 parse(String xml) {
        return ((MxCaaa00400101) MxReadImpl.parse(MxCaaa00400101 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCaaa00400101 parse(String xml, MxRead parserImpl) {
        return ((MxCaaa00400101) parserImpl.read(MxCaaa00400101 .class, xml, _classes));
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
     * Creates an MxCaaa00400101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCaaa00400101 message
     * @return
     *     a new instance of MxCaaa00400101
     */
    public final static MxCaaa00400101 fromJson(String json) {
        return AbstractMX.fromJson(json, MxCaaa00400101 .class);
    }

}
