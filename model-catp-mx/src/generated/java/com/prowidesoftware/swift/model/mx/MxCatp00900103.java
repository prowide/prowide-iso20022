
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
 * Class for catp.009.001.03 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "atmCmpltnAck"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:catp.009.001.03")
public class MxCatp00900103
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "ATMCmpltnAck", required = true)
    protected ATMCompletionAcknowledgementV03 atmCmpltnAck;
    public final static transient String BUSINESS_PROCESS = "catp";
    public final static transient int FUNCTIONALITY = 9;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 3;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {ATMCommand4Code.class, ATMCommand7 .class, ATMCommandIdentification1 .class, ATMCommandParameters1Choice.class, ATMCompletionAcknowledgement3 .class, ATMCompletionAcknowledgementV03 .class, ATMConfigurationParameter1 .class, ATMContext13 .class, ATMMessageFunction2 .class, ATMService14 .class, ATMServiceType7Code.class, ATMStatus1Code.class, ATMTransaction45 .class, Algorithm11Code.class, Algorithm12Code.class, Algorithm13Code.class, Algorithm15Code.class, Algorithm7Code.class, Algorithm8Code.class, AlgorithmIdentification11 .class, AlgorithmIdentification12 .class, AlgorithmIdentification13 .class, AlgorithmIdentification14 .class, AlgorithmIdentification15 .class, AttributeType1Code.class, AuthenticatedData4 .class, AutomatedTellerMachine3 .class, BytePadding1Code.class, CertificateIssuer1 .class, ContentInformationType10 .class, ContentInformationType15 .class, ContentType2Code.class, DataSetCategory7Code.class, EncapsulatedContent3 .class, EncryptedContent3 .class, EncryptionFormat1Code.class, EnvelopedData4 .class, GenericIdentification77 .class, GeographicCoordinates1 .class, GeographicLocation1Choice.class, Header32 .class, IssuerAndSerialNumber1 .class, KEK4 .class, KEKIdentifier2 .class, KeyTransport4 .class, MessageFunction11Code.class, MessageFunction8Code.class, MxCatp00900103 .class, Parameter4 .class, Parameter5 .class, Parameter6 .class, Parameter7 .class, PartyType12Code.class, PostalAddress17 .class, Recipient4Choice.class, Recipient5Choice.class, RelativeDistinguishedName1 .class, Response12Code.class, ResultDetail5Code.class, TMSContactLevel2Code.class, Traceability4 .class, TransactionIdentifier3 .class, UTMCoordinates1 .class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:catp.009.001.03";

    public MxCatp00900103() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCatp00900103(final String xml) {
        this();
        MxCatp00900103 tmp = parse(xml);
        atmCmpltnAck = tmp.getATMCmpltnAck();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCatp00900103(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the atmCmpltnAck property.
     * 
     * @return
     *     possible object is
     *     {@link ATMCompletionAcknowledgementV03 }
     *     
     */
    public ATMCompletionAcknowledgementV03 getATMCmpltnAck() {
        return atmCmpltnAck;
    }

    /**
     * Sets the value of the atmCmpltnAck property.
     * 
     * @param value
     *     allowed object is
     *     {@link ATMCompletionAcknowledgementV03 }
     *     
     */
    public MxCatp00900103 setATMCmpltnAck(ATMCompletionAcknowledgementV03 value) {
        this.atmCmpltnAck = value;
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
    public static MxCatp00900103 parse(String xml) {
        return ((MxCatp00900103) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCatp00900103 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxCatp00900103 parse(String xml, MxReadConfiguration conf) {
        return ((MxCatp00900103) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCatp00900103 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCatp00900103 parse(String xml, MxRead parserImpl) {
        return ((MxCatp00900103) parserImpl.read(MxCatp00900103 .class, xml, _classes));
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
     * Creates an MxCatp00900103 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCatp00900103 message
     * @return
     *     a new instance of MxCatp00900103
     */
    public final static MxCatp00900103 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxCatp00900103 .class);
    }

}
