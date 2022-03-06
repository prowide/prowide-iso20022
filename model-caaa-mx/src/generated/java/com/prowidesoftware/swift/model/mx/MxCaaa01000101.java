
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
import com.prowidesoftware.swift.model.mx.MxReadConfiguration;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Class for caaa.010.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "accptrRcncltnRspn"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:caaa.010.001.01")
public class MxCaaa01000101
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "AccptrRcncltnRspn", required = true)
    protected AcceptorReconciliationResponseV01 accptrRcncltnRspn;
    public final static transient String BUSINESS_PROCESS = "caaa";
    public final static transient int FUNCTIONALITY = 10;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AcceptorReconciliationResponse1 .class, AcceptorReconciliationResponseV01 .class, Acquirer1 .class, Algorithm1Code.class, AlgorithmIdentification1 .class, AttributeType1Code.class, AuthenticatedData1 .class, CardPaymentEnvironment7 .class, CertificateIdentifier1 .class, CertificateIssuer1 .class, ContentInformationType3 .class, ContentType1Code.class, EncapsulatedContent1 .class, GenericIdentification31 .class, GenericIdentification32 .class, Header1 .class, IssuerAndSerialNumber1 .class, KEK1 .class, KEKIdentifier1 .class, KeyTransport1 .class, MessageFunction1Code.class, MxCaaa01000101 .class, Parameter1 .class, PartyType3Code.class, PartyType4Code.class, Recipient1Choice.class, RelativeDistinguishedName1 .class, Response1Code.class, ResponseType1 .class, Traceability1 .class, TransactionIdentifier1 .class, TransactionReconciliation1 .class, TransactionTotals1 .class, TypeTransactionTotals1Code.class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:caaa.010.001.01";

    public MxCaaa01000101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCaaa01000101(final String xml) {
        this();
        MxCaaa01000101 tmp = parse(xml);
        accptrRcncltnRspn = tmp.getAccptrRcncltnRspn();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCaaa01000101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the accptrRcncltnRspn property.
     * 
     * @return
     *     possible object is
     *     {@link AcceptorReconciliationResponseV01 }
     *     
     */
    public AcceptorReconciliationResponseV01 getAccptrRcncltnRspn() {
        return accptrRcncltnRspn;
    }

    /**
     * Sets the value of the accptrRcncltnRspn property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcceptorReconciliationResponseV01 }
     *     
     */
    public MxCaaa01000101 setAccptrRcncltnRspn(AcceptorReconciliationResponseV01 value) {
        this.accptrRcncltnRspn = value;
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
     * Creates the MX object parsing the raw content from the parameter XML, using default unmarshalling options
     * 
     */
    public static MxCaaa01000101 parse(String xml) {
        return ((MxCaaa01000101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCaaa01000101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxCaaa01000101 parse(String xml, MxReadConfiguration conf) {
        return ((MxCaaa01000101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCaaa01000101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCaaa01000101 parse(String xml, MxRead parserImpl) {
        return ((MxCaaa01000101) parserImpl.read(MxCaaa01000101 .class, xml, _classes));
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
     * Creates an MxCaaa01000101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCaaa01000101 message
     * @return
     *     a new instance of MxCaaa01000101
     */
    public final static MxCaaa01000101 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxCaaa01000101 .class);
    }

}
