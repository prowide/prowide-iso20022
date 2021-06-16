
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
 * Class for caaa.006.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "accptrCxlRspn"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:caaa.006.001.01")
public class MxCaaa00600101
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "AccptrCxlRspn", required = true)
    protected AcceptorCancellationResponseV01 accptrCxlRspn;
    public final static transient String BUSINESS_PROCESS = "caaa";
    public final static transient int FUNCTIONALITY = 6;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AcceptorCancellationResponse1 .class, AcceptorCancellationResponseV01 .class, Acquirer1 .class, Action1 .class, ActionMessage1 .class, ActionType1Code.class, Algorithm1Code.class, AlgorithmIdentification1 .class, AttributeType1Code.class, AuthenticatedData1 .class, AuthorisationResult1 .class, CardPaymentEnvironment3 .class, CardPaymentTransaction10 .class, CardPaymentTransaction6 .class, CardPaymentTransactionDetails6 .class, CertificateIdentifier1 .class, CertificateIssuer1 .class, ContentInformationType1 .class, ContentInformationType3 .class, ContentType1Code.class, DigestedData1 .class, EncapsulatedContent1 .class, EncryptedContent1 .class, EnvelopedData1 .class, GenericIdentification31 .class, GenericIdentification32 .class, GenericIdentification33 .class, Header1 .class, IssuerAndSerialNumber1 .class, KEK1 .class, KEKIdentifier1 .class, KeyTransport1 .class, MessageFunction1Code.class, MxCaaa00600101 .class, NamedKeyEncryptedData1 .class, Parameter1 .class, PartyType3Code.class, PartyType4Code.class, PlainCardData3 .class, Recipient1Choice.class, RelativeDistinguishedName1 .class, Response1Code.class, ResponseType1 .class, SignedData1 .class, Signer1 .class, TMSContactLevel1Code.class, TMSTrigger1 .class, Traceability1 .class, TransactionIdentifier1 .class, UserInterface1Code.class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:caaa.006.001.01";

    public MxCaaa00600101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCaaa00600101(final String xml) {
        this();
        MxCaaa00600101 tmp = parse(xml);
        accptrCxlRspn = tmp.getAccptrCxlRspn();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCaaa00600101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the accptrCxlRspn property.
     * 
     * @return
     *     possible object is
     *     {@link AcceptorCancellationResponseV01 }
     *     
     */
    public AcceptorCancellationResponseV01 getAccptrCxlRspn() {
        return accptrCxlRspn;
    }

    /**
     * Sets the value of the accptrCxlRspn property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcceptorCancellationResponseV01 }
     *     
     */
    public MxCaaa00600101 setAccptrCxlRspn(AcceptorCancellationResponseV01 value) {
        this.accptrCxlRspn = value;
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
    public static MxCaaa00600101 parse(String xml) {
        return ((MxCaaa00600101) MxReadImpl.parse(MxCaaa00600101 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCaaa00600101 parse(String xml, MxRead parserImpl) {
        return ((MxCaaa00600101) parserImpl.read(MxCaaa00600101 .class, xml, _classes));
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
     * Creates an MxCaaa00600101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCaaa00600101 message
     * @return
     *     a new instance of MxCaaa00600101
     */
    public final static MxCaaa00600101 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxCaaa00600101 .class);
    }

}
