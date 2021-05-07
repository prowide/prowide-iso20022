
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
 * Class for caaa.004.001.02 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "accptrCmpltnAdvcRspn"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:caaa.004.001.02")
public class MxCaaa00400102
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "AccptrCmpltnAdvcRspn", required = true)
    protected AcceptorCompletionAdviceResponseV02 accptrCmpltnAdvcRspn;
    public final static transient String BUSINESS_PROCESS = "caaa";
    public final static transient int FUNCTIONALITY = 4;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 2;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AcceptorCompletionAdviceResponse2 .class, AcceptorCompletionAdviceResponseV02 .class, Algorithm2Code.class, Algorithm3Code.class, Algorithm5Code.class, Algorithm6Code.class, Algorithm7Code.class, Algorithm8Code.class, AlgorithmIdentification2 .class, AlgorithmIdentification3 .class, AlgorithmIdentification6 .class, AlgorithmIdentification7 .class, AlgorithmIdentification8 .class, AttributeType1Code.class, AuthenticatedData2 .class, CardPaymentEnvironment11 .class, CardPaymentTransactionAdviceResponse3 .class, CertificateIdentifier1 .class, CertificateIssuer1 .class, ContentInformationType5 .class, ContentInformationType6 .class, ContentType1Code.class, EncapsulatedContent1 .class, EncryptedContent2 .class, EnvelopedData2 .class, GenericIdentification31 .class, GenericIdentification32 .class, Header2 .class, IssuerAndSerialNumber1 .class, KEK2 .class, KEKIdentifier1 .class, KeyTransport2 .class, MessageFunction1Code.class, MxCaaa00400102 .class, Parameter1 .class, Parameter2 .class, Parameter3 .class, PartyType3Code.class, PartyType4Code.class, PlainCardData3 .class, Recipient2Choice.class, RelativeDistinguishedName1 .class, Response1Code.class, TMSContactLevel1Code.class, TMSTrigger1 .class, Traceability1 .class, TransactionIdentifier1 .class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:caaa.004.001.02";

    public MxCaaa00400102() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCaaa00400102(final String xml) {
        this();
        MxCaaa00400102 tmp = parse(xml);
        accptrCmpltnAdvcRspn = tmp.getAccptrCmpltnAdvcRspn();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCaaa00400102(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the accptrCmpltnAdvcRspn property.
     * 
     * @return
     *     possible object is
     *     {@link AcceptorCompletionAdviceResponseV02 }
     *     
     */
    public AcceptorCompletionAdviceResponseV02 getAccptrCmpltnAdvcRspn() {
        return accptrCmpltnAdvcRspn;
    }

    /**
     * Sets the value of the accptrCmpltnAdvcRspn property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcceptorCompletionAdviceResponseV02 }
     *     
     */
    public MxCaaa00400102 setAccptrCmpltnAdvcRspn(AcceptorCompletionAdviceResponseV02 value) {
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
    public static MxCaaa00400102 parse(String xml) {
        return ((MxCaaa00400102) MxReadImpl.parse(MxCaaa00400102 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCaaa00400102 parse(String xml, MxRead parserImpl) {
        return ((MxCaaa00400102) parserImpl.read(MxCaaa00400102 .class, xml, _classes));
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
     * Creates an MxCaaa00400102 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCaaa00400102 message
     * @return
     *     a new instance of MxCaaa00400102
     */
    public final static MxCaaa00400102 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxCaaa00400102 .class);
    }

}
