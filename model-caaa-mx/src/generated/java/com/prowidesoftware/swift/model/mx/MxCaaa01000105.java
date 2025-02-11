
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
 * Class for caaa.010.001.05 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "accptrRcncltnRspn"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:caaa.010.001.05")
public class MxCaaa01000105
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "AccptrRcncltnRspn", required = true)
    protected AcceptorReconciliationResponseV05 accptrRcncltnRspn;
    public static final transient String BUSINESS_PROCESS = "caaa";
    public static final transient int FUNCTIONALITY = 10;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 5;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {AcceptorReconciliationResponse4 .class, AcceptorReconciliationResponseV05 .class, Algorithm11Code.class, Algorithm12Code.class, Algorithm13Code.class, Algorithm7Code.class, Algorithm8Code.class, AlgorithmIdentification11 .class, AlgorithmIdentification12 .class, AlgorithmIdentification13 .class, AlgorithmIdentification15 .class, AttributeType1Code.class, AuthenticatedData4 .class, BytePadding1Code.class, CardPaymentEnvironment38 .class, CertificateIssuer1 .class, ContentInformationType15 .class, ContentType2Code.class, EncapsulatedContent3 .class, EncryptionFormat1Code.class, GenericIdentification32 .class, GenericIdentification53 .class, GenericIdentification76 .class, GenericIdentification94 .class, Header30 .class, IssuerAndSerialNumber1 .class, KEK4 .class, KEKIdentifier2 .class, KeyTransport4 .class, MessageFunction10Code.class, MxCaaa01000105 .class, NetworkParameters4 .class, NetworkParameters5 .class, NetworkType1Code.class, Parameter4 .class, Parameter5 .class, Parameter6 .class, Parameter7 .class, PartyType3Code.class, PartyType4Code.class, Recipient4Choice.class, Recipient5Choice.class, RelativeDistinguishedName1 .class, Response4Code.class, ResponseType5 .class, Traceability5 .class, TransactionIdentifier1 .class, TransactionReconciliation4 .class, TransactionTotals7 .class, TypeTransactionTotals2Code.class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:caaa.010.001.05";

    public MxCaaa01000105() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCaaa01000105(final String xml) {
        this();
        MxCaaa01000105 tmp = parse(xml);
        accptrRcncltnRspn = tmp.getAccptrRcncltnRspn();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCaaa01000105(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the accptrRcncltnRspn property.
     * 
     * @return
     *     possible object is
     *     {@link AcceptorReconciliationResponseV05 }
     *     
     */
    public AcceptorReconciliationResponseV05 getAccptrRcncltnRspn() {
        return accptrRcncltnRspn;
    }

    /**
     * Sets the value of the accptrRcncltnRspn property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcceptorReconciliationResponseV05 }
     *     
     */
    public MxCaaa01000105 setAccptrRcncltnRspn(AcceptorReconciliationResponseV05 value) {
        this.accptrRcncltnRspn = value;
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
    public static MxCaaa01000105 parse(String xml) {
        return ((MxCaaa01000105) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCaaa01000105 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxCaaa01000105 parse(String xml, MxReadConfiguration conf) {
        return ((MxCaaa01000105) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCaaa01000105 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCaaa01000105 parse(String xml, MxRead parserImpl) {
        return ((MxCaaa01000105) parserImpl.read(MxCaaa01000105 .class, xml, _classes));
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
     * Creates an MxCaaa01000105 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCaaa01000105 message
     * @return
     *     a new instance of MxCaaa01000105
     */
    public static final MxCaaa01000105 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxCaaa01000105 .class);
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
