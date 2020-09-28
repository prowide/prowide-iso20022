
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
 * Class for caaa.010.001.04 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "accptrRcncltnRspn"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:caaa.010.001.04")
public class MxCaaa01000104
    extends AbstractMX
{

    @XmlElement(name = "AccptrRcncltnRspn", required = true)
    protected AcceptorReconciliationResponseV04 accptrRcncltnRspn;
    public final static transient String BUSINESS_PROCESS = "caaa";
    public final static transient int FUNCTIONALITY = 10;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 4;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AcceptorReconciliationResponse3 .class, AcceptorReconciliationResponseV04 .class, Algorithm11Code.class, Algorithm12Code.class, Algorithm13Code.class, Algorithm7Code.class, Algorithm8Code.class, AlgorithmIdentification11 .class, AlgorithmIdentification12 .class, AlgorithmIdentification13 .class, AlgorithmIdentification15 .class, AttributeType1Code.class, AuthenticatedData4 .class, BytePadding1Code.class, CardPaymentEnvironment38 .class, CertificateIssuer1 .class, ContentInformationType11 .class, ContentType2Code.class, EncapsulatedContent3 .class, EncryptionFormat1Code.class, GenericIdentification32 .class, GenericIdentification53 .class, GenericIdentification76 .class, Header10 .class, IssuerAndSerialNumber1 .class, KEK4 .class, KEKIdentifier2 .class, KeyTransport4 .class, MessageFunction4Code.class, MxCaaa01000104 .class, Parameter4 .class, Parameter5 .class, Parameter6 .class, Parameter7 .class, PartyType3Code.class, PartyType4Code.class, Recipient4Choice.class, Recipient5Choice.class, RelativeDistinguishedName1 .class, Response1Code.class, ResponseType1 .class, Traceability2 .class, TransactionIdentifier1 .class, TransactionReconciliation3 .class, TransactionTotals3 .class, TypeTransactionTotals2Code.class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:caaa.010.001.04";

    public MxCaaa01000104() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCaaa01000104(final String xml) {
        this();
        MxCaaa01000104 tmp = parse(xml);
        accptrRcncltnRspn = tmp.getAccptrRcncltnRspn();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCaaa01000104(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the accptrRcncltnRspn property.
     * 
     * @return
     *     possible object is
     *     {@link AcceptorReconciliationResponseV04 }
     *     
     */
    public AcceptorReconciliationResponseV04 getAccptrRcncltnRspn() {
        return accptrRcncltnRspn;
    }

    /**
     * Sets the value of the accptrRcncltnRspn property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcceptorReconciliationResponseV04 }
     *     
     */
    public MxCaaa01000104 setAccptrRcncltnRspn(AcceptorReconciliationResponseV04 value) {
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
     * Creates the MX object parsing the raw content from the parameter XML
     * 
     */
    public static MxCaaa01000104 parse(String xml) {
        return ((MxCaaa01000104) MxReadImpl.parse(MxCaaa01000104 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCaaa01000104 parse(String xml, MxRead parserImpl) {
        return ((MxCaaa01000104) parserImpl.read(MxCaaa01000104 .class, xml, _classes));
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
     * Creates an MxCaaa01000104 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCaaa01000104 message
     * @return
     *     a new instance of MxCaaa01000104
     */
    public final static MxCaaa01000104 fromJson(String json) {
        return AbstractMX.fromJson(json, MxCaaa01000104 .class);
    }

}
