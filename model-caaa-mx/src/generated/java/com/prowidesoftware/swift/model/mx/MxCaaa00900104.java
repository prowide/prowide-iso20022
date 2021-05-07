
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
 * Class for caaa.009.001.04 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "accptrRcncltnReq"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:caaa.009.001.04")
public class MxCaaa00900104
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "AccptrRcncltnReq", required = true)
    protected AcceptorReconciliationRequestV04 accptrRcncltnReq;
    public final static transient String BUSINESS_PROCESS = "caaa";
    public final static transient int FUNCTIONALITY = 9;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 4;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AcceptorReconciliationRequest4 .class, AcceptorReconciliationRequestV04 .class, Acquirer4 .class, Algorithm11Code.class, Algorithm12Code.class, Algorithm13Code.class, Algorithm7Code.class, Algorithm8Code.class, AlgorithmIdentification11 .class, AlgorithmIdentification12 .class, AlgorithmIdentification13 .class, AlgorithmIdentification15 .class, AttributeType1Code.class, AuthenticatedData4 .class, BytePadding1Code.class, CardPaymentEnvironment37 .class, CertificateIssuer1 .class, CommunicationCharacteristics2 .class, ContentInformationType11 .class, ContentType2Code.class, EncapsulatedContent3 .class, EncryptionFormat1Code.class, GenericIdentification48 .class, GenericIdentification53 .class, GenericIdentification76 .class, Header10 .class, IssuerAndSerialNumber1 .class, KEK4 .class, KEKIdentifier2 .class, KeyTransport4 .class, MemoryCharacteristics1 .class, MemoryUnit1Code.class, MessageFunction4Code.class, MxCaaa00900104 .class, POICommunicationType1Code.class, POIComponentAssessment1Code.class, POIComponentStatus1Code.class, POIComponentType3Code.class, Parameter4 .class, Parameter5 .class, Parameter6 .class, Parameter7 .class, PartyType3Code.class, PartyType4Code.class, PartyType7Code.class, PointOfInteractionComponent5 .class, PointOfInteractionComponentAssessment1 .class, PointOfInteractionComponentCharacteristics2 .class, PointOfInteractionComponentIdentification1 .class, PointOfInteractionComponentStatus2 .class, Recipient4Choice.class, Recipient5Choice.class, RelativeDistinguishedName1 .class, Traceability2 .class, TransactionIdentifier1 .class, TransactionReconciliation3 .class, TransactionTotals3 .class, TypeTransactionTotals2Code.class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:caaa.009.001.04";

    public MxCaaa00900104() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCaaa00900104(final String xml) {
        this();
        MxCaaa00900104 tmp = parse(xml);
        accptrRcncltnReq = tmp.getAccptrRcncltnReq();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCaaa00900104(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the accptrRcncltnReq property.
     * 
     * @return
     *     possible object is
     *     {@link AcceptorReconciliationRequestV04 }
     *     
     */
    public AcceptorReconciliationRequestV04 getAccptrRcncltnReq() {
        return accptrRcncltnReq;
    }

    /**
     * Sets the value of the accptrRcncltnReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcceptorReconciliationRequestV04 }
     *     
     */
    public MxCaaa00900104 setAccptrRcncltnReq(AcceptorReconciliationRequestV04 value) {
        this.accptrRcncltnReq = value;
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
    public static MxCaaa00900104 parse(String xml) {
        return ((MxCaaa00900104) MxReadImpl.parse(MxCaaa00900104 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCaaa00900104 parse(String xml, MxRead parserImpl) {
        return ((MxCaaa00900104) parserImpl.read(MxCaaa00900104 .class, xml, _classes));
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
     * Creates an MxCaaa00900104 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCaaa00900104 message
     * @return
     *     a new instance of MxCaaa00900104
     */
    public final static MxCaaa00900104 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxCaaa00900104 .class);
    }

}
