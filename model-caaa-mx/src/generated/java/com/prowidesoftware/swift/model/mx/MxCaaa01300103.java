
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
 * Class for caaa.013.001.03 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "accptrDgnstcReq"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:caaa.013.001.03")
public class MxCaaa01300103
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "AccptrDgnstcReq", required = true)
    protected AcceptorDiagnosticRequestV03 accptrDgnstcReq;
    public final static transient String BUSINESS_PROCESS = "caaa";
    public final static transient int FUNCTIONALITY = 13;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 3;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AcceptorDiagnosticRequest3 .class, AcceptorDiagnosticRequestV03 .class, Acquirer2 .class, Algorithm10Code.class, Algorithm5Code.class, Algorithm7Code.class, Algorithm8Code.class, Algorithm9Code.class, AlgorithmIdentification10 .class, AlgorithmIdentification7 .class, AlgorithmIdentification8 .class, AlgorithmIdentification9 .class, AttributeType1Code.class, AuthenticatedData3 .class, CardPaymentEnvironment29 .class, CertificateIdentifier1 .class, CertificateIssuer1 .class, CommunicationCharacteristics2 .class, ContentInformationType8 .class, ContentType1Code.class, EncapsulatedContent2 .class, GenericIdentification31 .class, GenericIdentification32 .class, GenericIdentification48 .class, Header7 .class, IssuerAndSerialNumber1 .class, KEK3 .class, KEKIdentifier1 .class, KeyTransport3 .class, MemoryCharacteristics1 .class, MemoryUnit1Code.class, MessageFunction4Code.class, MxCaaa01300103 .class, POICommunicationType1Code.class, POIComponentAssessment1Code.class, POIComponentStatus1Code.class, POIComponentType3Code.class, Parameter1 .class, Parameter2 .class, Parameter3 .class, PartyType3Code.class, PartyType4Code.class, PartyType7Code.class, PointOfInteractionComponent4 .class, PointOfInteractionComponentAssessment1 .class, PointOfInteractionComponentCharacteristics2 .class, PointOfInteractionComponentIdentification1 .class, PointOfInteractionComponentStatus1 .class, Recipient3Choice.class, RelativeDistinguishedName1 .class, Traceability1 .class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:caaa.013.001.03";

    public MxCaaa01300103() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCaaa01300103(final String xml) {
        this();
        MxCaaa01300103 tmp = parse(xml);
        accptrDgnstcReq = tmp.getAccptrDgnstcReq();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCaaa01300103(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the accptrDgnstcReq property.
     * 
     * @return
     *     possible object is
     *     {@link AcceptorDiagnosticRequestV03 }
     *     
     */
    public AcceptorDiagnosticRequestV03 getAccptrDgnstcReq() {
        return accptrDgnstcReq;
    }

    /**
     * Sets the value of the accptrDgnstcReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcceptorDiagnosticRequestV03 }
     *     
     */
    public MxCaaa01300103 setAccptrDgnstcReq(AcceptorDiagnosticRequestV03 value) {
        this.accptrDgnstcReq = value;
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
    public static MxCaaa01300103 parse(String xml) {
        return ((MxCaaa01300103) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCaaa01300103 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxCaaa01300103 parse(String xml, MxReadConfiguration conf) {
        return ((MxCaaa01300103) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCaaa01300103 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCaaa01300103 parse(String xml, MxRead parserImpl) {
        return ((MxCaaa01300103) parserImpl.read(MxCaaa01300103 .class, xml, _classes));
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
     * Creates an MxCaaa01300103 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCaaa01300103 message
     * @return
     *     a new instance of MxCaaa01300103
     */
    public final static MxCaaa01300103 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxCaaa01300103 .class);
    }

}
