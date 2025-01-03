
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
 * Class for caaa.009.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "accptrRcncltnReq"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:caaa.009.001.01")
public class MxCaaa00900101
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "AccptrRcncltnReq", required = true)
    protected AcceptorReconciliationRequestV01 accptrRcncltnReq;
    public static final transient String BUSINESS_PROCESS = "caaa";
    public static final transient int FUNCTIONALITY = 9;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {AcceptorReconciliationRequest1 .class, AcceptorReconciliationRequestV01 .class, Acquirer1 .class, Algorithm1Code.class, AlgorithmIdentification1 .class, AttributeType1Code.class, AuthenticatedData1 .class, CardPaymentEnvironment7 .class, CertificateIdentifier1 .class, CertificateIssuer1 .class, ContentInformationType3 .class, ContentType1Code.class, EncapsulatedContent1 .class, GenericIdentification31 .class, GenericIdentification32 .class, Header1 .class, IssuerAndSerialNumber1 .class, KEK1 .class, KEKIdentifier1 .class, KeyTransport1 .class, MessageFunction1Code.class, MxCaaa00900101 .class, Parameter1 .class, PartyType3Code.class, PartyType4Code.class, Recipient1Choice.class, RelativeDistinguishedName1 .class, Traceability1 .class, TransactionIdentifier1 .class, TransactionReconciliation1 .class, TransactionTotals1 .class, TypeTransactionTotals1Code.class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:caaa.009.001.01";

    public MxCaaa00900101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCaaa00900101(final String xml) {
        this();
        MxCaaa00900101 tmp = parse(xml);
        accptrRcncltnReq = tmp.getAccptrRcncltnReq();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCaaa00900101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the accptrRcncltnReq property.
     * 
     * @return
     *     possible object is
     *     {@link AcceptorReconciliationRequestV01 }
     *     
     */
    public AcceptorReconciliationRequestV01 getAccptrRcncltnReq() {
        return accptrRcncltnReq;
    }

    /**
     * Sets the value of the accptrRcncltnReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcceptorReconciliationRequestV01 }
     *     
     */
    public MxCaaa00900101 setAccptrRcncltnReq(AcceptorReconciliationRequestV01 value) {
        this.accptrRcncltnReq = value;
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
    public static MxCaaa00900101 parse(String xml) {
        return ((MxCaaa00900101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCaaa00900101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxCaaa00900101 parse(String xml, MxReadConfiguration conf) {
        return ((MxCaaa00900101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCaaa00900101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCaaa00900101 parse(String xml, MxRead parserImpl) {
        return ((MxCaaa00900101) parserImpl.read(MxCaaa00900101 .class, xml, _classes));
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
     * Creates an MxCaaa00900101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCaaa00900101 message
     * @return
     *     a new instance of MxCaaa00900101
     */
    public static final MxCaaa00900101 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxCaaa00900101 .class);
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
