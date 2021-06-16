
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
 * Class for caaa.013.001.02 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "accptrDgnstcReq"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:caaa.013.001.02")
public class MxCaaa01300102
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "AccptrDgnstcReq", required = true)
    protected AcceptorDiagnosticRequestV02 accptrDgnstcReq;
    public final static transient String BUSINESS_PROCESS = "caaa";
    public final static transient int FUNCTIONALITY = 13;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 2;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AcceptorDiagnosticRequest2 .class, AcceptorDiagnosticRequestV02 .class, Algorithm2Code.class, Algorithm3Code.class, Algorithm5Code.class, Algorithm7Code.class, Algorithm8Code.class, AlgorithmIdentification2 .class, AlgorithmIdentification3 .class, AlgorithmIdentification7 .class, AlgorithmIdentification8 .class, AttributeType1Code.class, AuthenticatedData2 .class, CardPaymentEnvironment17 .class, CertificateIdentifier1 .class, CertificateIssuer1 .class, ContentInformationType6 .class, ContentType1Code.class, EncapsulatedContent1 .class, GenericIdentification31 .class, GenericIdentification32 .class, Header1 .class, IssuerAndSerialNumber1 .class, KEK2 .class, KEKIdentifier1 .class, KeyTransport2 .class, MessageFunction1Code.class, MxCaaa01300102 .class, Parameter1 .class, Parameter2 .class, Parameter3 .class, PartyType3Code.class, PartyType4Code.class, Recipient2Choice.class, RelativeDistinguishedName1 .class, Traceability1 .class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:caaa.013.001.02";

    public MxCaaa01300102() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCaaa01300102(final String xml) {
        this();
        MxCaaa01300102 tmp = parse(xml);
        accptrDgnstcReq = tmp.getAccptrDgnstcReq();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCaaa01300102(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the accptrDgnstcReq property.
     * 
     * @return
     *     possible object is
     *     {@link AcceptorDiagnosticRequestV02 }
     *     
     */
    public AcceptorDiagnosticRequestV02 getAccptrDgnstcReq() {
        return accptrDgnstcReq;
    }

    /**
     * Sets the value of the accptrDgnstcReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcceptorDiagnosticRequestV02 }
     *     
     */
    public MxCaaa01300102 setAccptrDgnstcReq(AcceptorDiagnosticRequestV02 value) {
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
     * Creates the MX object parsing the raw content from the parameter XML
     * 
     */
    public static MxCaaa01300102 parse(String xml) {
        return ((MxCaaa01300102) MxReadImpl.parse(MxCaaa01300102 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCaaa01300102 parse(String xml, MxRead parserImpl) {
        return ((MxCaaa01300102) parserImpl.read(MxCaaa01300102 .class, xml, _classes));
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
     * Creates an MxCaaa01300102 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCaaa01300102 message
     * @return
     *     a new instance of MxCaaa01300102
     */
    public final static MxCaaa01300102 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxCaaa01300102 .class);
    }

}
