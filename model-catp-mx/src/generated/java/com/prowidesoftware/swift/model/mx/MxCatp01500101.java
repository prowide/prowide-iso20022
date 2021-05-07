
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
 * Class for catp.015.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "atmDpstCmpltnAck"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:catp.015.001.01")
public class MxCatp01500101
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "ATMDpstCmpltnAck", required = true)
    protected ATMDepositCompletionAcknowledgementV01 atmDpstCmpltnAck;
    public final static transient String BUSINESS_PROCESS = "catp";
    public final static transient int FUNCTIONALITY = 15;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {ATMCommand4Code.class, ATMCommand7 .class, ATMCommandIdentification1 .class, ATMCommandParameters1Choice.class, ATMConfigurationParameter1 .class, ATMContext12 .class, ATMDepositCompletionAcknowledgement1 .class, ATMDepositCompletionAcknowledgementV01 .class, ATMMessageFunction2 .class, ATMService13 .class, ATMServiceType6Code.class, ATMStatus1Code.class, ATMTransaction18 .class, Algorithm11Code.class, Algorithm12Code.class, Algorithm13Code.class, Algorithm15Code.class, Algorithm7Code.class, Algorithm8Code.class, AlgorithmIdentification11 .class, AlgorithmIdentification12 .class, AlgorithmIdentification13 .class, AlgorithmIdentification14 .class, AlgorithmIdentification15 .class, AttributeType1Code.class, AuthenticatedData4 .class, AutomatedTellerMachine3 .class, BytePadding1Code.class, CertificateIssuer1 .class, ContentInformationType10 .class, ContentInformationType15 .class, ContentType2Code.class, DataSetCategory7Code.class, EncapsulatedContent3 .class, EncryptedContent3 .class, EncryptionFormat1Code.class, EnvelopedData4 .class, GenericIdentification77 .class, GeographicCoordinates1 .class, GeographicLocation1Choice.class, Header32 .class, IssuerAndSerialNumber1 .class, KEK4 .class, KEKIdentifier2 .class, KeyTransport4 .class, MessageFunction11Code.class, MessageFunction8Code.class, MxCatp01500101 .class, Parameter4 .class, Parameter5 .class, Parameter6 .class, Parameter7 .class, PartyType12Code.class, PostalAddress17 .class, Recipient4Choice.class, Recipient5Choice.class, RelativeDistinguishedName1 .class, Response4Code.class, ResultDetail4Code.class, TMSContactLevel2Code.class, Traceability4 .class, TransactionIdentifier1 .class, UTMCoordinates1 .class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:catp.015.001.01";

    public MxCatp01500101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCatp01500101(final String xml) {
        this();
        MxCatp01500101 tmp = parse(xml);
        atmDpstCmpltnAck = tmp.getATMDpstCmpltnAck();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCatp01500101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the atmDpstCmpltnAck property.
     * 
     * @return
     *     possible object is
     *     {@link ATMDepositCompletionAcknowledgementV01 }
     *     
     */
    public ATMDepositCompletionAcknowledgementV01 getATMDpstCmpltnAck() {
        return atmDpstCmpltnAck;
    }

    /**
     * Sets the value of the atmDpstCmpltnAck property.
     * 
     * @param value
     *     allowed object is
     *     {@link ATMDepositCompletionAcknowledgementV01 }
     *     
     */
    public MxCatp01500101 setATMDpstCmpltnAck(ATMDepositCompletionAcknowledgementV01 value) {
        this.atmDpstCmpltnAck = value;
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
    public static MxCatp01500101 parse(String xml) {
        return ((MxCatp01500101) MxReadImpl.parse(MxCatp01500101 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCatp01500101 parse(String xml, MxRead parserImpl) {
        return ((MxCatp01500101) parserImpl.read(MxCatp01500101 .class, xml, _classes));
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
     * Creates an MxCatp01500101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCatp01500101 message
     * @return
     *     a new instance of MxCatp01500101
     */
    public final static MxCatp01500101 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxCatp01500101 .class);
    }

}
